package collection;

import java.util.ArrayList;

public class ListWithGenerics {

    public void createStringList(){
        //SYNTAX: collectionName<datatype> objName=new collectionName<>();

        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add(" agra");//index 0
        stringArrayList.add(" delhi");//1
        stringArrayList.add(" pune");//2
        stringArrayList.add(" assam");//3

        for(String  var: stringArrayList ){
            System.out.println("printing string list "+var);
        }
    }
    public void createIntegerList(){
        //SYNTAX: collectionName<datatype> objName=new collectionName<>();
        ArrayList<Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(7);
        integerArrayList.add(5);
        integerArrayList.add(3);
        integerArrayList.add(6);

        for (Integer var: integerArrayList){
            System.out.println(" printing integer list "+ var);
        }
    }

    public void createDoubleList(){
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(2355.5);
        doubleArrayList.add(5555.5);
        doubleArrayList.add(100.5);
         for( double var: doubleArrayList){
             System.out.println(" printing double list "+var);
         }



    }

    public static void main(String[] args) {
        ListWithGenerics obj = new ListWithGenerics();
        obj.createStringList();
        obj.createIntegerList();
        obj.createDoubleList();
    }
}
