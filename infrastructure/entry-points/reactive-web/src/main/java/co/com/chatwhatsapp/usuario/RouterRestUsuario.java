package co.com.chatwhatsapp.usuario;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@RequiredArgsConstructor
@Configuration
public class RouterRestUsuario {
    @Bean
    public RouterFunction<ServerResponse> routerUsuario(HandlerUsuario handlerUsuario) {
        return route()
                .GET("/user/{id}", handlerUsuario::getUserById)
                .POST("/user", handlerUsuario::saveUser)
                .build();

    }
}
