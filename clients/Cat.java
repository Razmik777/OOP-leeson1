package clients;
import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, float weight, LocalDate age, Owner owner,boolean toGo, boolean toSwim,boolean fly) {
        super(name, weight, age, owner,false, true,false);

    }
    @Override
    public void toGo() {
        System.out.println("Васька гуляет");
    }
    @Override
    public void fly() {
        System.out.println("Васька не может летать");
    }
    @Override
    public void toSwim() {
        System.out.println("Васька очень боится воды - поэтому он не плавает");
    }

}
