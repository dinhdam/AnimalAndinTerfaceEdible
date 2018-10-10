package Animal;

public class AnimalEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof chicken) {
                System.out.println(((chicken) animal).howtoEat());
            }
        }

    }
}

