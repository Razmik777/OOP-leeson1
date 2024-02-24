package clients;

import java.time.LocalDate;

public class Bird extends Animal {
    public Bird(String name, float weight, LocalDate age, Owner owner,boolean toGo, boolean toSwim,boolean fly) {
        super(name, weight, age, owner,true, false,true);
    }

    @Override
    public void toGo() {
        System.out.println("Кеша гуляет");
    }
    @Override
    public void fly() {
        System.out.println("Кеша летает");
    }
    @Override
    public void toSwim() {
        System.out.println("Кеша не умеет плавать");
    }
}
