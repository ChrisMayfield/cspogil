import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IMDb {

    public static void main(String[] args) {
        File file = new File("title2020.tsv");
        File file2 = new File("results.tsv");
        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(file);
            out = new PrintWriter(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        in.useDelimiter("\t");
        in.nextLine();

        int count = 0;
        while (count < 5) {
            String tid = in.next();
            String type = in.next();
            String title = in.next();
            if (title.startsWith("A")) {
                out.println(tid + "\t" + type + "\t" + title);
                count++;
            }
            in.nextLine();
        }

        in.close();
        out.close();
    }

}
