package com.in28miniutes.learnspringframework.game;

public class PacmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Run");
    }

    @Override
    public void down() {
        System.out.println("Back");
    }

    @Override
    public void left() {
        System.out.println("Go Left");
    }

    @Override
    public void right() {
        System.out.println("Go Right");
    }
}
