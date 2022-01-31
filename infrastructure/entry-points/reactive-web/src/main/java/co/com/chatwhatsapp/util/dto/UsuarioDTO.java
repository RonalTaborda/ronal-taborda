package co.com.chatwhatsapp.util.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class UsuarioDTO {
    private String id;
    private String userName;
}
