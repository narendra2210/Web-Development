import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         int t=sc.nextInt();
         int low=0;

         int high=n-1;
         int mid=low+(high-low)/2;
         while(low<high)
         {
             if(arr[mid]==t)
            { System.out.println(mid);
             break;}
             else if(arr[mid]>t)
             {
                  high=mid-1;
                mid=low+(high-low)/2;
             }
             else
                 {
                     low=mid+1;
                      mid=low+(high-low)/2;
                 }
         }

    }
}