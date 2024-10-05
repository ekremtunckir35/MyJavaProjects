package Project;

import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {

        Scanner  scan  = new Scanner(System.in);

        //Kahve Secimi
        System.out.println("Hangi kahveyi istersiniz");
        System.out.println("1.Turk Kahvesi");
        System.out.println("2.Filtre Kahve");
        System.out.println("3.Espresso");

        String hangiKahve =scan.nextLine().toLowerCase();//kucuk buyuk harf diyarliligi

        //1.kosul bolumu
        if(hangiKahve.equals("turk kahvesi")){
            System.out.println(hangiKahve + "hazirlaniyor.....");

        }else if(hangiKahve.equals("filtrekahve")){
            System.out.println(hangiKahve + "hazirlaniyor....");

        }else if(hangiKahve.equals("espresso")){
            System.out.println(hangiKahve + "hazirlaniyor....");
        }else{
            System.out.println("Hatali tuslama yaptiniz");
            return;//yanlis secimdfe programi sonlandir.
        }

        //Sut sorusu
        System.out.println("Sut eklememizi ister misiniz?(Evet veya hayir cevabini veriniz");
        String sut =scan.nextLine().toLowerCase();

        //2.kosul
        if (sut.equals("evet")) {
            System.out.println("Sut ekleniyor.......");

        }else if(sut.equals("hayir")){
            System.out.println("Sut eklenmiyor....");
        }

     //seker sorusu
        System.out.println("Seker ister misiniz?(Evet veya hayir cevabini veriniz");
        String seker =scan.nextLine().toLowerCase();
        //3.kosul
        if (seker.equals("evet")) {
            System.out.println("Kac seker alirsiniz?");
            int kacSeker =scan.nextInt();
            System.out.println(kacSeker + "seker ekleniyor");
            String bosKod =scan.nextLine();//dummy kod
        }else if(seker.equals("hayir")){
            System.out.println("seker eklenmiyor.");
        }

        //Boyut Sorusu
        System.out.println("Hangi boyutta olsun?(Buyuk boy -orta boy -kucuk boy");
        String boyut = scan.nextLine().toLowerCase();

        //4.kosul
        if(boyut.equals("buyuk boy ")){
            System.out.println("Kahveniz" + boyut + "hazirlaniyor");

        }else if(boyut.equals("orta boy")){
            System.out.println("Kahveniz" + boyut + "hazirlaniyor");

        }else if(boyut.equals("kucuk boy")){
            System.out.println("Kahveniz" + boyut + "hazirlaniyor");
        }

        //sonuc bolumu
        System.out.println(hangiKahve + " " + boyut + "hazirdir.Afiyet olsun...");
    }
}
/*
1-Kahve Seçimi: Kullanıcıdan kahve tercihini alıyoruz ve bu seçime göre kahveyi hazırlıyoruz. toLowerCase() metodu sayesinde büyük/küçük harf duyarlılığını ortadan kaldırıyoruz.
2-Süt Sorusu: Kullanıcıdan süt ekleyip eklemeyeceğini soruyoruz. Yanıt "evet" olursa süt ekleniyor, "hayır" olursa eklenmiyor.
3-Şeker Sorusu: Kullanıcıdan şeker isteyip istemediğini soruyoruz. Yanıt "evet" olursa, kaç şeker istediğini soruyoruz ve girdiye göre şeker ekleniyor.
4-Boyut Sorusu: Kullanıcıdan kahve boyutunu soruyoruz ve seçilen boyuta göre kahve hazırlanıyor.
5-Sonuç: Kahve türü ve boyut bilgilerini kullanarak son mesajı oluşturuyoruz.
 */