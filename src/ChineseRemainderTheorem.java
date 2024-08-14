import java.util.*;

class ChineseRemainder {
    int calculate(int size, int div[] , int rem[]){
        int j;
        int x=1;
        while (true) {
            for (j=0; j<size; j++) {
                if(x % div[j] != rem[j])
                    break;
            }
            if(j==size)
                return x;
            x++;
        }
    }
}
public class ChineseRemainderTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divisor: ");

        int size = sc.nextInt();
        int [] div = new int[size];
        for (int i=0; i<size; i++){
            div[i] = sc.nextInt();
        }

        System.out.println("Enter Remainder: ");
        int rem[] = new int[size];
        for (int i=0; i<size; i++) {
            rem[i] = sc.nextInt();
        }

        ChineseRemainder remainder = new ChineseRemainder();

        System.out.println(remainder.calculate(size,div,rem));
    }
}