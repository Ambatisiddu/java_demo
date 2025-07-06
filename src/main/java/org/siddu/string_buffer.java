package org.siddu;

public class string_buffer {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Arjun");
        sb.append(" Reddy");
        //String str = sb.toString();
        //sb.deleteCharAt(4);
        sb.insert(11, " Hello ");
        //sb.setLength(30);
        //sb.ensureCapacity(100);

        System.out.println(sb);

    }
}
