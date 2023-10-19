package generics.bounding;
//parametre olarak aldığımız data tipini üstten sınırlandırabiliriz
//bu sınıfta sadeve Number class'ın kendisi ve alt sınıfları kullanılsın
//INTEGER,SHORT,BYTE,DOUBLE,FLOAT,LONG,NUMBER
public class GenericUpperBound <T extends Number>{

    private T[] numberArray;

    //parametre cont
    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    //numberArray içindeki elemanların ortalamasını bulalım
    public double getAverage(){
        double sum =0;

        for (T t:this.numberArray){
            sum+=t.doubleValue();
        }

        double average =sum/this.numberArray.length;

        return average;

    }

    //main methodu
    public static void main(String[] args) {

        Integer[] integers={1,2,5};
        Double[] doubles={1.2,5.6,88.2};
        String[] strings={"generics","üstten","sınırlandırılabilir"};

        GenericUpperBound<Integer> obj1= new GenericUpperBound<>(integers);
        System.out.println("obj1.getAverage() = " + obj1.getAverage());

        GenericUpperBound<Double> obj2= new GenericUpperBound<>(doubles);
        System.out.println("obj2.getAverage() = " + obj2.getAverage());


    }




}
