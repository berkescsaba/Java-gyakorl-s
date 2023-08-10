import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("List:");
        List<String> stringList = new ArrayList<>();
        stringList.add("James");
        stringList.add("Lilly");
        stringList.add("Harry");
        stringList.add("Sirius");
        stringList.add("Ronald");
        System.out.println("My list: " + stringList);
        System.out.println("List size: " + stringList.size());
        System.out.println("First element: " + stringList.get(0));
        System.out.println("Last element: " + stringList.get(stringList.size()-1));
        System.out.println("Without first and last: " + stringList.subList(1,4));
        System.out.println("Changing element: " + stringList.set(4, "Perselus"));
        System.out.println("Is there any Harry? " + stringList.contains("Harry"));
        System.out.println("Removing: " + stringList.remove(1));
        System.out.println("My list without Harry: " + stringList);
        System.out.println("=============================================================7");

        System.out.println("Set:");
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(6);
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(1);
        System.out.println("My set: " + integerSet);
        System.out.println("Is there any 4? " + integerSet.contains(4));
        Iterator iterator = integerSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        integerSet.remove(5);
        System.out.println("My set: " + integerSet);
        System.out.println("=============================================================7");


        System.out.println("Map:");
        Map<Integer, String> planes = new HashMap<>();
        planes.put(321, "B747");
        planes.put(6543, "A330");
        planes.put(9876, "P678");
        planes.put(123, "V543");
        planes.put(765, "F244");
        planes.put(4579, "L876");
        planes.put(457, "L876");
        System.out.println("My map: " + planes);
        System.out.println("Value of 6543: " + planes.get(6543));
        System.out.println("ContainsKey(765)? " + planes.containsKey(765));
        System.out.println("ContainsValue(L876)? " + planes.containsValue("L876"));
        planes.putIfAbsent(976, "P678");
        System.out.println("Changing value: " + planes.replace(123, "WWW543"));
        System.out.println("My map as Set: " + planes.entrySet());
        System.out.println("My map's keys: " + planes.keySet());


    }
}