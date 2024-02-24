import clients.Lion;
import clients.Ostrich;
import clients.Owner;
import clients.Animal;
import clients.Bird;
import clients.Cat;
import clients.Dog;
import clients.Duck;
import clients.Fish;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лева", 200, LocalDate.now(), new Owner(),true, true,false);
        Dog sharik = new Dog("Шарик", 5, LocalDate.now(), new Owner(),true, true,false);
        Cat vaska = new Cat("Вася", 5, LocalDate.now(), new Owner(),true, true,false);
        Duck petya = new Duck("Петя", 1, LocalDate.now(), new Owner(),true, true,true);
        Bird kesha = new Bird("Кеша", 0.5f, LocalDate.now(), new Owner(),true, false,true);
        Fish karp = new Fish("Карп", 0.1f, LocalDate.now(), new Owner(),false, true,false);
        Ostrich straus = new Ostrich("Нанду", 90, LocalDate.now(), new Owner(),true, true,false);

        sharik.fly();
        sharik.toGo();
        vaska.fly();
        straus.toSwim();
        karp.fly();
        // Lion test = new Lion();
        // System.out.println(test);
        
        // kuzma.liveCycle();

        // List<Animal> animals = new ArrayList<>();
        // animals.add(leva);
        // animals.add(kuzma);
        // animals.add(bobik);
        // animals.add(sharik);
        // System.out.println(animals);
    }
}
