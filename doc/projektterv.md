# Mi kicsi webshopunk Projektterv 2019

## 1. Összefoglaló 
Projektfeladatunk egy webshop lefejlesztése, tervezéstől a megvalósításig. A webshop fő célja, hogy egy olyan felületet biztosítson a megrendelőnek, amin keresztül értékesíteni tudja a termékeit. Fő célunk hogy egy működőképes, megbízható, felhasználóbarát végterméket adjunk át, amivel a megrendelő is meg van elégedve. 

## 2. Verziók


| Verzió |    Szerző    |     Dátum    |     Státusz     |                      Megjegyzés                     |
|:------:|:------------:|:------------:|:---------------:|:---------------------------------------------------:|
|  0.1 | Vincze Zoltán | 2019-09-25 |    Tervezet   |                   Legelső verzió                  |
|  0.2 | Kőházi Dániel | 2019-09-30 | Előterjesztés |         A projekt menedzsere jónak találta        |

Státusz osztályozás:
 - Tervezet: befejezetlen dokumentum
 - Előterjesztés: a projekt menedzser bírálatával
 - Elfogadott: a megrendelő által elfogadva

## 3. A projekt bemutatása
Ez a projektterv a webshop projektet mutatja be, mely 2019.09.02-től 2019.12.06-ig tart. A projekt célja egy stabil felület biztosítása a felhasználók számára a gondtalan és egyszerű vásárlás érdekében.

### 3.1. Rendszerspecifikáció
A projekt keretein belül egy felhasználóbarát webshop oldalt szeretnénk megvalósítani, ami rendelkezik regisztrációs és bejelentkezési felülettel, továbbá admin és felhasználói nézetekkel. Az oldal lehetőséget biztosít a különböző termékek közötti böngészésére, keresésre, szűrésre, kosárba helyezésére. Törekedünk az egyszerűségre, átláthatóságra és minél letisztultabb felületre, amelyen bármely felhasználó könnyedén el tud tájékozódni. Számunkra fontos, hogy a webáruházunk jól legyen optimalizálva, keresőmotorbarát legyen. A projekt egy megrendelésre készül, az rf1 gyakorlati órára.

### 3.2. Funkcionális követelmények
 **Felhasználói nézet**
 - Regisztráció, bejelentkezés megvalósítása <br>
   - Jelszó titkosítás <br>
   - E-mail cím validálás <br>
   - Hibás adatok esetén hibaüzenet <br>
   - Adatok mentése regisztrációnál illetve belépéskor ellenőrzés <br>
   - Elfelejtett jelszó esetén e-mail címre új jelszó <br>
 - Rendelés leadás <br>
   - lakcím és számlázasi cím megadás
   - fizetési mód kiválasztása
   - kosár tartalmának módosítása
   - Tájékozódás a kosár tartalmáról
 - Panaszbenyújtás <br>
  - weboldalunk felé történő visszajelzés lehetősége
  - Vélemény nyílvánitás adott termékünkről
  - Rendelés sikerességének megerősítése, E-mailben automatikus üzenet
 - Rendezés 
   - ár 
   - téma 
   - abc sorrend
   - népszerűség szerint 
 - Felhasználói fiók kezelése
   - jelszó és email változtatás
 - Szűrők hozzáadása például: gyártó, processzor, VGA típus, memória mérete, árkategória szerint
 - Tájékozódás az aktuális akciókról 


 **Admin nézet**
  - dinamikus tartalomkezelés: termék/kategória hozzáadása/eltávolítása/módosítása
  - akciók hozzáadása
  - válaszlehetőség termékekkel kapcsolatos panaszokra 
  - felhasználók kezelése, tiltása


### 3.3. Nem funkcionális követelmények
- Böngészők legfrissebb verzióit támogassa.(Opera, Google Chrome, Mozilla, Microsoft Edge). <br>
- Online felületen fusson mind az admin illetve a vásárlói felület is. A megjelenésnek számítógépen és telefonon egyaránt olyannak kell lennie, hogy megfelelő legyen a felhasználónak. <br>
- Egyszerű, letisztult, modern felhasználói felület.
- Optimalizált lekérdezések az adatbázisból ( legfeljebb 250ms alatt lefut), a gördülékeny felhasználói élmény érdekében. 

