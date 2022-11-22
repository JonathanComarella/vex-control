package br.com.vexcontrol.vexcontrol.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "earnings")
public class Earnings implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double value;

    public Earnings() {
    }

    public Earnings(Long id, String description, Double value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Earnings earnings = (Earnings) o;
        return Objects.equals(id, earnings.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
