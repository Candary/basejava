<<<<<<< HEAD
# Курс BaseJava (обновленный и переработанный)

## Разработка Web приложения "База данных резюме"
  -  используем: Java 8, <a href="https://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016-trends/#java-ides-adoption">IntelliJ IDEA</a>,
    <a href="https://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016-trends/#java-vcs-adoption">GitHib/Git</a>, Сервлеты, JSP, JSTL, Tomcat, JUnit, PostgreSQL, GSON, JAXB
  - хранение резюме
     -  в памяти на основе массива, отсортированного массива, списка и ассоциированного массива (Map)
     -  в файловой системе (File API и <a href="http://www.quizful.net/post/java-nio-tutorial">Java 7 NIO File API</a>)
        - в стандартной и кастомной сериализации Java
        - в формате JSON (<a href="https://github.com/google/gson">Google Gson</a>)
        - в формате XML (<a href="https://ru.wikipedia.org/wiki/Java_Architecture_for_XML_Binding">JAXB</a>)
     -  в реляционной базе <a href="https://ru.wikipedia.org/wiki/PostgreSQL">PostgreSQL</a>
  -  деплой веб приложения
     - в контейнер сервлетов <a href="http://tomcat.apache.org/">Tomcat</a>
     - в облачный сервис <a href="https://www.heroku.com/">Heroku</a>

Приложение будет разрабатываться начиная со первого занятия, основываясь на базовых темах курса:
**объектная модель, коллекции, система ввода-вывода, работа с файлами, сериализация, работа с XML, JSON, SQL, персистентность в базу данных (PostgreSQL), сервлеты, HTML/JSP/JSTL, веб-контейнер Tomcat, модульные тесты JUnit, java.util.Logging, система контроля версий Git.**

> Любое знание стоит воспринимать как подобие семантического дерева: убедитесь в том, что понимаете фундаментальные принципы, то есть ствол и крупные ветки, прежде чем лезть в мелкие листья-детали. Иначе последним не на чем будет держаться.

