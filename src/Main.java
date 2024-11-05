import java.util.function.*;

public class Main {
    public interface NestedInterface {
        default void nestedMethod() {
            System.out.println(" nested method");
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person() {
            @Override
            public String className(Person person) {
                return "Person";
            }
        };
        person1.setPersonDetails(new TeacherDetailsImpl());


        var a = 'd';
        Person person = new Doctor();
        System.out.println("print: " + person.className(person));
        DoctorWorkQuality doctorWorkQuality = new DoctorWorkQuality();
        doctorWorkQuality.calculate();
        Doctor doctor = new Doctor();
        doctor.setName("Gulnar");
        doctor.setSurname("salehova");
        doctor.setAge(29);
        System.out.println(doctor);
        DoctorR doctorR = new DoctorR("gasf", 17, "dsfds", ":asfdsfds");
        System.out.println(doctorR.email());
        System.out.println(doctorR);
        DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY;
        System.out.println("monday: " + daysOfWeek.name());
        for (DaysOfWeek day : DaysOfWeek.values())
            System.out.println("for: " + day.name());
        DaysOfWeek daysOfWeek1 = DaysOfWeek.valueOf("MONDAY");

        System.out.println("MONDAY valueof: " + daysOfWeek1.name());
        //DaysOfWeek daysOfWeek2 = DaysOfWeek.valueOf("monday");
        //System.out.println("monday valueof: " +daysOfWeek2.name());
        switch (daysOfWeek1) {
            case SATURDAY:
                System.out.println("weekend");
                break;
            case SUNDAY:
                System.out.println("weekend");
                break;
            default:
                System.out.println("workday");
        }
//        AbstractClass2 abstractClass2 = new AbstractClass2();
//        System.out.println(abstractClass2.test());

        System.out.println("********* " + DaysOfWeek.MONDAY.a);
        //DaysOfWeek daysOfWeek = new Day

        int Static = 5;
//        int const = 4;
//        int goto=17;
//        int true =17;
//        int null=47;
        NestedInterface nestedInterface = new NestedInterface() {
        };
        nestedInterface.nestedMethod();
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello World");


        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(5);
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {

            @Override
            public void accept(String s, Integer integer) {
                System.out.println("s: " + s + " integer: " + integer);
            }
        };
        biConsumer.accept("Stringggg", 5);

        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(predicate.test(5));
        IntPredicate intPredicate = new IntPredicate() {

            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        };
        System.out.println(intPredicate.test(6));


        Function<String, Integer> function = new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(function.apply("Hello World"));
        UnaryOperator<String> unaryOperator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s + "asdfsdgl";
            }
        };
        System.out.println(unaryOperator.apply("Hello World"));
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        System.out.println(binaryOperator.apply(5, 6));
        Supplier<String> supplier = new Supplier() {
            @Override
            public Object get() {
                return "supplier";
            }
        };
        System.out.println(supplier.get());
    }
}
