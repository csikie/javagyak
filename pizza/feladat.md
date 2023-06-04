# Programozási nyelvek (BSc, 18) Java zh programozási feladat

## A számonkérésről

Az alkalomra a gyakorlati számonkérés feltételei (lásd Canvas) vonatkoznak.

- Emlékeztető: a VS Code/Codium/(Code Together) linkeket a ZH elején be kell küldeni, és aztán végig aktívan kell tartani.
- A megoldás beadásának részletei szintén ebben a fájlban vannak leírva.

## A megoldásról

**Ahol a feladat mást nem kér**, ott a félévben megszokott módon:

- **feltételezhető, hogy az adatok helyesek, ezért az értékeket (fájlból beolvasáskor, konstruktorban, metódusokban stb.) nem kell ellenőrizni**
- a mezők láthatósága a lehető legszűkebb;
- a metódusok, konstruktorok, típusok láthatósága a lehető legtágabb
- "egész" alatt `int`-et, "valós" alatt `double`-t értünk
- ügyeljen a helyes egységbe zárásra, az adatszivárgás elkerülésére.

## Tesztelés

A tesztelés is a feladat része. [A szükséges fájlok innen tölthetők le.](https://exam.inf.elte.hu/exam20220120-pizza.zip)

- A JUnit 4 tesztelő kódokat ebben a ZH feladatban odaadjuk. A tesztelő kódokat nem szabad módosítani.
- Kezdetben a legtöbb teszteset megjegyzésben van. A megjegyzéseket a feladatok megoldásával párhuzamosan fokozatosan el kell távolítani.
- Használja a teszteseteket a munkája ellenőrzésére. Fontos, hogy a tesztesetek nem fednek le minden lehetséges forgatókönyvet.
- A teszteseteket így lehet futtatni:

  - Windowson:

    ```
    javac -cp "junit-4.12.jar;hamcrest-core-1.3.jar;." preri\test\PreriTester.java
    java -cp "junit-4.12.jar;hamcrest-core-1.3.jar;." org.junit.runner.JUnitCore preri.test.PreriTester
    ```

  - Linuxon:

    ```
    javac -cp "junit-4.12.jar:hamcrest-core-1.3.jar:." preri\test\PreriTester.java
    java -cp "junit-4.12.jar:hamcrest-core-1.3.jar:." org.junit.runner.JUnitCore preri.test.PreriTester
    ```

## 1. Ingredient, PizzaSize, Food (10 pont)

### Ingredient

Készítse el a `preri.pizza.utils.Ingredient` osztályt, amivel egy étel hozzávalóit tudjuk reprezentálni.

- Az osztály mezői:
  - `price` egész
  - `name` és `amountName` (a hozzávaló mennyiségi egység) szöveg
  - `amount` valós (a hozzávaló mennyisége)
  - A mezők láthatósága legyen alapértelmezett és tartozzon hozzájuk `getter` és `setter`
- A típusnak legyen egy konstruktora, amely az összes mezőt paraméterül várja és az alábbi ellenőrzéseket végzi el:
  - a szöveg típusú mezők csak betűt tartalmazhat
  - az `amountName` mező **nem** lehet üres szöveg
  - a `name` mezőnek legalább `3` hosszúnak kell lennie
  - az `amount` és `price` mezőknek az értéke nagyobb kell legyen mint `0`.
  - Ha valamelyik feltétel nem teljesül, akkor a konstruktor váltson ki egy `IllegalArgumentException` kivételt az `Invalid argument!` üzenettel

### PizzaSize

Készítse el a `preri.pizza.utils.PizzaSize` felsorolási típust a pizzák méretének kezelésére:

- A típus elemei sorrendben: `SMALL`, `MEDIUM`, `LARGE`.

### Food

Készítse el a `preri.pizza.Food` interface-t, mely az alábbi műveleteket tartalmazza:

- egész visszatérési értékű `getPrice`
- szöveg visszatérési értékű `getName`

## 2. Pizza, Cart, CartException (14 pont)

### Pizza

Készítse el a `preri.pizza.Pizza` osztályt amely a következő mezőkkel rendelkezik:

- `size (PizzaSize típus)` ami a pizza méretét tárolja
- egy szöveg típusú `name`
- a hozzávalókat pedig egy `Set<Ingredient>`-ben tárolja, a mező neve legyen `ingredients`

Két konstruktora legyen, az egyik csak egy `PizzaSize` típusú méretet várjon paraméterül, valamint legyen `"Pizza"` az alapértelmezett név. A másik konstruktor paraméterül várja a pizza nevét `(String)`, a pizza méretét `(PizzaSize)` és a hozzávalókat `(Set<Ingredient>)`, majd beállítja a mezők értékét.

Az osztály implementálja a `Food` interface-t. Az interface műveleteit az alábbi módon valósítsa meg:

- `getName`: térjen vissza a pizzának a nevével
- `getPrice`: `ár = 3*sum(hozzávalók)+méret*méret`

Továbbá az osztály rendelkezzen egy `getIngredients` művelettel amely visszatér a pizza hozzávalóival egy `Set<Ingredient>` adatszerkezetben.

### CartException

Készítse el a `preri.pizza.utils.CartException` osztályt, amely egy saját kivételt reprezentál:

- Az osztály származzon az `Exception` típusból.
- Az osztálynak legyen két konstruktora: egy paraméter nélküli, és egy `String`-et váró.
  - Utóbbi hívja meg a szülő osztály megfelelő konstruktorát.

### Cart

Készítse el a `preri.pizza.Cart` osztályt, mely egy `Map<Pizza, Integer>` típusú `cart` mezővel rendelkezik. Az osztály a következő műveleteket valósítsa meg:

- `add`: paraméterül egy `Pizza` típusú objektumot vár, amit, ha még kosár nem tartalmaz, akkor `1`-es multiplicitással beleteszi a kosárba, ha már a kosár tartalmaz ilyen pizzát, akkor pedig a multiplicitást növeli.
- `remove`: paraméterül egy `Pizza` típusú objektumot vár, amelyet kivesz a kosárból, ha már csak `1` db van a kosárban, különben csak a multiplicitását csökkenti `1`-el. Ha olyan pizzát kap paraméterül, amely nincs a kosárban, akkor a metódus váltson ki egy `CartException`-t a `"Cannot remove this item: " + PIZZA_NAME + ", because it is not present in the cart."` üzenettel, ahol a `PIZZA_NAME` a paraméterül kapott pizza neve. A metódus "engedje ki" a `CartException`-t.
- `getCount`: paraméterül egy `Pizza` típusú objektumot vár, majd visszatér a paraméterül kapott pizzának a multiplicitásával.
- `getTotalCost`: visszatér a kosár tartalmának az árával.

## 3. equals, hashCode, toString (11 pont)

### Ingredient

Valósítsa meg, hogy `preri.pizza.utils.Ingredient` osztály két példányáról el lehessen dönteni, hogy egyenlőek-e. Az osztály két példányát akkor tekintjük egyenlőnek, ha a `price` és `name` mezője megegyezik.

- Szintén az adattagok tartalma alapján kell a `hashCode()` metódust is megvalósítani.

### Pizza

Valósítsa meg, hogy `preri.pizza.Pizza` osztály két példányáról el lehessen dönteni, hogy egyenlőek-e. Az osztály két példányát akkor tekintjük egyenlőnek, ha mindhárom mezője megegyezik.

- Szintén az adattagok tartalma alapján kell a `hashCode()` metódust is megvalósítani.

### Cart

Definiálja felül a `Cart` osztály `toString` műveletét az alábbi példa mintájára!

```
The contents of the cart:
  Margarita (2x): 2000 Ft
  Songoku (1x): 1000 Ft

The total price of the cart is: 3000 Ft
```

Figyeljen a sortörésekre (`\n`), és a tagolásra (a pizzák 2 db szóközzel beljebb kezdődnek).

## 4. loadFromFile (5 pont)

Készítsen `loadFromFile` néven egy statikus metódust a `Pizza` osztályba, mely képes az alábbi tartalmú szöveges fájlt beolvasni, és egy `List<Pizza>`-val tér vissza eredményül. A metódus egyetlen paramétert vár, ami a beolvasandó fájlnak az elérési útvonala (`String`), erről feltételezhető, hogy érvényes. **Figyeljen a megfelelő erőforráskezelésre**. Az adatok soronként a következők:

> `PIZZA_NAME`;`PIZZA_SIZE`;`INGREDIENT_NAME`-`PRICE`-`AMOUNT`-`AMOUNT_NAME`

A pizza adatai `;` jelekkel vannak tagolva, egy hozzávaló adatai pedig `-` jelekkel. Feltételezhetjük, hogy az adatok a fájlban helyesek.

```
Hawaii;SMALL;Dough-150-500-g;Tomato-100-200-g;Pineapple-300-15-dkg;Cheese-150-10-dkg
Songoku;MEDIUM;Dough-250-75-dkg;Tomato-150-250-g;Ham-300-150-g;Corn-100-10-dkg;Mushroom-400-0.2-kg;Cheese-200-18-dkg
Margherita;LARGE;Dough-350-1-kg;Tomato-250-350-g;Cheese-300-25-dkg
```
