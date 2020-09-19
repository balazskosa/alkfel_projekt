# alkfel_projekt


## Projektötlet
Első lépésként egy rövid feladatleírást kell megadni a projekt Github főoldalán a README.md állományban. A feladatleírásnak a következő elemeket kell tartalmaznia rövid leírás vagy felsorolás formájában:

1) feladat funkcionális követelményeit
2) feladat nem funkcionális követelményei
3) szakterületi fogalomjegyzék (azon fogalmak definiálása, ami köré az alkalmazás épül)
4) szerepkörök

## Mintadokumentáció: 
[Első példa](https://github.com/KisGabo/gallery-elteik/wiki)
[Második példa](https://github.com/Telmike91/alkfejlszerver)


## Megvalósítás:
Készítsünk egy mozi üzemeltető rendszert, amely alkalmas az előadások, illetve
jegyvásárlások kezelésére.
A webes felületen keresztül a nézők tekinthetik meg a moziműsort, valamint
rendelhetnek jegyeket.

* A főoldalon megjelenik a napi program, azaz mely filmeket mikor vetítik a
moziban, valamint kiemelve az öt legfrissebb (legutoljára felvitt) film plakátja.
* A filmet kiválasztva megjelenik annak részletes leírása (rendező, főszereplők,
hossz, szinopszis), plakátja, továbbá az összes előadás időpontja.
* Az időpontot kiválasztva lehetőség nyílik helyfoglalásra az adott előadásra.
Ekkor a felhasználónak meg kell adnia a lefoglalandó ülések helyzetét (sor,
illetve oszlop, ügyelve a terem kapacitására). Egyszerre legfeljebb 6 jegy
foglalható, és természetesen csak a szabad helyek foglalhatóak (amelyek nem
foglaltak, vagy eladottak). A felhasználónak ezen felül meg kell adnia teljes
nevét, valamint telefonszámát, ezzel véglegesíti a foglalást.
A grafikus felületet az alkalmazottak használják a mozipénztárakban az
előadások meghirdetésére, illetve jegyek kiadására.
- Új film felvitelekor ki kell tölteni a film adatait (cím, rendező, főszereplők,
hossz, szinopszis), valamint feltölthetünk egy képet plakátként.
- Új előadás meghirdetéséhez a felhasználónak ki kell választania a termet,
valamint a filmet, és az időpont megadásával hirdetheti meg az előadást. A
meghirdetéskor ügyelni kell arra, hogy az előadás ne ütközzön más
előadásokkal az adott teremben (figyelembe véve a kezdés időpontját, illetve
a film hosszát), illetve két előadás között legalább 15 percnek kell eltelnie a
takarítás végett.
- A jegyvásárláshoz ki kell választani a filmet és az előadást. Ezt követően
listázódnak a helyek (sor, oszlop, státusz). A szabad, illetve foglalt helyek
eladhatóak, illetve a foglalt helyeket kiválasztva meg lehet tekinteni a foglaló
adatait (név, telefonszám).

## Az adatbázis az alábbi adatokat tárolja:
- filmek (cím, rendező, szinopszis, hossz, plakát, bevitel dátuma);
- termek (név, sorok száma, oszlopok száma);
- előadások (film, kezdő időpont, terem);
- helyek (előadás, terem, sor, oszlop, státusz <szabad, foglalt, eladott>, foglaló
neve, foglaló telefonszáma).
