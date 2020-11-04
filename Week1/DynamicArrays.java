import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

class dynarr {
    public static void main(String[] args) {
        DynamicArrays<Integer> ar = new DynamicArrays<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        System.out.println(ar.get(2));
        ar.set(2, 2);
        System.out.println(ar.get(2));
    }
}

class DynamicArrays<A> {
    private Object[] arr;
    private int used = 0;

    public DynamicArrays(){
        arr = new Object[1];
    }

    public int size() {
        return used;
    }

    public void add(A value) {
        Object[] tempArr = new Object[arr.length*2];
        for(int i = 0; i<arr.length; i++) {
            tempArr[i] = arr[i];
        }

        if(arr.length-1 == used) {
            tempArr[used] = value;
        } else {
            tempArr[used] = value;
        } 
        arr = tempArr;
        used++;
    }

    public A get(int index) {
        if(index > used-1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return (A) arr[index];
        }
    }

    public void set(int index, A value) {
        if(index > used-1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            arr[index] = value;
        }
    } 
}