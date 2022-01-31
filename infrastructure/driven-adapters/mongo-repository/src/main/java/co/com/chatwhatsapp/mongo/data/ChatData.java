package co.com.chatwhatsapp.mongo.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "chats")
public class ChatData {

    private String message;
    private String sender;
    private String chatId;
}
