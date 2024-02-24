package clients;
import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String name, float weight, LocalDate age, Owner owner,boolean toGo, boolean toSwim,boolean fly) {
        super(name, weight, age, owner, false, true, false);
    }

    @Override
    public void toGo() {
        System.out.println("Карп не умеет гулять");
    }
    @Override
    public void fly() {
        System.out.println("Карп не умеет летать");
    }
    @Override
    public void toSwim() {
        System.out.println("Карп плавает");
    }
}
