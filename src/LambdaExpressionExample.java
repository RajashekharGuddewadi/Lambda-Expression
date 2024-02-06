interface lambda{
    public void m2(int a,int b);
}
public class LambdaExpressionExample {

    public  static void m1(){

        System.out.println("hello Raj");
    }

    public  void m2(int a, int b){

        System.out.println(a+b);
    }

    public  int square(int n){

        return n*n;
    }

    // lambda Expression for above methods

    // ()->System.out.println("Hello Lambda");
    //(int a,int b) -> System.out.println(a+b);
    //n->n*n;
    public static void main(String[] args) {

        lambda l =(a,b)-> System.out.println("USing lambda expression sum of a and b "+(a+b));
        l.m2(5,10);

        m1();
        LambdaExpressionExample M = new LambdaExpressionExample() ;
        M. m2(2,3);;
        int result = M.square(5);
        System.out.println(result);

    }
}