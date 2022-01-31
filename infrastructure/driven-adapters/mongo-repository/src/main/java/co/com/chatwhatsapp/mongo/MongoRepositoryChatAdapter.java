package co.com.chatwhatsapp.mongo;

import co.com.chatwhatsapp.model.chat.Chat;
import co.com.chatwhatsapp.model.chat.gateways.ChatRepository;
import co.com.chatwhatsapp.model.usuario.Usuario;
import co.com.chatwhatsapp.model.usuario.gateways.UsuarioRepository;
import co.com.chatwhatsapp.mongo.data.ChatData;
import co.com.chatwhatsapp.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Repository
public class MongoRepositoryChatAdapter extends AdapterOperations<Chat, ChatData, String, MongoDBRRepositoryChat> implements ChatRepository {

    public MongoRepositoryChatAdapter(MongoDBRRepositoryChat repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Chat.ChatBuilder.class).build());
    }

    @Override
    public Mono<Chat> sendChat(Chat mensaje) {
       return super.save(mensaje);
    }

    @Override
    public Flux<Chat> mensajesChat(String chatId) {
        return repository.findWithTailableCursorByChatId(chatId);
    }
}
