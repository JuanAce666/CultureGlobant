package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.DocumentoAdjuntosDTO;
import com.example.propuestacultura.models.DocumentosAdjuntos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IDocumentoAdjuntoMapa {

    @Mappings({
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "enlace", target = "enlace")
    })
    DocumentoAdjuntosDTO documentoAdjuntoToDTO(DocumentosAdjuntos documentosAdjuntos);
}
