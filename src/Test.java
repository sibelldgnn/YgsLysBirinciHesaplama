
import java.util.Scanner;


public class Test {


   
    public static void main(String[] args) {
  
 
        System.out.println("ygs lys birinci bulma programı");
        Scanner scanner = new Scanner( System.in);
        String islemler="İşlemler...\n"
                        +"1.Eşitağırlık öğrencileri birincisi\n"
                        +"2.Sayısal öğrencileri birincisi";
                        
        System.out.println("**************");
        System.out.println(islemler);
        while(true)
        {
              System.out.println("çıkış için q ya bas");
              String islem2= scanner.nextLine();
             if(islem2.equals("q"))
            {
                System.out.println("programdan çıkılıyor...");
                break;
            }
                System.out.println("birinci ogrenci ismi");
                String isim1=scanner.nextLine();
                System.out.print("netler( türkçe,matematik,edebiyat,fizik: )");
                int turkce1=scanner.nextInt();
                int matematik1=scanner.nextInt();
                int edebiyat1=scanner.nextInt();
                int fizik1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("ikinci ogrenci ismi");
                String isim2=scanner.nextLine();
                System.out.print("netler( türkçe,matematik,edebiyat,fizik: )");
                int turkce2=scanner.nextInt();
                int matematik2=scanner.nextInt();
                int edebiyat2=scanner.nextInt();
                int fizik2=scanner.nextInt();
                scanner.nextLine();
                System.out.println("üçüncü ogrenci ismi");
                String isim3=scanner.nextLine();
                System.out.print("netler( türkçe,matematik,edebiyat,fizik: )");
                int turkce3=scanner.nextInt();
                int matematik3=scanner.nextInt();
                int edebiyat3=scanner.nextInt();
                int fizik3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("işlem seç");
               String islem= scanner.nextLine();
                 if (islem.equals("1")){
  
                EsitAgirlik ogrenci1= new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2= new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3= new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);
               EsitAgirlik birinci= birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("birinci eşit ağırlık öğrencisi="+birinci.getIsim());
                System.out.println("birincinin puanı= "+birinci.Hesapla());
                        }
            
           else if(islem.equals("2"))
            {
                Sayisal ogrenci1= new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2= new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3= new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                Sayisal birinci= birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("birinci sayısal ağırlık öğrencisi="+birinci.getIsim());
                System.out.println("birincinin puanı= "+birinci.Hesapla());
     
                
            }
            else{
                System.out.println("geçersiz işlem");
               
            }
        }
       
    }
    public static<E extends Aday> E birinci(E e1, E e2,E e3)// sadece aday clasını ezten edenleri yolluyoruz. genel yollayınca hata veriyor
{
if(e1.Hesapla()>e2.Hesapla()&& e1.Hesapla()>e3.Hesapla())
{
    return e1;
}
else if(e2.Hesapla()>e1.Hesapla()&& e2.Hesapla()>e3.Hesapla())
{
    return e2;
}
else if(e3.Hesapla()>e2.Hesapla()&& e3.Hesapla()>e1.Hesapla())
{
    return e3;
}
else{
    return e1;
}
}
    
}
