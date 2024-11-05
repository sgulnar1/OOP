
public class Doctor extends Person {

    private String position;

    public void changeName(String newName) {
        super.setName(newName);
    }

    @Override
    public String className(Person person) {
        return "Doctor";
    }

    public Doctor() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
