package co.com.chatwhatsapp.mongo;


import co.com.chatwhatsapp.mongo.data.GrupoData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<GrupoData, String>, ReactiveQueryByExampleExecutor<GrupoData> {
}
