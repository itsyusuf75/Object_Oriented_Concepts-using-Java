package Experiment03;
import java.util.Scanner;

public class TwinPrime {

    boolean prime(int num) {   // logic to check prime number
        if (num <= 1)
            return false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }

    void show() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number of your choice");
        int num = sc.nextInt();

        for (int i = 2; i <= num - 2; i++) {
            if (prime(i) && prime(i + 2)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }

    public static void main(String[] args) {
        TwinPrime obj = new TwinPrime();
        obj.show();
    }
}


