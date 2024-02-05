public class Main {

    public  static void m1(){
        System.out.println("hello Raj");
    }

    public  static void m2(int a, int b){
        System.out.println(a+b);
    }

    public  int square(int n){
        return n*n;
    }

    // ()->System.out.println("Hello Lambda"); // lambda Expression
    //(int a,int b) -> System.out.println(a+b);
    //n->n*n;
    public static void main(String[] args) {

        m1();
        m2(2,3);
        Main M = new Main() ;
        int result = M.square(5);
        System.out.println(result);

    }
}