Konkurentné programovanie- 2. projekt 2. zadanie (od WSDL ku kodu)
------------------------------------------------------------------

Vybral som si prvú metódu pre pridanie predmetu.

WSDL sa nachádza v adresári "WSDLKod/src". WSDL som vytvoril vyklikaním pomocou pluginu v eclipse. Ďalej som pozmenil a doplnil niektoré veci.

Databázu som robil v Mysql. Jednotlivé príkazy, ktoré som použil pri vytváraní databázy sa nachádzajú vo "Vytvorenie_databazy.sql".

Generovanie serverovskej a klientskej časti som riešil v príkazovom riadku. Príkazy, ktoré som použil sú zapísané v súboroch "Generovanie_klientskej_casti.txt" a "Generovanie_serverovskej_casti.txt".

Server sa nachádza v package "sk.kopr.server". Tento package obsahuje main metódu na spustenie servera, PredmetDao, ktorá obsahuje dve metódy: jednu na pridanie predmetu a druhú na zisťovanie, či sa daný predmet už nachádza v databáze, ObjectFactoryDao, ktorý obsahuje údaje k databáze a ImplementaciaPredmetPort, ktorá je implementáciou triedy Predmet.

Klient sa nachádza v package "sk.kopr.klient". Tento package obsahuje taktiež main metódu, v ktorej sa pridáva predmet. Táto metóda spraví to, že prvýkrát tento predmet pridá a druhýkrát vyhodí výnimku, že takýto predmet už v databáze existuje.

Junit testy som spravil na jednu metódu z PredmetDao, ktoré sa nachádzajú v package "sk.kopr.server" pod názvom PredmetDaoTest.
