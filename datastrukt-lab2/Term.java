
import java.util.Comparator;

public class Term {
    private String word;
    private long weight;

    // Initializes a term with a given word and weight.
    public Term(String word, long weight) {
        this.word = word;
        this.weight = weight;
    }

    // Gets the word.
    public String getWord() {
        return word;
    }

    // Gets the weight.
    public long getWeight() {
        return weight;
    }

    // Extracts a prefix from the word.
    public String getPrefix(int len) {
        String prefix = "";
        for (int i = 0; i < len && i < word.length(); i++) {
            prefix += word.charAt(i);
        }
        return prefix;
    }

    // Compares the two terms in case-insensitive lexicographic order.
    public static Comparator<Term> byLexicographicOrder() {
        Comparator<Term> comp = new Comparator<Term>() {
            @Override
            public int compare(Term t1, Term t2) {
                String w1 = t1.getWord();
                String w2 = t2.getWord();

                return w1.compareToIgnoreCase(w2);
            }
        };
        return comp;
    }

    // Compares the two terms in descending order by weight.
    public static Comparator<Term> byReverseWeightOrder() {
        Comparator<Term> comp = new Comparator<Term>() {
            @Override
            public int compare(Term t1, Term t2) {
                return (int) (t2.getWeight() - t1.getWeight());
            }
        };
        return comp;
    }

    // Compares the two terms in case-insensitive lexicographic order,
    // but using only the first k characters of each word.
    public static Comparator<Term> byPrefixOrder(int k) {
        Comparator<Term> comp = new Comparator<Term>() {
            @Override
            public int compare(Term t1, Term t2) {
                String w1 = t1.getPrefix(k);
                String w2 = t2.getPrefix(k);
                return w1.compareToIgnoreCase(w2);
            }
        };
        return comp;
    }

    // Returns a string representation of this term in the following format:
    // the weight, followed by whitespace, followed by the word.
    public String toString() {
        return String.format("%12d    %s", this.getWeight(), this.getWord());
    }
    
}
