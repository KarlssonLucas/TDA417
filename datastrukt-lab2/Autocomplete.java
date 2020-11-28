import java.util.*;


public class Autocomplete {
    private Term[] dictionary;

    // Initializes the dictionary from the given array of terms.
    public Autocomplete(Term[] dictionary) {
        this.dictionary = dictionary;
        sortDictionary();
    }

    // Sorts the dictionary in *case-insensitive* lexicographic order.
    // Complexity: O(N log N), where N is the number of terms
    private void sortDictionary() {
        Arrays.sort(dictionary, Term.byLexicographicOrder());
    }

    // Returns all terms that start with the given prefix, in descending order of weight.
    // Complexity: O(log N + M log M), where M is the number of matching terms
    public Term[] allMatches(String prefix) {

        int prefLen = prefix.length();
        Term key = new Term(prefix, 0);
        int firstIndex = RangeBinarySearch.firstIndexOf(dictionary, 
                key, Term.byPrefixOrder(prefLen));

        int lastIndex = RangeBinarySearch.lastIndexOf(dictionary, 
                key, Term.byPrefixOrder(prefLen));

        Term[] matches = new Term[lastIndex - firstIndex + 1];

        if (firstIndex == -1) {
            matches = new Term[0];
            return matches;
        }

        for (int i = firstIndex; i < lastIndex + 1; i++) {
            matches[i - firstIndex] = dictionary[i];
        }

        Arrays.sort(matches, Term.byReverseWeightOrder());

        return matches;
    }

    // Returns the number of terms that start with the given prefix.
    // Complexity: O(log N)
    public int numberOfMatches(String prefix) {

        int prefLen = prefix.length();
        Term key = new Term(prefix, 0);
         
        int firstIndex = RangeBinarySearch.firstIndexOf(dictionary, 
                key, Term.byPrefixOrder(prefLen));
        int lastIndex = RangeBinarySearch.lastIndexOf(dictionary, 
                key, Term.byPrefixOrder(prefLen));

        if (firstIndex == -1) {
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

}
