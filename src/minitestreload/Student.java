package minitestreload;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private int avgScore;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, int avgScore) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
