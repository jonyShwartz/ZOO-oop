package test;

import java.util.Scanner;

public class Lion extends Mammel{

    //properties
    private int volume;

    //constructors
    public Lion() throws Exception {
        this.type = typeOfAnimal.Lion;

        System.out.println("enter volume of Lion 0-10: ");
        this.setVolume(sc.nextInt());

    }

    //toString function
    public String toString(){
        return super.toString() +
                "volume: " + this.volume;
    }

    //validation on get volume
    public void setVolume(int volume) throws Exception{
        if(volume < 0 || volume > 10)
            throw  new Exception("cannot be above 0 or ahead 10");
        this.volume = volume;
    }

    //check for equals objects function
    public boolean equals(Lion lion){
        return this.volume == lion.volume &&
                this.type == lion.type &&
                this.gotMilk == lion.gotMilk &&
                this.age == lion.age &&
                this.name == lion.name;
    }

    //print lion voice function
    public void printVoice(){
        System.out.println("Lion voice:");
    }
}
