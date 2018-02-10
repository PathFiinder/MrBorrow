
package apka;

import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;


public class Wypozyczanie {
    String Imie_cz;
    String Nazwisko_czyt;
    String Tytul_ks;
    int ilosc_egz;
    ArrayList<Wypozyczanie> wyp = new ArrayList<Wypozyczanie> ();

    public String getImie_cz() {
        return Imie_cz;
    }

    public String getNazwisko_czyt() {
        return Nazwisko_czyt;
    }

    public String getTytul_ks() {
        return Tytul_ks;
    }

    public int getIlosc_egz() {
        return ilosc_egz;
    }
    
    

    public void setImie_cz(String Imie_cz) {
        this.Imie_cz = Imie_cz;
    }

    public void setNazwisko_czyt(String Nazwisko_czyt) {
        this.Nazwisko_czyt = Nazwisko_czyt;
    }

    public void setTytul_ks(String Tytul_ks) {
        this.Tytul_ks = Tytul_ks;
    }

    public void setIlosc_egz(int ilosc_egz) {
        this.ilosc_egz = ilosc_egz;
    }
    

    
    public Wypozyczanie (String imie,String nazwisko,String tytul,int ile) {
        this.Imie_cz=imie;
        this.Nazwisko_czyt=nazwisko;
        this.Tytul_ks=tytul;
        this.ilosc_egz=ile;
    }
    
    
    public Wypozyczanie () {
        
    }
    
    public Wypozyczanie(String tytul){
        this.Tytul_ks=tytul;
    }
    
    public void przykladowe_dane_wypoczyenia (ArrayList<Ksiazka> ks,ArrayList<Wypozyczanie> wypo) {
        this.wyp=wypo;
        
        wypo.add(new Wypozyczanie("Zbigniew","Mazur","Pan Tadeusz",1));
        wypo.add(new Wypozyczanie("Mariusz","Wisniewski","Lalka",3));
        
        int x = ks.get(0).getIlosc();
        int y = ks.get(1).getIlosc();
        x--;
        y=y-3;
        ks.get(0).ilosc = x;
        ks.get(1).ilosc = y;
               
    }
    
    
    public int spr_imienie_nazwisko(ArrayList<Wypozyczanie> wypo, String imie, String nazwisko){
        this.wyp=wypo;
        this.Imie_cz=imie;
        this.Nazwisko_czyt=nazwisko;
        int wynik=0;
        
        for(int i=0;i<=wypo.size()-1;i++) {
             
            if (wypo.get(i).getImie_cz().equalsIgnoreCase(imie) & wypo.get(i).getNazwisko_czyt().equalsIgnoreCase(nazwisko))
            {
                wynik=1;
                break;
            }            
        }
        return wynik;
    }
    
    public int sprawdz_czy_na_liscie_tytul_wypozyczanie(ArrayList<Wypozyczanie> w1 ,String tytul) {
        int wynik = 0;
        
        this.wyp=w1;
        this.Tytul_ks=tytul;
        
         for(int i=0;i<=w1.size()-1;i++) {
             
            if (w1.get(i).getTytul_ks().equalsIgnoreCase(tytul))
            {
                wynik=1;
                break;
            }            
        }

        
        return wynik;
    }
    
    
    public int spr_tytulu_lista_ksiazka(ArrayList<Ksiazka> ks, String tytul){
        this.Tytul_ks=tytul;
        int wynik=0;
        
        for (int i=0;i<=ks.size()-1;i++){
            
            if (ks.get(i).getTytul().equalsIgnoreCase(tytul))
            {
                wynik = 1;
                break;
            }
        }
        return wynik;
    }
    
    
    public void usun_ilosc(ArrayList<Ksiazka> ks,String tytul,int ile) {
        this.Tytul_ks=tytul;
        
        for (int i=0;i<=ks.size()-1;i++){
            
            if (ks.get(i).getTytul().equalsIgnoreCase(tytul))
            {
                int x = ks.get(i).getIlosc();
                x = x - ile;
                ks.get(i).ilosc=x;
                break;
            }
        }   
    }
    
    
 
    public int spr_czy_istnieje(ArrayList<Wypozyczanie> wypo,ArrayList<Ksiazka> ks, String imie,String nazwisko,String tytul,int ile) {
        int wynik=1;
        this.wyp=wypo;
        this.Imie_cz=imie;
        this.Nazwisko_czyt=nazwisko;
        this.Tytul_ks=tytul;
        this.ilosc_egz=ile;
        
        for (int i=0;i<=wypo.size()-1;i++){
            
            if (wypo.get(i).getImie_cz().equals(imie) & wypo.get(i).getNazwisko_czyt().equals(nazwisko) & wypo.get(i).getTytul_ks().equals(tytul)) {
                int x = wypo.get(i).getIlosc_egz();
                x = x + ile;
                wypo.get(i).ilosc_egz=x;
                usun_ilosc(ks, tytul, ile);
                wynik = 0;
                break;
   
            }
        }

        return wynik;
    }
            
