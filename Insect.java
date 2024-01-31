package test;

import java.util.Scanner;

public class Insect extends Animal{

    //properties
    private int numberOfLegs;

    //constructor
    public Insect() throws Exception{
        this.type = typeOfAnimal.Insect;

        sc = new Scanner(System.in);
        System.out.println("enter name of Insect: ");
        this.setName(sc.nextLine());
        System.out.println("enter age of Insect: ");
        this.setAge(sc.nextInt());
        System.out.println("enter number of legs: ");
        this.setNumberOfLegs(sc.nextInt());
    }

    //validation on name input
    @Override
    public void setName(String name) throws Exception {
        if (name.isEmpty())
            throw new Exception("The name cannot be empty!");
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public typeOfAnimal getType() {
        return  this.type;
    }

    //validation on age input
    @Override
    public void setAge(int age) throws Exception {
        if(age < 0)
            throw  new Exception("age cannot be smaller than 0!");
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    //toString function
    @Override
    public String toString() {
        return "Insect: \n" +
                "name: " + this.name +
                "\ntype: " + this.type +
                "\nage: " + this.age +
                "\nnumber of legs " + this.numberOfLegs;
    }

    //check for equals object function
    public boolean equals(Insect insect) {
        return this.numberOfLegs == insect.numberOfLegs &&
                this.age == insect.age &&
                this.type == insect.type &&
                this.name.equals(insect.name);
    }

    //check for numbetOfLegs input validation
    public void setNumberOfLegs(int numberOfLegs) throws  Exception{
        if (numberOfLegs < 2)
            throw new Exception("The number of legs must be bigger than 2!");
        this.numberOfLegs = numberOfLegs;
    }

    //print insect voice
    public void printVoice(){
        System.out.println("Insect voice:");
    }
}
