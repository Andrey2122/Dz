# Неделя 2 · 19–23.10 · Массивы, строки, методы, отладка

## 📖 Теория (читать/смотреть перед занятием)

### Пн 19.10 — Массивы, класс Arrays, обход, поиск

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Массивы и класс Arrays](https://metanit.com/java/tutorial/2.4.php) | Статья | Русский, 15 мин |
| [Oracle — Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html) | Документация | Английский, 8 мин |

### Вт 20.10 — String, StringBuilder, split/join, корректное сравнение

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Класс String](https://metanit.com/java/tutorial/7.1.php) | Статья | Русский, 15 мин |
| [Metanit — StringBuffer и StringBuilder](https://metanit.com/java/tutorial/7.3.php) | Статья | Русский, 10 мин |

### Ср 21.10 — Методы, перегрузка, varargs, области видимости

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Методы](https://metanit.com/java/tutorial/2.7.php) | Статья | Русский, 10 мин |
| [Metanit — Параметры методов](https://metanit.com/java/tutorial/2.16.php) | Статья | Русский, 8 мин |

### Чт 22.10 — Стек и куча, ссылки, mutable/immutable, null

| Ресурс | Тип | Ссылка |
|---|---|---|
| [Metanit — Объекты как параметры методов](https://metanit.com/java/tutorial/3.14.php) | Статья | Русский, 10 мин |
| [Baeldung — Stack Memory and Heap Space in Java](https://www.baeldung.com/java-stack-heap) | Статья | Английский, 12 мин |

### Пт 23.10 — Отладка в IDEA: breakpoint, Watch, Evaluate Expression

| Ресурс | Тип | Ссылка |
|---|---|---|
| [JetBrains — Debugging your first Java application](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html) | Документация | Английский, 10 мин |

---

## ✍️ Практика (решать в проекте `Dz`)

> Все новые классы создавать в пакете `org.example.week02` — папка `src/main/java/org/example/week02/`.

### Пн 19.10 — Статистика по массиву
1. [ ] `ArrayStats.java`:
   - Создать массив из 10 случайных чисел (1–100) через `Random`
   - Найти min, max, среднее арифметическое
   - Посчитать медиану: отсортировать массив (`Arrays.sort()`), взять средний элемент
   - Вывести всё через `System.out.printf`

### Вт 20.10 — Парсер CSV-строки
1. [ ] `CsvParser.java`:
   - Записать строку `"Иванов;4;5;3;5;4"`
   - Разбить через `split(";")`
   - Первый элемент — имя, остальные — оценки (int)
   - Посчитать средний балл
   - Проверить через `String.equals()`, что имя не пустое

### Ср 21.10 — Разбить арифметику на методы
1. [ ] `Calculator.java`:
   - Взять `AverageCalculator` из недели 1 (теперь лежит в `week01/AverageCalculator.java`)
   - Вынести чтение 5 чисел в метод `readNumbers()` (возвращает `int[]`)
   - Вынести вычисление среднего в `double average(int[] nums)`
   - Добавить перегрузку: `double average(double a, double b)` для двух чисел
   - Проверить, что `average(int[])` и `average(double, double)` не конфликтуют

### Чт 22.10 — Разбор «что напечатается»
1. [ ] `NullTraps.java`:
   - Написать 5 примеров, где может быть NPE:
     - 1) метод на `null`-объекте: `String s = null; s.length();`
     - 2) `null` в массиве объектов: `Integer[] arr = {1, null, 3};`
     - 3) передача `null` в метод
   - Комментировать каждый пример: что произойдёт и почему
   - Добавить пример с `int[]` vs `Integer[]` — примитивный массив не может хранить `null`

### Пт 23.10 — Найти и исправить 3 бага
1. [ ] `BugHunt.java`:
   - Создать 3 метода с багами:
     - 1) `sum(int[] arr)` — не инициализирована переменная `sum`
     - 2) `max(int[] arr)` — начальное значение `max` равно `0` (не работает для отрицательных)
     - 3) `find(int[] arr, int target)` — `for` выходит за границы (`i <= arr.length`)
   - Запустить, посмотреть stacktrace
   - Исправить все 3 бага
   - Проверить, что `Arrays.toString(arr)` и `Arrays.binarySearch(arr, target)` работают корректно

---

## 🛠 Инструменты

| Что | Как |
|---|---|
| Создать массив | `int[] arr = new int[10];` или `int[] arr = {1, 2, 3};` |
| Длина массива | `arr.length` (свойство, не метод!) |
| Копировать массив | `System.arraycopy(src, srcPos, dest, destPos, len);` |
| Сортировать | `Arrays.sort(arr);` |
| Бинарный поиск | `Arrays.binarySearch(arr, target);` — массив должен быть отсортирован! |
| Сравнить массивы | `Arrays.equals(arr1, arr2);` — `==` сравнивает ссылки |
| Breakpoint | F9 в редакторе (красная точка слева от строки) |
| Step Over | F8 — выполнить строку, не заходя в метод |
| Step Into | F7 — зайти внутрь вызванного метода |

---

## ⚡ Подсказки (не читай, пока не застрял)

- `int[] arr = new int[5];` — создаёт массив из 5 нулей; индексы 0–4
- `Arrays.toString(arr)` — удобно для отладки, выводит `[1, 2, 3]`
- `arr.length` — свойство (без `()`), не `arr.length()`
- `String s = "hello"; s.equals("hello");` — всегда `.equals()` для строк
- `String[] parts = line.split(";");` — возвращает массив без разделителя
- `StringBuilder sb = new StringBuilder(); sb.append("a"); sb.append("b");` — строим строку кусками
- `Integer[]` может хранить `null`, `int[]` — нет (примитив)
- `breakpoint` → F9 → F8 (Step Over) — смотреть значение переменной в панели Variables

---

## 📊 Чек-лист готовности к неделе 3

- [ ] Умею создавать массив, обходить через `for` и `for-each`
- [ ] Понимаю разницу `==` и `.equals()` для строк
- [ ] Умею использовать `split()`, `join()`, `StringBuilder`
- [ ] Понимаю, как объявить метод, что возвращает `return`
- [ ] Знаю разницу между передачей значения и передачей ссылки
- [ ] Понимаю, где хранятся примитивы (стек) и объекты (куча)
- [ ] Умею ставить breakpoint и пошагово выполнять код в IDEA

---

*Нумерация страниц на metanit.com иногда меняется. Если ссылка не открывается — найдите статью по названию в оглавлении: https://metanit.com/java/tutorial/*

---

⬅️ **Предыдущая неделя:** [week01_materials.md](week01_materials.md) · **План обучения:** [PLAN.md](PLAN.md)
