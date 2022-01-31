package co.com.chatwhatsapp.mongo;

import co.com.chatwhatsapp.model.usuario.Usuario;
import co.com.chatwhatsapp.model.usuario.gateways.UsuarioRepository;
import co.com.chatwhatsapp.mongo.data.UsuarioData;
import co.com.chatwhatsapp.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class MongoRepositoryUsuarioAdapter extends AdapterOperations<Usuario, UsuarioData, String, MongoDBRepositoryUsuario>
        implements UsuarioRepository {

    public MongoRepositoryUsuarioAdapter(MongoDBRepositoryUsuario repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Usuario.UsuarioBuilder.class).build());
    }

    @Override
    public Mono<Usuario> saveUsuario(Usuario usuario) {
        return super.save(usuario);
    }

    @Override
    public Mono<Usuario> getUsuarioById(String id) {
        return super.findById(id);
    }
}
