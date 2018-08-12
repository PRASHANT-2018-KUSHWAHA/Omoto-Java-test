import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;


class MergeTwoSorted
{
  
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
    
        while (i<n1 && j <n2)
        {
          
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
    
    
        while (i < n1)
            arr3[k++] = arr1[i++];
    
      
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
    
    public static void main (String[] args) 
    {
        int[] arr1 = new int[100];
        int n1 = arr1.length;
    
        int[] arr2 = new int[100];
        int n2 = arr2.length;
    
        int[] arr3 = new int[n1+n2];

        for (int i=0;i<arr1.length ;i++ ) {
            arr1[i]=(int)(Math.random()*100);
            arr2[i]=(int)(Math.random()*100);
            
        }
        
        mergeArrays(arr1, arr2, n1, n2, arr3);
    
        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
