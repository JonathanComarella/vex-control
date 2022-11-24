package br.com.vexcontrol.vexcontrol.dto;

import java.io.Serializable;

public class EarningsDTO implements Serializable {

    private Long id;
    private String description;
    private Double value;

    public EarningsDTO() {
    }

    public EarningsDTO(Long id, String description, Double value) {
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
}
