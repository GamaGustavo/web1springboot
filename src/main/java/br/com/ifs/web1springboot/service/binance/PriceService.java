package br.com.ifs.web1springboot.service.binance;

import br.com.ifs.web1springboot.model.binance.Price;
import br.com.ifs.web1springboot.model.binance.Coin;
import br.com.ifs.web1springboot.repository.binance.PriceRepository;
import br.com.ifs.web1springboot.service.binance.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class PriceService {
    @Autowired
    private PriceRepository priceRepository;
    @Autowired
    private CoinService coinService;
    private  WebClient webClient;

    public PriceService(){
        this.webClient = WebClient.builder().baseUrl("https://api.binance.com/api/v3")
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(configurer -> configurer
                                .defaultCodecs()
                                .maxInMemorySize(16*1024*1024)
                        )
                        .build())
                .build();

    }
    public void saveAllPrices(){
        List<Coin> symbols = coinService.getAllCoins();
        for (Coin symbol:
             symbols) {
            String uri = "/ticker/price?symbol="+symbol.getSymbol();
            Price price = webClient.get().uri(uri).retrieve().bodyToMono(Price.class).block();
            assert price != null;
            priceRepository.save(price);
        }
    }
    public List<Price> getAllPrices(){
        return (List<Price>) priceRepository.findAll();
    }
}
