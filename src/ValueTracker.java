import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ValueTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int val = 0;
        ArrayList<Integer> randnumbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            randnumbers.add(r.nextInt(50)+1);
        }
        System.out.println(randnumbers);
        System.out.print("Value to find: ");
        val = sc.nextInt();
        Collections.sort(randnumbers);
        int searchIndex = Collections.binarySearch(randnumbers, val);
        if (searchIndex>= 0) {
            System.out.println(val + " is in the ArrayList. ");
        } else {
            System.out.println(val + " not in Arraylist");}
    }
}
