# alkfel_projekt


## Projektötlet

Ez a program egy mozi által üzemeltetett felület.
Amelyen lehetősége van a vendégeknek a vetített filmek leírását és az aktuális moziműsort 
megtekinteni.
Illetve bejelentkezés után jegy vásárlásra, foglalásra és esetleges visszamondására is.
A mozi dolgozói ezen a felületen keresztül végezhetik a jegyek kiadását és az aktuális
előadások meghirdetését.

## 1) feladat funkcionális követelményeit
- Regisztráció
- Bejelentkezés
- Dolgozóknak megfelelő felület jegykiadáshoz
- Dolgozóknak az előadások meghirdetése, szerkesztése
- Felhasználó jegyfoglalás
- Felhasználó jegyvásárlás
- Felhasználó jegylemondás
- Megfelelő kategóriákra való szűrés

## 2) feladat nem funkcionális követelményei
- Felhasználóbarát: egyszerű, letisztult felület jól olvasható és elrendezésű, könnyen böngészhető megvalósítása a felületnek
- Biztonság: jelszavas azonosítás, jelszavak biztonságos tárolása és védelme (titkosítása)
- Gyors működés: Adatbázisban gyorsan lefutattot keresések alapján gyors visszajelzés

## 3) szakterületi fogalomjegyzék (azon fogalmak definiálása, ami köré az alkalmazás épül)
- moziműsor: A mozi által vetített filmek idő és termembeosztása napokra bontva.
- jegy vásárlás: A moziműsorból kiválasztott filmre jegy online megvásárlása.
- jegy foglalás: A moziműsorból kiválasztott filmre jegy online foglalása, amit vetítés előtt 
  helyben kell kifizetni.
  
## 4) szerepkörök:

- Vendég: Nem regisztrált felhasználó, böngészheti az oldalt.
- Felhasználó: Regisztrált és bejelentkezett felhasználó, akinek elérhető a jegyvásárlás, foglalás  és visszamondás is.
- Dolgozó: Jegyek kiadása és előadások meghirdetése, szerkesztése.

## Az adatbázis az alábbi adatokat tárolja:
- filmek (cím, rendező, szinopszis, hossz, plakát, bevitel dátuma);
- termek (név, sorok száma, oszlopok száma);
- előadások (film, kezdő időpont, terem);
- helyek (előadás, terem, sor, oszlop, státusz <szabad, foglalt, eladott>, foglaló
neve, foglaló telefonszáma).
- felhasználók(név, cím, születési hely, telefonszám, email cím, jelszó)
- dolgozók(név, cím, születési hely, telefonszám, email cím, jelszó)

#### Mintadokumentáció: 
[Első példa](https://github.com/KisGabo/gallery-elteik/wiki)
[Második példa](https://github.com/Telmike91/alkfejlszerver)
