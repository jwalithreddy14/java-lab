import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDeleteDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Original List: " + list);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to delete: ");
        String elem = sc.next();

        if (list.remove(elem)) {
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Element not found.");
        }

        System.out.println("List after deletion: " + list);
    }
}
