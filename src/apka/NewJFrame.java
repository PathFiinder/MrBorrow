/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apka;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.io.IOException;
import java.util.Arrays;



/**
 *
 * @author Krystian
 */
public class NewJFrame extends javax.swing.JFrame {

    ArrayList<Czytelnik> lista_cz = new ArrayList<Czytelnik>() {};
    ArrayList<Ksiazka> lista = new ArrayList<Ksiazka>() {};
    ArrayList<Wypozyczanie> lista_wyp = new ArrayList<Wypozyczanie> () {};
    
    
    public NewJFrame() {
        super("MrBorrow 2017");
        Czytelnik c1 = new Czytelnik();
        Ksiazka k1 = new Ksiazka();
        Wypozyczanie w1 = new Wypozyczanie();
        c1.przykladowe_dane_czytelnik(lista_cz);
        k1.przykladowe_dane_ksiazka(lista);
        w1.przykladowe_dane_wypoczyenia(lista, lista_wyp);
        
       System.out.println("-----------PRZYKŁADOWE DANE-------"); 
       c1.wypisz_liste(lista_cz);
       System.out.println("----------------------------------");
       k1.wypisz_liste(lista);
       System.out.println("----------------------------------");
       w1.wypisanie_listy(lista_wyp);
       System.out.println("----------------------------------");
       System.out.println("----------------------------------");
       System.out.println("\n");
       
       
        initComponents();
    }

    public int sprawdzanie_panelu_czytelnika(){ 
        int z=0;
        int v=0;
        int b=0;
        int m=0;
        int n=0;
        int wynik=0;
        
        String imie = jTextPane1.getText();
        String nazwisko = jTextPane2.getText();
        String adres = jTextPane3.getText();
        
        if(imie.hashCode() == 0 || nazwisko.hashCode() == 0 || adres.hashCode() == 0 ){
             JOptionPane.showMessageDialog(null, "Błąd : Wymagane pola nie zostały wypełnione");
         }
        else {
            v=1;
        }

        for (int i=0;i<=imie.length()+1;i++) {
            if (imie.matches(".*\\d.*") | imie.contains(",") | imie.contains(".") | imie.contains("/") | imie.contains(";") | imie.contains("?") | imie.contains("+") | imie.contains("_") | imie.contains("=")) {
               JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne imie (litery) ");
                 m=0;
                 break;
             }
             else {
                 m=1;
             }  
        }
       
         for (int i=0;i<=nazwisko.length()+1;i++) {
            if (nazwisko.matches(".*\\d.*") | nazwisko.contains(",") | nazwisko.contains(".") | nazwisko.contains("/") | nazwisko.contains(";") | nazwisko.contains("?") | nazwisko.contains("+") | nazwisko.contains("_") | nazwisko.contains("=")) {
               JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne nazwisko (litery) ");
                 m=0;
                 break;
             }
             else {
                 n=1;
             }  
        }
         
        try{
            int num3 = Integer.parseInt(jTextPane3.getText()); 
            JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawny adres czytelnika");
        } catch (NumberFormatException e) {
             z =1;
        }
        
        
        if (jTextPane1.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość imienia czytelnika wynosi 12 znaków ");
        } else if (jTextPane2.getText().length() > 15) {
             JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość nazwiska czytelnika wynosi 15 znaków ");   
        } else if (jTextPane3.getText().length() > 30 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość adresu czytelnika wynosi 30 znaków ");  
        } else {
            b=1;
        }
        
        if (v == 1  & z == 1 & b == 1 & m == 1 & n == 1){
            wynik=1;
        }
        
        return wynik;
    }
    
