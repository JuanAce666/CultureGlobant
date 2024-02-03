package com.example.propuestacultura.DTO;

public class TipoDocumentoDTO {

    private String tipo_documento;

    private Integer id_tipo_documento;

    public TipoDocumentoDTO() {
    }

    public TipoDocumentoDTO(String tipo_documento, Integer id_tipo_documento) {
        this.tipo_documento = tipo_documento;
        this.id_tipo_documento = id_tipo_documento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public Integer getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(Integer id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }
}
