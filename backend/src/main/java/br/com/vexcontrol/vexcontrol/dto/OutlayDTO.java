package br.com.vexcontrol.vexcontrol.dto;

import java.io.Serializable;

public class OutlayDTO implements Serializable {

    private Long id;
    private String description;
    private Double value;
    private Integer months;

    public OutlayDTO() {
    }

    public OutlayDTO(Long id, String description, Double value, Integer months) {
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
}
