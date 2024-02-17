package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.PropuestaDTO;
import com.example.propuestacultura.models.Propuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IPropuestaMapa {

    @Mappings({
            @Mapping(source = "nombrePropuesta",target = "nombrePropuesta"),
            @Mapping(source = "descripcion",target = "descripcion"),
            @Mapping(source = "fechaInicio",target = "fechaInicio"),
            @Mapping(source = "fechaPresentacion",target = "fechaPresentacion"),
            @Mapping(source = "empresaAliada",target = "empresaAliada"),
    })
    PropuestaDTO propuestaToDTO(Propuesta propuesta);
}
