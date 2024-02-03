package com.example.propuestacultura.DTO;

import java.time.LocalDate;

public class PropuestaDTO {

    private String nombrePropuesta;

    private String descripcion;

    private LocalDate fechaInicio;

    private  LocalDate fechaPresentacion;

    private String empresaAliada;

    public PropuestaDTO() {
    }

    public PropuestaDTO(String nombrePropuesta, String descripcion, LocalDate fechaInicio, LocalDate fechaPresentacion, String empresaAliada) {
        this.nombrePropuesta = nombrePropuesta;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaPresentacion = fechaPresentacion;
        this.empresaAliada = empresaAliada;
    }

    public String getNombrePropuesta() {
        return nombrePropuesta;
    }

    public void setNombrePropuesta(String nombrePropuesta) {
        this.nombrePropuesta = nombrePropuesta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public String getEmpresaAliada() {
        return empresaAliada;
    }

    public void setEmpresaAliada(String empresaAliada) {
        this.empresaAliada = empresaAliada;
    }
}
