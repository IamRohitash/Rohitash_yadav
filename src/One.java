public class One {
    public void print_geek()
    {
        System.out.println("geek");
    }
}
class two extends One {
    public void print_for()
    {
        System.out.println("for");
    }
}
class three extends two {
    public void print_geek()
    {
        System.out.println("geek");
    }
}
//driver class
class main
{
    public static void main(String[] args)
    {
        three g=new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
