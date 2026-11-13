public class Main {
    public static void main(String[] args) {
        DataBox<String> nameBox = new DataBox<>("Muhammad Younas");
        DataBox<Integer> idBox = new DataBox<>(1000);

        String name = nameBox.getValue();   // no cast needed
        int id = idBox.getValue();          // no cast needed

        System.out.println("Student Name: " + name);
        System.out.println("Student ID  : " + id);

        // ---- Compile-time safety demonstration ----
        // Uncomment either line below and the compiler will REJECT it:
        //
        // DataBox<Integer> wrongBox = new DataBox<>("Ali");
        //   error: incompatible types: cannot infer type arguments for DataBox<>
        //          (String cannot be converted to Integer)
        //
        // Integer wrongId = nameBox.getValue();
        //   error: incompatible types: String cannot be converted to Integer
        //
        System.out.println("\nTry uncommenting the lines in Main.java to see the compile-time errors.");
    }
}
