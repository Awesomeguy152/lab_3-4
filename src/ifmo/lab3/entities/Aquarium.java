package ifmo.lab3.entities;

import java.util.ArrayList;

public class Aquarium extends Container {
    public void overturn(){
        System.out.println("aquarium overturned");
        for (Element fish: this.contentList){
            ((GoldFish)fish).beat();
        }
    }

    public Aquarium(ArrayList<GoldFish> contentList) {
        super(contentList);
    }
}
