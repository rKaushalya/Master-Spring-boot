package com.in28miniutes.learnspringframework;

import com.in28miniutes.learnspringframework.game.GameRunner;
import com.in28miniutes.learnspringframework.game.GamingConsole;
import com.in28miniutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class);){
            context.getBean(GameRunner.class).run();
        }
    }
}
