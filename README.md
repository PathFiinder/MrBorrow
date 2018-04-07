1) Cel aplikacji:

Program wykonany na potrzeby zaliczenia zajęć: Inżynieria Oprogramowania na Politechnice Krakowskiej.


2) Wprowadzenie:

Dokument ten przedstawia specyfikację aplikacji „MrBorrow 2017”. Aplikacja ta jest stworzona do obsługi
systemu wypożyczalni książek.

3) Cel aplikacji:

Aplikacja będzie służyła do obsługi systemu zarządzania wypożyczalnią książek. Grupą docelową tej aplikacji
będą wypożyczalnie książek, biblioteki szkolne, uczelnianie publiczne lub prywatne.

4) Wymagania funkcjonalne:

Tworzona aplikacja posiada następujące funkcje:

I. Dodawanie czytelników – funkcja ta umożliwia dodawanie do systemu nowej osoby, poprzez
wpisanie danych o czytelniku do pól, takich jak: imię czytelnika, nazwisko czytelnika , adres czytelnika.
Jeśli użytkownik oprogramowania uzupełnił poprawnie pola i kliknął przycisk „Dodaj czytelnika”,
czytelnik o podanych danych jest dodawany do systemu oraz użytkownik otrzymuje następujący
komunikat: „Dodano czytelnika: imię czytelnika nazwisko czytelnika adres czytelnika” . Jeśli wyżej
wymienione pola nie zostały uzupełnione po kliknięciu w przycisk „Dodaj czytelnika” użytkownik
otrzymuje następujący komunikat: „Błąd : Wymagane pola nie zostały uzupełnione”. Jeśli w pola: imię
czytelnika i nazwisko czytelnika zostaną wpisane liczby użytkownik otrzymuje komunikaty: „Błąd :
Podaj poprawne imię/nazwisko czytelnika”. Jeśli pole adres czytelnika będzie rozpoczynać się od liczby,
użytkownik otrzymuje komunikat: „Błąd : Podaj poprawny adres”. W sytuacji przekroczenia
maksymalnej ilości znaków dla tych trzech pól pojawiają się następujące komunikaty: „ Błąd:
maksymalna długość imienia/nazwiska/adresu czytelnika wynosi 12/15/30 znaków”. Jeśli czytelnik o
podanym imieniu i nazwisku istnieje już w systemie, użytkownik otrzymuje następujący komunikat:
„Błąd: czytelnik o podanych danych już istnieje w systemie”. Tym samym aplikacja nie pozwala na
dodawanie czytelników o takim samym imieniu i nazwisku.

II. Usuwanie czytelników - celem tej funkcji jest usuwanie z systemu czytelnika o podanych danych,
wpisywanych do pól : imię czytelnika, nazwisko czytelnika. Jeśli użytkownik oprogramowania uzupełnił
poprawnie pola i kliknął przycisk „Usuń czytelnika”, czytelnik o podanych danych jest usuwany z
systemu oraz użytkownik otrzymuje następujący komunikat: „Usunięto czytelnika: imię czytelnika
nazwisko czytelnika” . Jeśli wyżej wymienione pola nie zostały uzupełnione po kliknięciu w przycisk
„Usuń czytelnika” użytkownik otrzymuje następujący komunikat: „Błąd: Wymagane pola nie zostały
uzupełnione”. Jeśli w pola: imię czytelnika i nazwisko czytelnika zostaną wpisane liczby użytkownik
otrzymuje komunikat: „Błąd : Podaj poprawne imię/nazwisko czytelnika”. W sytuacji przekroczenia
maksymalnej ilości znaków dla tych pól pojawiają się następujące komunikaty: „ Błąd : maksymalna
długość imienia/nazwiska czytelnika wynosi 12/15 znaków”. Przy próbie usunięcia czytelnika
posiadającego aktualnie wypożyczoną książkę, użytkownik otrzymuje komunikat: „Błąd : Nie można
usunąć danego czytelnika, gdyż ma on wypożyczoną książkę/ki”.