    public int sprawdz_czy_mozna_wypozyczyc_ilosc(ArrayList<Ksiazka> ks,String tytul,int ile) {
        int wynik=1;
        this.Tytul_ks=tytul;
        this.ilosc_egz=ile;
        
        for(int i=0;i<=ks.size()-1;i++) {
            if(ks.get(i).getTytul().equals(tytul)) {  
                    if (ks.get(i).getIlosc() - ile  < 0) {
                        wynik = 0;
                    }    
            }
        }
        return wynik;
    }
    
    
    
    
 
    public void wypozyczanie(ArrayList<Wypozyczanie> wypo,ArrayList<Czytelnik> czy, ArrayList<Ksiazka> ks, String imie, String nazwisko , String tytul, int ile) {
        this.wyp=wypo;
        this.Imie_cz=imie;
        this.Nazwisko_czyt=nazwisko;
        this.Tytul_ks=tytul;
        this.ilosc_egz=ile;
        int wynik1=0;
        int wynik2=0;
        int wynik3=1; 
     
        
        Czytelnik c = new Czytelnik();

        wynik1=c.sprawdz_czy_istnieje_czytelnik(czy, imie, nazwisko);
        wynik2=spr_tytulu_lista_ksiazka(ks, tytul);
        wynik3=spr_czy_istnieje(wypo,ks, imie, nazwisko, tytul, ile);
     
       
        if (wynik1 == 0) {
           JOptionPane.showMessageDialog(null,"Czytelnik o podanych danych nie istnieje");
       }
        
       if (wynik2 == 0) {
           JOptionPane.showMessageDialog(null,"Podany tytul nie istnieje");
       } 
       
      
       
       
       if (wynik1 == 1 & wynik2 == 1 & wynik3 == 1)
        {
            for (int i=0;i<=ks.size()-1;i++) {

                if (ks.get(i).getTytul().equalsIgnoreCase(tytul))
                {
                    wypo.add(new Wypozyczanie(imie,nazwisko,tytul,ile));
                    int x = ks.get(i).getIlosc();
                    x=x-ile;
                    ks.get(i).ilosc=x;
                }
            }
            
        }

    }
    
    
    public int spr_do_zwrotu(ArrayList<Wypozyczanie> wypo, String imie,String nazwisko,String tytul,int ile){
        this.wyp=wypo;
        this.Imie_cz=imie;
        this.Nazwisko_czyt=nazwisko;
        this.Tytul_ks=tytul;
        this.ilosc_egz=ile;
        int wynik=0;
        
        for (int i=0;i<=wypo.size()-1;i++){
            
            if (wypo.get(i).getImie_cz().equals(imie) & wypo.get(i).getNazwisko_czyt().equalsIgnoreCase(nazwisko) & wypo.get(i).getTytul_ks().equalsIgnoreCase(tytul)) {
                int x = wypo.get(i).getIlosc_egz();
                x=x-ile;
                wypo.get(i).ilosc_egz=x;

                if (x == 0){
                    wypo.remove(i);
                }
                
                wynik = 1;
                break;
            } 
        }
        
        return wynik;
    }
    
    
    public int sprawdz_ilosc_do_zwrotu(ArrayList<Wypozyczanie> wypo, String imie, String nazwisko, String tytul, int ile) {
        int wynik=1;
        this.Imie_cz=imie;
        this.Nazwisko_czyt=nazwisko;
        this.Tytul_ks=tytul;
        this.ilosc_egz=ile;
        this.wyp=wypo;
        
        
        for (int i=0;i<=wypo.size()-1;i++){
            if (wypo.get(i).getImie_cz().equalsIgnoreCase(imie) & wypo.get(i).getNazwisko_czyt().equalsIgnoreCase(nazwisko) & wypo.get(i).getTytul_ks().equalsIgnoreCase(tytul)){
                int x = wypo.get(i).getIlosc_egz();
                if ( ile > x || ile <= 0 ){
                    wynik = 0;
                }
            }
        }
        
        
        return wynik;
    }
    
    
    
    public void zwrot(ArrayList<Wypozyczanie> wypo, ArrayList<Ksiazka> ks,String imie,String nazwisko,String tytul, int ile) {
        this.wyp=wypo;
        this.Imie_cz=imie;
        this.Nazwisko_czyt=nazwisko;
        this.Tytul_ks=tytul;
        this.ilosc_egz=ile;
        //int wynik = spr_do_zwrotu(wypo, imie, nazwisko, tytul,ile);
       
       if (spr_do_zwrotu(wypo, imie, nazwisko, tytul,ile)== 1) {

            for (int i=0;i<=ks.size()-1;i++){
                if (ks.get(i).getTytul().equalsIgnoreCase(tytul)) {
                    
                    int x = ks.get(i).getIlosc();
                    x=x+ile;
                    ks.get(i).ilosc=x;
                    break;
                }
            }
       }
     
        
        
    }
    
    public void tworzenie_listy(ArrayList<Wypozyczanie> ww, Wypozyczanie ob) {
        this.wyp=ww;
        ww.add(ob);
    }

    
    public void wypisanie_listy(ArrayList<Wypozyczanie> w) {
        this.wyp=w;
        
        for (Wypozyczanie tab : w)
        System.out.println(tab);
    }
    
    public String toString () {
        return this.Imie_cz + " " + this.Nazwisko_czyt + " " + this.Tytul_ks + " " + this.ilosc_egz;
    }
    
}
