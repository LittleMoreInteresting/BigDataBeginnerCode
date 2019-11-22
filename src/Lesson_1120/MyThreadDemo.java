package Lesson_1120;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try {
                System.out.println("Thread name "+this.getName()+":"+i);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable{
    private String myName;
    public MyRunnable(String name) {
        this.myName = name;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try {
                System.out.println("Runnable name "+this.myName+":"+i);
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyThreadDemo{
    public static void main(String[] args)  {
        Thread t1 = new MyThread("t1");
        Runnable r2 = new MyRunnable("r2");
        Thread t2 = new Thread(r2,"r2");
        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }catch(InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Main stop ！");
    }
}
