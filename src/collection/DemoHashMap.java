package collection;

import java.util.HashMap;
import java.util.HashSet;

public class DemoHashMap {

     public void createHashMap(){

          // SYNTAX: HashMap <key datatype, value datatype> objName  = new hashMap<>();

          HashMap<Integer, String> HashMap= new HashMap<>();
          // adding element to map  put(key, value);

          HashMap.put(1," java");
          HashMap.put(2," spring ");
          HashMap.put(3," spring boot ");
          HashMap.put(4,"cloud and microservices ");

          // get methode : get(key);

          System.out.println(" printing map "+ HashMap.get(3));
          System.out.println(" printing map "+ HashMap.get(2));
          System.out.println(" printing map "+ HashMap.get(1));
          System.out.println(" printing map "+ HashMap.get(4));

          HashMap.keySet(); // returns set of all keys

          System.out.println(" printing all keys "+ HashMap.keySet());

          for( Integer var: HashMap.keySet()){
               System.out.println(" printing hasmap in advance loop "+ HashMap.get(var));
          }




     }

     public static void main(String[] args) {
          DemoHashMap obj= new DemoHashMap();
          obj.createHashMap();
     }
}
