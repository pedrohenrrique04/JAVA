package DesafiosIniciante;

public class Ninja extends Mission{
    private String name;
    private int age;

    public Ninja(String missionName, String difficultyLevel, String completionStatus, String name, int age) {
        super(missionName, difficultyLevel, completionStatus);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "Ninja " +
                "name is: " + name +
                ", age is: " + age + ".";
    }
}