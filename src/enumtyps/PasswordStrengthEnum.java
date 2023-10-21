package enumtyps;
/*
 enum ile sınırlı sayıda sabit değişkenler tanımlarız.
 Değişken isimleri(genellikle büyük harflerle ) virgülle ayrılarak
 listelenir. Default olarak static ve finaldır. Değişken isimleri birlikte
 ayrıca özellik/ler eklemek istersek private final tipinde field tanımlayabiliriz.
 Bu fieldın değeri paametreli constructor ile set edilir. Bu fieldın okunabilmesi için
 getter metodu oluşturulur.
  */
public enum PasswordStrengthEnum {

    LOW(10),//0
    MEDIUM(30),//1
    HIGH(50);//2

    private final int level;


    PasswordStrengthEnum(int level) {
        this.level=level;
    }

}
