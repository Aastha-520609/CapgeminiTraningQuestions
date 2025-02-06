import java.util.*;

class WithGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Type-safe list
        list.add("Hello");
        // list.add(10); // ❌ Compilation error, prevents incorrect data

        String str = list.get(0); // No typecasting needed
        System.out.println(str);
    }
}
