package java401_code_challenges.fifoAnimalShelter;

import java401_code_challenges.stack_and_queue.Queue;

public class AnimalShelter {
    public Queue<Dog> dogQueue;
    public Queue<Cat> catQueue;

    public AnimalShelter(){
        dogQueue = new Queue<>();
        catQueue = new Queue<>();

    }


    // Animal class
    public static class Animal{
        String animalType;
    }

    //Dog class
    public static class Dog extends Animal{
        Dog(){
          animalType = "dog";
        }
    }

    //Cat class
    public static class Cat extends Animal{
        Cat(){
            animalType = "cat";
        }
    }


    public void enqueueAnimal(Animal animal){

        if(animal.animalType == "dog"){
            dogQueue.enqueue((Dog)animal);
        }
        else if(animal.animalType == "cat"){
            catQueue.enqueue((Cat)animal);
        }

    }

    public Animal dequeueAnimal(String animalType){
        Animal animalToBeReturned = null;
            if(animalType.equals("dog") ){
                if(dogQueue.peek()==null){
                    System.out.println("Cannot remove from where there is nothing.");
                    return null;
                }
                animalToBeReturned = dogQueue.dequeue();
            }
            else if(animalType.equals("cat")){
                if(catQueue.peek()==null){
                    System.out.println("Cannot remove from where there is nothing.");
                    return null;
                }
                animalToBeReturned = catQueue.dequeue();
            }
            else{
                System.out.println("Can only return a dog or a cat.");
                return null;
            }
        return animalToBeReturned;
    }
}



//References: https://codereview.stackexchange.com/questions/144312/animal-shelter-in-java
//https://gist.github.com/WOLOHAHA/95b927ab678e0d813549