## 4. Költség- és erőforrás-szükségletek
Az erőforrásigényünk kb. **60** személynap.
A rendelkezésünkre áll **360** pont.

## 5. Szervezeti felépítés és felelősségmegosztás
A projekt megrendelője Pflanzner Tamás. A Webshop projektet a projektcsapat fogja végrehajtani,  amely a következő emberekből és feladatköreikből áll. 

### 5.1 Projektcsapat
A projekt a következő emberekből áll:

|                                              |        Név        |  E-mail cím (stud-os) |
|:--------------------------------------------:|:-----------------:|:---------------------:|
|                  Megrendelő                  | Pflanzer Tamás | tampfla@inf.u-szeged.hu |
|               Projekt menedzser              |          Kőházi Dániel         |   h767835@stud.u-szeged.hu                    |
|  Adatbázisért és adatkapcsolatokért felelős  |   Halász Gábor,<br> Bizony Dominik                |   h763416@stud.u-szeged.hu                    |
|       Felhasználói felületekért felelős      |        Apró Bálint,<br> Kőházi Dániel           |   h748740@stud.u-szeged.hu                    |
|    A rendszer működési logikájáért felelős   |       Halász Gábor,<br> Bizony Dominik            |        h745135@stud.u-szeged.hu                    |
|            Dokumentációért felelős           |     Vincze Zoltán              |       h676024@stud.u-szeged.hu                    |
|            Prezentációért felelős            |      Szabó Gergő László             |      h000000@stud.u-szeged.hu                    |

## 6. A munka feltételei
### 6.1. Munkakörnyezet
A projekt a következő munkaállomásokat fogja használni a munka során:
 - Lenovo y520 ( i5 7300HQ, 1050ti, 8gb DDR4, Windows 10 )
 - Asus x541u  ( i5 7200U, 920m, 8gb DDR4, Windows 10 )
 - Asztali gép ( i5 8600k, RTX 2070 super, 16gb DDR4, Windows 10 )
 - Lenovo ideapad 100 ( i3 5005U, 920MX, 4 GB DDR4, Windows 10 )
 - Dell latitude e5540 ( i5 4200U, GT 720M, 8GB DDR3R, Windows 7 )


Használt nyelv: **Java** <br>
Használt technológiák: **Spring Boot, Thymeleaf, MySQL, Bootstrap, JQuery** <br>
A következő szoftvereket fogjuk használni: **IntelliJ, Eclipse (STS), VSCode**

### 6.2. Rizikómenedzsment
 Rizikótényező (hatás):
 - Adatok elvesztése: mivel az egyetlen adatvesztés lehetősége, hogy az adott személy push előtt elveszti aktuális munkáját ezért erre az egyetlen megoldás a sűrű pusholás.
 - Internetkapcsolat bizonytalanná válása:  Internet nélkül nincs lehetőség pusholásra ezért veszélybe kerülhet az aktuális munka illetve ha éppen nincs lehetőség összeülni interneten keresztül kell megbeszélni a dolgokat ami internetkapcsolat nélkül megint csak nehézkes.
 - Hardver és szoftver meghibásodások, amik előre nem látható módon hátráltathatják a projekt további menetét.  
 - ZH-k miatti csúszás előfordulhat. Erre megoldás a feladatok előre elkészítése

## 7. Jelentések
### 7.1. Munka menedzsment
A munkát Kőházi Dániel menedzseli, felosztani a feladatokat, nyomon követi a csapattagok haladását, motiválja a csapatot, a feladatok végrehajtásához konkrét időpontokat rendel, szervezi a csoport gyűlések helyét idejét. Rendszeresen tartja a kapcsolatot a csapattagokkal személyesen és online. Továbbá az ő felelőssége, hogy folyamatosan ellenőrizze, hogy az csapattagok hol tartanak a rájuk kiszabott feladatok megoldásában.

### 7.2. Csoportgyűlések

