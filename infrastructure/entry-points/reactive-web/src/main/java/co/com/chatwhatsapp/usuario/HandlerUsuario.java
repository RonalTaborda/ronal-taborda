package co.com.chatwhatsapp.usuario;

import co.com.chatwhatsapp.model.usuario.Usuario;
import co.com.chatwhatsapp.usecase.usuario.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class HandlerUsuario {
    public static final String PARAMETER_ID = "id";
    private final UsuarioUseCase useCase;

    @NonNull
    public Mono<ServerResponse> saveUser(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Usuario.class)
                .flatMap(usuario -> useCase.saveUser(usuario))
                .flatMap(usuario1 -> ServerResponse.ok().bodyValue(usuario1));
    }

    @NonNull
    public Mono<ServerResponse> getUserById(ServerRequest serverRequest) {
        return useCase.getUserById(serverRequest.pathVariable(PARAMETER_ID))
                .flatMap(usuario1 -> ServerResponse.ok().bodyValue(usuario1));
    }
}
