public class Person {
    private int peopleID;
    private String name;
    private String birthday;

    public Person(int peopleID, String name, String birthday) {
        this.peopleID = peopleID;
        this.name = name;
        this.birthday = birthday;
    }
    public int getPeopleID() {
        return peopleID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "peopleID=" + peopleID +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
