public abstract class Person implements PersonInterface, FuncInterface.NestedInterface {
    private String name;
    private int age;
    private String surname;
    private String email;
    private PersonDetails personDetails;

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public abstract String className(Person person); /*{
        if (person instanceof Doctor) {
            return "Doctor";
        } else if (person instanceof Teacher)
            return "Teacher";
        else return "Person";
    }*/

    public Person() {
        System.out.println("Person constructor");
    }

    public int c = 10;


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
        PersonInterface.privateStaticMethod();
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
