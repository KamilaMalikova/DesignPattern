package com.company.CommandPattern;

public class LightOffCommand implements ICommand{
    private Receiver Light;
    public LightOffCommand(Receiver light){
        this.Light = light;
    }
    @Override
    public void execute() {
        Light.lightOff();
    }

    @Override
    public void unexecute() {
        Light.lightOn();
    }

}
