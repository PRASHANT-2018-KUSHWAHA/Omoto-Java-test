import java.util.*;
import java.util.Collections;


 class DuplList {
  int count=1;
  int max=1;

  public static void main(String[] args) {


  
  ArrayList<String> list = new ArrayList<String>(
    Arrays.asList("AAA","AAA","BBB","BBB","BBB","CC","CC","XXX", "XXX","PP","QQ","XXX","XXX","QQ","123","123","234","123","12","123"));

ArrayList<String> newList = new ArrayList<String>();


   int max_count = 1, curr_count = 1;
   String res = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      for(int j = 0; j < list.size(); j++){
        if (list.get(i)== list.get(j) && i!=j){
            curr_count++;
            newList.add(list.get(i));
             
         }else {
            if (curr_count > max_count) {
                max_count = curr_count;
                res = list.get(i);
                
            }
            curr_count = 1;
        }
        
    }}
    Collections.sort(newList);
 Set<String> s = new LinkedHashSet<>(newList);
 
    
    if (curr_count > max_count)
    {
        max_count = curr_count;
        res = list.get(list.size()- 1);
    }
 
    System.out.println(s);
    }
  }
