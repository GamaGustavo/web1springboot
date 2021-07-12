package br.com.ifs.web1springboot.service.binance;

import br.com.ifs.web1springboot.model.binance.Coin;
import br.com.ifs.web1springboot.repository.binance.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinService {
    @Autowired
    private CoinRepository coinRepository;

    public void saveCoinList(List<Coin> coinList){
        for (Coin symblo:
             coinList) {
            if (symblo.getQuoteAsset().equals("USDT")){
                coinRepository.save(symblo);
            }
        }
    }

    public List<Coin> getAllCoins(){
        Iterable<Coin> symbols = coinRepository.findAll();
        return ((List<Coin>) symbols);
    }

}
