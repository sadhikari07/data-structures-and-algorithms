package java401_code_challenges.fifoAnimalShelter;

import java401_code_challenges.stack_and_queue.Queue;

public class AnimalShelter {

    public static class Animal{
        String animalType;
    }


    public static class dog extends Animal{
        dog(){
          animalType = "dog";
        }
    }

    public static class cat extends Animal{
        cat(){
            animalType = "cat";
        }
    }
    public static Queue<dog> dogQueue = new Queue<>();
    public static Queue<cat> catQueue = new Queue<>();

    public static void enqueueAnimal(Animal animal){

        if(animal.animalType == "dog"){
            dogQueue.enqueue((dog)animal);
        }
        if(animal.animalType == "cat"){
            catQueue.enqueue((cat)animal);
        }

    }

    public static Animal dequeueAnimal(String animalType){
        Animal animalToBeReturned = null;
            if(animalType == "dog"){
                if(dogQueue.peek()==null){
                    System.out.println("Cannot remove from where there is nothing.");
                    return null;
                }
                animalToBeReturned = dogQueue.dequeue();
            }
        else if(animalType == "cat"){
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