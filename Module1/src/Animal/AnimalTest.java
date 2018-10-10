package Animal;
public class AnimalTest {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new chicken();
        animals[1] = new Tiger();
        for(Animal animal: animals){
            animal.makeSound();
            System.out.println(animal.makeSound());
        }
    }
}
