package exchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CurrencyExchangeResponse {

    private String ccy;
    @JsonProperty("base_ccy")
    private String baseCcy;
    private Double buy;
    private Double sale;

    public CurrencyExchangeResponse() {
    }

    public CurrencyExchangeResponse(String ccy, String baseCcy, Double buy, Double sale) {
        this.ccy = ccy;
        this.baseCcy = baseCcy;
        this.buy = buy;
        this.sale = sale;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getBaseCcy() {
        return baseCcy;
    }

    public void setBaseCcy(String baseCcy) {
        this.baseCcy = baseCcy;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }
}


