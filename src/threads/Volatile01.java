package threads;
/*
 Birden fazla thread kullanılan bir uygulamada ,değişkenler performans nedeniyle CPU
 cache'inde tutulabilir.
 Bilgisayarın birden fazla CPU'su(çekirdek) olduğunu düşünürsek her thread farklı
 CPU üzerinde çalısabilir
 bu nedenle her thread değişkenlerin değerini CPU cache'ine farklı değerde yazabilir.

 "volatile" keywordü değişken üzerinde bir değişiklik olduğunda diğer threadler tarafından
 görünmesini garanti eder.
 "volatile" ile bir değişken CPU cache yerine bilgisayarın main memory'sinden okunur ve
 CPU cache yerine main memory'sine yazılır.
 non-volatile değişkenler için böyle bir garanti yoktur.
 */
public class Volatile01 {
    public static int flog=0;//bu değişkenin main memoryden okunsun ve yazılsn diye garnati altına alıyoruz

    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {//core1
            @Override
            public void run() {

                while (flog!=1){
                    System.out.println("Theradlerle çalışmak harika:)");
                }

            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {//core2
            @Override
            public void run() {
                try {
                    Thread.sleep(20);//thread2 ne kadar az sürerse bilgisayar için o kadar iyi
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                flog++;//cache:x=1------ main=x=0
                System.out.println("flag değeri 1 oldu ARTIK DURRRRRRRRR");
            }
        });
        thread2.start();







    }
}
