package book.exercises.E13_bagsqueuesandstacks.helper;

public class DoublingStackOfStrings {

    private String a[]; //stack of entries
    private int N; //size

    public DoublingStackOfStrings(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(String item){
        // Add item to the top of stack
        if(N == a.length){
            resize(2*a.length);
        }
        a[N++] = item;
    }

    public String pop(){
        // Remove item from top of stack
        String item =  a[--N];
        a[N] = null; // Avoid loitering (see page 137)
        if(N > 0 && N == a.length/4) {
            resize(a.length/2);
        }
        return item;
    }

    public String peek(){
        return a[N-1];
    }

    public boolean isFull(){
        return N == a.length;
    }

    private void resize(int max){
        // Move stack of size N <= max to a new array of size max
        String[] temp = new String[max];
        for(int i = 0; i< N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }
}
