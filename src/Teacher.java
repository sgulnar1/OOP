public class Teacher extends Person implements Cloneable {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Gulnar");
        Person p = new Person();
        boolean ins = p instanceof Person;
        System.out.println(ins);
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
