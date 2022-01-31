package co.com.chatwhatsapp.util.mapper;

import co.com.chatwhatsapp.model.chat.Chat;
import co.com.chatwhatsapp.util.dto.ChatDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ChatMapper {
    Chat toData(ChatDTO chatDTO);
}
