package peaksoft.spring;

public class Person {

    private String name;
    private byte age;
    private Animal animal;

    public Person() {
    }

    public Person(String name, byte age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public void callAnimal() {
        animal.animalPlus();
        animal.animalMinus();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal +
                ' ';
    }
}
