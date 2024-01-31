package test;

import java.util.Scanner;

public class Mammel extends Animal{

    //properties
    protected boolean gotMilk;

    //constructor
    public Mammel() throws Exception{
        this.type = typeOfAnimal.Mammel;

        sc = new Scanner(System.in);
        System.out.println("enter name of Mammel: ");
        this.setName(sc.nextLine());
        System.out.println("enter age of Mammel: ");
        this.setAge(sc.nextInt());
        System.out.println("Can he make milk? t/f ");
        this.setGotMilk(sc.next().charAt(0));
    }

    //validation on got milk
    public void setGotMilk(char gotMilk) throws Exception{
        switch (gotMilk){
            case 'f':
                this.gotMilk = false;
                break;
            case 't':
                this.gotMilk = true;
                break;
            default:
                throw new Exception("got milk must be t or f");
        }
    }


    //validation on name input
    @Override
    public void setName(String name) throws Exception{
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
        return this.type;
    }

    //validation on age input
    @Override
    public void setAge(int age) throws  Exception{
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
        return "Mammel: \n" +
                  "name: " + this.name +
                  "\ntype: " + this.type +
                  "\nage: " + this.age +
                  "\ngot milk? " + this.gotMilk;
    }


    //check for equals object function
    public boolean equals(Mammel mammel) {
        return this.gotMilk == mammel.gotMilk &&
               this.age == mammel.age &&
               this.type == mammel.type &&
               this.name.equals(mammel.name);
    }


    //print mammel voice function
    public void printVoice(){
        System.out.println("Mammel voice:");
    }
}
