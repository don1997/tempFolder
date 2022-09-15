package activity3;

public class CourseTest{

    public static void main(String[] args){


        Course Student  = new Course("CSCI 1000", "Programming");
        Course Student1  = new Course("CSCI 4000", "ADVANCED PROGRAMMING", 6);

        System.out.println(Student.toString());
        System.out.println(Student1.toString());

        Student1.setTitle("A NEW TITLE");  
        Student1.setCredit(100);
        System.out.println(Student1.getTitle() + " " + Student1.getCredit());

        Student.printInfo();
        Student1.printInfo();
        
        
    }
}

