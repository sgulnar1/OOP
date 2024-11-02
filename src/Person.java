public class Person implements PersonInterface, FuncInterface.NestedInterface {
    public Person() {
        System.out.println("Person constructor");
    }
    public int c=10;


    @Override
    public void printPerson() {
        System.out.println("print person method");
    }

    @Override
    public void print() {
        System.out.println("print method");
    }

    @Override
    public double calculate(int a) {
        System.out.println("calculate method : " + 2);
        return 2;
    }

    public static void staticMethod() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p.printPerson();
        p.print();
        PersonInterface.privateStaticMethod();
        System.out.println(p.calculate(10));
        FuncInterface.NestedInterface f = new FuncInterface.NestedInterface() {
            @Override
            public void nestedMethod() {
                System.out.println("nested method");
            }
        };
        f.nestedMethod();
    }

    public enum DaysOfWeek {
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);
        int a = 5;

        DaysOfWeek(int a) {
            this.a = a;
        }

        public static void main(String[] args) {
            System.out.println("asfhcsdbfcv");
        }
    }

    @Override
    public void nestedMethod() {
        System.out.println(" nested method");
    }
}
