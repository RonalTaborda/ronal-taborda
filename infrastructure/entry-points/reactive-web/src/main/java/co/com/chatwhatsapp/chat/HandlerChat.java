package co.com.chatwhatsapp.chat;

import co.com.chatwhatsapp.chat.model.ChatList;
import co.com.chatwhatsapp.model.chat.Chat;
import co.com.chatwhatsapp.usecase.chat.ChatUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class HandlerChat {
    private final ChatUseCase useCase;
    public static final String PARAMETER_ID = "channelId";

//    public Flux<Chat> getChatMensaje(ServerRequest serverRequest) {
//        return useCase.getChatMensaje(getQueryParameter(serverRequest, PARAMETER_ID))
//                .collectList()
//                .map(ChatList::new)
//                .flatMap(chatList -> ServerResponse.ok().bodyValue(chatList));
//    }

    public static String getQueryParameter(ServerRequest serverRequest, String paramName) {
        return serverRequest.queryParam(paramName).orElse(null);
    }

    public Mono<ServerResponse> enviarMensaje(ServerRequest serverRequest) {

        return serverRequest.bodyToMono(Chat.class)
                .flatMap(chat -> useCase.enviarMensaje(chat))
                .flatMap(chat1 -> ServerResponse.ok().bodyValue(""));
    }
}
