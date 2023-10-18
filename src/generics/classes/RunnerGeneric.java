package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGeneric {
    public static void main(String[] args) {

        //generic yapılarda hangi data tipini kullanacığımızde sonradan karar verebiliriz.
        //JAva 7 den sonre sağ tarafa data tipini yazmaya gerek kalmadı.
        GenericProduct<String> book = new GenericProduct<String>();

        String str =book.getCode();//CTE vermedi, CAST problemi çözğldğ gerek kalmadı.
                                   //ClassCastException hatası da engellendi.

        GenericProduct<Integer> laptop = new GenericProduct<>();
        laptop.setCode(123);

        Integer integer= laptop.getCode();

        GenericProduct<String> phone= new GenericProduct<>();
        //       phone.setCode(123);//generics tür güvenliği sağlar

        //GenericProduct<double> obj = new GenericProduct<double>();sadece NON-PRIMITIVE

        ArrayList<String> list = new ArrayList<>();
        //list.add(123);

        HashMap<String,Integer> map = new HashMap<>();
        map.put("advjava",99);

        //============================ÇOK PARAMETRELİ CLASS===============================
        GenericClassTwoParam<Integer,String> mymap= new GenericClassTwoParam<>(11,"generic");
        GenericClassTwoParam<Integer,Integer> mymap2= new GenericClassTwoParam<>(11,99);









    }
}
