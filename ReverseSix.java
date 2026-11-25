import java.util.Arrays;
import java.security.SecureRandom;
public class ReverseSix {
    public static void main(String[] args){
        int [] numbers = {11,22,33,44,55,66};
        int [] reverse = new int [6];
        int num =0;

        for(int i=5; i>=0; i--){
            reverse[num] = numbers[i];
            num++;

        }
        System.out.print(Arrays.toString(reverse));
//        SecureRandom random = new SecureRandom();
//        int num =1 + random.nextInt(6);
//
//        System.out.println(num);
    }
}
