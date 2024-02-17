package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.RepresentanteDTO;
import com.example.propuestacultura.models.Representante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IRepresentanteMapa {

    @Mappings({
            @Mapping(source = "tipo_documento.tipo_documento", target = "tipo_documento"),
            @Mapping(source = "primer_nombre",target = "primer_nombre"),
            @Mapping(source = "numero_documento",target = "numero_documento"),
            @Mapping(source = "telefono_celular",target = "telefono_celular"),
            @Mapping(source = "corre_electronico",target = "corre_electronico")
    })
    RepresentanteDTO representanteToDTO(Representante representante);
}
