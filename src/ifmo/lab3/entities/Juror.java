package ifmo.lab3.entities;

import ifmo.lab3.interfaces.Beatable;

import java.util.Objects;

public class Juror extends Element implements Beatable {

    public Juror(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public interface JurorOpinion{
        public void express();
    }

    public String name;
    public String surname;
    public void ExpressOpinion(){
        JurorOpinion opinion = new JurorOpinion() {
            @Override
            public void express() {
                System.out.println("Hanging");
            }
        };
        opinion.express();
    }

    public void beat(){
        System.out.println("Juror beats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juror juror = (Juror) o;
        return Objects.equals(surname, juror.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}
