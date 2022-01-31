package co.com.chatwhatsapp.model.grupo;
import co.com.chatwhatsapp.model.usuario.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Grupo {
    private String id;
    private List<Usuario> listUsers;
}
