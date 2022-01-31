package co.com.chatwhatsapp.grupo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;


@Configuration
public class RouterRest {
    @Bean
    public RouterFunction<ServerResponse> routerGrupo(Handler handler) {
        return route()
                .GET("/grupo/{id}", handler::findGroup)
                .POST("/grupo", handler::createGroup)
                .build();

    }
}
