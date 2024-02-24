package clients;

import java.time.LocalDate;

public class Animal {

    protected String name;

    protected float weight;

    protected LocalDate age;

    protected Owner owner;

    protected boolean fly;

    protected boolean toGo;

    protected boolean toSwim;

    public Animal(String name, float weight, LocalDate age, Owner owner,boolean toGo, boolean toSwim,boolean fly) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
        this.fly = fly;
        this.toGo = toGo;
        this.toSwim = toSwim;
    }

    public Animal() {
        this("animal", 80, LocalDate.now(), new Owner(),false, false,false);
        // this.name = "animal";
        // this.weight = 80;
        // this.age = LocalDate.now();
        // this.owner = new Owner();
    }

    private void sleep() {
        System.out.println(getType() + " спит");
    }

    private void wakeUp() {
        System.out.println(getType() + " просыпается");
    }

    private void wakeUp(int time) {
        System.out.println(getType() + " просыпается в " + time);
    }

    private void eat() {
        System.out.println(getType() + " ест");
    }

    private void play() {
        System.out.println(getType() + " играет");
    }

    public void toGo() {
        System.out.println(getType() + " гуляет");
    }

    public void fly() {
        System.out.println(getType() + " летает");
    }

    public void toSwim() {
        System.out.println(getType() + " плавает");
    }

    public void liveCycle() {
        wakeUp(8);
        eat();
        play();
        sleep();
    }
   
    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s", name, weight, age, owner);
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }
    public boolean isFly() {
        return fly;
    }
    public boolean isToGo() {
        return toGo;
    }
    public boolean isToSwim() {
        return toSwim;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public void setFly(boolean fly) {
        this.fly = fly;
    }
    public void setToGo(boolean toGo) {
        this.toGo = toGo;
    }
    public void setToSwim(boolean toSwim) {
        this.toSwim = toSwim;
    }

}