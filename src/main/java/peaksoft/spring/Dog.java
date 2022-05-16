package peaksoft.spring;

public class Dog extends AnimalInfo implements Animal{

    @Override
    public void animalPlus() {
        System.out.println("Dog Bean is initialized. Init method has worked!!");
    }

    @Override
    public void animalMinus() {
        System.out.println("Dog Bean is destroyed. Destroy method has worked");
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
