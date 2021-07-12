package br.com.ifs.web1springboot.model.binance;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "coin")
public class Coin {

    @Id
    @Column
    private String symbol;
    @Column
    private String status;
    @Column
    private String baseAsset;
    @Column
    private float baseAssetPrecision;
    @Column
    private String quoteAsset;
    @Column
    private float quotePrecision;
    @Column
    private float quoteAssetPrecision;
    @Column
    private float baseCommissionPrecision;
    @Column
    private float quoteCommissionPrecision;
    @Column
    private boolean icebergAllowed;
    @Column
    private boolean ocoAllowed;
    @Column
    private boolean quoteOrderQtyMarketAllowed;
    @Column
    private boolean isSpotTradingAllowed;
    @Column
    private boolean isMarginTradingAllowed;
}
