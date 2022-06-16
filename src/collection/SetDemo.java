package collection;

import java.util.HashSet;

public class SetDemo {
    public void createSet(){
        //collection name <datatype> obj= new collectionName<>();

        HashSet<String> stringHashSet= new HashSet<>();

        stringHashSet.add("Assam");
        stringHashSet.add("Assam");
        stringHashSet.add("agra");
        stringHashSet.add("pune");
        stringHashSet.add("pune");
        stringHashSet.add("Assam");
        stringHashSet.add("agra");

        HashSet<Integer> intHashSet= new HashSet<>();

        intHashSet.add(34);
        intHashSet.add(34);
        intHashSet.add(34);
        intHashSet.add(22);
        intHashSet.add(22);

        HashSet<Double> doubleHashSet= new HashSet<>();

         doubleHashSet.add(25.00);
        doubleHashSet.add(25.00);
        doubleHashSet.add(50.00);
        doubleHashSet.add(50.00);


        for( String var :stringHashSet){
            System.out.println(" printing SET "+ var);
        }

         for ( int var : intHashSet){
             System.out.println(" printing SET integer "+ var);
         }
          for( double var : doubleHashSet){
              System.out.println(" printing double set " + var );
          }
       }

       public static void main(String[] args) {
        SetDemo obj= new SetDemo();
        obj.createSet();


    }
}
