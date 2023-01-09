import java.util.Arrays;
import java.util.Random;

public class Selenium_Practices_day04 {
        /**
         * 1. Basic: Find sum of elements in an array
         * 2. Basic: Print even and odd numbers from an array based on
         * what user wants to print out
         */
        public static void main(String[] args) {
            int[] numbers = new Random().ints(0, 20).limit(10).toArray();
            System.out.println("Numbers generated: " + Arrays.toString(numbers));

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + numbers[i];
            }

            System.out.println(sum);
            if(sum % 2 == 0){
                System.out.println("This is even number");
            }else{
                System.out.println("This is odd number");
            }
        }
    }
