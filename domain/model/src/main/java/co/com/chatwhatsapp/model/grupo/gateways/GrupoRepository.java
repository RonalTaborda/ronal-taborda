package co.com.chatwhatsapp.model.grupo.gateways;

import co.com.chatwhatsapp.model.grupo.Grupo;
import reactor.core.publisher.Mono;

public interface GrupoRepository {
    Mono<Grupo> findIdGroup(String id);
    Mono<Grupo> createGroup(Grupo grupo);
}
