public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String address;

    /**
     * contructor.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * compare.
     */
    public int compareTo(Person a) {
        if (this.name.compareTo(a.name) == 0) {
            return this.age - a.age;
        } else {
            return this.name.compareTo(a.name);
        }
    }

}
