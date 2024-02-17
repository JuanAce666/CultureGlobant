package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.ValorPropuestaDTO;
import com.example.propuestacultura.models.ValorPropuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IValorPropuestaMapa {

    @Mappings({
            @Mapping(source = "propuesta",target = "propuesta"),
            @Mapping(source = "monto_total_propuesta",target = "monto_total_propuesta"),
            @Mapping(source = "aporte_comfama",target = "aporte_comfama")
    })
    ValorPropuestaDTO valorPropuestaToDTO(ValorPropuesta valorPropuesta);
}
