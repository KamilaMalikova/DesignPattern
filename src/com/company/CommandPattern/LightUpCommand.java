package com.company.CommandPattern;

public class LightUpCommand implements ICommand{
    private Receiver Light;
    public LightUpCommand(Receiver light){
        this.Light = light;
    }
    @Override
    public void execute() {
        this.Light.up();
    }

    @Override
    public void unexecute() {
        this.Light.down();
    }

}
