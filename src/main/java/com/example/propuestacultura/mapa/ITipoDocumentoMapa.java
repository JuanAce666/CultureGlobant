package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.TipoDocumentoDTO;
import com.example.propuestacultura.models.TipoDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ITipoDocumentoMapa {

    @Mappings({
            @Mapping(source = "tipo_documento",target = "tipo_documento"),
            @Mapping(source = " id_tipo_documento",target = " id_tipo_documento")
    })
    TipoDocumentoDTO tipoDocumentoToDTO(TipoDocumento tipoDocumento);
}
