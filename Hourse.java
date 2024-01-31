package test;

public class Hourse extends Mammel{

    //properties
    private int speed;

    //constructors
    public Hourse() throws Exception {
        this.type = typeOfAnimal.Hourse;

        System.out.println("enter speed of hourse: ");
        this.setSpeed(sc.nextInt());

    }

    //validation on speed input
    public void  setSpeed(int speed) throws  Exception{
        if(speed < 1)
            throw new Exception("speed cannot bee less than 1!");
        this.speed = speed;
    }

    //toString function
    public String toString(){
        return  super.toString() +
                "hourse speed: " + this.speed;
    }

    //check for equals objects function
    public boolean equals(Hourse hourse){
        return this.name == hourse.name &&
                this.age == hourse.age &&
                this.gotMilk == hourse.gotMilk &&
                this.speed == hourse.speed &&
                this.type == hourse.type;
    }

    //print hourse voice function
    public void printVoice(){
        System.out.println("hourse voice:");
    }
}
