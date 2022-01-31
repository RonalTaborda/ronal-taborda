package co.com.chatwhatsapp.util.mapper;

import co.com.chatwhatsapp.model.grupo.Grupo;
import co.com.chatwhatsapp.util.dto.GrupoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface GrupoMapper {
    Grupo toData(GrupoDTO grupoDTO);
}
