package java401_code_challenges.fifoAnimalShelter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnimalShelterTest {


    public static void enqueueDogs(){
        AnimalShelter thisAnimalShelter = new AnimalShelter();
        AnimalShelter.dog newDog = new AnimalShelter.dog();
        AnimalShelter.dog newDog1 = new AnimalShelter.dog();
        AnimalShelter.dog newDog2 = new AnimalShelter.dog();
        AnimalShelter.dog newDog3 = new AnimalShelter.dog();
        thisAnimalShelter.enqueueAnimal(newDog);
        thisAnimalShelter.enqueueAnimal(newDog1);
        thisAnimalShelter.enqueueAnimal(newDog2);
        thisAnimalShelter.enqueueAnimal(newDog3);
    }

    public static void clearDogQueue(){
        while(AnimalShelter.dogQueue.front!=null){
            AnimalShelter.dogQueue.dequeue();
            AnimalShelter.dogQueue.front = AnimalShelter.dogQueue.front.next;
        }
    }


    public static void enqueueCats(){
        AnimalShelter thisAnimalShelter = new AnimalShelter();
        AnimalShelter.cat newCat = new AnimalShelter.cat();
        AnimalShelter.cat newCat1 = new AnimalShelter.cat();
        AnimalShelter.cat newCat2 = new AnimalShelter.cat();
        AnimalShelter.cat newCat3 = new AnimalShelter.cat();
        thisAnimalShelter.enqueueAnimal(newCat);
        thisAnimalShelter.enqueueAnimal(newCat1);
        thisAnimalShelter.enqueueAnimal(newCat2);
        thisAnimalShelter.enqueueAnimal(newCat3);
    }

    public static void clearCatQueue(){
        while(AnimalShelter.catQueue.front!=null){
            AnimalShelter.catQueue.dequeue();
            AnimalShelter.catQueue.front = AnimalShelter.catQueue.front.next;
        }
    }



    @Test
    public void testEnqueueDog() {
        clearDogQueue();
        enqueueDogs();
        assertEquals("There should be a dog on the front of the queue.", AnimalShelter.dogQueue.peek().animalType, "dog");
    }

    @Test
    public void testEnqueueCat() {
        clearCatQueue();
        enqueueCats();
        assertEquals("There should be a cat on the front of the queue.", AnimalShelter.catQueue.peek().animalType, "cat");
    }

    @Test
    public void testEnqueueMultipleDogs() {
        AnimalShelter thisAnimalShelter = new AnimalShelter();
        clearDogQueue();
        enqueueDogs();
        ArrayList arrayOfDogs = new ArrayList();
        while (AnimalShelter.dogQueue.front!=null){
            arrayOfDogs.add(AnimalShelter.dogQueue.peek());
            AnimalShelter.dogQueue.front = AnimalShelter.dogQueue.front.next;
        }
        assertEquals("There should be four dogs in the queue.", 4, arrayOfDogs.size());
    }

    @Test
    public void testEnqueueMultipleCats() {
        clearCatQueue();
        enqueueCats();
        ArrayList arrayOfCats = new ArrayList();
        while (AnimalShelter.catQueue.front!=null){
            arrayOfCats.add(AnimalShelter.catQueue.peek());
            AnimalShelter.catQueue.front = AnimalShelter.catQueue.front.next;
        }
        assertEquals("There should be four dogs in the queue.", 4, arrayOfCats.size());
    }

    @Test
    public void testDequeueCat() {
        clearCatQueue();
        enqueueCats();
        String animalOutput = AnimalShelter.dequeueAnimal("cat").animalType;
        assertEquals("Cat should be removed from cat queue.", animalOutput, "cat");
    }

    @Test
    public void testDequeueDog() {
        clearDogQueue();
        enqueueDogs();
        String animalOutput = AnimalShelter.dequeueAnimal("dog").animalType;
        assertEquals("Dog should be removed from cat queue.", animalOutput, "dog");
    }

    @Test
    public void testInvalidDeque() {
        clearDogQueue();
        enqueueDogs();
        assertNull("If invalid item is intended to be removed, output should be null.", AnimalShelter.dequeueAnimal("doggy"));
    }



}
