package generics.classes;

public class RunnenNonGeneric {
    public static void main(String[] args) {

        // 2 farklı obje: book,laptop

        NonGenericProduct book = new NonGenericProduct();//
        book.setCode("advjava");//code değerini string ile set ettik

        NonGenericProduct laptop = new NonGenericProduct();
        laptop.setCode(123);//code değerini int ile set ettik

        String srt = (String) book.getCode();//CTE aldık-->CAST problemi
        System.out.println(srt);

        String str2 = (String) laptop.getCode();//CTE-->CAST problemi-->ClassCastException
        System.out.println(str2);


    }
}
