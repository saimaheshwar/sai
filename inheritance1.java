class Totalmarks{
    void marks(int a,int b){
        System.out.println("Total marks:"+(a+b));
    }
    
}
class Student extends Totalmarks{
    void Arun(){
    System.out.println("student name is Arun");
    }
    void deepak(){
        System.out.println("student name is deepak");
    }
}
public class Demo{
    public static void main(String args[]){
        Student s=new Student();
        s.Arun();
        s.marks(40,50);
        s.deepak();
        s.marks(60,100);
    }
}