- **2019.09.30. Hétfő 18:00** <br>
Résztvevők: Kőházi Dániel, Vincze Zoltán, Bizony Dominik, Halász Gábor, Apró Bálint.<br> Helyszín: TIK könyvtár <br>
A találkozó során részletesen átbeszéltük az általunk elképzelt rendszer felépítését. Kiválasztottuk a legfontosabb funkcionális követelményeket, és ez alapján már felmértük hogy ki milyen funkciót fog megvalósítani. Ütemeztük a diagramok elkészítését jövőhétre. Megegyeztünk hogy milyen nyelven fogjuk lefejleszteni a projektet, és milyen relációsadatbázis-kezelő rendszert fogunk használni. Utánanéztük hogy milyen technológiákat lenne érdemes használni, és közös megegyezés alapján kiválasztottuk a megfelelőket. 

- **2019.10.30. Szerda 13:00** <br>
Résztvevők: Kőházi Dániel, Szabó Gergő László, Bizony Dominik, Halász Gábor, Apró Bálint.<br> Helyszín: Discord <br>
A konferencia során részletesen átbeszéltük az általunk elképzelt prototípus felépítését, kiosztottuk a feladatokat magunk között és az előző mérföldkőben elkészített diagramokat összehangoltuk, helyességüket megvitattuk.  

### 7.3. Minőségbiztosítás
Az elkészült terveket a terveken nem dolgozó csapattársak közül átnézik, hogy megfelel-e a specifikációnak és az egyes diagramtípusok összhangban vannak-e egymással. A meglévő rendszerünk helyes működését a prototípusok bemutatása előtt a tesztelési dokumentumban leírtak végrehajtása alapján ellenőrizzük és összevetjük a specifikációval, hogy az elvárt eredményt kapjuk-e. További tesztelési lehetőségek: unit tesztek írása az egyes modulokhoz vagy a kód közös átnézése (code review) egy, a vizsgált modul programozásában nem résztvevő csapattaggal. Szoftverünk minőségét a végső leadás előtt javítani kell a rendszerünkre lefuttatott kódelemzés során kapott metrikaértékek és szabálysértések figyelembevételével.
Az alábbi lehetőségek vannak a szoftver megfelelő minőségének biztosítására:
- Specifikáció és tervek átnézése (kötelező)
- Teszttervek végrehajtása (kötelező)
- Unit tesztek írása (választható)
- Kód átnézése (választható)

### 7.4. Átadás, eredmények elfogadása
A projekt eredményeit Pflanzer Tamás fogja elfogadni. A projektterven változásokat csak  Pflanzer Tamás írásos kérés esetén Pflanzer Tamás engedélyével lehet tenni. A projekt eredményesnek bizonyul, ha specifikáció helyes és határidőn belül készül el. Az esetleges késések pontlevonást eredményeznek.
Az elfogadás feltételeire és beadás formájára vonatkozó részletes leírás Kertész Attila fő gyakorlatvezető honlapján olvasható.

### 7.5. Státuszjelentés
Minden leadásnál a projektmenedzser jelentést tesz a projekt haladásáról, és ha szükséges változásokat indítványoz a projektterven. Ezen kívül a megrendelő felszólítására a menedzser 3 munkanapon belül köteles leadni a jelentést. A gyakorlatvezetővel folytatott csapatmegbeszéléseken a megadott sablon alapján emlékeztetőt készít a csapat, amit a következő megbeszélésen áttekintenek és felmérik az eredményeket és teendőket. Továbbá gazdálkodnak az erőforrásokkal és szükség esetén a megrendelővel egyeztetnek a projektterv módosításáról.

## 8. A munka tartalma
### 8.1. Tervezett szoftverfolyamat modell és architektúra

Csapatunk az agilis szoftverfejlesztés menetét választotta a program megvalósításához, mert sokkal rugalmasabb fejlesztést nyújt, és biztosítja hogy a szoftver a lehető legjobban illeszkedjen a megrendelő elvárásaihoz. Programunkat Java-ban és MySQL-ben írjuk. A GUI-t HTML, CSS segítségével valósitjuk meg és Thymeleaf template engine-t fogunk használni az oldalak sablonosítása érdekében. 


