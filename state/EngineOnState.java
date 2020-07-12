package com.uniyaz.state;

public class EngineOnState implements State {

    public void on(final Engine engine) {
    // on konumunda olan bir
    // motorun tekrar on() metodu
    // kullanılarak acilmak
    // istenmesi anlamsız.
        System.out.println("Motor çalışır durumda!");

    }

    public void off(final Engine engine) {
        engine.setState(new EngineOffState());
        System.out.println("Motor durduruldu...");
    }
}
