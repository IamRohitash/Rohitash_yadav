public class Test1 {
    enum color{
        red,green ,blue;
    }
    public static void main(String[] args)
    {
        color arr[]=color.values();
        for(color col :arr)
        {
            System.out.println( col +" at index :"+col.ordinal());
        }

        System.out.println(color.valueOf("red"));

    }
}
