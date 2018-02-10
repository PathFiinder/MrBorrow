
package apka;

import java.lang.String;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;

public class Czytelnik {
    String imie;
    String nazwisko;
    String adres;
    ArrayList<Czytelnik> user = new ArrayList<Czytelnik> ();
    
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Czytelnik() {
        
    }
    
    public Czytelnik(String imie,String nazwisko,String adres) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.adres=adres;
                 
    }
    
    public void usun_czytlenika(ArrayList<Czytelnik> czy, String imie, String nazwisko) {
        this.user=czy;
        this.imie=imie;
        this.nazwisko=nazwisko;
        
        for (int i=0;i<=czy.size()-1;i++) {
            if (czy.get(i).getImie().equalsIgnoreCase(imie) & czy.get(i).getNazwisko().equalsIgnoreCase(nazwisko)) {
                JOptionPane.showMessageDialog(null,"Usunieto czytelnika: " + czy.get(i).getImie() + " " + czy.get(i).getNazwisko());
                czy.remove(i);
     
            }
        }  
        
    }
 
    public void przykladowe_dane_czytelnik(ArrayList<Czytelnik> maga) {
        this.user=maga;
        maga.add(new Czytelnik ("Jan","Kowalski","Kraków Wilenska 54"));
        maga.add(new Czytelnik ("Adam","Nowak","Kraków Podchorążych 98"));
        maga.add(new Czytelnik ("Mariusz","Wisniewski","Kraków Wrocławska 53"));
        maga.add(new Czytelnik ("Zbigniew","Mazur","Kraków Mazowiecka 12"));
    }
    
    public int sprawdz_czy_istnieje_czytelnik(ArrayList<Czytelnik> cz, String imie, String nazwisko) {
        this.user=cz;
        this.imie=imie;
        this.nazwisko=nazwisko;
        int x=0;
        
        for (int i=0;i<=cz.size()-1;i++) {
            if (cz.get(i).getImie().equalsIgnoreCase(imie) & cz.get(i).getNazwisko().equalsIgnoreCase(nazwisko)) {
                x=1;
            }
        }
        return x;
    }
    
    
    public void tworzenie_listy(ArrayList<Czytelnik> li, Czytelnik ob) {
        this.user=li;
        li.add(ob);
    }
      
    public void wypisz_liste(ArrayList<Czytelnik> lista) {
        this.user=lista;
        
        for (Czytelnik tab : lista)
        System.out.println(tab);
    }
    
    public void wypisanie_dodanego_czytelnika(Czytelnik c)  {
        System.out.println(c.imie + " " + c.nazwisko + " " + c.adres);
    }
    
    
    public String toString () {
        return this.imie + " " + this.nazwisko + " " + this.adres;
    }
    
    
    
    
    
    
    
    
}

