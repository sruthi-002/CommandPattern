package com.company;
public class Menuoptions {
    DocOpen open;
    DocSave save;

    public Menuoptions(DocOpen open, DocSave save) {
        this.open = open;
        this.save = save;
    }

    public void clickopen()
    {
        open.execute();
    }
    public void clicksave()
    {
        save.execute();
    }
}
