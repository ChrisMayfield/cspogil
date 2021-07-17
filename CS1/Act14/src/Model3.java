import java.util.Arrays;

public class Model3 {

    public static void main(String[] args) {
        final int N = 4;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            nums[i] *= 5;
        }
        System.out.println(Arrays.toString(nums));
    }

}
