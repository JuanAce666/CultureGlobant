package com.example.propuestacultura.DTO;

public class ValorPropuestaDTO {
    private String propuesta;

    private Double monto_total_propuesta;

    private Double aporte_comfama;

    public ValorPropuestaDTO() {
    }

    public ValorPropuestaDTO(String propuesta, Double monto_total_propuesta, Double aporte_comfama) {
        this.propuesta = propuesta;
        this.monto_total_propuesta = monto_total_propuesta;
        this.aporte_comfama = aporte_comfama;
    }

    public String getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

    public Double getMonto_total_propuesta() {
        return monto_total_propuesta;
    }

    public void setMonto_total_propuesta(Double monto_total_propuesta) {
        this.monto_total_propuesta = monto_total_propuesta;
    }

    public Double getAporte_comfama() {
        return aporte_comfama;
    }

    public void setAporte_comfama(Double aporte_comfama) {
        this.aporte_comfama = aporte_comfama;
    }
}
