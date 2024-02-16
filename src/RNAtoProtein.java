import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RNAtoProtein {
    public static void main(String[] args) {
        String rna1 = "AAAGAGAAUG";
        String rna2 = "UAAAGAGAAGCCAGC";

        System.out.println(translateRnaToProtein(rna1));
        System.out.println(translateRnaToProtein(rna2));

    }
    public static String translateRnaToProtein(String RNA) {
        Queue<String> queue = new LinkedList<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("UUU", "F");
        map.put("UCU", "S");
        map.put("UAU", "Y");
        map.put("UGU", "C");
        map.put("UUC", "F");
        map.put("UCC", "S");
        map.put("UAC", "Y");
        map.put("UGC", "C");
        map.put("UUA", "L");
        map.put("UCA", "S");
        map.put("UAA", ".");
        map.put("UGA", ".");
        map.put("UUG", "L");
        map.put("UCG", "S");
        map.put("UAG", ".");
        map.put("UGG", "W");
        map.put("CUU", "L");
        map.put("CCU", "P");
        map.put("CAU", "H");
        map.put("CGU", "R");
        map.put("CUC", "L");
        map.put("CCC", "P");
        map.put("CAC", "H");
        map.put("CGC", "R");
        map.put("CUA", "L");
        map.put("CCA", "P");
        map.put("CAA", "Q");
        map.put("CGA", "R");
        map.put("CUG", "L");
        map.put("CCG", "P");
        map.put("CAG", "Q");
        map.put("CGG", "R");
        map.put("AUU", "I");
        map.put("ACU", "T");
        map.put("AAU", "N");
        map.put("AGU", "S");
        map.put("AUC", "I");
        map.put("ACC", "T");
        map.put("AAC", "N");
        map.put("AGC", "S");
        map.put("AUA", "I");
        map.put("ACA", "T");
        map.put("AAA", "K");
        map.put("AGA", "R");
        map.put("AUG", "M");
        map.put("ACG", "T");
        map.put("AAG", "K");
        map.put("AGG", "R");
        map.put("GUU", "V");
        map.put("GCU", "A");
        map.put("GAU", "D");
        map.put("GGU", "G");
        map.put("GUC", "V");
        map.put("GCC", "A");
        map.put("GAC", "D");
        map.put("GGC", "G");
        map.put("GUA", "V");
        map.put("GCA", "A");
        map.put("GAA", "E");
        map.put("GGA", "G");
        map.put("GUG", "V");
        map.put("GCG", "A");
        map.put("GAG", "E");
        map.put("GGG", "G");

        int count = 0;
        String codon = "";
        for (int i = 0; i < RNA.length(); i++) {
            if (count == 3) {
                queue.add(codon);
                codon = "";
                count = 0;
            }
            codon += RNA.charAt(i);
            count++;
        }
        if (codon != "") {
            queue.add(codon);
        }

        String protein = "";
        for(String codons: queue) {
            if (map.get(codons) != null) {
                protein += map.get(codons);
            } else {
                protein += ".";
            }
        }
        return protein;
    }
}