import java.util.LinkedList;
import java.util.List;

public class LinksAreBad {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        System.out.println("Start");
        addAndGet(list);
        System.out.println("Done!");
    }

    public static void addAndGet(List<String> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add("A");  // add at the end
        }
        for (int i = 0; i < 1000000; i++) {
            list.get(list.size() / 2);  // get the middle
        }
    }
}
