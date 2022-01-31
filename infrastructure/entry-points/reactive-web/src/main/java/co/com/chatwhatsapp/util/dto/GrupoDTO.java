package co.com.chatwhatsapp.util.dto;

import co.com.chatwhatsapp.model.usuario.Usuario;
import lombok.Builder;
import lombok.Value;


import java.util.List;

@Value
@Builder(toBuilder = true)
public class GrupoDTO {
    private String id;
    private List<Usuario> listUsers;
}
