package app;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Animal> animals = new ArrayList<Animal>(); // lista de animales
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        animals.add(new Animal("ratata", true, false));
        animals.add(new Animal("lapras", false, true));



        System.out.println();

        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
        print(animals, a ->! a.canSwim ());

        print(animals, new CheckIfHopper()); // pasa la clase que hace la prueba
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
