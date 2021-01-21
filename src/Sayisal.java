
public class Sayisal extends Aday{

    @Override
    public int Hesapla() {

        return getTurkce()*5+getMatematik()*5+getFizik()*4+getEdebiyat()*1;
    
    }

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik,String isim) {
        super(turkce, matematik, edebiyat, fizik,isim);
    }

   
    
    
}
