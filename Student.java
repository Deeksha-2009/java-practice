class Student
{
    String name; 
    int rollno;
    String branch;

    Student(String name,int rollno, String branch)
{

    this.name=name;
    this.rollno = rollno;
    this .branch=branch;

}
void display()
{
    System.out.println("Student Name:"+name);
    System.out.println("Roll Number:"+rollno);
    System.out.println("Branch:"+branch);
}
}
public class Student {
    public static void main(String[] args){

    Student s1=new Student(
        "Rahul",
        101,
        "CSE"
    );
    Student s2=new Student(
        "Anjali",
        102,
        "ECE"
    );

    s1.display();
    System.out.println();

    s1.display();
}
}

