# epam-edu-task1
EPAM-courses

➢ Разработать entity-классы, например: «Разработать классы Точка и Фигура»

➢ Entity-классы не следует наполнять методами, выполняющими функциональные 
действия (методами бизнес-логики, такими как вычисление, поиск и т.д.).

➢ Фигура должна содержать поле id или name.

➢ Разработать action-классы реализующие заданные функциональности, например: 
«Реализовать методы вычисления площади и периметра фигуры»

➢ Параметры, необходимые для создания объектов, читать из файла (.txt). Часть данных 
должна быть некорректной. Если встретилась некорректная строка, приложение 
должно переходить к следующей строке. Файлы не должны находиться вне каталогов.

➢ Для чтения информации из файла использовать только возможности, появившиеся в 
Java8.

➢ Разработать классы-валидаторы для проверки результатов вычислений параметров фигур, 
а также для валидации исходных данных для создания объектов entity-классов.
Например: корректная строка в файле для создания объекта Круг: «1.0 2.0 3.0», где 
первое второе – координаты центра, третье - радиус круга;
некорректная строка в файле для создания объекта Круг: «2a.0 3.0 4.1» - недопустимый 
символ «z», всю строку следует считать некорректной здесь и в случаях приведенных 
ниже;
некорректная строка в файле для создания объекта Круг: «1.0 2.0» - недостаточно 
информации для создания объекта (можно использовать значение по умолчанию, н-р: 1);
некорректная строка в файле для создания объекта Круг: «1.0 2.0 -3.0» - невозможно 
создать Круг с отрицательным радиусом.

➢ Для классов-сущностей следует переопределять методы класса Object: toString(), 
equals(), hashCode(). Методы класса Objects использовать нельзя.

➢ При решении задачи для создания entity-классов использовать паттерн Factory Method.

➢ Все классы приложения должны быть структурированы по пакетам.

➢ Использовать собственные классы исключительных ситуаций.

➢ Оформление кода должно соответствовать Java Code Convention.

➢ Для записи логов использовать Log4J2 (SLF4J). Логи писать следует в консоль и в файл.

➢ Код должен быть покрыт Unit-тестами. Использовать TestNG (JUnit). При написании тестов
запрещено: создавать неаннотированные методы, писать логи и использовать операторы 
ветвления: if, for, while, do\while, switch; использовать в тест-методе более одного Assertметода.

➢ Обратить внимание на примечания 1 и 2

Куб. Разработать классы Точка и Куб. Создать методы и тесты: вычисления площади 
поверхности куба, объема куба; соотношения объемов получаемых в результате 
рассечения куба координатной плоскостью является ли объект кубом; находится ли 
основание куба на одной из координатных плоскостей.

Примечание 0:
Определение фигуры может быть различным. Например, Куб может определяться 8-ю 
точками или координатой центра и длиной стороны или каким либо еще.

Примечание 1:
Cекущие плоскости, фигуры и основания следует ориентировать в пространстве 
параллельно осям и плоскостям координат, чтобы формулы вычисления сечений и 
параметров фигур не были слишком сложными.

Примечание 2:
1. После if всегда следует положительный сценарий, после else - отрицательный
2. Если только if, то возможен и отрицательный сценарий
3. В if, for, while обязательно использовать { }
4. Если генерируется exception, с помощью throw, не ловить его сразу же
5. В finally не генерировать исключения и не использовать return
6. Не генерировавать стандартные исключения. Разрешено только в методах private
7. fileWriter.close(); - в блок finally
8. Регулярные выражения в константы
9. В именах пакетов не использовать большие буквы
10. Не класть сторонние файлы в папки рядом или вместе с классами
11. Размещать файлы только в папках в корне проекта
12. Использовать для файлов только относительные пути. Папка src не должна 
присутствовать в пути к файлу
13. Если константа неизменяемая, то имя должно быть в верхнем регистре, если 
изменяемая, то как правило именуется как обычное поле класса
14. Элементы перечисления именуются как неизменяемые константы
15. Не увлекаться статическими методами
16. Не объявлять get-теры и set-теры абстрактными
17. Не давать классам имена, совпадающие с именами стандартных классов и 
интерфейсов Java !
18. Не разделять объявление переременной и присвоение ей значения в методах, то есть 
не писать:
Integer count; 
count = 0;
а надо Integer count = 0;
19. Расстояние (в строчках кода) между использование переменной и ее объявление 
должно быть минимально!
20. В одной строчке – одна точка, то есть надо использовать локальные переменные, не 
надо:
sample.getSomething().getData()
надо:
Something something = sample.getSomething();
Data data = something.getData();
21. Не писать if (isValid == true), а писать if (isValid)
22. Не писать:
 if (someValue == EXPECTED_VALUE) {
 return true;
 } else {
 return false;
 }
писать:
 return someValue == EXPECTED_VALUE;
23. Использовать assertEquals вместо assertTrue(some == other)
24. Использовать assertTrue(isValid) вместо assertEquals(true, isValid)
25. Лучше тестовые объекты размещать в тестах в виде констант, а не создавать их в 
самом методе
26. Не использовать существующий FactoryMethod в тестах для создания объектов, 
объекты в тестах делать через new
27. Тест должен иметь структуру: given, when, then, где given – прекондишены 
(инициализация данных), when – вызов тестируемого метода (всегда одна строчка), 
then – посткондишн (assert-метод)
