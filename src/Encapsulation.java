public class Encapsulation {
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public String getGeekName() {
        return geekName;
    }

    public void setGeekName(String geekName) {
        this.geekName = geekName;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    public void setGeekRoll(int geekRoll) {
        this.geekRoll = geekRoll;
    }

    public int getGeekAge() {
        return geekAge;
    }

    public void setGeekAge(int geekAge) {
        this.geekAge = geekAge;
    }
}
class TestEncapsulation
{
    public static void main(String[] args)
    {
        Encapsulation obj=new Encapsulation();
        obj.setGeekName("Rohitash Yadav");
        obj.setGeekRoll(171500268);
        obj.setGeekAge(22);
        System.out.println("Geek's name: " + obj.getGeekName());
        System.out.println("Geek's age: " + obj.getGeekAge());
        System.out.println("Geek's roll: " + obj.getGeekRoll());

    }
}
