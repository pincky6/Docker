    public class Person implements Cloneable {
    private String firstName, lastName;
    private int age;


	public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

	@Override
    public String toString() {
        return "Person [first name=" + firstName + ", last name=" + lastName +", age=" + age + "]";
    }
}
