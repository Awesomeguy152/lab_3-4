package ifmo.lab3.entities;

import ifmo.lab3.interfaces.Beatable;

public class GoldFish extends Element implements Beatable {
    public void beat(){
        System.out.println("golden fish beats");
    }
}
