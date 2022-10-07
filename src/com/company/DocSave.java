package com.company;
public class DocSave implements Doc {
    Document d;
    public DocSave(Document d) {
        this.d = d;
    }
    @Override
    public void execute()
    {
        d.save();
    }
}
