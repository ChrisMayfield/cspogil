public class Ragged {
    public static void main(String[] args) {
        char[][] ragged = new char[3][];
        ragged[0] = new char[5];
        ragged[1] = new char[9];
        ragged[2] = new char[12];

        char letter = 'A';
        ragged[0][0] = letter;
        letter++;
        System.out.println(letter);
    }
}
