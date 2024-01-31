package test;

public class Fly extends Insect{

    //properties
    private int liveInYears;

    //constructors
    public Fly() throws Exception {
        this.type = typeOfAnimal.Fly;

        System.out.println("enter live time of fly: ");
        this.setLiveInYears(sc.nextInt());
    }

    //validation of get liveInYears
    public void setLiveInYears(int liveInYears) throws  Exception{
        if(liveInYears <= 0)
            throw new Exception("live time cant be smaller than 1!");
        this.liveInYears = liveInYears;
    }

    //toString function
    public String toString(){
        return super.toString() +
                "live time: " + this.liveInYears;
    }

    //check for equal objects function
    public boolean equals(Fly fly){
        return this.liveInYears == fly.liveInYears &&
                this.type == fly.type &&
                this.age == fly.age &&
                this.name == fly.name;
    }

    //print noise of fly function
    public void printVoice(){
        System.out.println("fly voice:");
    }
}
