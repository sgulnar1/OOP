public class FinalTest extends Person {
    private static final int a;
    private int c =7;

    @Override
    public String className(Person person) {
        return "FinalTest";
    }

    public FinalTest() {
        super();

        System.out.println("default constructor");
    }


    public FinalTest(int c) {
        this();
        this.c = c;
    }

    //    FinalTest(int a) {
//        this.a=5;
//    }
    public void test3(int c) {
        this.c = c;
    }

    static {
        a = 1;
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Gulnar");
        Teacher teacher2 = new Teacher("Murad");
        teacher1.surname = "Salehova"; // Teacher.surname
        teacher2.surname = "Aliyeva"; // Teacher.surname
        System.out.println(teacher1.surname + " " + teacher2.surname);


        FinalTest finalTest = new FinalTest();
        System.out.println(finalTest);
        System.out.println(finalTest.test());
    }

//    @Override
//    public String toString() {
//        return "to strting";
//    }

    public FinalTest test() {
        test2(this);
        super.printPerson();
        System.out.println(super.c);
        return this;
    }

    public void test2(FinalTest finalTest) {
        System.out.println("test2");
    }
}
