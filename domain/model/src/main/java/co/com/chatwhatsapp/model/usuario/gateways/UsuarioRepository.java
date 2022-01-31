package co.com.chatwhatsapp.model.usuario.gateways;

import co.com.chatwhatsapp.model.usuario.Usuario;
import reactor.core.publisher.Mono;

public interface UsuarioRepository {
    Mono<Usuario> saveUsuario(Usuario usuario);

    Mono<Usuario> getUsuarioById(String id);
}
