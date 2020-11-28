
import java.util.Comparator;

public class RangeBinarySearch {

    // Returns the index of the *first* element in terms[] that equals the search key,
    // according to the given comparator, or -1 if there are no matching elements.
    // Complexity: O(log N), where N is the length of the array
    public static int firstIndexOf(Term[] terms, Term key, Comparator<Term> comparator) {
        int lo = 0;
        int hi = terms.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int comp = comparator.compare(key, terms[mid]);

            if (comp < 0) {
                hi = mid - 1;
            } else if (comp > 0) {
                lo = mid + 1;
            } else if (lo != mid){
                hi = mid;
            } else {
                return mid;
                
            }
        }
        return -1;
    }

    // returns the index of the *last* element in terms[] that equals the search key,
    // according to the given comparator, or -1 if there are no matching elements.
    // complexity: o(log n)
    public static int lastIndexOf(Term[] terms, Term key, Comparator<Term> comparator) {
        int lo = 0;
        int hi = terms.length - 1;

        while (lo <= hi) {
            int mid = (int) ((lo + hi) / 2.0 + 0.5); // always round up
            int comp = comparator.compare(key, terms[mid]);

            if (comp < 0) {
                hi = mid - 1;
            } else if (comp > 0) {
                lo = mid + 1;
            } else if (hi != mid){
                lo = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
