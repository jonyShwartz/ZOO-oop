package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    //properties
    private String name;
    private List<Animal> animalList;
    private static int numberOfAnimals;
    protected Scanner sc;

    //constructors
    public Zoo(String name) throws  Exception{
        numberOfAnimals = 0;
        sc = new Scanner(System.in);
        this.setName(name);
        animalList = new ArrayList<>();
    }

    //validation of name
    public void setName(String name) throws Exception{
        if (name.isEmpty())
            throw new Exception("the name must contain at list 1 letter!");
        this.name = name;
    }

    //print all animals in array function
    public void printAllAnimals(){
        for(Animal animal:animalList)
            System.out.println(animal.toString());
    }

    //print all voices of animals in array
    public void printAllVices(){
        for(Animal animal:animalList)
            animal.printVoice();
    }

    //sort the array according to name
    public void sortAnimalList(){
        Animal helpAnimal;
        for (int i = 0; i < animalList.size(); i++){
            if(animalList.get(0).getName().compareTo(animalList.get(i).getName()) > 0){
                helpAnimal = animalList.get(i);
                animalList.remove(i);
                animalList.add(animalList.get(0));
                animalList.remove(0);
                animalList.add(0,helpAnimal);
            }
        }

    }

    //return index of animal according to name of animal
    public int returnIndexOfAnimal(String name){
        for(int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getName().compareTo(name) == 0)
                return i;
        }
        return  -1;
    }

    //toString function (not returning the array!!!)
    public String toString(){
        return "Zoo:\n" +
                "namme of zoo: " + this.name +
                "\nnumber of animals: " + this.numberOfAnimals;
    }

    //check for 2 objects equal
    public boolean equals(Zoo zoo){
        return this.numberOfAnimals == zoo.numberOfAnimals &&
                this.name == zoo.name &&
                this.animalList == animalList;
    }

    public void addAnimalToList(int typeOfAnimal) throws Exception {
        while(typeOfAnimal < 1 || typeOfAnimal > 5){
            System.out.println("enter again number between 0 to 5: ");
            typeOfAnimal = sc.nextInt();
        }
        switch (typeOfAnimal){
            case 1:
                this.animalList.add(new Mammel());
                numberOfAnimals ++;
                break;
            case 2:
                this.animalList.add(new Insect());
                numberOfAnimals++;
                break;
            case 3:
                this.animalList.add(new Lion());
                numberOfAnimals++;
                break;
            case 4:
                this.animalList.add(new Hourse());
                numberOfAnimals++;
                break;
            case 5:
                this.animalList.add(new Fly());
                numberOfAnimals++;
                break;
        }
    }

    public void removeAnimalFromList() throws Exception{
        String nameOfAnimalToRemove;
        System.out.println("Enter name of animal to remove: ");
        Scanner nsc = new Scanner(System.in);
        nameOfAnimalToRemove = nsc.nextLine();
        if(nameOfAnimalToRemove.isEmpty())
            throw new Exception("you must enter name of animal!");
        for(int i = 0; i < animalList.size(); i++){
            if(animalList.get(i).getName().equals(nameOfAnimalToRemove)) {
                animalList.remove(i);
                break;
            }
        }
    }

    public int checkHowMuchLions(){
        int numberOfLions = 0;
        for (Animal animal: animalList){
            if(animal.getType().equals("Lion"))
                numberOfLions++;
        }
        return numberOfLions;
    }

    public Animal theYoungestAnimal(Zoo zoo){
        Animal theYoungestAnimalFound = animalList.get(0);
        for (Animal animal: animalList){
            if(animal.getAge() < theYoungestAnimalFound.getAge())
                theYoungestAnimalFound = animal;
        }
        return  theYoungestAnimalFound;
    }

    public int CounterOfCommonAge(){
        int counterOfCommonAge = 0;
        int counterToCompare = 0;
        for (int i = 0; i < animalList.size(); i++){
            for (int j = 0; j < animalList.size(); j++) {
                if(animalList.get(j).getAge() == animalList.get(i).getAge())
                    counterToCompare++;
            }
            if(counterToCompare > counterOfCommonAge) {
                counterOfCommonAge = counterToCompare;
            }
            counterToCompare = 0;
        }
        return counterOfCommonAge;
    }

    public Zoo compareBetweenCommonAges(Zoo zoo){
        if(this.CounterOfCommonAge() > zoo.CounterOfCommonAge())
            return this;
        return zoo;
    }


}
