package br.com.vexcontrol.vexcontrol.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "balance")
public class Balance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valueBalance;
    private Double valueOutlay;
    private Double valueEarnings;

    public Balance() {
    }

    public Balance(Long id, Double valueBalance, Double valueOutlay, Double valueEarnings) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balance balance = (Balance) o;
        return Objects.equals(id, balance.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
