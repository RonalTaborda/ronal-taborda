package co.com.chatwhatsapp.usecase.usuario;

import co.com.chatwhatsapp.model.usuario.Usuario;
import co.com.chatwhatsapp.model.usuario.gateways.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class UsuarioUseCase {

    public final UsuarioRepository usuarioRepository;

    public Mono<Usuario> saveUser(Usuario usuario){
        return usuarioRepository.saveUsuario(usuario);
    }

    public Mono<Usuario> getUserById(String id){
        return usuarioRepository.getUsuarioById(id);
    }
}
