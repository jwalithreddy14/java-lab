import java.util.*;
 public class CollectionDemo {
 public static void main(String[] args) {
 ArrayList<String> list = new ArrayList<>();
 list.add("Apple");
 list.add("Banana");
 list.add("Mango");
 System.out.println("ArrayList: " + list);
 HashSet<Integer> set = new HashSet<>();
 set.add(10);
 set.add(20);
 set.add(10);
 System.out.println("HashSet: " + set);
 HashMap<Integer, String> map = new HashMap<>();
 map.put(1, "One");
 map.put(2, "Two");
 map.put(3, "Three");
 System.out.println("HashMap:");
 for (Map.Entry<Integer, String> entry : map.entrySet()) {
 System.out.println(entry.getKey() + "-> " + entry.getValue());
 }
 }
 }