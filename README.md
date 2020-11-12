# alkfel_projekt


## Projektötlet

Ez egy mozifilmek kibeszélésére és megtekentési lehetőségek keresésére lehetőséget kínáló program.
Amelyben filmek leírására kereshetnek rá a felhasználók és megnézhetik, hogy melyik mozikban vetítik az adott filmet.
Illetve bejelentkezés után lehetőség nyílik kommentet írni a filmekhez.


## 1) feladat funkcionális követelményeit
- Regisztráció
- Bejelentkezés
- Adminoknak megfelelő felület filmek hozzáadásához, szerkesztéséhez
- Adminoknak megfelelő felület mozik hozzáadásához, szerkesztéséhez
- Felhasználóknak kommentelési felület biztosítása
- Megfelelő kategóriákra való szűrés

## 2) feladat nem funkcionális követelményei
- Felhasználóbarát: egyszerű, letisztult felület jól olvasható és elrendezésű, könnyen böngészhető megvalósítása a felületnek
- Biztonság: jelszavas azonosítás, jelszavak biztonságos tárolása és védelme (titkosítása)
- Gyors működés: Adatbázisban gyorsan lefutattot keresések alapján gyors visszajelzés

## 3) szakterületi fogalomjegyzék (azon fogalmak definiálása, ami köré az alkalmazás épül)
-film: közönség előtt bemutatott felvett mozgókép.
- mozi: A hely ahol vetítik az adott filmeket.
- kommentelés: a megtekintet filmről való véleménynyílvánítás.
  
## 4) szerepkörök:

- Vendég: Nem regisztrált felhasználó, böngészheti az oldalt.
- Felhasználó: Regisztrált és bejelentkezett felhasználó, akinek elérhető a kommentelési funkció.
- Admin: Filmek és mozik hozzáadása szedrkesztése, szerkesztése és törlése.

## Az adatbázis az alábbi adatokat tárolja:
- filmek (cím, leírás, kategória, hossz, kiadás dátuma, hozzáadás dátuma, frissítés);
- commentek (hozzászólás, hozzáadás dátuma, frissítés).
- felhasználók(név, jelszó, szerep)
- mozi (név, cím)


#### Mintadokumentáció: 
[Első példa](https://github.com/KisGabo/gallery-elteik/wiki)
[Második példa](https://github.com/Telmike91/alkfejlszerver)
