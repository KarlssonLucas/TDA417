public class bstNODE {
    String key;
    Object value;
    bstNODE left, right;

    public bstNODE(String key, Object value) {
       this.key = key;
       this.value = value;
   } 

   public void put(String key, Object value) {
        if(key.compareTo(this.key) < 0) {
            if(left != null) {
                left.put(key, value);
            } else {
                right.put(key, value);
            }
        } else if(key.compareTo(this.key) > 0) {
            if(right != null) {
                right.put(key, value);
            } else {
                right = new bstNODE(key, value);
            }
        } else {
            this.value = value;
        }
   }

   public Object get(String key) {
        if(this.key.equals(key)) {
            return value;
        }
 
        if(key.compareTo(this.key) < 0) {
            return left == null ? null : left.get(key);
        } else {
        return right == null ? null : right.get(key);
        }
   }
}
