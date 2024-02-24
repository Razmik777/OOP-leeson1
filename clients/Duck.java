package clients;
import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String name, float weight, LocalDate age, Owner owner,boolean toGo, boolean toSwim,boolean fly) {
        super(name, weight, age, owner,true,true,false);
    }

    @Override
    public void toGo() {
        System.out.println("Петя гуляет");
    }
    @Override
    public void fly() {
        System.out.println("Петя летает");
    }
    @Override
    public void toSwim() {
        System.out.println("Петя плавает");
    }
}
