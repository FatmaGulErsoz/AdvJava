package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArr={2,3,8,99,55};
        Double[] doubleArr={1.3,35.6,99.9,0.5};
        String[] stringArr={"Java","generics","hayatımızı","kolaylaştırır"};

        printArr(intArr);
        printArr(doubleArr);
        printArr(stringArr);
        System.out.println("--------------------VOID GENERIC--------------------------");
        genericprintArray(intArr);
        genericprintArray(doubleArr);
        genericprintArray(stringArr);
        System.out.println("----------------------T GENERIC------------------------");
        System.out.println("getFirst(intArr) = " + getFirst(intArr));
        System.out.println("getFirst(stringArr) = " + getFirst(stringArr));
        System.out.println("----------------------Two Param------------------------");
        printArrayAndValue(intArr,"generic");//S:Integer U:String
        printArrayAndValue(stringArr,"harika:)");//S:String U:String




    }
    //arrayleri yazdırmak için method tanımlayalım
    public static void printArr(Integer[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+"  "));
        System.out.println();
    }

    //overloading..
    public static void printArr(Double[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+"  "));
        System.out.println();
    }

    //overloading..
    public static void printArr(String [] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+"  "));
        System.out.println();
    }

    //generic method
    public static <T> void genericprintArray(T[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+"  "));
        System.out.println();

    }

    //geriye sonuç döndüren generic method:arrayin ilk elemanını return etsin
    public static <T> T getFirst(T[] arr) {
        T first=arr[0];
        return first;
    }

    //birden fazla data tipini kullanan generic method
    public static <S,U> void printArrayAndValue(S[] arr ,U value){


        //value=arr[0];-->farklı data tipleri olabilir


        Arrays.stream(arr).forEach(t-> System.out.print(t+"  "));
        System.out.println("-----------------------------------" + value);
        System.out.println();
    }



























}
