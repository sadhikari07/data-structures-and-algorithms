package java401_code_challenges.fifoAnimalShelter;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnimalShelterTest {


    public AnimalShelter enqueueDogs(){
        AnimalShelter thisAnimalShelter = new AnimalShelter();
        AnimalShelter.Dog newDog = new AnimalShelter.Dog();
        AnimalShelter.Dog newDog0 = new AnimalShelter.Dog();
        AnimalShelter.Dog newDog1 = new AnimalShelter.Dog();
        AnimalShelter.Dog newDog2 = new AnimalShelter.Dog();
        AnimalShelter.Dog newDog3 = new AnimalShelter.Dog();
        thisAnimalShelter.enqueueAnimal(newDog);
        thisAnimalShelter.enqueueAnimal(newDog1);
        thisAnimalShelter.enqueueAnimal(newDog2);
        thisAnimalShelter.enqueueAnimal(newDog3);
        return thisAnimalShelter;
    }

    public  AnimalShelter enqueueCats(){
        AnimalShelter thisAnimalShelter = new AnimalShelter();
        AnimalShelter.Cat newCat = new AnimalShelter.Cat();
        AnimalShelter.Cat newCat1 = new AnimalShelter.Cat();
        AnimalShelter.Cat newCat2 = new AnimalShelter.Cat();
        AnimalShelter.Cat newCat3 = new AnimalShelter.Cat();
        thisAnimalShelter.enqueueAnimal(newCat);
        thisAnimalShelter.enqueueAnimal(newCat1);
        thisAnimalShelter.enqueueAnimal(newCat2);
        thisAnimalShelter.enqueueAnimal(newCat3);
        return thisAnimalShelter;
    }


    @Test
    public void testEnqueueDog() {
        AnimalShelter test = enqueueDogs();
        assertEquals("There should be a dog on the front of the queue.", test.dogQueue.peek().animalType, "dog");
    }

    @Test
    public void testEnqueueCat() {
        AnimalShelter test = enqueueCats();
        assertEquals("There should be a cat on the front of the queue.", test.catQueue.peek().animalType, "cat");
    }

    @Test
    public void testEnqueueMultipleDogs() {
        AnimalShelter test = enqueueDogs();
        ArrayList arrayOfDogs = new ArrayList();
        while (test.dogQueue.front!=null){
            arrayOfDogs.add(test.dogQueue.peek());
            test.dogQueue.front = test.dogQueue.front.next;
        }
        assertEquals("There should be four dogs in the queue.", 4, arrayOfDogs.size());
    }

    @Test
    public void testEnqueueMultipleCats() {
        AnimalShelter test =  enqueueCats();
        ArrayList arrayOfCats = new ArrayList();
        while (test.catQueue.front!=null){
            arrayOfCats.add(test.catQueue.peek());
            test.catQueue.front = test.catQueue.front.next;
        }
        assertEquals("There should be four dogs in the queue.", 4, arrayOfCats.size());
    }

    @Test
    public void testDequeueCat() {
        AnimalShelter test = enqueueCats();
        String animalOutput = test.dequeueAnimal("cat").animalType;
        assertEquals("Cat should be removed from cat queue.", animalOutput, "cat");
    }

    @Test
    public void testDequeueDog() {
        AnimalShelter test = enqueueDogs();
        String animalOutput = test.dequeueAnimal("dog").animalType;
        assertEquals("Dog should be removed from cat queue.", animalOutput, "dog");
    }

    @Test
    public void testInvalidDeque() {
        AnimalShelter test =  enqueueDogs();
        assertNull("If invalid item is intended to be removed, output should be null.", test.dequeueAnimal("doggy"));
    }



}
