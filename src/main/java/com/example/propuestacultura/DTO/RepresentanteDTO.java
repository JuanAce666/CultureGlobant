package com.example.propuestacultura.DTO;

public class RepresentanteDTO {

    private String primer_nombre;

    private String primer_apellido;

    private String numero_documento;

    private String tipo_documento;

    private String telefono_celular;

    private String corre_electronico;

    public RepresentanteDTO() {
    }

    public RepresentanteDTO(String primer_nombre, String primer_apellido, String numero_documento, String tipo_documento, String telefono_celular, String corre_electronico) {
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.numero_documento = numero_documento;
        this.tipo_documento = tipo_documento;
        this.telefono_celular = telefono_celular;
        this.corre_electronico = corre_electronico;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getCorre_electronico() {
        return corre_electronico;
    }

    public void setCorre_electronico(String corre_electronico) {
        this.corre_electronico = corre_electronico;
    }
}