    public int sprawdzanie_panelu_ksiazka(){
        int x=0;
        int a1=0;
        int a2=0;
        int a4=1;
        int a5=0;
        int a6=1;
        int a7=0;
        int b=0;
        int bb=0;
        int wynik=0;
        int wynik1=1;
        
        if(jTextPane4.getText().hashCode() == 0 || jTextPane5.getText().hashCode() == 0 || jTextPane6.getText().hashCode() == 0 || jTextPane7.getText().hashCode() == 0 || jTextPane8.getText().hashCode() == 0 || jTextPane9.getText() == null){
             JOptionPane.showMessageDialog(null, "Błąd : Wymagane pola nie zostały wypełnione");
             a4=0;
             a6=0;
             a7=1;
         }
        else {
            x=1;
        }

        String imie = jTextPane4.getText();
        String nazwisko = jTextPane5.getText();
        
       
        
        for (int i=0;i<=imie.length()+1;i++) {
            if (imie.matches(".*\\d.*") | imie.contains(",") | imie.contains(".") | imie.contains("/") | imie.contains(";") | imie.contains("?") | imie.contains("+") | imie.contains("_") | imie.contains("=")) {
               JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne imie (litery) ");
                 a1=0;
                 break;
             }
             else {
                a1=1;
             }  
        }
        
        for (int i=0;i<=nazwisko.length()+1;i++) {
            if (nazwisko.matches(".*\\d.*") | nazwisko.contains(",") | nazwisko.contains(".") | nazwisko.contains("/") | nazwisko.contains(";") | nazwisko.contains("?") | nazwisko.contains("+") | nazwisko.contains("_") | nazwisko.contains("=")) {
               JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne nazwisko (litery) ");
                a2=0;
                 break;
             }
             else {
                 a2=1;
             }  
        }
        
        
        
        if (a4 == 1) {
            try{
            Integer.parseInt(jTextPane7.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawny rok wydania ksiązki");
            a4=0;
        }
        }

        try{
            int num5 = Integer.parseInt(jTextPane8.getText()); 
            JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne wydawnictwo");
        } catch (NumberFormatException e) {
             a5 =1;
        }
        
        if (a6 == 1) {
         try{
            Integer.parseInt(jTextPane9.getText()); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawna ilosc");
            a6=0;
        }   
        }

        if (jTextPane4.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość imienia autora wynosi 12 znaków ");
        } else if (jTextPane5.getText().length() > 15) {
             JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość nazwiska autora wynosi 15 znaków ");   
        } else if (jTextPane6.getText().length() > 30 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość tytułu ksiązki  wynosi 30 znaków ");  
        } else if (jTextPane8.getText().length() > 10 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość wydawnictwa  wynosi 10 znaków ");  
        } else if (jTextPane9.getText().length() > 3 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość pola ilosc   wynosi 3 znaki ");  
        } else {
            b=1;
        }
        
        if (a7 == 0)
        {if (jTextPane7.getText().length() != 4 )
            JOptionPane.showMessageDialog(null, "Błąd : Pole rok musi składać sie z 4 znaków ");  
         else
        {
            bb=1;
        }
        }

        if (a7 == 0) {
         if ((int)(Integer.parseInt(jTextPane9.getText())) <= 0 ){
                   JOptionPane.showMessageDialog(null, "Błąd : Ilość egzemplarzy nie może byc mniejsza lub równa 0"); 
                   wynik1=0;
         }
        }

        if (x == 1 &  a1 == 1 & a2 == 1 & a4 == 1 & a5 == 1 & a6 == 1 & b == 1 & bb == 1 & wynik1 == 1){
            wynik=1;
        }
        
        return wynik;
    }
    
     public int sprawdzanie_panelu_wypozycz_zwroc(){
        int x=0;
        int a1=0;
        int a2=0;
        int a4=1;
        int b=0;
        int wynik=0;
        
        if(jTextPane10.getText().hashCode() == 0 || jTextPane11.getText().hashCode() == 0 || jTextPane12.getText().hashCode() == 0 || jTextPane13.getText() == null){
             JOptionPane.showMessageDialog(null, "Błąd : Wymagane pola nie zostały wyepełnione");
             a4=0;
         }
        else {
            x=1;
        }

        
        String imie = jTextPane10.getText();
        String nazwisko = jTextPane11.getText();
        
       
        
        for (int i=0;i<=imie.length()+1;i++) {
            if (imie.matches(".*\\d.*") | imie.contains(",") | imie.contains(".") | imie.contains("/") | imie.contains(";") | imie.contains("?") | imie.contains("+") | imie.contains("_") | imie.contains("=")) {
               JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne imie (litery) ");
                 a1=0;
                 break;
             }
             else {
                a1=1;
             }  
        }
        
        for (int i=0;i<=nazwisko.length()+1;i++) {
            if (nazwisko.matches(".*\\d.*") | nazwisko.contains(",") | nazwisko.contains(".") | nazwisko.contains("/") | nazwisko.contains(";") | nazwisko.contains("?") | nazwisko.contains("+") | nazwisko.contains("_") | nazwisko.contains("=")) {
               JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne nazwisko (litery) ");
                a2=0;
                 break;
             }
             else {
                 a2=1;
             }  
        }
        
        
        if (a4 == 1) {
            try{
            Integer.parseInt(jTextPane13.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawnie zapisana ilość");
            a4=0;
        }
        }


        if (jTextPane10.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość imienia czytelnika wynosi 12 znaków ");
        } else if (jTextPane11.getText().length() > 15) {
             JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość nazwiska czytelnika wynosi 15 znaków ");   
        } else if (jTextPane12.getText().length() > 30 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość tytułu ksiązki  wynosi 30 znaków ");  
        } else if (jTextPane13.getText().length() > 3){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość pola ilosc  wynosi 3 znaki ");  
        } else {
            b=1;
        }

        if (x == 1 &  a1 == 1 & a2 == 1 & a4 == 1 & b == 1){
            wynik=1;
        }
        
        return wynik;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPane13 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane10 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextPane11 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextPane12 = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane3.setViewportView(jTextPane3);

        jLabel1.setText("Podaj imie czytelnika");

        jLabel2.setText("Podaj nazwisko czytelnika");

        jLabel3.setText("Podaj adres czytelnika");

        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane2.setViewportView(jTextPane2);

        jLabel22.setText("               PANEL CZYTELNIKA");

        jButton1.setText("Dodaj czytelnika");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setText("Usuń czytelnika");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane6.setViewportView(jTextPane6);

        jScrollPane7.setViewportView(jTextPane7);

        jScrollPane8.setViewportView(jTextPane8);

        jScrollPane9.setViewportView(jTextPane9);

        jLabel4.setText("Podaj imie autora");

        jLabel5.setText("Podaj nazwisko autora");

        jLabel6.setText("Podaj tytul książki");

        jLabel7.setText("Podaj rok wydania");

        jLabel8.setText("Podaj wydawnictwo");

        jLabel9.setText("Podaj ilosc egzemplarzy");

        jScrollPane4.setViewportView(jTextPane4);

        jScrollPane5.setViewportView(jTextPane5);

        jButton2.setText("Dodaj książkę");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("           PANEL KSIĄZKI");

        jButton8.setText("Usun ksiazke");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Sprawdz czy istnieje juz taka ksiązka");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Podaj ilość egzemplarzy");

        jLabel23.setText("          PANEL WYPOŻYCZEŃ I ZWROTÓW");

        jLabel10.setText("Podaj imie czytelnika");

        jLabel14.setText("Podaj nazwisko czytelnika");

        jLabel15.setText("Podaj tytul ksiazki");

        jScrollPane12.setViewportView(jTextPane13);

        jScrollPane10.setViewportView(jTextPane10);

        jScrollPane11.setViewportView(jTextPane11);

        jScrollPane13.setViewportView(jTextPane12);

        jButton3.setText("Wypożycz");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Zwróć");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sprawdź dostępność książki");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Sprawdż czy czytelnik ma wypożyczenie");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10)
                            .addComponent(jScrollPane13)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String imie_a;
        String nazwisko_a;
        String tytul;
        String wyd;
        int rok;
        int ilosc;
        int wynik = sprawdzanie_panelu_ksiazka();
      
        
        
        
        if (wynik == 1){
                imie_a = (String)(jTextPane4.getText());
                nazwisko_a = (String)(jTextPane5.getText());
                tytul = (String)(jTextPane6.getText());
                rok = (int)(Double.parseDouble(jTextPane7.getText()));
                wyd = (String)(jTextPane8.getText());
                ilosc = (int)(Double.parseDouble(jTextPane9.getText()));

                Wypozyczanie w = new Wypozyczanie();
                int x = w.spr_tytulu_lista_ksiazka(lista, tytul);
                Ksiazka k = new Ksiazka(imie_a,nazwisko_a,tytul,rok,wyd,ilosc);
               
                
                
                if (x == 0) {
                     JOptionPane.showMessageDialog(null, "Dodano ksiazke: " + imie_a + " " + nazwisko_a + " " + tytul + " " + wyd + " " + rok + " " + ilosc);
                     System.out.println("-------------DODAWANIE KSIAZKI----------------");
                     k.tworzenie_listy(lista, k);
                     k.wypisz_liste(lista);
                     System.out.println("----------------------------------------------");
                     System.out.println("----------------------------------------------");
                     System.out.println("\n");         
                }
                else {
                    JOptionPane.showMessageDialog(null, "Ksiazka o podanym tytule juz istnieje");
                }
                    
        }
    
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String imie;
        String nazwisko;
        String tytul;
        int ile;
        int wynik = sprawdzanie_panelu_wypozycz_zwroc();
        Wypozyczanie w1 = new Wypozyczanie();
        Czytelnik c1 = new  Czytelnik();
        int wynik1 = w1.spr_tytulu_lista_ksiazka(lista, jTextPane12.getText());
        int wynik2 = c1.sprawdz_czy_istnieje_czytelnik(lista_cz, jTextPane10.getText(), jTextPane11.getText());
        int spr=1;
 
        String n = jTextPane13.getText();
        if (n.matches("[0]+")) {
            JOptionPane.showMessageDialog(null, "Błąd : Ilosc nie moze wynosic 0");
            spr = 0;
        }
        

        if (wynik == 1 & spr == 1 ) {

            imie = (String)((jTextPane10.getText()));
            nazwisko = (String)((jTextPane11.getText()));
            tytul = (String)(jTextPane12.getText());
            ile = (int)(Double.parseDouble(jTextPane13.getText()));

            int wynik3 = w1.sprawdz_czy_mozna_wypozyczyc_ilosc(lista, tytul, ile);

            
            
            if ((int)(Double.parseDouble(jTextPane13.getText())) > 0) {
                if (wynik3 == 1) {
                    w1.wypozyczanie(lista_wyp, lista_cz, lista, imie, nazwisko, tytul, ile); 

                    if (wynik1 == 1 & wynik2 == 1) {
                    JOptionPane.showMessageDialog(null, "Dodano wypożyczenie: " + jTextPane10.getText() + " " + jTextPane11.getText() + " " + jTextPane12.getText() + " " + jTextPane13.getText());
                    System.out.println("----------------DODAWANIE WYPOZYCZENIA-------------");
                    w1.wypisanie_listy(lista_wyp);
                    System.out.println("---------------------------------------------------");

                    Ksiazka k = new Ksiazka();
                    System.out.println("Lista ksiazke : \n");
                    k.wypisz_liste(lista);
                    System.out.println("----------------------------------------------------");
                    System.out.println("----------------------------------------------------");
                    System.out.println("\n");
                } 
                } else  {
                    JOptionPane.showMessageDialog(null, "Błąd : Podana ilosc egzemplarzy jest większa od dostępnej ilości danej ksiązki");
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Błąd : Ilosc nie moze być mniejsza od 0");
            }
            
    
        } 
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String imie;
        String nazwisko;
        String tytul;
        int ile;
        int wynik = sprawdzanie_panelu_wypozycz_zwroc();
        Wypozyczanie w1 = new Wypozyczanie();
        Czytelnik c1 = new  Czytelnik();
        int wynik1 = w1.spr_tytulu_lista_ksiazka(lista, jTextPane12.getText());
        int wynik2 = c1.sprawdz_czy_istnieje_czytelnik(lista_cz, jTextPane10.getText(), jTextPane11.getText());
        int wynik4 = 0;
        int wynik5 = w1.spr_imienie_nazwisko(lista_wyp, jTextPane10.getText(), jTextPane11.getText());


        for (int i=0;i<=lista_wyp.size()-1;i++) {
            if (lista_wyp.get(i).Imie_cz.equalsIgnoreCase(jTextPane10.getText()) & lista_wyp.get(i).Nazwisko_czyt.equalsIgnoreCase(jTextPane11.getText()) & lista_wyp.get(i).getTytul_ks().equalsIgnoreCase(jTextPane12.getText())) {
                wynik4 = 1;
                break;
            }
        }
        
        
        if (wynik == 1) {
                
            imie = (String)((jTextPane10.getText()));
            nazwisko = (String)((jTextPane11.getText()));
            tytul = (String)(jTextPane12.getText());
            ile = (int)(Double.parseDouble(jTextPane13.getText()));

            
            int wynik3 = w1.sprawdz_ilosc_do_zwrotu(lista_wyp, imie, nazwisko, tytul,ile);
            
            
            
            if (wynik1 == 1 & wynik2 == 1 & wynik3 == 1 & wynik4 == 1 & wynik5 == 1) {
            w1.zwrot(lista_wyp, lista, imie, nazwisko, tytul, ile);
            System.out.println("-------------ZWROT KSIĄZKI--------------------");    
            System.out.println("Lista wypozyczeń: \n");
            w1.wypisanie_listy(lista_wyp);
            System.out.println("----------------------------------------------");
            Ksiazka k = new Ksiazka();
            System.out.println("Lista ksiażek: \n");
            k.wypisz_liste(lista);
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("\n");
            JOptionPane.showMessageDialog(null, "Dodano zwrot: " + imie + " " + nazwisko + " " + tytul + " " + ile);
            } else if (wynik1 == 0) {
             JOptionPane.showMessageDialog(null, "Podany tytuł nie istnieje");
            } else if (wynik2 == 0) {
             JOptionPane.showMessageDialog(null, "Podano złe dane o czytleniku");
            } else if (wynik3 == 0) {
            JOptionPane.showMessageDialog(null, "Błąd : Ilośc egzemplarzy jest większa od ilości wypożyczonej ksiązki przez danego czytlenika lub jest równa 0");
            } else if (wynik4 == 0) {
                if (wynik5 == 0) {
                JOptionPane.showMessageDialog(null, "Czytlenik o podanych danych nie wypozyczył żadnej ksiązki");
                } else {
                     JOptionPane.showMessageDialog(null, "Czytlenik o podanych danych nie wypożyczył tej książki");   
                }
            } 
            
     }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String imie;
        String nazwisko;
        String adres;
        int wynik = sprawdzanie_panelu_czytelnika();
        
        if (wynik == 1) {
                imie = (String)((jTextPane1.getText()));
                nazwisko = (String)((jTextPane2.getText()));
                adres = (String)((jTextPane3.getText()));
                Czytelnik c = new Czytelnik(imie,nazwisko,adres);

                int b = c.sprawdz_czy_istnieje_czytelnik(lista_cz, imie, nazwisko);

                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "Dodano czytelnika: " + imie + " " + nazwisko + " " + adres);
                    System.out.println("-----------DODAWANIE CZYTELNIKA---------------");
                    c.tworzenie_listy(lista_cz, c);
                    c.wypisz_liste(lista_cz);
                    System.out.println("----------------------------------------------");
                    System.out.println("----------------------------------------------");
                    System.out.println("\n");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Blad : Czytelnik o podanych danych juz istnieje");
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        String tytul;
        int y = 0;
        int b=0;
        
        Wypozyczanie w = new Wypozyczanie();
        int wynik = w.spr_tytulu_lista_ksiazka(lista, jTextPane12.getText());
        
            
        
            if(jTextPane12.getText().hashCode() == 0){
                  JOptionPane.showMessageDialog(null, "Błąd : Wypełnij pole tytuł");
              }
             else {
                 y=1;
            }
            
            if (y == 1) {
                if (wynik == 0) {
                 JOptionPane.showMessageDialog(null, "Błąd : Podany tytul nie istnieje ");  
            }  
            }

            
            if (jTextPane12.getText().length() > 30 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość pola tytuł wynosi 30 znaki ");  
             } else {
            b=1;
            }

            if ( y == 1 & wynik == 1 & b == 1) {

            
            tytul = (String)(jTextPane12.getText());

             Ksiazka k3 = new Ksiazka ();
             k3.sprawdzenie_dostepnosci(lista, tytul);
            }
              
    }//GEN-LAST:event_jButton5ActionPerformed
 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String imie;
        String nazwisko;
        
        
        int y = 0;
        int a1=0;
        int a2=0;
        int b=0;
        Czytelnik c1 = new  Czytelnik();
        int wynik1 = c1.sprawdz_czy_istnieje_czytelnik(lista_cz, jTextPane10.getText(), jTextPane11.getText());
      
            if(jTextPane10.getText().hashCode() == 0 & jTextPane11.getText().hashCode() == 0){
                  JOptionPane.showMessageDialog(null, "Błąd : Wypełnij pole imie i nazwisko czytelnika");
              }
             else {
                 y=1;
            }

            try{
                 int num1 = Integer.parseInt(jTextPane10.getText()); 
                 JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne imie czytlenika");
             } catch (NumberFormatException e) {
                 a1 =1;
            }
            
            try{
                 int num1 = Integer.parseInt(jTextPane11.getText()); 
                 JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne nazwisko czytelnika");
             } catch (NumberFormatException e) {
                 a2 =1;
            }
            
            if (jTextPane10.getText().length() > 12 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość pola imie czytelnika wynosi 12 znaki ");  
             } else  if (jTextPane11.getText().length() > 15 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość pola nazwisko czytelnika wynosi 15 znaki ");  
             } else {
            b=1;
            }
            
    
            ArrayList tablica = new ArrayList();
            for (int i=0;i<lista_wyp.size();i++){
                if (lista_wyp.get(i).getImie_cz().equals(jTextPane10.getText()) & lista_wyp.get(i).getNazwisko_czyt().equals(jTextPane11.getText()) ) {
                    tablica.add(lista_wyp.get(i).getTytul_ks() + " w ilosci: " +  lista_wyp.get(i).getIlosc_egz());    
                }
            }
            
   
            if ( y == 1 & a1 == 1 & a2 == 1 & b == 1) {
                
                imie = (String)((jTextPane10.getText()));
                nazwisko = (String)((jTextPane11.getText()));

                 Wypozyczanie w3 = new Wypozyczanie();
                 int x = w3.spr_imienie_nazwisko(lista_wyp, imie, nazwisko);

                 if (wynik1 == 0) {
                    JOptionPane.showMessageDialog(null, "Błąd : Czytelnik o podanych danych nie istnieje");
                } else if (x == 1 & wynik1 == 1) {
                     JOptionPane.showMessageDialog(null,"Czytelnik: " + imie + " " + nazwisko + " ma wypozyczona ksiazke/ki: " + tablica.toString());
                }
                else {
                    JOptionPane.showMessageDialog(null,"Czytelnik: " + imie + " " + nazwisko + " nie ma wypozyczonych ksiazke/ki");
                }
            }        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String imie;
       String nazwisko;
       int yy = 0;
       int v = 0;
       int xx = 0;
       int b = 0;
       
       
        if(jTextPane1.getText().hashCode() == 0 || jTextPane2.getText().hashCode() == 0){
             JOptionPane.showMessageDialog(null, "Błąd : Wymagane pola ( imię i nazwisko czytelnika ) nie zostały wypełnione");
         }
        else {
            v=1;
        }

       try{
            int num1 = Integer.parseInt(jTextPane1.getText()); 
            JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne imie czytelnika");
        } catch (NumberFormatException e) {
            xx =1;
         }
       
         try{
            int num2 = Integer.parseInt(jTextPane2.getText()); 
            JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawne nazwisko czytelnika");
        } catch (NumberFormatException e) {
             yy =1; 
        }
       
         if (jTextPane1.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość imienia czytelnika wynosi 12 znaków ");
        } else if (jTextPane2.getText().length() > 15) {
             JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość nazwiska czytelnika wynosi 15 znaków ");   
        } else {
            b=1;
        } 
       
       
       
       if (v == 1 & xx == 1 & yy == 1 & b == 1 ){
           
            imie = (String)((jTextPane1.getText()));
            nazwisko = (String)((jTextPane2.getText()));

            Czytelnik c = new Czytelnik();
            Wypozyczanie w = new Wypozyczanie();
            int x = c.sprawdz_czy_istnieje_czytelnik(lista_cz, imie, nazwisko);
            int y = w.spr_imienie_nazwisko(lista_wyp, imie, nazwisko);


           if (x == 1 & y == 0){

            c.usun_czytlenika(lista_cz, imie, nazwisko);

           }
           else if (x == 0)
           {
               JOptionPane.showMessageDialog(null,"Nie mozna usunac gdyz czytlenik o podanych danych nie istnieje");
           }
           else if (y == 1) {
               JOptionPane.showMessageDialog(null,"Nie mozna usunac gdyz czytlenik o podanych danych ma wypożyczona ksiązka/ki)");
           }
           
           System.out.println("-----------USUWANIE CZYTELNIKA---------------");
           c.wypisz_liste(lista_cz);
           System.out.println("----------------------------------------------");
           System.out.println("----------------------------------------------");
           System.out.println("\n");
        } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String tytul;
        int y = 0;
        int b=0; 
        
            if(jTextPane6.getText().hashCode() == 0){
                  JOptionPane.showMessageDialog(null, "Błąd : Wypełnij pole tytuł");
              }
             else {
                 y=1;
            }        
            
            if (jTextPane6.getText().length() > 30 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość pola tytuł wynosi 30 znaki ");  
             } else {
            b=1;
            }
            
            if ( y == 1 &  b == 1) {
                    tytul = (String) ((jTextPane6.getText()));

                    Wypozyczanie w = new Wypozyczanie();
                    Ksiazka k = new Ksiazka();
                    int x = w.sprawdz_czy_na_liscie_tytul_wypozyczanie(lista_wyp, tytul);
                    int wynik = w.spr_tytulu_lista_ksiazka(lista, tytul);
                    if (wynik == 0){
                        JOptionPane.showMessageDialog(null, "Błąd : Podany tytuł nie istnieje");
                    }
                   

                    if (x == 0 & wynik == 1) 
                    {
                    k.usun_ksiazke(lista, tytul);
                    System.out.println("----------------USUWANIE KSIAZKI--------------");
                    k.wypisz_liste(lista);
                    System.out.println("----------------------------------------------");
                    System.out.println("----------------------------------------------");
                    System.out.println("\n");
                    }
                    else if (x == 1)
                    {
                      JOptionPane.showMessageDialog(null,"Nie mozna usunac ksiazki gdyz jest ona aktualnie wypozyczona");
                    }
            }    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String tytul;
         int y = 0;
        int a1=0;
        int b=0;
        
            if(jTextPane6.getText().hashCode() == 0){
                  JOptionPane.showMessageDialog(null, "Błąd : Wypełnij pole tytuł");
              }
             else {
                 y=1;
            }

            try{
                 int num1 = Integer.parseInt(jTextPane6.getText()); 
                 JOptionPane.showMessageDialog(null, "Błąd : Podaj poprawny tytul");
             } catch (NumberFormatException e) {
                 a1 =1;
            }
            
            if (jTextPane6.getText().length() > 30 ){
            JOptionPane.showMessageDialog(null, "Błąd : Maksymalna długość pola tytuł wynosi 30 znaki ");  
             } else {
            b=1;
            }
            
            if ( y == 1 & a1 == 1 & b == 1) {

                tytul = (String) ((jTextPane6.getText()));

                Wypozyczanie w = new Wypozyczanie();
                int x = w.spr_tytulu_lista_ksiazka(lista, tytul);

                if (x == 1) {
                    JOptionPane.showMessageDialog(null,"Podana ksiazka " + tytul + " juz istnieje");
                }
                else {
                     JOptionPane.showMessageDialog(null,"Ksiazka o podanym tyule nie istnieje w systemie");
                }
            }        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    
  
   
    public static void main(String args[]) {

      
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
             
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane10;
    private javax.swing.JTextPane jTextPane11;
    private javax.swing.JTextPane jTextPane12;
    private javax.swing.JTextPane jTextPane13;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    // End of variables declaration//GEN-END:variables
}
