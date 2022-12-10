package minitest02;

public class Student {
    private String name;
    private int age;
    private String address;
    private String gender;
    private int scoreAverage;

    public Student() {
    }

    public Student(String name, int age, String address, String gender, int scoreAverage) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.scoreAverage = scoreAverage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public int getScoreAverage() {
        return scoreAverage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setScoreAverage(int scoreAverage) {
        this.scoreAverage = scoreAverage;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", scoreAverage=" + scoreAverage +
                '}';
    }
}
