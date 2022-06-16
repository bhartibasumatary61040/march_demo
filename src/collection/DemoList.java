package collection;

import java.util.ArrayList;

public class DemoList {

    public void createlist() {
        //SYNTAX collectionName obj=new collectionName{};

        ArrayList list = new ArrayList();

        //adding element to list
        list.add("agra");//index 0
        list.add("delhi"); //1
        list.add("pune"); //2
        list.add("assam"); //3
        //geeting an element

        System.out.println("printing list " + list.get(2));
        System.out.println("printing list " + list.get(3));
        System.out.println("printing list " + list.get(1));
        for ( int i=0; i< list.size(); i++){
            System.out.println(" normal loop " + list.get(i));
        }

        for (Object var : list) {
            System.out.println("advance loop " + var);

        }
    }

    public static void main(String[] args) {

        DemoList obj= new DemoList();
        obj.createlist();
    }









    }

