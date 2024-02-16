import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DNAToRNA {

    public static String transcribeToRNA(String dnaSequence) {
        Queue<Character> queue = new LinkedList<>();
        for (char base : dnaSequence.toCharArray()) {
            if (base == 'T') {
                queue.offer('U');
            } else {
                queue.offer(base);
            }
        }
        String ret = "";
        while (!queue.isEmpty()) {
            ret = ret + queue.remove();
        }
        return ret;
    }

    public static void main(String[] args) {
        // Sample Input
        String[] dnaSequences = {
                "AGCTGGGAAACGTAGGCCTA",
                "TTTTTTTTTTGGCGCG",
                "CTTTGGGACTAGTAACCCATTTCGGCT"
        };

        // Sample Output
        for (String dnaSequence : dnaSequences) {
            System.out.println(transcribeToRNA(dnaSequence));
        }
    }
}
