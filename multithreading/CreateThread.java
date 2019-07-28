public class CreateThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread); //创建线程，之后会调用MyThread中的run(),而不是Thread中的run()
        thread.start();
        while(true) {
            System.out.println("Main()方法正在运行");
        }
    }
}

class MyThread implements Runnable {
    public void run() {
        while(true) {
            System.out.println("MyThread的run方法正在运行");
        }
    }
}