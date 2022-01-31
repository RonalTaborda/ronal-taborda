package co.com.chatwhatsapp.mongo;

import co.com.chatwhatsapp.model.chat.Chat;
import co.com.chatwhatsapp.mongo.data.ChatData;
import co.com.chatwhatsapp.mongo.data.GrupoData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

public interface MongoDBRRepositoryChat extends ReactiveMongoRepository<ChatData, String> {

    @Tailable
    public Flux<Chat> findWithTailableCursorByChatId(String chatId);


}
