package sample;

public class Student {

    String name;
    double gpa;
    int id, classes;


    public Student(String name, double gpa, int id, int classes){
        this.name = name;
        this.gpa = gpa;
        this.id = id;
        this.classes = classes;
    }

    public String toString(){
        return String.format("%s %f %d %d", name, gpa, id, classes);
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public int getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }
}
