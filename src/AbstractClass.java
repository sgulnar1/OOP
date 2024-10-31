public abstract class AbstractClass {
    public abstract void abstractMethod();

    private AbstractClass() {
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod() {
                System.out.println("abstract method body ...");
            }
        };
        abstractClass.abstractMethod();
    }
}
