package threads;

public class ThreadCreationWays {
    public static void main(String[] args) {

        //her Java programında 1 tane thread default olarak çalıştırılır.
        System.out.println("Mevcut thread : "+Thread.currentThread().getName());

        Thread thread1=new MyThread();
        thread1.start();//Threadi başlatır ve run metodunu çağırır.
        //thread1.run();--sadece run içindeki kodları çalıştırır fakat yeni thread başlatmaz
        thread1.setName("threadcik");//Thread-0

        //2.yol:Runnable:functional interface
        MyRunnable myRunnable=new MyRunnable();
        Thread thread2=new Thread(myRunnable);
        thread2.start();

        //anonymous class:isimsiz sınıf
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Anonim thread :"+Thread.currentThread().getName());
                System.out.println("Anonim sınıf ile thread oluştu.");
            }
        });
        thread3.start();

        //Runnable:functional interface:sadece run implemente edilecek:lambda exp.
        Thread thread4=new Thread(()->{
            System.out.println("lambda ile run metodunu override ettik ve runnable parametresi verdik.  ");
        });
        thread4.start();

        try{
            Thread.sleep(3000);//hangi thread (main) çalışırken kullanılırsa bu threadi bekletir.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("burada main thread işini bitirdi");



    }

}
//thread oluşturmanın 2 tane yolu var.
//1.YOL:Thread classını extend ederek
class MyThread extends Thread{

    @Override
    public void run() {
        //threade yaptırmak istediğimiz işlemler
        System.out.println("Çalışan thread : "+Thread.currentThread().getName());
        System.out.println("MyThread threadi çalışıyor. HARİKA:)");
    }
}
//2.YOL:Runnable interfaceini implemente etmek
class MyRunnable implements Runnable{

    @Override
    public void run() {
        //threade yaptırmak istediğimiz işlemler
        System.out.println("Çalışan thread runnable : "+Thread.currentThread().getName());
        System.out.println("Runnable interface ile oluşturulan thread çalışıyor. HARİKA:)");
    }
}
