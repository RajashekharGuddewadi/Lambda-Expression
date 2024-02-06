import java.util.HashMap;
import java.util.TreeMap;

public class LambdaUsingMapCollection {
    public static void main(String[] args) {
        // default map Collection gives Ascending Order
        TreeMap<Integer,String> Students = new TreeMap<>();
        Students.put(1,"Raj");
        Students.put(66,"Parag");
        Students.put(5,"Sagar");
        Students.put(555,"Keshav");
        Students.put(3,"Kartik");
        Students.put(4,"Pradeep");
        System.out.println(Students);

        //Using Lambda Expression implementing descending order // using Comparator Interface
        TreeMap<Integer,String> Student = new TreeMap<>((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0);
        Student.put(1,"Raj");
        Student.put(66,"Parag");
        Student.put(5,"Sagar");
        Student.put(555,"Keshav");
        Student.put(3,"Kartik");
        Student.put(4,"Pradeep");
        System.out.println(Student);
    }

}
