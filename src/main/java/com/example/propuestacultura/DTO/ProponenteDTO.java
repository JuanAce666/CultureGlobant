package com.example.propuestacultura.DTO;

public class ProponenteDTO {

    private String nombre;

    private String trayectoria;

    private String tipoProponente;

    public ProponenteDTO(String nombre, String trayectoria, String tipoProponente) {
        this.nombre = nombre;
        this.trayectoria = trayectoria;
        this.tipoProponente = tipoProponente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }

    public String getTipoProponente() {
        return tipoProponente;
    }

    public void setTipoProponente(String tipoProponente) {
        this.tipoProponente = tipoProponente;
    }
}
