public class NumberPrograms {

    public static void main(String[] args) {
    int number = 7;
    int anotherNum = 153;
        //Check if the number is prime or not
        System.out.println("Is Prime "+number+" : " +isPrime(number));

        //print Fibonacci Series
        System.out.println("Fibonacci Series for "+number+" : ");
        printFibonacciSeries(number);

        //Calculate factorial for given number
        System.out.println("Factorial for number " +number+" : "+ calcFactorial(number));

        //Check if the number is Armstrong number
        System.out.println("Is Armstrong number "+anotherNum+" : " +isArmstrongNumber(anotherNum));
    }

    public static boolean isPrime(int number) {
        if (number==1) return false;
        for(int i=1; i<number/2;i++) {
            if((number%i)!=0) {
                return false;
            }
        }
        return true;
    }

    public static void printFibonacciSeries(int number) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " +second+ " " );
        for(int i=2; i<number;i++) {
            int third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
        System.out.println();
    }

    public static boolean isArmstrongNumber(int number) {
       int digits = String.valueOf(number).length();
       int num = number;
       double sum = 0;
       while(num>0) {
           int lastdigit = num % 10;
           sum = sum + Math.pow(lastdigit,digits);
           num = num/10;
       }
       return (number==sum) ;
    }

    public static int calcFactorial(int number) {
        int fact = 0;
        while (number>0) {
            fact = fact+  factorial(number);
            number--;
        }
        return fact;
    }
    public static int factorial(int number) {
        return number * number-1;
    }
}
