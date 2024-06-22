package ifmo.lab3.entities;

import ifmo.lab3.Exceptions.AliceSleepsException;
import ifmo.lab3.Exceptions.ContainerTooHeavyException;

public class Alice {
    public class AliceSkirt{
        public int size;
        public String color;
        public String material;

        public AliceSkirt(int size, String color, String material) {
            this.size = size;
            this.color = color;
            this.material = material;
        }
        public void overturnObject(Container object) throws ContainerTooHeavyException {
            object.overturn();
        }
    }
    private int height;
    private boolean sleep;
    private AliceSkirt skirt;
    public void grow(){
        this.height = Math.min(this.height+1, AliceHeight.HIGH.ordinal());
    }

    public Alice() {
        this.sleep=false;
        this.height = AliceHeight.LOW.ordinal();
        this.skirt = new AliceSkirt(42, "green", "leather");
    }
    static class AliceSoul{
        public static void soulHurts(){
            System.out.println("ouch :( ");
        };
        public static void soulSings(){
            System.out.println("Life is as perfect");
        };
    }
    public void tryToSleep(){
        if  (Math.random()>0.5){
            this.sleep=true;
        }
        if (this.sleep){
            Alice.AliceSoul.soulSings();
            throw new AliceSleepsException("Alise felt asleep");
        }
    }

    public boolean standUpAndCheckOverturn(){
        System.out.println("Alice standUp");
        if (this.height == AliceHeight.HIGH.ordinal() ){
            return true;
        }
        return false;
    }
    public void overturnObject(Container object) throws ContainerTooHeavyException {
        System.out.println("Alice tries to overturn object ");
        this.skirt.overturnObject(object);
        Alice.AliceSoul.soulHurts();
    }
}
