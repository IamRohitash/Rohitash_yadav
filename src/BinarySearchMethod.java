import java.util.Arrays;
public class BinarySearchMethod {
    public static void main(String[] args)
    {
        int arr[]={12,34,23,45,56,67,36,46,57,58};
        Arrays.sort(arr);
       int  key1=23,key2=36;
       int res=Arrays.binarySearch(arr,key1);
       int res1=Arrays.binarySearch(arr,key2);
       if(res>=0)
       {
           System.out.println(key1+" found at index:"+res);
       }
       else
       {
           System.out.println("key not found");
       }
        if(res1>=0)
        {
            System.out.println(key2+" found at index:"+res1);
        }
        else
        {
            System.out.println("key not found");
        }



    }
}
