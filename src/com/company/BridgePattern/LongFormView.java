package com.company.BridgePattern;

public class LongFormView extends View{

    public LongFormView(IResource resource){
        super(resource);
    }
    @Override
    public String Show() {
        return this.getResource().snipped();
    }
}
