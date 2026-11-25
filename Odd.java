import java.util.Arrays;

public class Odd {
    public static void main(String[] args) {
        int [] numbers = new int [5];

        int counter = 0;
        for(int count = 0; count < 5; count++){
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter number: ");
            int number = input.nextInt();
            numbers[count] = number;
            if(number % 2 != 0){
                counter++;
            }
        }


        int [] oddNumbers = new int [counter];
        int counter2 = 0;
        for(int i=0; i < 5; i++){
            if(numbers[i] % 2 !=0 ){
                oddNumbers[counter2] = numbers[i];
                counter2++;
            }

        }
        System.out.print(Arrays.toString(oddNumbers));

    }

}
