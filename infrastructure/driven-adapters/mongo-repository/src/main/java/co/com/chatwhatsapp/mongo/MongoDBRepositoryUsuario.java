package co.com.chatwhatsapp.mongo;

import co.com.chatwhatsapp.mongo.data.UsuarioData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryUsuario extends ReactiveMongoRepository<UsuarioData, String>, ReactiveQueryByExampleExecutor<UsuarioData> {
}
