public class AnonymousInnerClass {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Inner anonymous class or child class");
                }
            }
        });

        Thread t1 =new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread using lambda expression");
            }
        }
        );
        t1.start();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }

}
