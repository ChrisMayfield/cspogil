import java.util.ArrayList;
import java.util.List;

public class ArraysAreBad
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        
        System.out.println("ArrayList: ");
        addAndRemoveAtStart(arrayList);
        System.out.println("Done!");
    }
    
    public static void addAndRemoveAtStart(List<String> list)
    {
        for (int i = 0; i < 1000000; i++)
        {
            list.add(0, "A");  // add at index 0
        }
        
        for (int i = 0; i < 1000000; i++)
        {
            list.remove(0);  // remove at index 0
        }
    }
}
