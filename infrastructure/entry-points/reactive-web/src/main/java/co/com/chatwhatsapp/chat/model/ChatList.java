package co.com.chatwhatsapp.chat.model;

import co.com.chatwhatsapp.model.chat.Chat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ChatList {
    private List<Chat> chat;
}
