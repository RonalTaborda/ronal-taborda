package co.com.chatwhatsapp.mongo;

import co.com.chatwhatsapp.model.grupo.Grupo;
import co.com.chatwhatsapp.model.grupo.gateways.GrupoRepository;
import co.com.chatwhatsapp.mongo.data.GrupoData;
import co.com.chatwhatsapp.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Grupo, GrupoData, String, MongoDBRepository>
        implements GrupoRepository {

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Grupo.GrupoBuilder.class).build());
    }

    @Override
    public Mono<Grupo> findIdGroup(String id) {
        return super.findById(id);
    }

    @Override
    public Mono<Grupo> createGroup(Grupo grupo) {
        return super.save(grupo);
    }
}
