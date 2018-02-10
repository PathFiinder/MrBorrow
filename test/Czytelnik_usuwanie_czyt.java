

import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import apka.Czytelnik;
/**
 *
 * @author Krystian
 */
public class Czytelnik_usuwanie_czyt {
    
   @Test
    public void test() {

    int expectedSize = 3 ;    
    ArrayList<Czytelnik> czyt = new ArrayList<Czytelnik>();
    Czytelnik c = new Czytelnik();
    String imie = "Jan";
    String nazwisko = "Kowalski";
    c.przykladowe_dane_czytelnik(czyt);
    
    Assert.assertEquals(czyt.size(), 4);
    System.out.println("1 )" + czyt.get(0) + "\n" + "2) " + czyt.get(1) + "\n" + "3) " + czyt.get(2));
    System.out.println("Running testRemove()");
    
    c.usun_czytlenika(czyt,imie,nazwisko);
   Assert.assertEquals(czyt.size(), expectedSize) ;
    System.out.println("1) " + czyt.get(0) + "\n" + "2) " + czyt.get(1) + "\n" + "3) " + czyt.get(2));
      
    }
}
