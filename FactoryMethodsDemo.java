package Week6.Session25_JDK_9_UPDATE;

import java.util.*;

class ListDemo {
    void listMethods() {
        List<Integer> list1 = new ArrayList<Integer>();  // Before jdk 9
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = List.of(1,2,3,4,5);    // In jdk 9
        System.out.println("List 1 before jdk 9 " + "\n"+ list1 );
        System.out.println("List 2 After jdk 9 " + "\n"+ list2 );
    }

}

class SetDemo {
    void setMethods() {
        Set<Integer> set1 = new HashSet<Integer>();  // Before jdk 9
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set<Integer> set2 = Set.of(1,2,3,4,5);    // In jdk 9
        System.out.println("Set 1 before jdk 9 " + "\n" +set1 );
        System.out.println("Set 2 After jdk 9 " + "\n" +set2 );
    }
}

class MapDemo {
    void mapMethods()  {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"One");
        map1.put(2,"Two");
        map1.put(3,"Three");
        map1.put(4,"Four");
        map1.put(5,"Five");

        Map<Integer,String> map2 = Map.of(1,"One",2,"Two",3,"Three",4,"Four",
                5,"Five");

        System.out.println("Map 1 before jdk 9 " +"\n" +map1 );
        System.out.println("Map 2 After jdk 9 " +"\n" +map2 );
    }
}
public class FactoryMethodsDemo {
    public static void main(String[] args) {
        ListDemo obj_1 = new ListDemo();
        obj_1.listMethods();

        SetDemo obj_2 = new SetDemo();
        obj_2.setMethods();

        MapDemo obj_3 = new MapDemo();
        obj_3.mapMethods();
    }

}

/*

List 1 before jdk 9
[1, 2, 3, 4, 5]
List 2 After jdk 9
[1, 2, 3, 4, 5]

Set 1 before jdk 9
[1, 2, 3, 4, 5]
Set 2 After jdk 9
[2, 1, 5, 4, 3]

Map 1 before jdk 9
{1=One, 2=Two, 3=Three, 4=Four, 5=Five}
Map 2 After jdk 9
{2=Two, 1=One, 5=Five, 4=Four, 3=Three}


* */