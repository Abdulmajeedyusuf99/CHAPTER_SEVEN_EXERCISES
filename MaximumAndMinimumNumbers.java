public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        int maximum= 0;
        int minimum= 0;
        int [] numbers =new int[10];
        for(int count = 0; count<10; count++){
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter score: ");
            int score = input.nextInt();
            numbers[count] =score;
//            maximum=score;
//            minimum=score;
            maximum=numbers[0];
            minimum=numbers[0];

        }

        for(int i = 0; i< 10; i++ ){

            if(numbers[i]>maximum) {
                maximum = numbers[i];

            }

            if(numbers[i]< minimum) {
                minimum = numbers[i];

            }

        }

        System.out.println("Maximum: "+ maximum);
        System.out.println("Minimum: "+ minimum);
        double average = (maximum + minimum) / 2;
        System.out.println("Average: "+ average);
    }
}