III. Dodawanie książek – funkcja ta umożliwia dodawanie nowych pozycji książkowych do systemu,
poprzez uzupełnienie pól, takich jak: imię autora, nazwisko autora, tytuł książki, rok wydania,
wydawnictwo oraz ilość egzemplarzy. Jeśli użytkownik oprogramowania uzupełnił poprawnie pola i
kliknął przycisk „Dodaj książkę”, książka o podanych danych jest dodawana do systemu oraz
użytkownik otrzymuje komunikat: „Dodano książkę do magazynu : imię autora, nazwisko autora, tytuł
książki, rok wydania, wydawnictwo, ilość egzemplarzy”. Jeśli wyżej wymienione pola nie zostały
uzupełnione po kliknięciu w przycisk „Dodaj książkę” użytkownik otrzymuje następujący komunikat:
„Błąd: Wymagane pola nie zostały uzupełnione”. Jeśli w pola: imię autora, nazwisko autora,
wydawnictwo zostaną wpisane liczby użytkownik otrzymuje komunikaty: „Błąd : Podaj poprawne
imię/nazwisko autora lub wydawnictwo”. Jeśli pola: rok wydania i ilość egzemplarzy będą zawierały
litery, użytkownik otrzymuje komunikat: „Błąd : podaj poprawny rok/ilość egzemplarzy”. W sytuacji
przekroczenia maksymalnej ilości znaków dla wyżej wymienionych pól (poza pola rok wydania)
pojawiają się następujące komunikaty: „ Błąd: maksymalna długość imienia/nazwiska
autora/wydawnictwa/ilości egzemplarzy wynosi 12/15/30/10/3 znaków/ki”. Jeśli pole: rok wydania
nie będzie składać się dokładnie z 4 cyfr, użytkownik otrzymuje komunikat: „Błąd: Podaj poprawny rok
wydania”. W sytuacji gdy wprowadzona ilość egzemplarzy będzie mniejsza lub równa zeru użytkownik
otrzymuje komunikat: „Błąd : Ilość egzemplarzy nie może być mniejsza lub równa zeru”. Jeśli
uzupełnione pole: tytuł książki będzie istniało już systemie, użytkownik otrzymuje komunikat: „Błąd :
Książka o podanym tytule już istnieje”.

IV. Usuwanie książek – celem tej funkcji jest usuwanie książek z systemu, poprzez wypełnienie pola:
tytuł książki i wciśnięcie przycisku : „Usuń książkę” . Jeśli użytkownik wypełnił poprawnie wyżej
wymienione pole, wciśnięcie przycisku: „Usuń książkę” powoduje że, książka o podanym tytule jest
usuwana z systemu oraz użytkownik otrzymuje komunikat: „Usuwanie książki : tytuł książki”. Jeśli
wyżej wymienione pole nie zostało uzupełnione po kliknięciu w przycisk „Usuń książkę” użytkownik
otrzymuje następujący komunikat: „Błąd : Wypełnij pole tytuł książki ”. W sytuacji przekroczenia
maksymalnej ilości znaków dla wyżej wymienionego pola pojawia się następujący komunikat: „Błąd :
Maksymalna długość pola tytuł wynosi 30 znaki”. W sytuacji gdy wprowadzony tytuł książki nie istnieje
w systemie użytkownik otrzymuje komunikat: „Błąd : Podany tytuł nie istnieje”. Jeśli książka o
podanym tytule będzie aktualnie wypożyczona przez czytelnika, użytkownik otrzymuje komunikat:
„Błąd : Nie można usunąć książki gdyż jest ona aktualnie wypożyczona”.

