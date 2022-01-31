package co.com.chatwhatsapp.mongo.data;

import co.com.chatwhatsapp.model.usuario.Usuario;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "grupo")
public class GrupoData {

    @Id
    private String id;
    private List<Usuario> listUsers;
}
