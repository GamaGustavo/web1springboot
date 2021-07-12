package br.com.ifs.web1springboot.service.binance;

import br.com.ifs.web1springboot.dto.BinanceDTO;
import br.com.ifs.web1springboot.model.binance.Binance;
import br.com.ifs.web1springboot.repository.binance.BinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class BinanceService {

    private final WebClient webClient;
    @Autowired
    private BinanceRepository binanceRepository;
    @Autowired
    private CoinService coinService;

    public BinanceService() {
        webClient = WebClient.builder().baseUrl("https://api.binance.com/api/v3")
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(configurer -> configurer
                                .defaultCodecs()
                                .maxInMemorySize(16*1024*1024)
                        )
                        .build())
                .build();
    }
    public void saveAllCoinsWithUsdt(){
        BinanceDTO binanceDTO = this.webClient.get().uri("/exchangeInfo")
                .retrieve().bodyToMono(BinanceDTO.class).block();
        assert binanceDTO != null;
        coinService.saveCoinList(binanceDTO.getSymbols());
        Binance binance = binanceDTO.toBinance();
        binanceRepository.save(binance);
    }
}
