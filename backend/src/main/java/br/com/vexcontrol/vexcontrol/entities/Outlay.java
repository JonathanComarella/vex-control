package br.com.vexcontrol.vexcontrol.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "outlay")
public class Outlay implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double value;
    private Integer months;

    public Outlay() {
    }

    public Outlay(Long id, String description, Double value, Integer months) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.months = months;
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

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Outlay outlay = (Outlay) o;
        return Objects.equals(id, outlay.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
