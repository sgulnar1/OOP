
public class Doctor extends Person implements SalaryMoney {

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

    @Override
    public int getSalary() {
        return 10000;
    }


    @Override
    public void comman() {

    }
}
