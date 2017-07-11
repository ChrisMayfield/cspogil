public class StrCmp {
    public static void main(String[] args) { 

        String name1 = "Mark";
        String name2 = "Ma" + "rk";
        String name3 = "Mary";
        
        // compare name1 and name2
        if (name1 == name2) {
            System.out.println("name1 and name2 are identical");
        } else {
            System.out.println("name1 and name2 are NOT identical");
        }
        
        // compare "Mark" and "Mark"
        if (name1.equals(name2)) {
            System.out.println("name1 and name2 are equal");
        } else {
            System.out.println("name1 and name2 are NOT equal");
        }
        
        // compare "Mark" and "Mary"
        if (name1.equals(name3)) {
            System.out.println("name1 and name3 are equal");
        } else {
            System.out.println("name1 and name3 are NOT equal");
        }
        
    }
}