V. Sprawdzanie istnienia książki o podanym tytule - funkcja ta umożliwia sprawdzenie czy tytuł
książki wprowadzony w pole: „ Podaj tytuł” istnieje już w systemie. Jeśli użytkownik uzupełnił
poprawnie wyżej wymienione pole, wciśnięcie przycisku „Sprawdź czy istnieje już taka książka”
powoduje otrzymanie komunikatu: „Podana książka: tytuł książki istnieje już w systemie”. Jeśli wyżej
wymienione pole nie zostało uzupełnione po kliknięciu w przycisk „Sprawdź czy istnieje już taka
książka” użytkownik otrzymuje następujący komunikat: „Błąd : Wypełnij pole tytuł książki”. W sytuacji
przekroczenia maksymalnej ilości znaków dla wyżej wymienionego pola pojawia się następujący
komunikat: „Błąd: Maksymalna długość pola tytuł wynosi 30 znaków”. W sytuacji gdy wprowadzony
tytuł książki nie istnieje w systemie użytkownik otrzymuje komunikat: „Książka o podanym tytule nie
istnieje w systemie”.

VI. Dodawanie wypożyczeń – celem tej funkcji jest wprowadzanie wypożyczeń do systemu, poprzez
uzupełnienie pól, takich jak: imię czytelnika , nazwisko czytelnika, tytuł książki oraz ilość sztuk. Jeśli
użytkownik oprogramowania uzupełnił poprawnie pola i kliknął przycisk „Wypożycz”, tworzona jest w
systemie lista wypożyczeń oraz ilość egzemplarzy danej książki w magazynie jest zmniejszana o
podaną ilość sztuk. Dodatkowo użytkownik systemu otrzymuje komunikat: „Dodano wypożyczenie:
imię czytelnika, nazwisko czytelnika, tytuł książki, ilość sztuk”. Jeśli wyżej wymienione pola nie zostały
uzupełnione, po kliknięciu w przycisk „Wypożycz” użytkownik otrzymuje następujący komunikat:
„Błąd: Wymagane pola nie zostały uzupełnione”. Jeśli w pola: imię czytelnika i nazwisko czytelnika
zostaną wpisane liczby użytkownik otrzymuje komunikat: „Błąd : Podaj poprawne imię/nazwisko
czytelnika”. Jeśli pole ilość egzemplarzy będzie zawierało litery lub będzie wynosiło 0, użytkownik
otrzymuje komunikat: „Błąd: Podaj poprawną ilość egzemplarzy” lub „Błąd : Ilość egzemplarzy nie
może wynosić 0”. W sytuacji przekroczenia maksymalnej ilości znaków dla tych czterech pól pojawiają
się następujące komunikaty: „ Błąd : maksymalna długość imienia/nazwiska czytelnika/tytułu
książki/ilości egzemplarzy wynosi 12/15/30/3 znaków/ki”. Jeśli czytelnik o podanym imieniu i
nazwisku nie istnieje w systemie, użytkownik otrzymuje następujący komunikat: „Błąd : Czytelnik o
podanych danych nie istnieje w systemie”. Jeśli książka o podanym tytule nie istnieje w systemie,
użytkownik otrzymuje komunikat: „Błąd: Książka o podanym tytule nie istnieje w systemie”.
Dodatkowo jeśli podana ilość egzemplarzy danej książki będzie większa od dostępnej ilości jej sztuk w
magazynie, użytkownik otrzymuje komunikat: „Błąd : Podana ilość egzemplarzy jest większa od
dostępnej ilości danej książki”.