### 8.2. Átadandók és határidők
A főbb átadandók és határidők a projekt időtartama alatt a következők:

| Szállítandó |                 Neve                |   Határideje  |
|:-----------:|:-----------------------------------:|:-------------:|
|      D1     |       Projektterv és útmutató       |  2019-09-25   |
|    P1+D2    | UML és adatbázis tervek és bemutató |  2019-10-11   |
|    P1+D3    |      Prototípus I. és bemutató      |  2019-11-05   |
|    P2+D4    |      Prototípus II. és bemutató     |  2019-12-02   |

## 9. Feladatlista

A Webshop projekt 2019. szeptember 02-án indult. A következőkben a tervezett feladatok részletes összefoglalása található:

### 9.1. Projektterv (1. mérföldkő)
Ennek a feladatnak az a célja, hogy megtervezzük a projekt alapjait. <br>
Felelősök: Bizony Dominik, Kőházi Dániel, Halász Gábor, Vincze Zoltán, Apró Bálint <br>
Tartam: 10 nap <br>
Erőforrásigény: 2 személynap / fő

### 9.2. UML és adatbázis tervek (2. mérföldkő)
Ennek a feladatnak az a célja, hogy elkészüljenek az adatbázistervek. Tehát Use case, Class, Sequence, Egyed-kapcsolat, Package diagramokat, továbbá képernyőtervet is készítünk. Majd mindezekről egy bemutatót csinálunk, ami előadásra is kerül.
 Részfeladatai a következők:

#### 9.2.1. Use Case diagram
Felelősök: Kőházi Dániel <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap 

#### 9.2.2. Class diagram
Felelősök: Vincze Zoltán <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap

#### 9.2.3. Sequence diagram
Felelősök: Bizony Dominik <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap

#### 9.2.4. Egyed-kapcsolat diagram adatbázishoz
Felelősök: Halász Gábor <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap

#### 9.2.5. Package diagram
Felelősök: Apró Bálint <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap

#### 9.2.6. Képernyőtervek
Felelősök: Szabó Gergő László <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap

#### 9.2.7. Tesztesetek, teszttervek
Felelősök: Apró Bálint <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap

#### 9.2.8. Bemutató elkészítése és bemutatása
Felelősök: Kőházi Dániel <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap

### 9.3. Prototípus I. (3. mérföldkő)
Ennek a feladatnak az a célja, hogy egy bemutatásra alkalmas, futtatható és fordítható program el legyen készítve. Ezt tesztelni is fogjuk, amit részletesen dokumentálunk.
Részfeladatai a következők:

#### 9.3.1. Prototípus
Felelősök: Apró Bálint, Bizony Dominik, Halász Gábot, Vincze Zoltán, Kőházi Dániel, Szabó Gergő László <br>
Tartam: 3 hét <br>
Erőforrásigény: 3 személynap/fő<br>

#### 9.3.2. Tesztelési dokumentum
Felelősök: Szabó Gergő László <br>
Tartam: 2 nap <br>
Erőforrásigény: 2 személynap <br>

#### 9.3.3. Bemutató elkészítése és bemutatása
Felelősök: Vincze Zoltán, Kőházi Dániel <br>
Tartam: 3 nap <br>
Erőforrásigény: 1.5 személynap <br>

#### 9.3.4 Adatbázis séma létrehozása
Felelősök: Bizony Dominik, Halász Gábor, Vincze Zoltán<br>
Tartam: 3 nap <br>
Erőforrásigény: 1.5 személynap/fő <br>

#### 9.3.5 Regisztráció és bejelentkezés logikájának implementálása
Felelősök: Bizony Dominik, Halász Gábor, Szabó Gergő László<br>
Tartam: 3 nap <br>
Erőforrásigény: 1.5 személynap/fő <br>

#### 9.3.6 Termékek megjelenítéséhez szükséges logika implementálása
Felelősök: Bizony Dominik, Halász Gábor, Kőházi Dániel<br>
Tartam: 1 nap <br>
Erőforrásigény: 0.5 személynap/fő <br>

