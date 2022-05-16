package peaksoft.spring;

public class Horse extends AnimalInfo implements Animal{

    @Override
    public void animalPlus() {
        System.out.println("Horse Bean is initialized. Init method has worked!!");
    }

    @Override
    public void animalMinus() {
        System.out.println("Horse Bean is destroyed. Destroy method has worked");
    }

    @Override
    public String toString() {
        return "Horse " + super.toString();
    }
}
