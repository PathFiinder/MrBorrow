

import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import apka.Ksiazka;
/**
 *
 * @author Krystian
 */
public class Ksiazka_sprawdzenie_dostepnosci {
    
   @Test
    public void test() {

    int expectedResult = 1;
    ArrayList<Ksiazka> book = new ArrayList<Ksiazka>();
    Ksiazka k = new Ksiazka();
    
    String tytul = "Pan Tadeusz";
    k.przykladowe_dane_ksiazka(book);
    
    
    k.sprawdzenie_dostepnosci(book, tytul);
    
    int m=1;
    
    for (int i=0;i<book.size()-1;i++){
        if (book.get(i).getTytul().equalsIgnoreCase(tytul)) {
            m=1;
            break;
        } else { 
            m=0;
        }
    }
    
    if (m == 0) {
        System.out.println("Tytul nie istnieje");
    }
    
    Assert.assertEquals(m, expectedResult);
    
    
    }
}