#### 9.3.7 Adatbázis feltöltése tesztadatokkal
Felelősök: Vincze Zoltán, Szabó Gergő László<br>
Tartam: 1 nap <br>
Erőforrásigény: 1 személynap <br>

#### 9.3.8 Design megtervezése
Felelősök: Apró Bálint, Kőházi Dániel<br>
Tartam: 2 nap <br>
Erőforrásigény: 1 személynap/fő <br>

#### 9.3.9 HTML struktúra létrehozása, sablonozítás template enginnel
Felelősök: Kőházi Dániel, Szabó Gergő László <br>
Tartam: 3 nap <br>
Erőforrásigény: 1.5 személynap/fő <br>

#### 9.3.10 CSS hozzáadása
Felelősök: Apró Bálint, Kőházi Dániel, Vincze Zoltán <br>
Tartam: 3 nap <br>
Erőforrásigény: 1 személynap/fő <br>




### 9.4. Prototípus II. (4. mérföldkő)
Ennek a feladatnak az a célja, hogy piacra kész program elkészüljön, amelyet a megrendelő illetve a felhasználó alkalmazni, tesztelni, használni tudjon. A Prototípus I-hez készülnek új funkciók, amiket a tervezésük után megvalósítunk, majd tesztelünk.
Részfeladatai a következők:

#### 9.4.1. Dokumentációk, tervek új funkciókkal
Felelősök: Kőházi Dániel, Apró bálint<br>
Tartam: 6 nap<br>
Erőforrásigény: 3 személynap/fő<br>

#### 9.4.2. Javított minőségű prototípus új funkciókkal
Felelősök: Apró Bálint, Bizony Dominik, Halász Gábor, Vincze Zoltán, Kőházi Dániel<br>
Tartam: 15 nap<br>
Erőforrásigény: 3 személynap/fő<br>

#### 9.4.3. Tesztelési dokumentum új funkciókhoz
Felelősök: Vincze Zoltán, Kőházi Dániel <br>
Tartam: 4 nap<br>
Erőforrásigény: 2 személynap/fő<br>

#### 9.4.4. Bemutató elkészítése és bemutatása
Felelősök: Apró Bálint, Kőházi Dániel<br>
Tartam: 4 nap<br>
Erőforrásigény: 2 személynap/fő<br>

 

## 10. Részletes időbeosztás

![rf1_ganttchart](/uploads/7abf4565f175780a90145b17037d5587/rf1_ganttchart.JPG)

## 11. Projekt költségvetés
### 11.1. Részletes költségvetés
(Az egyes leadások alkalmával teljesíthető pontszámot kell beírni minden emberre külön-külön.)

|                     Név                    | 1. leadás - Projektterv | 2. leadás - UML és adatbázis | 3. leadás - Prototípus I. | 4. leadás - Prototípus II. | Összesen |
|:------------------------------------------:|:----------------------:|:--------------------------:|:-----------------------:|:------------------------:|:--------:|
| Min. és max. kapható  pontszám százalékban |          5-10%         |           15-40%           |          20-40%         |          20-40%          |          |
|                     Kőházi Dániel                    |           6          |             24            |           15           |            15           |    60    |
|                     Bizony Dominik                    |           6          |             24            |           15           |            15           |    60    |
|                     Apró Bálint                    |           6          |             24            |           15           |            15           |    60    |
|                     Halász Gábor                    |           6          |             24            |           15           |            15           |    60    |
|                     Vincze Zoltán                    |           6          |             24            |           15           |            15           |    60    |
                     Szabó Gergő László                    |           3          |             24            |           15           |            18           |    60    |

### 11.2. Átvétel
A projektet a megrendelő a következő eredménnyel vette át:

|                     Név                    | 1. leadás - Projektterv | 2. leadás - UML és adatbázis | 3. leadás - Prototípus I. | 4. leadás - Prototípus II. | Összesen |
|:------------------------------------------:|:----------------------:|:--------------------------:|:-----------------------:|:------------------------:|:--------:|
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |
|                                            |                        |                            |                         |                          |    60    |

Szeged, 2019. 09. 18.

#### &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Az átadó részéről &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Az átvevő részéről 

 