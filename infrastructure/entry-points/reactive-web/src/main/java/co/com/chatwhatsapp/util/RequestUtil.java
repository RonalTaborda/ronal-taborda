package co.com.chatwhatsapp.util;


import co.com.chatwhatsapp.model.usuario.Usuario;
import co.com.chatwhatsapp.util.dto.UsuarioDTO;
import co.com.chatwhatsapp.util.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class RequestUtil {

    private final UsuarioMapper usuarioMapper;

    public Mono<Usuario> getBody(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(UsuarioDTO.class)
                .map(usuarioMapper::toData);
    }


}
