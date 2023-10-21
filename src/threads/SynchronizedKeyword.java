package threads;

public class SynchronizedKeyword {
    public static void main(String[] args) {

        //task: 14 defa [ [ [ [ [ ] ] ] ] ] satırını yazdıralım
        Brackets brackets=new Brackets();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=7;i++){
                    brackets.generateBrackets();
                }
            }
        });
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=7;i++){
                    brackets.generateBrackets();
                }
            }
        });
        thread2.start();

    }
}
//iki thread de aynı anda aynı objeyi kullanmaya çalıştığında istenmeyen sınuçlar
//elde ettik. çözüm: generateBrackets methoduna aynı anda sadece 1 thread ulaşsın (senkronize olsun)
class Brackets{

    public synchronized void generateBrackets(){

        for (int i=1;i<=10;i++){
            if (i<6){
                System.out.print("[ ");
            }else {
                System.out.print("] ");
            }
        }
        System.out.println(" - "+Thread.currentThread().getName());

    }

}