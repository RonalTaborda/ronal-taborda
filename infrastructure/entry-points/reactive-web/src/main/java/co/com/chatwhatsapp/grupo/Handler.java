package co.com.chatwhatsapp.grupo;

import co.com.chatwhatsapp.model.grupo.Grupo;
import co.com.chatwhatsapp.model.usuario.Usuario;
import co.com.chatwhatsapp.usecase.grupo.GrupoUseCase;
import co.com.chatwhatsapp.usecase.usuario.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private final GrupoUseCase useCase;
    public static final String PARAMETER_ID = "id";
    public Mono<ServerResponse> findGroup(ServerRequest serverRequest) {
        return  useCase.findGroup(serverRequest.pathVariable(PARAMETER_ID))
                .flatMap(grupo -> ServerResponse.ok().bodyValue(grupo));
    }

    public Mono<ServerResponse> createGroup(ServerRequest serverRequest) {

        return serverRequest.bodyToMono(Grupo.class)
                .flatMap(grupo -> useCase.createGroup(grupo))
                .flatMap(grupo1 -> ServerResponse.ok().bodyValue(grupo1));
    }
}
