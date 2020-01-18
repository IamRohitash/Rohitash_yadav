public class EnhencedForLoop {
    public static void main(String[] args)
    {
        String arr[]={"Rohitash","Mohit","Akhilesh"};
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        for(String x:arr) {
            System.out.println(x);
        }
        for(int y:arr1)
        {
            if(y%2==0) {
                System.out.println(y);
            }
        }
}   }




