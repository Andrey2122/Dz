# Неделя 1 · 12–16.10 · Фундамент Java

## 📖 Теория (читать/смотреть перед занятием)

### Пн 12.10 — JDK/JVM, IntelliJ, структура проекта, package, main, запуск

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Структура программы](https://metanit.com/java/tutorial/2.1.php) | Статья | Русский, 3 мин |
| [Metanit — JDK, JRE, JVM](https://metanit.com/java/tutorial/1.1.php) | Статья | Русский, 5 мин |
| [JetBrains — Getting Started with IntelliJ IDEA](https://www.jetbrains.com/help/idea/getting-started-with-idea.html) | Документация | Английский, 10 мин |

### Вт 13.10 — Типы данных, переменные, final, printf

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Типы данных](https://metanit.com/java/tutorial/2.12.php) | Статья | Русский, 10 мин |
| [Metanit — Литералы](https://metanit.com/java/tutorial/2.3.php) | Статья | Русский, 5 мин |
| [Metanit — Вывод на экран](https://metanit.com/java/tutorial/2.11.php) | Статья | Русский, 7 мин |

### Ср 14.10 — Операторы, приведение типов, Scanner, ошибки ввода

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Арифметические операторы](https://metanit.com/java/tutorial/2.4.php) | Статья | Русский, 5 мин |
| [Metanit — Преобразования типов](https://metanit.com/java/tutorial/2.2.php) | Статья | Русский, 10 мин |
| [Metanit — Ввод данных с клавиатуры](https://metanit.com/java/tutorial/2.10.php) | Статья | Русский, 7 мин |

### Чт 15.10 — if/else, switch, тернарный оператор, логика

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Условные операторы](https://metanit.com/java/tutorial/2.5.php) | Статья | Русский, 10 мин |
| [Metanit — Оператор switch](https://metanit.com/java/tutorial/2.6.php) | Статья | Русский, 8 мин |
| [Metanit — Логические операторы](https://metanit.com/java/tutorial/2.7.php) | Статья | Русский, 5 мин |

### Пт 16.10 — Циклы for/while/do-while, break/continue

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Цикл for](https://metanit.com/java/tutorial/2.8.php) | Статья | Русский, 7 мин |
| [Metanit — Цикл while](https://metanit.com/java/tutorial/2.9.php) | Статья | Русский, 5 мин |
| [Metanit — break и continue](https://metanit.com/java/tutorial/2.9.php) | Статья | Русский, 5 мин |

---

## ✍️ Практика (решать в проекте `Dz`)

### Пн 12.10 — Hello World и запуск
1. [x] Создать `HelloWorld.java` — вывести `Hello, Java!`
2. [x] Запустить через консоль: `java HelloWorld.java`
3. [x] Запустить через `javac HelloWorld.java && java HelloWorld`
4. [x] В IntelliJ: создать класс в пакете `week01`, запустить (Shift+F10)

### Вт 13.10 — Консольный калькулятор средних
1. [x] Создать `AverageCalculator.java`
2. [x] Считать 5 чисел через `Scanner`
3. [x] Посчитать среднее арифметическое
4. [x] Вывести через `System.out.printf("Среднее: %.2f%n", avg)`
5. [ ] Добавить `static final int COUNT = 5;`

### Ср 14.10 — 5 мини-программ
1. [x] `CurrencyConverter.java` — доллары в рубли (курс — константа)
2. [x] `SecondsConverter.java` — секунды → часы:минуты:секунды (оператор `%`)
3. [x] `TrianglePerimeter.java` — периметр по 3 сторонам
4. [x] `TemperatureConverter.java` — Цельсий → Фаренгейт
5. [x] `RectangleArea.java` — площадь и периметр прямоугольника

### Чт 15.10 — Классификатор треугольника + валидатор пароля
1. [x] `TriangleClassifier.java`:
   - Считать 3 стороны
   - Определить: равносторонний / равнобедренный / разносторонний / «не треугольник»
   - Использовать `if/else if/else`
2. [x] `PasswordValidator.java`:
   - Считать пароль
   - Проверить: длина ≥ 8, заглавная, цифра, спецсимвол
   - Вывести `true/false` для каждого критерия
3. [x] `SumOfNumbers.java` — цикл `for`:
   - Считать число `N`
   - Просуммировать числа от 1 до `N` в переменную `sum`
   - Вывести результат: `N = 5` → `15`
4. [x] `Countdown.java` — цикл `while`:
   - Считать число `N`
   - Печатать `N` и уменьшать его на 1, пока `N > 0`
   - После цикла вывести `Старт!`

### Пт 16.10 — FizzBuzz + палиндром + чек-лист
1. [x] `FizzBuzz.java` — 1–100: Fizz/Buzz/FizzBuzz
2. [ ] `PalindromeChecker.java` — проверить палиндром через `StringBuilder.reverse()`
3. [ ] `Checklist.java` — консольное меню (добавить/показать/выйти)

---

## 🛠 Инструменты

| Что | Как |
|---|---|
| Создать проект | IntelliJ → File → New → Java Project |
| Запустить класс | Shift+F10 или кнопка ▶ |
| Командная строка | `javac MyClass.java && java MyClass` |
| Читать ввод | `Scanner sc = new Scanner(System.in);` |
| Вывод с форматом | `System.out.printf("Число: %d%n", n);` |

---

## ⚡ Подсказки (не читай, пока не застрял)

- `public class HelloWorld` → файл должен называться `HelloWorld.java`
- `java HelloWorld.java` работает с Java 11+
- `sc.nextDouble()` читает дробь, `sc.nextInt()` — целое
- `printf`: `%d` — целое, `%.2f` — дробь с 2 знаками, `%n` — новая строка
- `5 / 2` → `2`, `(double) 5 / 2` → `2.5`
- `sc.nextLine()` после `nextInt()` — ловушка! Считает пустую строку
- `==` для чисел, `.equals()` для строк
- `for (int i = 1; i <= 100; i++)` — стандартный цикл
- `n % 15 == 0` — проверка делимости на 15
- `sum += i` — накопление суммы; `sum` объявляй **до** цикла, иначе обнуляется
- В `while` меняй счётчик внутри тела (`n--`), иначе цикл будет бесконечным

---

## 📊 Чек-лист готовности к неделе 2

- [ ] Знаю 8 примитивных типов (`byte, short, int, long, float, double, char, boolean`)
- [ ] Понимаю разницу `int / int` и `(double) int / int`
- [ ] Умею читать числа через `Scanner`
- [ ] Понимаю `if/else if/else` и `switch`
- [ ] Умею писать цикл `for` и `while`
- [ ] Понимаю `break` и `continue`
- [ ] В IntelliJ могу создать проект, класс, запустить и посмотреть вывод

---

*Материалы проверены. Все ссылки активны.*

---

➡️ **Следующая неделя:** [week02_materials.md](week02_materials.md) · **План обучения:** [PLAN.md](PLAN.md)
