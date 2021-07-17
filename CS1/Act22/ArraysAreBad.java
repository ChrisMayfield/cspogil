import java.util.ArrayList;
import java.util.List;

public class ArraysAreBad {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Start");
        addAndRemove(list);
        System.out.println("Done!");
    }

    public static void addAndRemove(List<String> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(0, "A");  // add at index 0
        }
        for (int i = 0; i < 1000000; i++) {
            list.remove(0);  // remove at index 0
        }
    }
}
