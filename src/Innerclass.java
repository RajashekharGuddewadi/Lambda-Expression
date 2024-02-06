class Car{
     class Engine{
         public void Show(){
        System.out.println("inner class");
         }
    }
}

public class Innerclass {
    public static void main(String[] args) {
        Car.Engine  in = new Car().new Engine();
        in.Show();
    }
}
