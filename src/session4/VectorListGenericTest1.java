package session4;

import session3.VectorList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class VectorListGenericTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(5); // concurrent
        }

        VectorListGeneric1<Integer> vectorList = new VectorListGeneric1<>();
        vectorList.add(1);
        vectorList.add(2);
        vectorList.add(2);
        vectorList.add(3);
        vectorList.add(3);
        vectorList.add(3);
        vectorList.add(4);
        vectorList.add(4);
        vectorList.add(4);
        vectorList.add(4);
        vectorList.add(5);
        vectorList.add(5);
        vectorList.add(5);
        vectorList.add(5);
        vectorList.add(5);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        vectorList.add(6);
        System.out.println(vectorList);
    }
}
