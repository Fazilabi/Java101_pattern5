import java.util.Scanner;

public class Main {
    static void minus1(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            minus1(number - 5, temp);
        } else if (number <= 0) {
            minus2(number, temp);
        }
    }
    static void minus2(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            minus2(number + 5, temp);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : " );
        int number = scan.nextInt();
        int temp = number;
        minus1(number, temp);
    }
}