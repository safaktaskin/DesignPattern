package com.uniyaz.state;

public class App 
{
    public static void main(final String[] args) {
        final Engine engine = new Engine();
        engine.stop();
        engine.start();
        engine.start();
    }
}
