package clients;
import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, float weight, LocalDate age, Owner owner, boolean toGo, boolean toSwim,boolean fly) {
        super(name, weight, age, owner,true, true,false);
    }

    @Override
    public void toGo() {
        System.out.println("Шарик гуляет");
    }
    @Override
    public void fly() {
        System.out.println("Шарик не может летать");
    }
    @Override
    public void toSwim() {
        System.out.println("Шарик плавает");
    }
}