VII. Dodawanie zwrotów książek – funkcja umożliwia wprowadzenie zwrotów danej książki do
magazynu, poprzez uzupełnienie pól, takich jak: imię czytelnika, nazwisko czytelnika, tytuł książki oraz
ilość sztuk. Jeśli użytkownik oprogramowania uzupełnił poprawnie pola i kliknął przycisk „Zwróć”, ilość
egzemplarzy danej książki w magazynie jest zwiększana o podaną ilość sztuk oraz użytkownik
systemu otrzymuje komunikat: „Dodano zwrot: imię czytelnika, nazwisko czytelnika, tytuł książki, ilość
sztuk”. Jeśli wyżej wymienione pola nie zostały uzupełnione, po kliknięciu w przycisk „Zwróć”
użytkownik otrzymuje następujący komunikat: „Błąd : Wymagane pola nie zostały uzupełnione”. Jeśli
w pola: imię czytelnika i nazwisko czytelnika zostaną wpisane liczby użytkownik otrzymuje
komunikaty: „Błąd : Podaj poprawne imię/nazwisko czytelnika”. Jeśli pole: ilość egzemplarzy będzie
zawierało litery lub podana ilość egzemplarzy będzie większa od ilości sztuk wypożyczonych przez
danego czytelnika bądź będzie równa 0, użytkownik otrzymuje komunikat: „Błąd: Podaj poprawną ilość
egzemplarzy” lub „Błąd: Ilość egzemplarzy jest większa od ilości wypożyczonej książki przez danego
czytelnika lub jest równa 0”. W sytuacji przekroczenia maksymalnej ilości znaków dla tych czterech pól
pojawiają się następujące komunikaty: „ Błąd : maksymalna długość imienia/nazwiska
czytelnika/tytułu książki/ilości egzemplarzy wynosi 12/15/30/3 znaków/ki”. Jeśli czytelnik o podanym
imieniu i nazwisku nie istnieje w systemie, użytkownik otrzymuje następujący komunikat: „Błąd :
Czytelnik o podanych danych nie istnieje”. Jeśli książka o podanym tytule nie istnieje w systemie,
użytkownik otrzymuje komunikat: „Błąd: Książka o podanym tytule nie istnieje”. Jeśli czytelnik o
podanych danych istnieje w systemie, lecz nie wypożyczył żadnej książki lub wypożyczył książkę ale o
innym tytule niż wprowadzony w pole: tytuł książki otrzymuje następujące komunikaty: „Błąd:
Czytelnik o podanych danych nie wypożyczył żadnej książki” lub „Błąd: Czytelnik o podanych danych
wypożyczył inna książkę”.

VIII. Sprawdzanie dostępności książki - celem tej funkcji jest sprawdzenie, czy książka o podanym tytule
jest dostępna do wypożyczenia oraz ile wynosi ilość jej egzemplarzy. Po poprawnym wypełnieniu
pola: „Podaj tytuł” , i wciśnięciu przycisku „Sprawdź dostępność książki”, użytkownik otrzymuje
komunikat: „Książka: tytuł książki jest dostępna w następującej ilości egzemplarzy – ilość
egzemplarzy”. Jeśli wyżej wymienione pole nie zostało uzupełnione, po kliknięciu w przycisk „Sprawdź
dostępność książki” użytkownik otrzymuje następujący komunikat: „Błąd : Wypełnij pole tytuł książki.
W sytuacji przekroczenia maksymalnej ilości znaków pojawia się komunikat: „ Błąd : maksymalna
długość pola tytuł wynosi 30 znaków”. Dodatkowo jeśli książka o wprowadzony tytule nie będzie
istniała w systemie, użytkownik otrzymuje komunikat: „Błąd : Podany tytuł nie istnieje”.
IX. Sprawdzenie czy czytelnik ma wypożyczone książki – funkcja ta umożliwia sprawdzenie czy
czytelnik o podanym imieniu i nazwisku wypożyczył już jakąś książkę. W celu użycia tej funkcji należy
wypełnić pola: imię czytelnika i nazwisko czytelnika a następnie wcisnąć przycisk „Sprawdź czy
czytelnik ma wypożyczenie”. Jeśli użytkownik poprawnie wypełnił pola, otrzymuje komunikat:
„Czytelnik imię czytelnika, nazwisko czytelnika ma wypożyczoną książkę/ki”. W przypadku sytuacji, gdy
czytelnik o podanych danych nie widnieje na liście wypożyczeń, użytkownik otrzymuje komunikat:
„Czytelnik imię czytelnika, nazwisko czytelnika nie ma wypożyczonej książki/książek”. Jeśli wyżej
wymienione pola nie zostały uzupełnione, po kliknięciu w przycisk „Sprawdź czy czytelnik ma
wypożyczone książki” użytkownik otrzymuje następujący komunikat: „Błąd : Wymagane pola nie
zostały uzupełnione”. Jeśli w pola: imię czytelnika i nazwisko czytelnika zostaną wpisane liczby
użytkownik otrzymuje komunikaty: „Błąd : Podaj poprawne imię/nazwisko czytelnika”. W sytuacji
przekroczenia maksymalnej ilości znaków dla tych pól pojawiają się następujące komunikaty: „ Błąd :
maksymalna długość imienia/nazwiska czytelnika wynosi 12/15 znaków”. Jeśli czytelnik o podanym
imieniu i nazwisku nie istnieje w systemie, użytkownik otrzymuje następujący komunikat: „Błąd :
Czytelnik o podanych danych nie istnieje”.

