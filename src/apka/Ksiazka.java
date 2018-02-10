package apka;

import java.lang.String;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;


public class Ksiazka {
    
    String imie_A;
    String nazwisko_A;
    String tytul;
    String wydawnictwo;
    int rok;
    int ilosc;
    ArrayList<Ksiazka> book = new ArrayList<Ksiazka> ();

    public String getImie_A() {
        return imie_A;
    }

    public String getNazwisko_A() {
        return nazwisko_A;
    }

    public String getTytul() {
        return tytul;
    }

    public int getRok() {
        return rok;
    }

    
    public String getWydawnictwo() {
        return wydawnictwo;
    }


    public int getIlosc() {
        return ilosc;
    }

    public void setImie_A(String imie_A) {
        this.imie_A = imie_A;
    }

    public void setNazwisko_A(String nazwisko_A) {
        this.nazwisko_A = nazwisko_A;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }


    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Ksiazka (String imie,String nazwisko,String tytul,int rok,String wyd,int ilosc) {
        this.imie_A=imie;
        this.nazwisko_A=nazwisko;
        this.tytul=tytul;
        this.rok=rok;
        this.wydawnictwo=wyd;
        this.ilosc=ilosc;
 
       
    }
    
    public Ksiazka () {
        
    }
 
    public void przykladowe_dane_ksiazka(ArrayList<Ksiazka> maga) {
        this.book=maga;
        maga.add(new Ksiazka ("Adam","Mickiewicz","Pan Tadeusz",2010,"Greg",20));
        maga.add(new Ksiazka ("Boleslaw","Prus","Lalka",2015,"Grge",36));
        maga.add(new Ksiazka ("Henryk","Sienkiewicz","Potop",2013,"Greg",12));
        maga.add(new Ksiazka ("Stefan","Żerowmski","Ludzie bezdomni",2011,"Greg",9));
        maga.add(new Ksiazka ("Julisz","Slowacki","Kordian",2016,"Greg",18));
        maga.add(new Ksiazka ("David","Sawyer","JavaScript",2017,"Helion",5));
        
    }
    
    public void tworzenie_listy(ArrayList<Ksiazka> li, Ksiazka ob) {
        this.book=li;
        li.add(ob);
    }
            
    
    public void wypisz_liste(ArrayList<Ksiazka> lista) {
        this.book=lista;
        
        for (Ksiazka tab : lista)
        System.out.println(tab);
    }
    
    public void usun_ksiazke(ArrayList<Ksiazka> ks,String tytul) {
        this.book=ks;
        this.tytul=tytul;
        
        for (int i=0;i<=ks.size()-1;i++) {
            if (ks.get(i).getTytul().equalsIgnoreCase(tytul)) {
                JOptionPane.showMessageDialog(null,"Usunięto ksiazke: " + ks.get(i).getTytul());
                ks.remove(i);
            }
        }
        
    }
    
    /*public void szukanie_tytulu_do_wyp(ArrayList<Ksiazka> lista , String tytull) {
        this.book=lista;
        this.tytul=tytull;
         
        for (int i=0; i<lista.size();i++)
        {
           if (lista.get(i).getTytul().equalsIgnoreCase(tytull))
           {
               
               int x=lista.get(i).ilosc;
               x--;
               lista.get(i).ilosc=x;
               System.out.println(lista.get(i).getIlosc());
               break;
           }
        }
        
    }*/
    
    public void sprawdzenie_dostepnosci(ArrayList<Ksiazka> lista, String Tytul) {
        this.book=lista;
        this.tytul=Tytul;
        
         for (int i=0; i<=lista.size()-1;i++)
        {
           if (lista.get(i).getTytul().equalsIgnoreCase(Tytul))
           { 
               JOptionPane.showMessageDialog(null, "Ksiazka:  " +  lista.get(i).getTytul()+ " jest dostepna w nastepujacej ilosci sztuk " + lista.get(i).getIlosc());
               break;
           }    
        }   
    }
            
    public void wypisanie_dodanej_ksiazki(Ksiazka k)  {
        System.out.println(k.tytul + " " + k.imie_A + " " + k.nazwisko_A + " " + k.rok + " " + k.wydawnictwo + " " + k.ilosc);
    }
  
    public String toString () {
        return this.tytul + " " + this.imie_A + " " + this.nazwisko_A + " " + this.rok + " " + this.wydawnictwo + " " + this.ilosc ;
    }
    
}