[*— Илон Маск](https://ru.wikipedia.org/wiki/Маск,_Илон)

# Изучайте [первое открытое занятие](lesson/lesson1.md).
### Внизу урока есть первое домашнее задание, по которому можно оценить свой уровень готовности к проекту.

## Программа 
### [Регистрация](http://javaops.ru/reg/basejava)
### Открытое занятие 1
 - Обзор курса и методики обучения
 - Подготовка и настройка рабочего окружения
 - Подходы, применяемые при разработке ПО
 - Обзор инструментов и технологий, используемых Java-разработчиками
 - Введение в язык Java: история создания, JVM, JIT-компиляция
 - Системы управления версиями. Git
 - Домашнее задание

### Занятие 2
 - Введение в объектно-ориентированное программирование
 - Принципы ООП
 - Модификаторы доступа
 - Классы-обертки
 - Классы и объекты
 - Структура памяти java-программы: Heap (куча), Stack (стек)
 - Типы данных
 - Пакетная организация файлов
 - Домашнее задание

### Занятие 3
 - Разбор домашнего задания
 - Обзор суперкласса Object
 - Связь между equals() и hashCode()
 - Статические методы и переменные
 - Программирование с помощью интерфейсов
 - Абстрактные классы
 - Сложность алгоритмов
 - Паттерн проектирования Шаблонный метод 
 - Домашнее задание
 
### Занятие 4
 - Разбор домашнего задания
 - Работа со строками: String, StringBuilder, StringBuffer
 - String literal pool
 - Исключения (Exceptions)
 - Конструктор
 - Ключевые слова: this, super
 - Reflection
 - Аннотации в Java 8
 - Введение в модульное тестирование. JUnit 
 - Домашнее задание

### Занятие 5
 - Разбор домашнего задания
 - Иерархия классов Коллекций
 - Списки (List)
 - Множества (Set)
 - Ассоциативные массивы (Map)
 - Введение в Iterator
 - Тестирование коллекций 
 - Домашнее задание
 
### Занятие 6
 - Разбор домашнего задания
 - Autoboxing and Unboxing
 - Паттерн проектирования Итератор
 - Вложенные классы
 - Внутренние классы
 - Локальные классы
 - Анонимные классы
 - Введение в лямбды
 - Функциональный интерфейс
 - Домашнее задание

### Занятие 7
 - Разбор домашнего задания
 - Дженерики (Generic)
 - Введение в логирование. Log4J
 - Стандартный логер - Java Logging API
 - Паттерн проектирования - Синглтон
 - Перечисляемые типы (Enum)
 - Объектная модель
 - Домашнее задание

### Занятие 8
 - Разбор домашнего задания
 - Классы работы с датами: Date, Calendar, TimeZone
 - Дата и время в Java 8
 - Внешние библиотеки: Joda Time library
 - Работа с файловой системой: класс File
 - try-with-resources
 - Домашнее задание

### Занятие 9
 - Разбор домашнего задания
 - Обзор пакета java.io
 - Классы чтения/записи потоков: InputStream/OutputStream
 - Паттерн проектирования Декоратор
 - Работа с классами чтения/записи символов: Reader и Writer
 - Сериализация
 - Обзор пакета java.nio
 - Введение в Java 8 Stream API
 - Домашнее задание

### Занятие 10
 - Разбор домашнего задания
 - Паттерн проектирования Стратегия
 - Работа с XML
 - Работа с JSON: Google GSON и Jackson
 - Введение в REST
 - DataInputStream/DataOutputStream
 - Домашнее задание

### Занятие 11
 -  Процессы и потоки
 - Синхронизация методов и блоков
 - Закон Мура
 - Закон Амдала
 - Обзор методов класса Object
 - Ленивая инициализация
 - Java Memory Model
 - Взаимная блокировка
 - Домашнее задание
 
### Занятие 12
 - Разбор домашнего задания
 - Обзор java.util.concurrent
 - Синхронизаторы
 - ThreadLocal переменные
 - Сравнение с обменом (Compare-and-swap)
 - Домашнее задание

### Занятие 13
 - Разбор домашнего задания
 - Введение в реляционные базы данных
 - Язык SQL
 - Обзор NoSQL баз данных
 - Установка и настройка СУБД PostgreSQL
 - Работа с базами данных из IDEA
 - Конфигурирование базы данных и каталога хранения
 - Подключение базы данных к проекту
 - Обзор JDBC-архитектуры
 - Домашнее задание

### Занятие 14
 - Разбор домашнего задания
 - Операции соединения таблиц. JOIN
 - Транзакции
 - Требования к транзакциям. ACID
 - Уровни изоляции транзакций в SQL
 - Установка и настройка контейнера сервлетов Tomcat
 - Домашнее задание

### Занятие 15
 - Разбор домашнего задания
 - Введение в HTML
 - Основы протокола HTTP
 - Настройка web.xml
 - Развертывание (деплой) web-приложения в Tomcat
 - Сервлеты
 - Домашнее задание
 
### Занятие 16
 - Разбор домашнего задания
 - Жизненный цикл сервлета
 - Создание динамических страниц. JSP
 - Расширенные возможности JSP: JSTL
 - Redirect и Forward
 - CRUD
 - Домашнее задание
 
### Занятие 17
 - Разбор домашнего задания
 - Деплой приложения в облачный сервис Heroku
 - Загрузка классов в Java. Classloader
 - Домашнее задание

## Рекомендуемые книги
- <a href="http://myflex.org/books/java4kids/java4kids.htm">YAKOV FAIN: Программирование на Java для начинающих</a>
- <a href="https://habrahabr.ru/post/153373/">Книги по Java: от новичка до профессионала</a>
- <a href="http://scanlibs.com/java-effektivnoe-programmirovanie-2-e-izdanie">Джошуа Блох: Java. Эффективное программирование, 2-е издание</a>
- <a href="http://www.labirint.ru/books/87603/">Гамма, Хелм, Джонсон: Приемы объектно-ориентированного проектирования. Паттерны проектирования</a>
- <a href="http://www.bookvoed.ru/book?id=639284">Редмонд Э.: Семь баз данных за семь недель. Введение в современные базы данных и идеологию NoSQL.</a>

##  Ресуры в сети
- [EduTools плагин от JetBrains для изучения Kotlin, Java, Python, Scala, ...](http://javaops.ru/view/story/story21#edutools)
- [Руководство по Java Core](http://proselyte.net/tutorials/java-core/)
- [Java. Базовый курс (доступен также через плагин JetBrains EduTools)](https://stepik.org/course/Java-Базовый-курс-187)
- <a href="http://www.intuit.ru/studies/courses/16/16/info">intuit: Программирование на Java</a>
- <a href="http://sernam.ru/book_java.php">Основы программирования на Java: учебное пособие</a>
=======
# basejava
BaseJava Homework
>>>>>>> 3a502b8f845711cce87c82cacd2da27460bcee79
