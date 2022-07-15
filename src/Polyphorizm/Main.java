package Polyphorizm;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        for (Animal animal : animals) {
            if (animal instanceof Shark ) {
                ((Shark) animal).Attack();
            }else if (animal instanceof Turtle){
                ((Turtle) animal).Swim();
            }else if (animal instanceof  Eagle)
                ((Eagle) animal).Fly();
            System.out.println(animal.getClass());
        }
    }
}
