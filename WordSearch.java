import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();
        
    
        str = str.toLowerCase();
        word = word.toLowerCase();
        
    
        if (str.contains(word)) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found!");
        }
        
        sc.close();
    }
}
