public class Bicycle {
    public int speed;
    public int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }
    public void applyBreak(int decreament)
    {
        speed-=decreament;
    }
    public void speedUp(int increament)
    {
        speed+=increament;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }

}
class MountainBike extends Bicycle
{
   public int seathiegth;

    public MountainBike(int speed, int gear, int seathiegth) {
        super(speed, gear);
        this.seathiegth = seathiegth;
    }
    public void seatHiegth(int newvalue)
    {
        seathiegth=newvalue;
    }

    @Override
    public String toString() {
        return (super.toString()+"\nseat hiegth is:"+seathiegth);
    }

}
class Test12
{
    //driver class
    public static  void main(String[] args)
    {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
