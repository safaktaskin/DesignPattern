package com.uniyaz.state;

public class EngineOffState implements State {

    public void off(final Engine engine) {
        // off konumunda olan bir
        // motorun tekrar off() metodu
        // kullanılarak kapatilmak
        // istenmesi anlamsız.
        System.out.println("Motor kapalı durumda!");
    }
    public void on(final Engine engine) {
        engine.setState(new EngineOnState());
        System.out.println("Motor çalıştı...");

    }


}
