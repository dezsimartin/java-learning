package main;

import java.util.Objects;

public abstract class Animal {              // Absztrakt osztály = nem lehet példányosítani

    private String name;
    private int age;
    private boolean isMammal;
    // láthatóságok: private - csak osztályon belül
    // protected - csomagon belül (adott osztály, csomagban, leszármazottban is)
    // nem adunk meg láthatóságot - adott osztályban, adott csomagban látszik, de sem kívül, sem a leszármazottban nem
    // public - mindenhol látszik

  /*  public Animal() {                                                           // default konstruktor
        this.name = "";
        this.age = 0;
        this.isMammal = false;
    }*/

    public Animal(String name, int age, boolean isMammal) {                    //konstruktor - public, létrehozza az objectumot
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal(String name) {                                               //konstruktor overloading, ugyanaz a fgv. fejléce, de eltérő paraméterlista, típusban vagy mennyiségben eltérő
        this.name = name;
        this.age = 0;
        this.isMammal = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                isMammal() == animal.isMammal() &&
                getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isMammal());
    }

    public abstract void sound();           // absztrakt függvény: nem implementáljuk, csak a származtatott osztályban fogjuk

    public String sayHello() {
        return "Szia," + name + "vagyok," + age + "éves," + (isMammal ? "emlős." : "nemlős.");
    }

    public String toString() {
        return "Szia," + name + "vagyok," + age + "éves," + (isMammal ? "emlős." : "nemlős.");
    }

    public String getName() {               //getter, adattag értéket ad vissza
        return name;
    }

    public void setName(String name) {      //setter, általában void
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age && age < 30) {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
}
