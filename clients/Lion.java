package clients;
import java.time.LocalDate;

public class Lion extends Animal {
    public Lion(String name, float weight, LocalDate age, Owner owner,boolean toGo, boolean toSwim,boolean fly) {
        super(name, weight, age, owner,true, true,false);
    }

    public Lion() {
        super();
    }
    @Override
    public void toGo() {
        System.out.println("Лева гуляет");
    }
    @Override
    public void fly() {
        System.out.println("Лева не может летать");
    }
    @Override
    public void toSwim() {
        System.out.println("Лева плавает");
    }

}
