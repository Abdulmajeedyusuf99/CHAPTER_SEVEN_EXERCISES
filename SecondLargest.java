import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int [] numbers = {45,12,30,45,18,25,30,10};

        int firstLargest = 0;
        int secondLargest =  0;
        for(int i=0; i<8; i++) {
            if (numbers[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = numbers[i];

            }
            else if(numbers[i] > secondLargest && numbers[i] < firstLargest){
                secondLargest = numbers[i];

            }

        }
        System.out.print(secondLargest);

    }
}
