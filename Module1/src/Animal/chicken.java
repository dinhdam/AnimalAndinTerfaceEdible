package Animal;

import Edible.Edible;

public class chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken = quác,quác";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
