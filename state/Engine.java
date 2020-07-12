package com.uniyaz.state;

public class Engine {
    private State state;
    public Engine() {
// Motor ilk olarak
// kapalı durumuna getirilir.
        setState(new EngineOffState());
        System.out.println("Motor kapalı.");
    }
    public void start() {
        getState().on(this);
    }
    public void stop() {
        getState().off(this);
    }
    public State getState() {
        return state;
    }
    public void setState(final State state) {
        this.state = state;
    }
}
