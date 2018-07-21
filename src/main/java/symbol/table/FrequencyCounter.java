//package symbol.table;
//
//import edu.princeton.cs.introcs.StdOut;
//
//public class FrequencyCounter {
//
//    public void method(int minLength, String args[]){
//
//        SymbolTable<String, Integer> st = new SymbolTable();
//        for (int i=0; i<args.length; i++) {
//            String word = args[i];
//            if (word.length() < minLength) {
//                continue;
//            }
//            if (!st.contains(word)) {
//                st.put(word, 1);
//            } else
//            {
//                st.put(word, st.get(word) +1);
//            }
//        }
//        String max = "";
//        st.put(max, 0);
//        for(String word : st.keys()){
//            if(st.get(word) > st.get(max)){
//                max = word;
//            }
//        }
//        StdOut.println(max + " " + st.get(max));
//    }
//}
