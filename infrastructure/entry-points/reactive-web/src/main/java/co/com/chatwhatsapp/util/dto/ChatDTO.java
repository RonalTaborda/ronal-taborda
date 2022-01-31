package co.com.chatwhatsapp.util.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class ChatDTO {

    private String message;
    private String sender;
    private String chatId;
}
