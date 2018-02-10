
import junit.framework.Assert;
import apka.Czytelnik;
import org.junit.Test;
import java.util.ArrayList;


public class Czytelnik_sprawdz_czy_istnieje {
    
    @Test
    public void test() {

    int expectedResult = 1;    
    ArrayList<Czytelnik> czyt = new ArrayList<Czytelnik>();
    Czytelnik c = new Czytelnik();
    c.przykladowe_dane_czytelnik(czyt);
    
    String imie = "Zbigniew";
    String nazwisko = "Mazur";
    int wynik = c.sprawdz_czy_istnieje_czytelnik(czyt, imie, nazwisko);
    
    Assert.assertEquals(wynik,expectedResult);
    
    
    
    for (int i=0;i<czyt.size();i++){
        if (czyt.get(i).getImie().equalsIgnoreCase(imie) & czyt.get(i).getNazwisko().equalsIgnoreCase(nazwisko)){
           System.out.println(czyt.get(i));
        }
    }
    
    
    }
}
