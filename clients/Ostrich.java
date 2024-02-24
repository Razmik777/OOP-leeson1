package clients;
import java.time.LocalDate;

public class Ostrich extends Animal {
    public Ostrich(String name, float weight, LocalDate age, Owner owner,boolean toGo, boolean toSwim,boolean fly) {
        super(name, weight, age, owner,true,false,false);
    }

    @Override
    public void toGo() {
        System.out.println("Нанду гуляет");
    }
    @Override
    public void fly() {
        System.out.println("Нанду не может летать");
    }
    @Override
    public void toSwim() {
        System.out.println("Нанду плавает");
    }
}
