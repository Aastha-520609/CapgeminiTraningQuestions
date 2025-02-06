class GenericMethodExample {
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Example"};
        
        printArray(intArray);
        printArray(strArray);
    }
}
