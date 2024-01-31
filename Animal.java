package test;

import java.util.Scanner;

abstract class Animal{

    //properties
protected String name;
protected int age;
protected typeOfAnimal type;
protected Scanner sc;


protected enum typeOfAnimal{
    Animal,
    Mammel,
    Insect,
    Lion,
    Hourse,
    Fly
}

//check name function
abstract public void setName(String name) throws Exception;
//get name function
abstract public String getName();
//get the type function
abstract public typeOfAnimal getType();
//check age function
abstract public void setAge(int age) throws  Exception;
//get age function
abstract  public int getAge();

//to string function
abstract public String toString();

//print animal voice function
public void printVoice(){
    System.out.println("Animal voice");
}


    
}