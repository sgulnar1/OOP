public interface PersonInterface {
    void printPerson();

    static int interVariable = 0;

    default void print() {
        int a = 5;
        privateInterMethod();
        privateStaticMethod();
        System.out.println(interVariable);
    }

    private void privateInterMethod() {
        System.out.println("private method");
    }

    public static void privateStaticMethod() {
        System.out.println("static method");
    }

    double calculate(int a);
}
