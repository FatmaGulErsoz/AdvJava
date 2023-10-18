package generics.classes;
//generic olarak  PRIMITIV data tipleri kullanılamaz!
 /*
        E --> Element, collection gibi yapılarda kullanılır
        K --> Key
        V --> Value
        N --> Number
        T --> Type
        S,U,V , vb --> 2., 3. ve 4. tipler için

         */
public class GenericProduct <T>{

    private T code;

    private String name;//bütün fieldler generic olamk zorunda değil

    //getter-setter oluştur

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }













}

