import java.util.*;

class WithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList(); // No generics
        list.add("Hello");
        list.add(10);  // No restriction, any type can be added

        String str = (String) list.get(0); // Typecasting needed
        String num = (String) list.get(1); // Runtime Error (ClassCastException) 
        //num tries to convert an Integer into a String, causing an error.
        
        System.out.println(str);
    }
}

