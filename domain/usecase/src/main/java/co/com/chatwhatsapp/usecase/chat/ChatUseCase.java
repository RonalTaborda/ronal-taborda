package co.com.chatwhatsapp.usecase.chat;

import co.com.chatwhatsapp.model.chat.Chat;
import co.com.chatwhatsapp.model.chat.gateways.ChatRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ChatUseCase {

    private final ChatRepository chatRepository;

    public Flux<Chat> getChatMensaje(String chatId){
        return chatRepository.mensajesChat(chatId);
    }

    public Mono<Chat> enviarMensaje(Chat chat){
        return chatRepository.sendChat(chat);
    }
}
