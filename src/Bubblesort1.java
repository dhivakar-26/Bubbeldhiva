
import java.util.*;
import java.util.Arrays;
public class Bubblesort1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the element:");
        int size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" elements"); 
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();
            for(int i=0;i<(size-1);i++){
                for(int j=0;j<size-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int swap=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=swap;
                    }
                }
            }
            System.out.println("Sorted list of numbers are :"+Arrays.toString(arr));
           

    }
}