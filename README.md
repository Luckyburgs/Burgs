import java.util.ArrayList; 

public class assignment01_arrayList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>(); 

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry"); 

        // Access elements from the ArrayList
        System.out.println("Element at index 1: " + list.get(1)); // Access using index 

        // Remove an element
        list.remove("Banana"); 

        // Display updated list
        System.out.println("Updated List: " + list);
    }
}
