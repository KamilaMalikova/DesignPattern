package com.company.CommandPattern;

public class LightOnCommand implements ICommand{
    private Receiver Light;
    public LightOnCommand(Receiver light){
        this.Light = light;
    }
    @Override
    public void execute() {
        this.Light.lightOn();
    }

    @Override
    public void unexecute() {
        this.Light.lightOff();
    }
}
