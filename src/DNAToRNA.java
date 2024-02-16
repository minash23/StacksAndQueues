import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DNAToRNA {

    public static String transcribeToRNA(String dnaSequence) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < dnaSequence.length(); i++) {
            if (dnaSequence.charAt(i) == 'T') {
                queue.offer('U');
            } else {
                queue.offer(dnaSequence.charAt(i));
            }
        }

        StringBuilder retBuilder = new StringBuilder();
        while (!queue.isEmpty()) {
            retBuilder.append(queue.remove());
        }
        return retBuilder.toString();
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
