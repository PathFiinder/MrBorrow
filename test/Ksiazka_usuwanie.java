

import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import apka.Ksiazka;
/**
 *
 * @author Krystian
 */
public class Ksiazka_usuwanie {
    
   @Test
    public void test() {

    int expectedSize = 5;
    ArrayList<Ksiazka> book = new ArrayList<Ksiazka>();
    Ksiazka k = new Ksiazka();
    String tytul = "Pan Tadeusz";
    k.przykladowe_dane_ksiazka(book);
    
    Assert.assertEquals(book.size(), 6);
    System.out.println("1 )" + book.get(0) + "\n" + "2) " + book.get(1) + "\n" + "3) " + book.get(2));
    System.out.println("Running testRemove()");
    
    k.usun_ksiazke(book,tytul);
    Assert.assertEquals(book.size(), expectedSize);   
    System.out.println("1) " + book.get(0) + "\n" + "2) " + book.get(1) + "\n" + "3) " + book.get(2));
     
    }
}
