
import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;
import apka.Ksiazka;
import apka.Wypozyczanie;
import apka.Czytelnik;
/**
 *
 * @author Krystian
 */
public class Wypozyczanie_zwrot {
    
   @Test
    public void test() {

    int expectedResult = 1;
    int expectedSize = 1;    
    ArrayList<Ksiazka> book = new ArrayList<Ksiazka>();
    ArrayList<Wypozyczanie> wypo = new ArrayList<Wypozyczanie>();
    ArrayList<Czytelnik> cz = new ArrayList<Czytelnik>();
    
    Czytelnik c1 = new Czytelnik();
    Ksiazka k = new Ksiazka();
    Wypozyczanie w1 = new Wypozyczanie();
    c1.przykladowe_dane_czytelnik(cz);
    k.przykladowe_dane_ksiazka(book);
    w1.przykladowe_dane_wypoczyenia(book, wypo);
    
    String imie = "Zbigniew";
    String nazwisko = "Mazur";
    String tytul = "Pan Tadeusz";
    int ile = 1;
    
    int wynik1 = c1.sprawdz_czy_istnieje_czytelnik(cz, imie, nazwisko);
    int wynik2 = w1.spr_tytulu_lista_ksiazka(book, tytul);
    int wynik3 = w1.sprawdz_ilosc_do_zwrotu(wypo, imie, nazwisko, tytul, ile);
    
    int wynik4 = 0;
    if (wynik1 == 1 & wynik2 == 1 & wynik3 == 1) {
        wynik4 = 1;
    }
    
    Assert.assertEquals(wynik4, expectedResult);
    
    System.out.println("PRZED ZWROTEM");
    System.out.println("Lista ksiazek: ");
    k.wypisz_liste(book);
    System.out.println("\nLista wypozyczen: ");
    w1.wypisanie_listy(wypo);
    System.out.println("\n");
    
    w1.zwrot(wypo, book, imie, nazwisko, tytul, ile);
    Assert.assertEquals(wypo.size(), expectedSize);
    
    System.out.println("PO ZWROCIE");
    System.out.println("Lista ksiazek: ");
    k.wypisz_liste(book);
    System.out.println("\nLista wypozyczen: ");
    w1.wypisanie_listy(wypo);
    System.out.println("\n");
    
    
    

    
    
    }
}
