//import java.util.ArrayList;

import java.util.LinkedList;

public class collection {
    public static void main(String[] args){

        //ArrayList<Integer> numbers = new ArrayList<>();
        //numbers.add(5);
        //numbers.add(50);
        //numbers.add(1, 10);

        //System.out.println(numbers.size());

        //System.out.println(numbers.get(1));
        //numbers.remove(0);
        //numbers.clear();

        //for(Integer el: numbers) {
            //System.out.println(el);
        //}

        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(5.16f);
        numbers.add(5.24f);

        for(Float el: numbers)
        System.out.println(el);
    }
}
