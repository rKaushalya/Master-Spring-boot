package com.in28miniutes.learnspringframework;

import com.in28miniutes.learnspringframework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
