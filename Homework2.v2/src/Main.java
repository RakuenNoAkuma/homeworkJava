import Plus.Plus;

public class Main {
    public static void main(String[] args) {
        plus();
        minus();
        multiplication();
        division();
    }

    public  static void plus() {

        int number1 = 15;
        int number2 = 36;
        int resultsOfInt = number1 + number2;
        System.out.println(resultsOfInt);
    }

    public static void minus(){
        int number1 = 85;
        int number2 = 36;
        int resultsOfInt = number1 - number2;
        System.out.println(resultsOfInt);
    }
    public static void multiplication (){
        double number1 = 85.15;
        double number2 = 36;
        double resultsOfInt = number1 * number2;
        System.out.println(resultsOfInt);
    }
    public static void division () {
        double number1 = 85;
        double number2 = 36;
        double resultsOfInt = number1 / number2;
        System.out.println(resultsOfInt);
    }

}



