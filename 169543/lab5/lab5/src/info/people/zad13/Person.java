package info.people.zad13;

class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    Person(String firstName, String lastName, int age, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String introduceYourself(){
        String result = "";
        result += getFirstName() + " " + getLastName() + " " + getAge() + " " + getAddress();

        return result;
    }

}
