package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class JavaCodes {
	public static void main(String[] args) {
		//Question 1
        ArrayList<String> items = new ArrayList<>();
        items.add("Toyota");
        items.add("Maruti Suzuki");
        items.add("Tata");
        items.add("Hyundai");
        items.add("Kia");

        System.out.println("Question_1");
        System.out.println("Original list:");
        System.out.println(items);
        
        Collections.shuffle(items);
        
        System.out.println("\nShuffled list:");
        System.out.println(items);
        System.out.println("==============================================================");

        
        //Question2
        public List<String> extractPortionOfArrayList(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("WaterMelon");
        fruits.add("Strawberry");
        fruits.add("Mango");
        
        System.out.println("Question_2");
        System.out.println("Original list:");
        System.out.println(fruits);
        
        List<String> sub = fruits.subList(1, 3);
        
        System.out.println("\nExtracted portion (index 1 to 3):");
        System.out.println(sub);
        System.out.println("==============================================================");
        }
       
        
        //Question4
        ArrayList<String> cricketers = new ArrayList<>();
        cricketers.add("MS Dhoni");
        cricketers.add("Virat kohli");
        cricketers.add("Rohit Sharma");
        
        System.out.println("Question_4");
        System.out.println("Original list:");
        System.out.println(cricketers);
        
        String newPlayer = "Rishabh Pant";
        cricketers.set(0, newPlayer); 
        System.out.println("\nModified list:");
        System.out.println(cricketers);
        System.out.println("==============================================================");
        
        //Question7
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("John");
        originalSet.add("carry");
        originalSet.add("Alex");

        System.out.println("Question_7");
        System.out.println("Original HashSet:");
        System.out.println(originalSet);

        HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();

        System.out.println("\nCloned HashSet:");
        System.out.println(clonedSet);
        System.out.println("==============================================================");
        
        //Question8
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Abc");
        hashSet.add("Xyz");
        hashSet.add("Pqr");
        
        System.out.println("Question_8");
        System.out.println("HashSet List:");
        System.out.println(hashSet);
        
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("\nTreeSet List:");
        System.out.println(treeSet);
        System.out.println("==============================================================");
        
        //Question10
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Car");
        map.put(2, "Bus");
        map.put(3, "Train");

        System.out.println("Question_10");
        System.out.println("Original Map list:");
        System.out.println(map);

        Set<Integer> keySet = map.keySet();

        System.out.println("\nKey Set in the map:");
        System.out.println(keySet);
    }

}
