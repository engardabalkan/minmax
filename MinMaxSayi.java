import java.util.Scanner;
public class MinMaxSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter desired number amount:");
        int counter = inp.nextInt();
        int max = 0, min = 0, a;

        for (int i = 1; i <= counter; i++) {
            System.out.println("Please enter your number " + i + ":");
            a = inp.nextInt();
            if (a >= max) {
                max = a;
            } else if (a <= min) {
                min = a;
            }
        }
        System.out.println("Max:" + max);
        System.out.print("Min" + min);
    }

}

