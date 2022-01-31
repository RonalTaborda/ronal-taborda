package co.com.chatwhatsapp.chat;

import co.com.chatwhatsapp.model.chat.Chat;
import co.com.chatwhatsapp.usecase.chat.ChatUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@RestController
@RequiredArgsConstructor
public class RouterRestChat {

    private final ChatUseCase useCase;

    @GetMapping(value = "/chats/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Chat> streamMessages(@RequestParam String chatId){
        return useCase.getChatMensaje(chatId);
    }

    @PostMapping("/chats")
    @ResponseStatus(HttpStatus.CREATED)
    public void postChat(@RequestBody Chat chatMessage){
        useCase.enviarMensaje(chatMessage).subscribe();
    }

}
