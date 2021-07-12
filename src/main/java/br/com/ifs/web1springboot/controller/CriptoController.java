package br.com.ifs.web1springboot.controller;

import br.com.ifs.web1springboot.service.PriceService;
import br.com.ifs.web1springboot.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ifs.web1springboot.service.BinanceService;

@RestController
@RequestMapping("cripto")
public class CriptoController {
    @Autowired
    BinanceService binanceService;
    @Autowired
    CoinService coinService;
    @Autowired
    PriceService priceService;

    @GetMapping(value = "/status")
    public String testController(){
        return "Status: ok!";
    }

    @GetMapping(value = "/save-all-coins-with-usdt")
    public Object saveAllCoinsWhithUSDT (){
        this.binanceService.saveAllCoinsWithUsdt();
        return "foi";
    }
    @GetMapping(value = "/find-all-coins")
    public Object findAllCoins() {
        return this.coinService.getAllCoins();
    }

    @GetMapping(value = "/save-all-prices")
    public Object saveAllprices() {
        this.priceService.saveAllPrices();
        return "Salvo";
    }

    @GetMapping(value = "/find-all-prices")
    public Object findAllprices() {
        return this.priceService.getAllPrices();
    }



}
