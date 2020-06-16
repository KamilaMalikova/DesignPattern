package com.company.CommandPattern;

public class LightDownCommand implements ICommand{
    private Receiver Light;
    public LightDownCommand(Receiver light){
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
