package ifmo.lab3.entities;

import ifmo.lab3.Exceptions.ContainerTooHeavyException;

import java.util.ArrayList;

public class Bench extends Container {
    public void overturn() throws ContainerTooHeavyException {
        if (this.contentList.size()>6){
            throw new ContainerTooHeavyException("Bench is too heavy");
        }
        System.out.println("Bench overturned");
        for (Element juror: this.contentList){
            ((Juror)juror).beat();
        }
    }

    public Bench (ArrayList<Juror> contentList) {
        super(contentList);
    }
}