import java.util.Comparator;
import java.util.TreeSet;

// Comparator used For Descending
class MyComparator implements Comparator<Integer>{
    public int compare(Integer I1,Integer I2){

        return (I1<I2)?1:(I1>I2)?-1:0;

        // Same as above
//        if(I1<I2){
//           return +1;
//        }else if(I1>I2){
//            return -1;
//        }else{
//            return 0;
//        }
    }
}

public class LambdaExpressionWithCollection {
    public static void main(String[] args) {
        // Normal TreeSet collection implementation
        TreeSet<Integer> num2 = new TreeSet<>();
        num2.add(10);
        num2.add(0);
        num2.add(15);
        num2.add(5);
        num2.add(20);
        System.out.println(num2);

        // Comparator Interface Using
        TreeSet<Integer> num1 = new TreeSet<>(new MyComparator());
        num1.add(10);
        num1.add(0);
        num1.add(15);
        num1.add(5);
        num1.add(20);
        System.out.println(num1);

        //Lambada Expression Using
        TreeSet<Integer> num = new TreeSet<>((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0);
        num.add(10);
        num.add(0);
        num.add(15);
        num.add(5);
        num.add(20);
        System.out.println(num);

    }
}
