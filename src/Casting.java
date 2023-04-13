public class Casting {
    public static void main(String[] args){
        Animal myAnimal = new Dog();
        Animal myAnimal1 = new Cat();
        //Cat myDog = new Cat();

        doAnimalStuff(myAnimal);
        doAnimalStuff(myAnimal1);

    }
    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();

        if(animal instanceof Dog){
            Dog myDog = (Dog)animal;
            myDog.growl();
        }
        else if(animal instanceof Cat){
            Cat myDog = (Cat)animal;
            myDog.unghia();
        }
    }



}
