


import junit.framework.Assert;
import apka.Czytelnik;
import apka.Ksiazka;
import org.junit.Test;
import java.util.ArrayList;


public class Czytelnik_dodawanie_czytelnika {
    
    @Test
    public void test() {

    int expectedSize = 5;    
    ArrayList<Czytelnik> czyt = new ArrayList<Czytelnik>();
    Czytelnik c = new Czytelnik();
    c.przykladowe_dane_czytelnik(czyt);
    
    Assert.assertEquals(czyt.size(),4);
    String imie = "Karol";
    String nazwisko = "Kowalik";
    
    Czytelnik c2 = new Czytelnik(imie,nazwisko,"Warszawa Grunwaldzka 56");
    c2.tworzenie_listy(czyt, c2);
    
    Assert.assertEquals(czyt.size(),expectedSize);
    System.out.println(czyt.get(czyt.size()-1));
            }
}
