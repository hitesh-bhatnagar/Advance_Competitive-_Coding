import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Strobogrammatic {
    static boolean checkStrobo(String num) {
        Map<Character, Character> map = new HashMap<>();

        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');

        int i = 0;
        int r = num.length() - 1;
        while (i <= r) {
            // Check if the character at position i is valid
            if (!map.containsKey(num.charAt(i))) return false;
            // Check if the character at position i maps to the character at position r
            if (map.get(num.charAt(i)) != num.charAt(r)) return false;

            i++;
            r--;
        }
        return true;
    }
}

public class Strobogrammatic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give num");
        String n = sc.next();
        System.out.println(Strobogrammatic.checkStrobo(n));
        sc.close(); // Close the scanner
    }
}
