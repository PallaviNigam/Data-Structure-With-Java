import java.util.*;
class Student
{
 String name;
 int rollno;
 public  Student(String name, int rollno)
 {
     this.name = name;
     this.rollno = rollno;
 }
}
public class MyClass {
    public static void main(String args[]) {
        //Array list of students
        ArrayList<Student> arrl = new ArrayList<Student>();
        Student std1 = new Student("Ravi",1);
        arrl.add(std1);
         Student std2 = new Student("Mohan",2);
        arrl.add(std2);
         Student std3 = new Student("Ram",3);
        arrl.add(std3);
         Student std4 = new Student("Ashish",4);
        arrl.add(std4);
        Iterator itr = arrl.iterator();
        while(itr.hasNext())
        {
            std1 = (Student) itr.next();
            System.out.println(std1.name + " " + std1.rollno);
        }
    }
}
