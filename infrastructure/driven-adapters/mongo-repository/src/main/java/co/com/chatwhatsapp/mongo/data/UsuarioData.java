package co.com.chatwhatsapp.mongo.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "usuarios")
public class UsuarioData {
    @Id
    private String id;
    private String userName;
}
