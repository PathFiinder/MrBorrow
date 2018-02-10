

import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import apka.Wypozyczanie;
import apka.Ksiazka;
/**
 *
 * @author Krystian
 */
public class Ksiazka_spr_czy_istnieje_ksiazka {
    
   @Test
    public void test() {

    int expectedResult = 1;
    ArrayList<Ksiazka> book = new ArrayList<Ksiazka>();
    Ksiazka k = new Ksiazka();
    Wypozyczanie w1 = new Wypozyczanie();
    
    String tytul = "Pan Tadeusz";
    k.przykladowe_dane_ksiazka(book);
    
    
    int wynik = w1.spr_tytulu_lista_ksiazka(book, tytul);
    
   
    Assert.assertEquals(wynik, expectedResult);
    
    
    }
}
