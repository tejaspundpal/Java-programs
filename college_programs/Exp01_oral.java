package college_programs;

import java.util.*;
class StudentInfo{
    private int studentID = 0;
    private String studentName;

    StudentInfo(int studentID,String studentName)
    {
        this.studentName = "";
        this.studentID++;
    }
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
class StudnetMarks extends StudentInfo{
    private int marks1;
    private int marks2;
    private int marks3;

    public StudnetMarks(int id,String name,int marks_1,int marks_2,int marks_3) {
        super(id,name);
        this.marks1 = 0;
        this.marks2 = 0;
        this.marks3 = 0;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
}

class StudentResult extends StudnetMarks{
    public StudentResult(int id,String name,int marks_1,int marks_2,int marks_3) {
        super(id,name,marks_1,marks_2,marks_3);
    }

    public int calculateTotalMarks()
    {
        int totalMarks = getMarks1() + getMarks2() + getMarks3();
        return totalMarks;
    }
    public void display()
    {
        System.out.println("****************** Topper student ******************");
        System.out.println("ID : "+getStudentID());
        System.out.println("Name : "+getStudentName());
        System.out.println("Total Marks : "+calculateTotalMarks());
    }
}
class Exp01_oral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentResult[] st = new StudentResult[5];
        int[] storemarks = new int[5];
        
        for(int i = 0;i < st.length;i++)
        {
            String name = "";
            int id = 0,marks_1 = 0,marks_2 = 0,marks_3 = 0;
            st[i] = new StudentResult(id,name,marks_1,marks_2,marks_3);
            System.out.println("Enter data of student "+(i+1));
            System.out.println("Enter Student id : ");
            id = sc.nextInt();
            System.out.println("Enter Student Name : ");
            name = sc.next();
            System.out.println("Enter marks 1: ");
            marks_1 = sc.nextInt();
            System.out.println("Enter marks 2: ");
            marks_2 = sc.nextInt();
            System.out.println("Enter marks 3: ");
            marks_3 = sc.nextInt();
            st[i].setStudentID(id);
            st[i].setStudentName(name);
            st[i].setMarks1(marks_1);
            st[i].setMarks2(marks_2);

            st[i].setMarks3(marks_3);

            storemarks[i] = st[i].calculateTotalMarks();
        }
        int max = 0;
        int index = 0;
        for(int i = 0;i < storemarks.length;i++)
        {
            if(storemarks[i] > max) {
                max = storemarks[i];
                index = i;
            }
        }
        st[index].display();

    }
}