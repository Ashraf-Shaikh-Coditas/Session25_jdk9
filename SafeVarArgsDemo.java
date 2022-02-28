package Week6.Session25_JDK_9_UPDATE;

import java.util.ArrayList;

public class SafeVarArgsDemo {

    @SafeVarargs
    public final void display(ArrayList<Integer>... list) {
        for(ArrayList i : list) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);

        SafeVarArgsDemo obj = new SafeVarArgsDemo();
        obj.display(list1,list2);
    }
}

/*

[1, 2, 3]
[4, 5]

* */