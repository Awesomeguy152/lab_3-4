package ifmo.lab3;

import ifmo.lab3.Exceptions.ContainerTooHeavyException;
import ifmo.lab3.entities.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GoldFish> fishes = new ArrayList<>();
        fishes.add(new GoldFish());
        fishes.add(new GoldFish());
        ArrayList<Juror> jurors = new ArrayList<>();
        jurors.add(new Juror("Misha", "Ulanov"));
        jurors.add(new Juror("Nikita", "Pavlov"));
        jurors.add(new Juror("Maxim", "Volkov"));
        jurors.add(new Juror("Vladimir", "Kuksenko"));

        Aquarium aquarium = new Aquarium(fishes);
        for (int i=0; i<jurors.size(); i++){
            for (int j =0; j<jurors.size(); j++){
                if(i!=j){
                    if(jurors.get(i).equals(jurors.get(j))){
                        System.out.println("challenge to juror " + jurors.get(i));
                        System.out.println("challenge to juror " + jurors.get(j));
                        jurors.remove(i);
                    }
                }
            }
        }
        Bench bench = new Bench(jurors);
        Alice alice = new Alice();
        try {
            alice.overturnObject(aquarium);
        }
        catch (ContainerTooHeavyException e){
            System.out.println(e.getMessage());
        }
        alice.grow();
        alice.grow();
        alice.grow();
        alice.grow();
        alice.grow();
        alice.tryToSleep();
        for (int i=0; i < jurors.size(); i++ ){
            jurors.get(i).ExpressOpinion();
        }
        if (alice.standUpAndCheckOverturn()){
            try {
                alice.overturnObject(bench);
            }
            catch (ContainerTooHeavyException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(alice.getClass());
    }
}
