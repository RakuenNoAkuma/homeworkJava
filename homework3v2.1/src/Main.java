import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       first();
    }

    public static void first(){
        System.out.println("ввод цифр совершать по одной. максимум цыфр 4! если отсутсвует 4 цыфры, вводить сначало нули, потом ваше число");
System.out.println("Введите ваше значение");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int result = 0;

        result = ((number1*(16*16*16))+(number2*(16*16))+(number3*16)+(number4*1));

                System.out.println("перевод из шестнадцатиричной в десятичную равен цифре - "+ result);
    }
}
