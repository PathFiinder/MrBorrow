


import junit.framework.Assert;
import apka.Ksiazka;
import org.junit.Test;
import java.util.ArrayList;


public class Ksiazka_dodawanie_ksiazki {
    
    @Test
    public void test() {

    int expectedSize = 7;
    ArrayList<Ksiazka> book = new ArrayList<Ksiazka>();
    Ksiazka k = new Ksiazka();
    k.przykladowe_dane_ksiazka(book);
    
    Assert.assertEquals(book.size(),6);
    String imie_a = "Stefan";
    String nazwisko_a = "Żeromski";
    
    Ksiazka k2 = new Ksiazka(imie_a,nazwisko_a,"Syzyfowe prace",2007,"GREG",20);
    k2.tworzenie_listy(book, k2);
    
    Assert.assertEquals(book.size(),expectedSize);
    System.out.println(book.get(book.size()-1));
            }
}