5) Opis interfejsu użytkownika:

Aplikacja jest oknem o domyślnych rozmiarach 1200x1000. Istnieje możliwość jego skalowania.
Po uruchomieniu aplikacji użytkownik ma do dyspozycji trzy główne panele:

 „PANEL CZYTELNIKA” – w panelu tym użytkownik wypełnia trzy podane pola : Podaj imię
czytelnika, Podaj nazwisko czytelnika, Podaj adres czytelnika. Następnie ma do dyspozycji dwa
przyciski:
a) „Dodaj czytelnika” -&gt; wciśnięcie tego przycisku umożliwia dodanie do systemu nowego
czytelnika, po prawidłowym uzupełnieniu wyżej wymienionych pól
b) „Usuń czytelnika” -&gt; wciśniecie tego przycisku umożliwia usunięcie z systemu danego
czytelnika, po poprawnym uzupełnieniu pól: Podaj imię czytelnika, Podaj nazwisko czytelnika.

 „PANEL KSIĄZKI” – w panelu tym użytkownik wypełnia sześć podanych pól : Podaj imię autora,
Podaj nazwisko autora, Podaj tytuł książki, Podaj rok wydania, Podaj wydawnictwo, Podaj ilość
egzemplarzy. Następnie użytkownik do dyspozycji trzy przyciski:
a) „Dodaj książkę” -&gt; wciśnięcie tego przycisku umożliwia dodanie do systemu nowej książki, po
prawidłowym uzupełnieniu wyżej wymienionych pól.
b) „Usuń książkę” -&gt; wciśniecie tego przycisku umożliwia usunięcie z systemu danej książki po
poprawnym uzupełnieniu pola: Podaj tytuł książki.
c) „Sprawdź czy istnieje już taka książka” -&gt; wciśniecie tego przycisku umożliwia sprawdzenie,
czy książka o podanym tytule istnieje już w systemie, po poprawnym wypełnieniu pola: Podaj
tytuł książki.

 „PANEL WYPOŻYCZEŃ I ZWROTÓW” – w panelu tym użytkownik wypełnia cztery podane pola :
Podaj imię czytelnika, Podaj nazwisko czytelnika, Podaj tytuł książki, Podaj ilość egzemplarzy.
Następnie użytkownik do dyspozycji cztery przyciski:
a) „Wypożycz” -&gt; wciśnięcie tego przycisku umożliwia wypożyczenie przez czytelnika danej
książki, po prawidłowym uzupełnieniu wyżej wymienionych pól.
b) „Zwróć” -&gt; wciśniecie tego przycisku umożliwia zwrot książki przez danego czytelnika po
poprawnym uzupełnieniu powyższych pól.
c) „Sprawdź dostępność książki” -&gt; wciśniecie tego przycisku umożliwia sprawdzenie, czy książka
o podanym tytule jest możliwa do wypożyczenia, po poprawnym wypełnieniu pola: Podaj
tytuł książki.
d) „Sprawdź czy czytelnik ma wypożyczenie” -&gt; wciśniecie tego przycisku umożliwia
sprawdzenie, czy czytelnik o podanych danych znajduje się na liście wypożyczonych, po
poprawnym wypełnieniu pola: Podaj imię czytelnika oraz Podaj nazwisko czytelnika.
