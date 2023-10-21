package enumtyps;

import static enumtyps.PasswordStrengthConstant.*;

public class Runner {
    public static void main(String[] args) {
      printPasswordStrength("LOW");
        System.out.println("----------------------------------------");
        printPasswordStrength("MEDIUM");
        System.out.println("----------------------------------------");
        printPasswordStrength("HIGH");///mesaj yazılmadı,CTE yok,RTE yok
        System.out.println("----------------------------------------");
        printPasswordStrength("YÜKSEK");
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        printMessageByEnum(PasswordStrengthEnum.LOW);
        printMessageByEnum(PasswordStrengthEnum.MEDIUM);
        //printMessageByEnum("yüksek");!!     Başka bir seçeneğin yok bunun dışında başka bir değer kullanırsa hata
        //verir . Enum sabit değişkenleriniz için hata almadan temizinden sabit değişkenler oluşturuyoruz.
        printMessageByEnum(PasswordStrengthEnum.HIGH);


    }

    //
    public static void printPasswordStrength(String strength){
        if (strength.equals("LOW")){
            System.out.println("Password gücünüz düşüktür!!!");
        } else if (strength.equals("MEDIUM")) {
            System.out.println("Password gücünüz orta seviyededir!!!");
        } else if (strength.equals("HIGH")) {
            System.out.println("Password gücünüz yüksektir....");
        }
        //PasswordStrengthConstant.(METHODUN YAZILIMINI GÖSTERİYOR)
    }

    //enumla metod
    public static void printMessageByEnum(PasswordStrengthEnum strength){

        if (strength.equals(PasswordStrengthEnum.LOW)){
            System.out.println("Password gücünüz düşüktür!!!");

        } else if (strength.equals(PasswordStrengthEnum.MEDIUM)) {
            System.out.println("Password gücünüz orta seviyededir!!!");

        } else if (strength.equals(PasswordStrengthEnum.HIGH)) {
            System.out.println("Password gücünüz yüksektir....");

        }

        System.out.println("Enum ismi : " + strength.name());
        System.out.println("Enum sırası : " + strength.ordinal());


    }




}
