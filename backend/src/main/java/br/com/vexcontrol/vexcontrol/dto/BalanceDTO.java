package br.com.vexcontrol.vexcontrol.dto;

import java.io.Serializable;

public class BalanceDTO implements Serializable {

    private Long id;
    private Double valueBalance;
    private Double valueOutlay;
    private Double valueEarnings;

    public BalanceDTO() {
    }

    public BalanceDTO(Long id, Double valueBalance, Double valueOutlay, Double valueEarnings) {
        this.id = id;
        this.valueBalance = valueBalance;
        this.valueOutlay = valueOutlay;
        this.valueEarnings = valueEarnings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValueBalance() {
        return valueBalance;
    }

    public void setValueBalance(Double valueBalance) {
        this.valueBalance = valueBalance;
    }

    public Double getValueOutlay() {
        return valueOutlay;
    }

    public void setValueOutlay(Double valueOutlay) {
        this.valueOutlay = valueOutlay;
    }

    public Double getValueEarnings() {
        return valueEarnings;
    }

    public void setValueEarnings(Double valueEarnings) {
        this.valueEarnings = valueEarnings;
    }
}
