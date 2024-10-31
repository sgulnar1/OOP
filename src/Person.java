public class Person implements PersonInterface, FuncInterface.NestedInterface {
    @Override
    public void printPerson() {
        System.out.println("print person method");
    }

    @Override
    public void print() {
        System.out.println("print method");
        ;
    }

    @Override
    public double calculate(int a) {
        System.out.println("calculate method : " + 2);
        return 2;
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


    @Override
    public void nestedMethod() {
        System.out.println(" nested method");
    }
}
