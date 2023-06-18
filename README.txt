1.  Kod rozpoczyna się od definicji interfejsu Component, który określa wspólne metody dla elementów, które mogą być
   pojedynczymi obiektami (tzw. "liśćmi", tutaj Czujnik) lub złożonymi obiektami składającymi się z wielu innych komponentów
   (tzw. "kompozyty", tutaj SystemAlarmowy).

2.  Klasa Czujnik implementuje interfejs Component. Definiuje ona czujnik, który ma unikalne id, stan (wlaczony), i może
   generować alarmy. Metody wlacz(), wylacz(), jestWlaczony(), jestAlarm() i podajId() implementowane są zgodnie z interfejsem
    Component.

3. Klasa SystemAlarmowy także implementuje interfejs Component. Reprezentuje ona system alarmowy, który może zawierać wiele
   czujników lub innych systemów alarmowych. Ma listę komponentów (czujniki) oraz unikalne idSystemu. Implementuje metody z
   interfejsu Component oraz dodatkowo posiada metody dodaj() do dodawania nowych komponentów i pokazElementy() do wyświetlania
   wszystkich elementów w systemie.

4. W klasie Main tworzymy główny SystemAlarmowy o nazwie "S01". Następnie tworzymy dwa podsystemy, "S02" i "S03".
   Do "S02" dodajemy czujniki "C01" i "C02", a do "S03" - czujnik "C03".

5.  Dodajemy podsystemy do systemu głównego za pomocą metody dodaj().

6.  Wywołujemy pokazElementy() na systemie głównym, co powoduje wyświetlenie wszystkich elementów (podsystemów i czujników)
     w systemie.

7.  Wywołujemy wlacz() na systemie głównym, co powoduje włączenie wszystkich czujników we wszystkich podsystemach.

8.  Sprawdzamy, czy w jakimkolwiek czujniku jest alarm za pomocą metody jestAlarm(). Jeśli tak, wyświetlamy "Alarm!!!",
    w przeciwnym razie - "Brak alarmu".

9.  Na koniec wyłączamy system główny za pomocą metody wylacz(), co powoduje wyłączenie wszystkich czujników we wszystkich
    podsystemach.