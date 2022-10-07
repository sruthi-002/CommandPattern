package com.company;
public class DocOpen implements Doc {
    Document d;
    public DocOpen(Document d) {
        this.d = d;
    }
    public void execute()
    {
        d.open();
    }
}
