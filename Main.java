import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                TreeMap<String, String> books = new TreeMap<>();

       String bookInput;
       String authorInput;
       System.out.println("Enter your favorite books and authors. Enter 'stop' to finish");

        while (true) {

            System.out.printf("Book title: ");
            bookInput = scanner.nextLine();

            if(bookInput.equals("stop")){
                break;
            }

            System.out.printf("Author name: ");
            authorInput = scanner.nextLine();

            books.putIfAbsent(bookInput, authorInput);

        }
        for (String name : books.keySet()) {
            String authorValue = books.get(name);
            System.out.println(name + " by " + authorValue);
        }
    }


}