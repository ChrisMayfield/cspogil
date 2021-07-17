import java.util.ArrayList;

public class Model1 {

    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        int[] nums;
        nums = new int[3];

        nums[0] = 74;
        nums[1] = 11;
        nums[2] = 21;

        System.out.println(nums.length);
        System.out.println(nums);
    }

    public static void example2() {
        ArrayList<Integer> nums;
        nums = new ArrayList<Integer>();

        nums.add(74);
        nums.add(11);
        nums.add(21);

        System.out.println(nums.size());
        System.out.println(nums);
    }

}
