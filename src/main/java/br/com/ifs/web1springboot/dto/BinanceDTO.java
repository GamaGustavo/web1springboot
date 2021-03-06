package br.com.ifs.web1springboot.dto;

import br.com.ifs.web1springboot.model.binance.Binance;
import br.com.ifs.web1springboot.model.binance.Coin;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BinanceDTO {
    private String timezone;
    private float serverTime;
    List<Coin> symbols = new ArrayList<>();

    public Binance toBinance(){
        Binance binance = new Binance();
        binance.setTimezone(this.timezone);
        binance.setServerTime(this.serverTime);
        return binance;
    }
}
