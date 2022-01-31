package co.com.chatwhatsapp.util.mapper;

import co.com.chatwhatsapp.model.usuario.Usuario;
import co.com.chatwhatsapp.util.dto.UsuarioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface UsuarioMapper {
    Usuario toData(UsuarioDTO usuarioDTO);
}
