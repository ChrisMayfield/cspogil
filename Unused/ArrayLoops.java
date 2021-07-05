import java.util.Arrays;

public class ArrayLoops {
    
    /**
     * Return a new array containing the pairwise maximum value of
     * the arguments. For each subscript i, the return value at [i]
     * will be the larger of x[i] and y[i].
     *
     * @param x an array of double values
     * @param y an array of double values
     * @return pairwise max of x and y; returns null if x.length
     *         != y.length or if either of the arrays is null
     */
    public static double[] pairwiseMax(double[] x, double[] y) {
        if (x == null || y == null || x.length != y.length) {
            return null;
        }
        double[] z = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > y[i]) {
                z[i] = x[i];
            } else {
                z[i] = y[i];
            }
        }
        return z;
    }
    
    /**
     * Computes the final letter grade for a student. The labs are
     * worth 40% and the exams are worth 60%. All scores range from
     * 0 to 100, inclusive. Letter grades are assigned on the scale
     * A=90-100, B=80-89, C=70-79, D=60-69, F=0-59.
     *
     * @param labs the student's lab scores
     * @param exams the student's exam scores
     * @return letter grade 'A', 'B', 'C', 'D', or 'F'
     */
    public static char finalGrade(int[] labs, int[] exams) {
        int labSum = 0;
        for (int score : labs) {
            labSum += score;
        }
        int examSum = 0;
        for (int score : exams) {
            examSum += score;
        }
        
        double labGrade = 1.0 * labSum / labs.length;
        double examGrade = 1.0 * examSum / exams.length;
        double grade = 0.40 * labGrade + 0.60 * examGrade;
        
        char letter;
        if (grade >= 90) {
            letter = 'A';
        } else if (grade >= 80) {
            letter = 'B';
        } else if (grade >= 70) {
            letter = 'C';
        } else if (grade >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        return letter;
    }
    
    /**
     * Example method calls.
     */
    public static void main(String[] args) {
        
        // test pairwiseMax
        double[] max = pairwiseMax(new double[] {1, 2, 3, 4, 5},
                                   new double[] {5, 4, 3, 2, 1});
        System.out.println("max = " + Arrays.toString(max));
        
        // test finalGrade
        char grade = finalGrade(new int[] {95, 72, 84, 79, 93},
                                new int[] {100, 91, 86});
        System.out.println("grade = " + grade);
    }
    
}
