package co.com.chatwhatsapp.model.chat.gateways;

import co.com.chatwhatsapp.model.chat.Chat;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ChatRepository {
    Mono<Chat> sendChat(Chat mensaje);

    Flux<Chat> mensajesChat(String chatId);
}
