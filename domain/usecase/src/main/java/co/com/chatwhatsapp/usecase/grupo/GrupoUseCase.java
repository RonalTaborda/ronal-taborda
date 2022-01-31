package co.com.chatwhatsapp.usecase.grupo;

import co.com.chatwhatsapp.model.grupo.Grupo;
import co.com.chatwhatsapp.model.grupo.gateways.GrupoRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GrupoUseCase {
    private final GrupoRepository grupoRepository;


    public Mono<Grupo> findGroup(String id){
        return grupoRepository.findIdGroup(id);
    }

    public Mono<Grupo> createGroup(Grupo grupo){
        return grupoRepository.createGroup(grupo);
    }

}
