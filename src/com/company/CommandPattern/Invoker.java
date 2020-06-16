package com.company.CommandPattern;

public class Invoker {
    ICommand on;
    ICommand off;
    ICommand up;
    ICommand down;
    public Invoker(LightOnCommand on, LightOffCommand off, LightUpCommand up, LightDownCommand down){
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn(){
        on.execute();
    }
    public void clickOff(){
        off.execute();
    }
    public void clickUp(){
        up.execute();
    }
    public void clickDown(){
        down.execute();
    }
}
