import java.util.Arrays;

public class Descending {
    public static void main(String[] args){
        int [] numbers = {4,10,2,7,5};
        int num = 0;
        for(int i = 0; i<5; i++){

            for(int j = 0; j<4 ; j++){

                if(numbers[j] < numbers[j+1]){
                    num = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = num;


                }
            }

        }
        System.out.print(Arrays.toString(numbers));

    }
}
