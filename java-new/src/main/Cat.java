package main;

public class Cat extends Animal {                                                           //öröklődés Animal osztályból, legfeljebb 1 ős lehet

    private int numberOfLifes;

    public Cat(String name, int age, int numberOfLifes) {
        super(name, age, true);                                                 //ősosztály konstrukor meghívás, ha nincs default.
        this.numberOfLifes = numberOfLifes;

    }

    @Override
    public String sayHello() {                                                             //method override, ősosztály fgv-.t felüldefiniáljuk
        return super.sayHello() + "és életeim száma: " + numberOfLifes;
    }

    public void sound() {
        System.out.println("meow");                                                         //absztrakt függvény implementálás
    }

}
