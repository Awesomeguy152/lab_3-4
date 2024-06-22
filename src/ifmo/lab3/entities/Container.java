package ifmo.lab3.entities;

import ifmo.lab3.interfaces.Overturnable;

import java.util.ArrayList;

public abstract class Container implements Overturnable {
    protected ArrayList<Element> contentList;

    public Container(ArrayList contentList) {
        this.contentList = contentList;
    }
}

// new void Container() параметры конструктора