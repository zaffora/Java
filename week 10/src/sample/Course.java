package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Course {

    static ArrayList<Student> students = new ArrayList<>();

    public Course(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void loadStudents(){

    }

    public void loadGrades(){

    }

    //void readStudents() throws IOException {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        int studentCount=0;
        String line = "";

        try{
            br = new BufferedReader(new FileReader("C:\\Users\\zaffo\\OneDrive\\Documents\\Classes\\ITN261 Programing 2\\week_10\\src\\sample\\studentList.csv"));

            while ((line = br.readLine()) != null) {
                String[] studentDetails = line.split(",");
                // When the string is split, it will result in an array with the following information in the corresponding index
                // 0 - id
                // 1 - age
                // 2 - First Name
                // 3 - Last Name
                // 4 - grade1
                // 5 - grade2

                if (studentDetails.length > 0) {
                    Student tempStudent = new Student();

                    tempStudent.setId(Integer.parseInt(studentDetails[0]));
                    tempStudent.setAge(Integer.parseInt(studentDetails[1]));
                    tempStudent.setFirstName(studentDetails[2]);
                    tempStudent.setLastName(studentDetails[3]);
                    tempStudent.setGrade(Double.parseDouble(studentDetails[4]));
                    tempStudent.setGrade(Double.parseDouble(studentDetails[5]));

                    // TODO: change to ArrayList variable
                    students.add(tempStudent);
                }
            }

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
