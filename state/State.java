package com.uniyaz.state;

public interface State {
    void on(Engine engine);
    void off(Engine engine);

}
