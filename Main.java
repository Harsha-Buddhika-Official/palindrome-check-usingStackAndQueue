import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String word) {
        int n = word.length();
        Stack S = new Stack(n);
        Queue Q = new Queue(n);

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            S.push(ch);
            Q.enqueue(ch);
        }

        while (!S.isEmpty() && !Q.isEmpty()) {
            if (S.pop() != Q.dequeue()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        sc.close();
    }
}
