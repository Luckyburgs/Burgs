import java.util.ArrayList; 

public class assignment02_arrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>(); 

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30); 

        // Display elements
        System.out.println("Stored numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
