package model.people;

public class Person implements IOwner{
    private String passNumber;
    private String fullName;


    public Person() {
    }

    public Person(String passNumber, String fullName) {
        this.passNumber = passNumber;
        this.fullName = fullName;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getNumber() {
        return passNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!passNumber.equals(person.passNumber)) return false;
        return fullName.equals(person.fullName);
    }

    @Override
    public int hashCode() {
        int result = passNumber.hashCode();
        result = 31 * result + fullName.hashCode();
        return result;
    }

    @Override
    public String getName() {
        return fullName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("fullName='").append(fullName).append('\'');
        sb.append(", name='").append(getName()).append('\'');
        sb.append(", number='").append(getNumber()).append('\'');
        sb.append(", passNumber='").append(passNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
