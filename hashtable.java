import java.io.*;
import java.util.*;

public class ContactLookup {
    public static void main(String[] args) throws IOException {
        Hashtable<String, String> nameToPhone = new Hashtable<>();
        Hashtable<String, String> phoneToName = new Hashtable<>();

        BufferedReader br = new BufferedReader(new FileReader("contacts.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\t");
            nameToPhone.put(parts[0], parts[1]);
            phoneToName.put(parts[1], parts[0]);
        }

        br.close();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name or phone number: ");
        String input = sc.next();

        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone Number: " + nameToPhone.get(input));
        } else if (phoneToName.containsKey(input)) {
            System.out.println("Name: " + phoneToName.get(input));
        } else {
            System.out.println("Record not found.");
        }
    }
}