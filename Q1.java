import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.text.*;

 class wy2 {

public static void main(String[] args) {
Date d = new Date();

Scanner sc = new Scanner(System.in);
System.out.print("Enter Date dd/mm/yyyy : ");
String fromdate = sc.nextLine();
System.out.print("Enter Date dd/mm/yyyy : ");
String todate = sc.nextLine();

     
    
    String[] integerStrings1 = fromdate.split("/"); 
    String[] integerStrings2= todate.split("/");

    int[] integers1 = new int[integerStrings1.length]; 
    int[] integers2 = new int[integerStrings2.length]; 
    
    for (int i = 0; i < integers1.length; i++){
        integers1[i] = Integer.parseInt(integerStrings1[i]); 
        integers2[i] = Integer.parseInt(integerStrings2[i]); 
   
    }
  int i=2;
  System.out.println("returnFromdate : " + fromdate );
    
      if(integers2[i]>=integers1[i]){
            if (integers2[i-1]>=integers1[i-1]) {
               if (integers2[i-2] >=integers1[i-2]) {
                       
                      System.out.println("returntodate : "+  );          
                 }else
                   System.out.println("returntodate : "+ d.toString());   
                                  
            }else
                   System.out.println("returntodate : "+ d.toString());
      
      }else
                   System.out.println("returntodate : "+ d.toString());
}}