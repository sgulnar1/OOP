public class Teacher extends Person implements Cloneable {
    private String name;
    public static String surname;

    public Teacher(String name) {
        super();
        this.name = name;
    }

    @Override
    public String className(Person person) {
        return "Teacher";
    }

    public void printPerson() {

        super.printPerson();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Gulnar");
        System.out.println(t);
        System.out.println("t before" + t.getName());
        try {
            Teacher t2 = (Teacher) t.clone();
            System.out.println("t2 before" + t2.getName());
            t2.setName("Murad");
            System.out.println("t after" + t.getName());
            System.out.println("t2 after" + t2.getName());
            System.out.println(t2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
