package sample;
import java.util.ArrayList;

import java.util.ArrayList;

public class Student extends Person {
    int id;
    double gradesDouble;
    ArrayList<Double> grade = new ArrayList<Double>();

        public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Double> getGrade() {
        return grade;
    }

    public void setGrade(double g) {
        grade.add(g);
    }

    public void setFirstName(String fName) {
            super.firstName = fName;
    }

    public void setLastName(String lName) {
            super.lastName = lName;
    }

    public void setAge(int a) {
            super.age = a;
    }

    @Override
    public String toString(){
            return String.format("%s %s, id=%d", super.firstName, super.lastName, id);
    }
}
