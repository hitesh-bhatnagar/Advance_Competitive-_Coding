import java.util.Scanner;

public class SegmentedSeive {
    static void SegSieve(int l, int h){

        // step 1:
        boolean prime[] = new boolean[h+1];

        // step 2:
        for (int p =2; p*p <= h; p++){
            int sm = (1/p)*p;
            if(sm<1){
                sm +=p;

            }
            for (int i=sm ; i<=h; i = i+p){
                prime[i] = true;
            }
        }
        // step 3: Print all the primes
        for(int i =l; i<=h; i++){
            if(prime[i] == false){
                System.out.println(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        SegSieve(10,30);
    }
}

