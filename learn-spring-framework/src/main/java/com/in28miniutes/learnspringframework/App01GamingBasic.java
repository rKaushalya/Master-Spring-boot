package com.in28miniutes.learnspringframework;

import com.in28miniutes.learnspringframework.game.GameRunner;
import com.in28miniutes.learnspringframework.game.PacmanGame;

public class App01GamingBasic {
    public static void main(String[] args) {
        //        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
