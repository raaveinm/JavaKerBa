## Java User Input (scanner)
Класс `Scanner` используется для получения пользовательского ввода и находится в пакете `java.util`.

Чтобы использовать класс `Scanner`, создайте объект этого класса и используйте любой из доступных методов, описанных в документации класса `Scanner`. В нашем примере мы будем использовать метод `nextLine()`, который используется для чтения строк.

**Типы ввода**

В приведенном выше примере мы использовали метод `nextLine()`, который используется для чтения строк. Чтобы читать данные других типов, обратитесь к таблице ниже:

| Метод           | Описание                                          |
| --------------- | ------------------------------------------------- |
| `nextBoolean()` | Считывает значение типа `boolean` от пользователя |
| `nextByte()`    | Считывает значение типа `byte` от пользователя    |
| `nextDouble()`  | Считывает значение типа `double` от пользователя  |
| `nextFloat()`   | Считывает значение типа `float` от пользователя   |
| `nextInt()`     | Считывает значение типа `int` от пользователя     |
| `nextLine()`    | Считывает значение типа `String` от пользователя  |
| `nextLong()`    | Считывает значение типа `long` от пользователя    |
| `nextShort()`   | Считывает значение типа `short` от пользователя   |
```java
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name, age and salary:");
		
		// String input
		String name = myObj.nextLine();
		// Numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		// Output input by user
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}
```
Необходимо проверить, что пользователь вводит именно целое число. Для этого можно использовать `Scanner` и его метод `nextInt()`. Важно учесть, что `nextInt()` может выбросить `InputMismatchException`, если введенное значение не является целым числом.

*пример из задания 7*

```java
import java.util.Scanner;
public class TestCircleRectangle {  
    public static void main(String[] args) throws IllegalTriangleException
    Scanner Triangle = new Scanner(System.in);
        System.out.println("Три стороны треугольника: ");
        double side1 = Triangle.nextDouble();
        double side2 = Triangle.nextDouble();
        double side3 = Triangle.nextDouble();
        System.out.println("цвет: ");
        String color = Triangle.next();
        System.out.println("заполнение: ");
        Boolean filled = Triangle.nextBoolean();
    
}
```

## Массив
Объявление массива реализуется следующим образом:
```java
String[] ExampleArr;
```
*в квадратных скобках указывается размер массива*

Создание массива реализуется примерно так же как и любой другой объект -  с помощью оператора `new`:
```java
ExampleArr = new String [10]
```
*Длину массива нельзя изменить после его создания*

Заполнить массив можно следующим образом:
```java
String[] seasons  = new String[4];

seasons[0] = "Winter";
seasons[1] = "Spring";
seasons[2] = "Summer";
seasons[3] = "Autumn";
```

Или так
```java
String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
```
## Двумерный массив
Двумерный массив в Java можно представить как таблицу, состоящую из строк и столбцов. Каждый элемент в этой таблице хранит значение определенного типа данных (например, `int`, `double`, `String` и т.д.) и доступен по его индексам строки и столбца

**Объявление двумерного массива**

Чтобы объявить двумерный массив, нужно указать тип данных, дважды поставить квадратные скобки `[]` и имя массива:
```java
int[][] matrix;
```

**Создание двумерного массива**

После объявления массива нужно его создать, выделив память под элементы. Это делается с помощью оператора `new`:
```java
matrix = new int[3][4];
```
массив `matrix` размером 3x4, то есть с 3 строками и 4 столбцами.
```java
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

**Доступ к элементам массива**

Для доступа к элементу массива нужно указать его индексы строки и столбца. Нумерация индексов начинается с 0
```java
int element = matrix[1][2];
```
*получаем элемент из 2-й строки и 3-го столбца (значение 7)*

```java
public class StudentGrades {
    public static void main(String[] args) {
        int[][] grades = {
                {85, 90, 78}, // оценки первого студента
                {92, 88, 95}, // оценки второго студента
                {76, 82, 80}  // оценки третьего студента
        };

        // Выводим оценки первого студента
        System.out.println("Оценки первого студента:");
        for (int j = 0; j < grades[0].length; j++) {
            System.out.print(grades[0][j] + " ");
        }
        System.out.println();

        // Вычисляем средний балл второго студента
        int sum = 0;
        for (int j = 0; j < grades[1].length; j++) {
            sum += grades[1][j];
        }
        double average = (double) sum / grades[1].length;
        System.out.println("Средний балл второго студента: " + average);
    }
}
```
## ArrayList 
В отличие от обычных массивов, размер `ArrayList` может изменяться во время выполнения программы. Это значит, что вам не нужно заранее знать, сколько элементов будет храниться в списке.

Для создания ArrayList понадобится импортировать класс `ArrayList` из пакета `java.util`.  При создание объекта необходимо указать, какие типы данных он будет хранить.
```java
import java.util.ArrayList;
ArrayList<String> names = new ArrayList<String>();  // Список строк
ArrayList<Integer> numbers = new ArrayList<Integer>(); // Список целых чисел
```

Для добавления используется метод `add()`, доступ к элементам по индексу с помощью метода `get()`

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        // Добавляем фрукты
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Выводим количество фруктов
        System.out.println("Количество фруктов: " + fruits.size());

        // Выводим все фрукты
        System.out.println("Фрукты:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Удаляем банан
        fruits.remove("Банан");

        // Проверяем, содержит ли список апельсин
        if (fruits.contains("Апельсин")) {
            System.out.println("Список содержит апельсин");
        }
    }
}
```
## Методы 
Метод - это блок кода, который выполняет определенную задачу. Методы используются для многократного использования кода: определите код один раз и используйте его много раз.

**Зачем использовать методы?**
- **Повторное использование кода:** один раз определите код и используйте его многократно.
- **Структурирование программы:** разбивайте сложные задачи на более мелкие и управляемые части.
- **Улучшение читаемости кода:** делайте код более понятным и легким для поддержки.

### **Создание метода**

Метод должен быть объявлен внутри класса. Он определяется с помощью имени метода, за которым следуют круглые скобки `()`. Java предоставляет некоторые предопределенные методы, такие как `System.out.println()`, но вы также можете создавать свои собственные методы для выполнения определенных действий.

*объявление метода:*
```Java
public class Main {
  static void myMethod() {
    // код для выполнения
  }
}
```

**Вызов метода**

Чтобы вызвать метод в Java, напишите имя метода, за которым следуют две круглые скобки `()` и точка с запятой `;`.

```Java
public class Main {
  static void myMethod() {
    System.out.println("Wake up, Samurai!");
  }

  public static void main(String[] args) {
    myMethod(); 
  }
}
```

**Вывод:**

```
Wake up, Samurai!
```

Метод можно вызывать несколько раз:

```Java
public class Main {
  // ... (код метода myMethod)

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}
```

**Вывод:**

```
Wake up, Samurai!
Wake up, Samurai!
Wake up, Samurai!
```

### Static and Public

**Static (Статические)**

В Java статический метод — это метод, который принадлежит самому классу, а не какому-либо конкретному экземпляру (объекту) этого класса. Статические методы можно вызывать без создания объектов. Это означает, что вы можете вызвать статический метод, используя имя класса напрямую, без необходимости создавать объект этого класса. Статические методы часто используются для вспомогательных функций, методов-утилит или операций, которые не требуют каких-либо данных, специфичных для экземпляра.

```Java
class Main {
  // Создание метода
  public static int mySum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int result = Main.mySum(10, 20);
    System.out.println(result);
  }
}
```

**Использование статического метода:** Вы можете вызвать статический метод напрямую, используя имя класса, без создания объекта этого класса.

**Public (Открытые)**

В Java открытый метод — это метод, к которому можно получить доступ и который можно вызвать из любого другого класса или пакета. Это один из четырех модификаторов доступа в Java, наряду с `private` (закрытый), `protected` (защищенный) и `package-private` (доступ по умолчанию, в пределах пакета).


**Основные отличия**

|Характеристика|Static|Public|
|---|---|---|
|**Принадлежит**|Классу|Объекту (экземпляру класса)|
|**Доступ**|Через имя класса|Через ссылку на объект|
|**Совместное использование**|Общий для всех экземпляров|У каждого экземпляра своя копия|
|**Видимость**|Может быть доступен отовсюду (если public)|Доступен отовсюду|


## Конструкторы

Конструктор в Java используется для создания экземпляра класса
Всякий раз, когда мы используем ключевое слово `new` для создания экземпляра класса, вызывается конструктор и возвращается объект класса. Поскольку конструктор может возвращать только объект класса, это неявно делается средой выполнения Java, и мы не должны добавлять к нему тип возвращаемого значения. Если мы добавим тип возвращаемого значения к конструктору, то он станет методом класса. Таким образом среда выполнения Java различает обычный метод и конструктор. Предположим, у нас есть следующий код в классе `Employee`.

```java
public Employee() {
	System.out.println("Employee Constructor");
}


public Employee Employee() {
	System.out.println("Employee Method");
	return new Employee();
}
```

### Типы конструкторов

В Java существует три типа конструкторов:
- Конструктор по умолчанию (`Default Constructor`)
- Конструктор без аргументов (`No-Args constructor`)
- Параметризованный конструктор (`Parameterized constructor`)
#### Default Constructor

Не всегда требуется предоставлять реализацию конструктора в коде класса. Если мы не предоставляем конструктор, то Java предоставляет реализацию конструктора по умолчанию для нашего использования.

```java
public class Data {

	public static void main(String[] args) {
		Data d = new Data();
	}
}
```

#### No-Args Constructor
Конструктор без аргументов (no-args constructor) - это конструктор, который не принимает никаких параметров. Он похож на переопределение конструктора по умолчанию и используется для выполнения некоторых предварительных инициализаций, таких как проверка ресурсов, сетевых подключений, ведение журнала и т. д. 
```java
public class Data {
        //no-args constructor
	public Data() {
		System.out.println("No-Args Constructor");
	}
	public static void main(String[] args) {
		Data d = new Data();
	}
}
```

#### Parameterized Constructor
Параметризованный конструктор с аргументами используется для инициализации объекта с определенными значениями, которые передаются в конструктор при создании объекта
## Модификаторы доступа

Эта тема посвящена управлению доступом к членам класса (полям и методам) в Java.  Ключевые понятия:

* **Модификаторы доступа:**  `public`, `private`, `protected`, `default` (package-private). Они определяют, кто может "видеть" и использовать члены класса.
* **Инкапсуляция:**  Принцип ООП, заключающийся в скрытии внутренних деталей реализации объекта и предоставлении контролируемого доступа к ним через публичные методы (геттеры и сеттеры). 

**Модификаторы доступа:**

| Модификатор | Внутри класса | Внутри пакета | Подкласс (другой пакет) | Везде |
| ----------- | ------------- | ------------- | ----------------------- | ----- |
| `public`    | Да            | Да            | Да                      | Да    |
| `protected` | Да            | Да            | Да                      | Нет   |
| `default`   | Да            | Да            | Нет                     | Нет   |
| `private`   | Да            | Нет           | Нет                     | Нет   |


## TASK#3

**Создание структуры проекта:**

```
vehicles/
├── Car.java
└── ElectricCar.java
app/
└── Main.java
```


##  Абстрактные классы и методы

**Абстрактный класс:**  Класс, который не может быть непосредственно использован для создания объектов (инстанцирования). Он служит как шаблон для подклассов, определяя общие характеристики и поведение.

**Абстрактный метод:**  Метод, объявленный в абстрактном классе, но не имеющий реализации (тела). Подклассы обязаны реализовать этот метод, предоставляя свою специфическую логику.

**Зачем нужны абстрактные классы?**

* **Абстракция:**  Выделение общих свойств и поведения разных объектов.
* **Полиморфизм:**  Работа с объектами разных классов через общий интерфейс (абстрактный класс).
* **Обязательная реализация:**  Гарантия, что подклассы реализуют определенные методы.

### 2. Наследование

**Наследование:**  Механизм ООП, позволяющий создавать новые классы (подклассы) на основе существующих (родительских классов). Подклассы наследуют поля и методы родительского класса и могут добавлять свои собственные.

### 3. Полиморфизм

**Полиморфизм:**  Способность объектов разных классов реагировать по-разному на один и тот же вызов метода.

### 4. Инкапсуляция

**Инкапсуляция:**  Скрытие внутренних деталей реализации объекта и предоставление контролируемого доступа к ним через публичные методы (геттеры и сеттеры).


## TASK#4

### Абстрактный класс Vehicle

**Логика:**

* Абстрактный класс `Vehicle` представляет общие характеристики всех транспортных средств.
* Он содержит поля: `model`, `license`, `color`, `year`, `ownerName`, `insuranceNumber`, `engineType`.
* Поле `engineType` объявлено как `protected`, чтобы его могли использовать подклассы.
* Абстрактный метод `vehicleType()` определяет метод, который будет возвращать тип транспортного средства, но не реализует его.
* Геттеры и сеттеры предоставляют доступ к полям класса.

**Пример кода (Vehicle.java):**

```java
package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Vehicle(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public abstract String vehicleType();

    // Геттеры и сеттеры для всех полей (пример для model)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // ... (геттеры и сеттеры для остальных полей)
}
```

### Класс Car

**Логика:**

* Класс `Car` наследует `Vehicle` и представляет автомобили.
* Он реализует абстрактный метод `vehicleType()`, возвращая "Car".
* В конструкторе `Car` мы вызываем конструктор родительского класса `Vehicle` для инициализации общих полей.

**Пример кода (Car.java):**

```java
package vehicles;

public class Car extends Vehicle {

    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber);
    }

    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", license='" + getLicense() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", ownerName='" + getOwnerName() + '\'' +
                ", insuranceNumber='" + getInsuranceNumber() + '\'' +
                ", engineType='" + getEngineType() + '\'' +
                '}';
    }
}
```

### Класс ElectricCar

**Логика:**

* Класс `ElectricCar` наследует `Car` и представляет электромобили.
* Он добавляет поле `batteryCapacity`.
* Он реализует метод `vehicleType()`, возвращая "Electric Car".
* В конструкторе `ElectricCar` мы вызываем конструктор родительского класса `Car` и устанавливаем `engineType` в "Electric" с помощью `protected` поля.

**Пример кода (ElectricCar.java):**

```java
package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric"; // Используем protected поле engineType
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + getModel() + '\'' +
                ", license='" + getLicense() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", ownerName='" + getOwnerName() + '\'' +
                ", insuranceNumber='" + getInsuranceNumber() + '\'' +
                ", engineType='" + getEngineType() + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
```

### Тестовый класс TestCar

**Логика:**

* В тестовом классе `TestCar` мы создаем объекты `Car` и `ElectricCar`.
* Мы используем полиморфизм, работая с объектами через ссылки на родительские классы (`Vehicle` и `Car`).
* Мы изменяем свойства объектов с помощью сеттеров.
* Мы выводим информацию на экран с помощью метода `toString()`.

**Пример кода (TestCar.java):**

```java
package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Camry", "ABC1234", "Silver", 2022, "John Doe", "INS123");
        Vehicle electricCar = new ElectricCar("Tesla Model 3", "DEF5678", "Red", 2023, "Jane Smith", "INS456", 75);

        car.setColor("Black");
        electricCar.setOwnerName("Peter Jones");

        System.out.println(car.toString());
        System.out.println(electricCar.toString());

        System.out.println("Car type: " + car.vehicleType());
        System.out.println("Electric car type: " + electricCar.vehicleType());
    }
}
```

**Вывод программы:**

```
Car{model='Toyota Camry', license='ABC1234', color='Black', year=2022, ownerName='John Doe', insuranceNumber='INS123', engineType='null'}
ElectricCar{model='Tesla Model 3', license='DEF5678', color='Red', year=2023, ownerName='Peter Jones', insuranceNumber='INS456', engineType='Electric', batteryCapacity=75}
Car type: Car
Electric car type: Electric Car
```

Этот пример кода демонстрирует использование абстрактных классов, наследования, полиморфизма и инкапсуляции в Java. 


## Пакеты

### Что такое пакеты?

Пакеты в Java — это механизм для организации классов и интерфейсов в логические группы, подобно папкам в файловой системе. Они помогают структурировать код, избегать конфликтов имен и управлять доступом к классам.

### Зачем использовать пакеты?

* **Организация кода:** Пакеты разбивают большой проект на более мелкие, управляемые модули, что облегчает навигацию и понимание кода.
* **Избежание конфликтов имен:** Два класса с одинаковым именем могут существовать в разных пакетах, предотвращая коллизии.
* **Управление доступом:** Пакеты позволяют контролировать доступ к классам и интерфейсам с помощью модификаторов доступа (`public`, `protected`, `default`, `private`).
* **Повторное использование кода:** Пакеты позволяют группировать связанные классы, которые можно использовать в разных проектах.


### Создание пакета

**1. Объявление пакета:** 

Для объявления пакета используется ключевое слово `package`, за которым следует имя пакета. Объявление пакета должно быть первым оператором в файле Java (до объявления класса).

```java
package com.example.myproject;

public class MyClass {
    // ...
}
```

**2. Иерархия пакетов:**

Имена пакетов обычно строятся в иерархическом порядке, используя точку (`.`) в качестве разделителя. Например:

```
com.example.myproject.utils
com.example.myproject.ui
```

Это отражает структуру проекта, где `utils` и `ui` — это подпакеты пакета `com.example.myproject`.

**3. Соответствие файловой системы:**

Структура пакетов должна соответствовать структуре файловой системы. Например, если класс `MyClass` объявлен в пакете `com.example.myproject`, то файл `MyClass.java` должен находиться в директории `com/example/myproject` относительно корня проекта.

**4. Компиляция:**

При компиляции Java-файлов компилятор создает `.class` файлы в соответствующих директориях, отражая структуру пакетов.


### Использование классов из других пакетов

**1. Импорт:**

Для использования классов из другого пакета можно использовать оператор `import`. 

* **Импорт конкретного класса:**

```java
import com.example.myproject.utils.MyUtil;

public class MyClass {
    // ... использование класса MyUtil ...
}
```

* **Импорт всех классов из пакета:**

```java
import com.example.myproject.utils.*;

public class MyClass {
    // ... использование классов из пакета utils ...
}
```

**2. Полное имя:**

Вместо импорта можно использовать полное имя класса, включая имя пакета:

```java
public class MyClass {
    com.example.myproject.utils.MyUtil util = new com.example.myproject.utils.MyUtil();
    // ... использование объекта util ...
}
```


### Модификаторы доступа и пакеты

Модификаторы доступа (`public`, `protected`, `default`, `private`) определяют видимость членов класса (полей и методов) в контексте пакетов.

* **`public`:** Доступен везде (внутри пакета, в других пакетах, в подклассах).
* **`protected`:** Доступен внутри пакета и в подклассах (даже в других пакетах).
* **`default` (package-private):** Доступен только внутри пакета.
* **`private`:** Доступен только внутри класса.

**Пример:**

```java
package com.example.myproject;

public class MyClass {
    public int publicField;
    protected int protectedField;
    int defaultField; // default modifier
    private int privateField;
}
```

В этом примере:

* `publicField` доступен из любого места.
* `protectedField` доступен внутри пакета `com.example.myproject` и в подклассах `MyClass`.
* `defaultField` доступен только внутри пакета `com.example.myproject`.
* `privateField` доступен только внутри класса `MyClass`.


### Стандартные пакеты Java

Java предоставляет множество стандартных пакетов, содержащих классы для различных задач:

* **`java.lang`:** Базовые классы, такие как `Object`, `String`, `Thread`.
* **`java.util`:** Коллекции, дата и время, другие утилиты.
* **`java.io`:** Ввод/вывод данных.
* **`java.net`:** Сетевое программирование.
* **`java.awt` и `javax.swing`:** Графический интерфейс пользователя.

**Пример:**

```java
// Объявление пакета vehicles
package vehicles;

// Класс Car в пакете vehicles
public class Car {
    // ...
}
```

**Использование классов из других пакетов:**

* **Импорт:**  Использование ключевого слова `import` для указания полного имени класса или пакета.

```java
// Импорт класса Car из пакета vehicles
import vehicles.Car;

// Использование класса Car
Car myCar = new Car();
```

* **Полное имя:**  Указание полного имени класса, включая имя пакета.

```java
// Использование класса Car без импорта
vehicles.Car myCar = new vehicles.Car();
```


### Заключение

Пакеты играют важную роль в организации кода Java.  Они помогают сделать код более 
модульным, читабельным и maintainable. Понимание принципов работы пакетов 
и использование лучших практик — важный навык для любого Java-разработчика.

## Объекты и классы: абстрактные классы и интерфейсы.

###  Оператор `instanceof`
В примере выше мы явно видим, что переменная `kate` - это ссылка на объект `Client`, а не `Employee`. Однако нередко данные приходят извне, и мы можем точно не знать, какой именно объект эти данные представляют. Соответственно возникает большая вероятность столкнуться с ошибкой. И перед тем, как провести преобразование типов, мы можем проверить, а можем ли мы выполнить приведение с помощью оператора `instanceof`:

```java
Object kate = new Client("Kate", "DeutscheBank", 2000);
if(kate instanceof Employee){
      
    Employee employeeKate = (Employee) kate;
    employeeKate.display();
}
else{
    System.out.println("Conversion is invalid");
}
```
Выражение `kate instanceof Employee` проверяет, является ли переменная kate объектом типа Employee. Но так как в данном случае явно не является, то такая проверка вернет значение `false`, и преобразование не сработает.

А выражение `kate instanceof Client` возвратило бы `true`:
```java
Object kate = new Client("Kate", "DeutscheBank", 2000);
if(kate instanceof Client){
               
    Client clientKate = (Client) kate;
    clientKate.display();
}
else{
                      
    System.out.println("Conversion is invalid");
}
```

Следует отметить, что начиная с версии Java 16 мы можем упростить преобразование типов следующим образом
```java
Object kate = new Client("Kate", "DeutscheBank", 2000);
if(kate instanceof Client clientKate){

    clientKate.display();
}
else{
                      
    System.out.println("Conversion is invalid");
}
```

### Абстрактные классы
Абстрактный класс похож на обычный класс. В абстрактном классе также можно определить поля и методы, но в то же время нельзя создать объект или экземпляр абстрактного класса. Абстрактные классы призваны предоставлять базовый функционал для классов-наследников. А производные классы уже реализуют этот функционал.

При определении абстрактных классов используется ключевое слово abstract:

```java
public abstract class Human{
    private String name;    
    public String getName() { return name; }
}
```

Но главное отличие состоит в том, что мы не можем использовать конструктор абстрактного класса для создания его объекта. Например, следующим образом:

```java
Human h = new Human();
```

Кроме обычных методов абстрактный класс может содержать абстрактные методы. Такие методы определяются с помощью ключевого слова `abstract` и не имеют никакой реализации:

```java
public abstract void display();
```

Производный класс обязан переопределить и реализовать все абстрактные методы, которые имеются в базовом абстрактном классе. Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.
### Интерфейсы

Механизм наследования очень удобен, но он имеет свои ограничения. В частности мы можем наследовать только от одного класса, в отличие, например, от языка С++, где имеется множественное наследование.

В языке Java подобную проблему частично позволяют решить интерфейсы. Интерфейсы определяют некоторый функционал, не имеющий конкретной реализации, который затем реализуют классы, применяющие эти интерфейсы. И один класс может применить множество интерфейсов.

То есть одни действия вызываются другими действиями. Стандартный пример - нажатие на кнопку. Когда мы нажимаем на кнопку, мы производим действие, но в ответ на это нажатие запускаются другие действия.

**Интерфейс:**  Тип данных, описывающий набор методов, которые класс должен реализовать. Интерфейс не содержит реализации методов, только их объявление.

**Зачем нужны интерфейсы?**

* **Абстракция:**  Определение контракта, которому должны следовать классы.
* **Полиморфизм:**  Работа с объектами разных классов, реализующих один интерфейс, через общий тип.
* **Разделение обязанностей:**  Разделение реализации метода от его объявления.

**Пример:**

```java
// Интерфейс ElectricVehicle
interface ElectricVehicle {
    int getBatteryCapacity();
    void setBatteryCapacity(int capacity);
}

// Класс ElectricCar, реализующий интерфейс ElectricVehicle
class ElectricCar implements ElectricVehicle {
    private int batteryCapacity;

    // ... конструктор и другие методы ...

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity;
    }
}
```

Все методы интерфейса не имеют модификаторов доступа, но фактически **по умолчанию доступ public**, так как цель интерфейса - определение функционала для реализации его классом. Поэтому весь функционал должен быть открыт для реализации.

Чтобы класс применил интерфейс, надо использовать ключевое слово **implements**:
```java
public class Program{
      
    public static void main(String[] args) {
             
        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy
    }
}
interface Printable{
 
    void print();
}
class Book implements Printable{
  
    String name;
    String author;
  
    Book(String name, String author){
          
        this.name = name;
        this.author = author;
    }
      
    public void print() {
      
        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal implements Printable {
 
    private String name;
  
    String getName(){
        return name;
    }
  
    Journal(String name){
          
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }  
}
```

интерфейсы кроме определения методов могут иметь их реализацию по умолчанию, которая используется, если класс, реализующий данный интерфейс, не реализует метод. Например, создадим метод по умолчанию в интерфейсе Printable:
```java
interface Printable {
     
    default void print(){
         
        System.out.println("Undefined printable");
    }
}
```

Кроме методов в интерфейсах могут быть определены статические константы.
Хотя такие константы также не имеют модификаторов, но по умолчанию они имеют модификатор доступа `public/static/final`, и поэтому их значение доступно из любого места программы.
```java
public class Program{
      
    public static void main(String[] args) {
          
        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);
    }
}
class WaterPipe implements Stateable{
     
    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }
}
interface Stateable{
 
    int OPEN = 1;
    int CLOSED = 0;
     
    void printState(int n);
}
```


## Task#5

В вашем задании необходимо:

1. Создать интерфейс `ElectricVehicle` с методами `getBatteryCapacity()` и `setBatteryCapacity()`.
2. Класс `ElectricCar` должен реализовать этот интерфейс, добавив поле `batteryCapacity` и реализацию методов интерфейса.
3. В тестовом классе `TestCar` необходимо создать объекты `Car` и `ElectricCar`, проверить работу геттеров и сеттеров, а также методов интерфейса `ElectricVehicle`.

**Пример кода для ElectricCar с реализацией интерфейса:**

```java
package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private int batteryCapacity;

    // ... конструктор и другие методы ...

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity;
    }
}
```


**Пример кода для TestCar с использованием интерфейса:**

```java
package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.ElectricVehicle;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        // ... создание объектов Car и ElectricCar ...

        // Проверка методов интерфейса ElectricVehicle
        if (electricCar instanceof ElectricVehicle) {
            ElectricVehicle ev = (ElectricVehicle) electricCar;
            System.out.println("Battery capacity: " + ev.getBatteryCapacity());
            ev.setBatteryCapacity(80);
            System.out.println("New battery capacity: " + ev.getBatteryCapacity());
        }
    }
}
```

Этот пример демонстрирует использование интерфейсов для добавления специфической функциональности к классам.




## Конкатенация строк
Конкатенация строк в Java - это процесс объединения двух или более строк в одну.

В Java есть несколько способов конкатенации строк:

### **1. Оператор `+`:**

Это самый простой и распространенный способ. Оператор `+` может использоваться для объединения строк с другими строками, а также с другими типами данных (числами, булевыми значениями и т.д.). Java автоматически преобразует эти значения в строки перед конкатенацией.



```Java
String str1 = "Hello";
String str2 = " world!";
String result = str1 + str2; // result будет "Hello world!"

int num = 10;
String str3 = "Number: " + num; // str3 будет "Number: 10"
```

### **2. Метод `concat()`:**

Этот метод класса `String` позволяет объединить строку с другой строкой.

```Java
String str1 = "Hello";
String str2 = " world!";
String result = str1.concat(str2); // result будет "Hello world!"
```

### **3. StringBuilder и StringBuffer:**

Для конкатенации большого количества строк или в циклах рекомендуется использовать классы `StringBuilder` и `StringBuffer`. Они более эффективны, чем оператор `+`, поскольку не создают новые объекты строк на каждом шаге конкатенации. `StringBuffer` является потокобезопасным аналогом `StringBuilder`.

```Java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("world!");
String result = sb.toString(); // result будет "Hello world!"
```

### **4. String.format():**

Этот метод позволяет форматировать строки и вставлять в них значения переменных.

```Java
String name = "John";
int age = 30;
String result = String.format("My name is %s and I'm %d years old.", name, age); 
// result будет "My name is John and I'm 30 years old."
```

**Важно помнить:**

- При использовании оператора `+` для конкатенации большого количества строк создается много промежуточных объектов строк, что может негативно сказаться на производительности.
- `StringBuilder` более эффективен для конкатенации строк, чем оператор `+`, особенно в циклах.
- `StringBuffer` следует использовать, если требуется потокобезопасность.




## Task#6
*этот модуль был удален по техническим причинам.*


## Пакеты и модули `work in progress`
пакет имеет множество имен для классов и интерфейсов, что помогает бороться с конфликтом имен. Именование внутри пакетов строго иерархическое.

## Object и его методы
Все остальные классы, даже те, которые мы добавляем в свой проект, являются неявно производными от класса Object

### ToString
Метод `toString` служит для получения представления данного объекта в виде строки
```java
public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Person Tom
    }
}
class Person {
     
    private String name;
    
    public Person(String name){
     
        this.name=name;
    }
     
    @Override
    public String toString(){
          
        return "Person " + name;
    }
}
```

### hashCode
Метод `hashCode` позволяет задать некоторое числовое значение, которое будет соответствовать данному объекту или его хэш-код

```java
Person tom = new Person("Tom");
System.out.println(tom.hashCode()); // 2036368507
```

### getClass
Метод `getClass` позволяет получить тип данного объекта
```java
Person tom = new Person("Tom");
System.out.println(tom.getClass()); // class Person
```

### equals
Метод `equals` сравнивает два объекта на равенство.
Метод  принимает в качестве параметра объект любого типа, который мы затем приводим к текущему, если они являются объектами одного класса.
```java
public class Program{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        System.out.println(tom.equals(bob)); // false
         
        Person tom2 = new Person("Tom");
        System.out.println(tom.equals(tom2)); // true
    }
}
class Person {
     
    private String name;
     
    public Person(String name){
     
        this.name=name;
    }
     
    @Override
    public boolean equals(Object obj){
         
        if (!(obj instanceof Person)) return false;
 
        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}
```

### Обобщения (Generics)
`Generics` позволяют указывать тип данных, с которыми будет работать класс или метод, используя **параметры типа**. Параметры типа указываются в угловых скобках `<` и `>` после имени класса или метода.

**обобщенный класс**
```java
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Использование:
Box<String> stringBox = new Box<>("Hello");
String str = stringBox.getValue();

Box<Integer> intBox = new Box<>(123);
Integer num = intBox.getValue();
```

**обобщенный метод**

```java
public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.print(element + " ");
    }
    System.out.println();
}

// Использование:
Integer[] intArray = {1, 2, 3};
printArray(intArray);

String[] strArray = {"Hello", "World"};
printArray(strArray);
```

С помощью буквы T в определении класса `class Account<T>` мы указываем, что данный тип T будет использоваться этим классом. Параметр T в угловых скобках называется универсальным параметром, так как вместо него можно подставить любой тип. При этом пока мы не знаем, какой именно это будет тип: String, int или какой-то другой. Причем буква `T` выбрана условно, это может и любая другая буква или набор символов.
	При определении переменной данного класса и создании объекта после имени класса в угловых скобках нужно указать, какой именно тип будет использоваться вместо универсального параметра. При этом надо учитывать, что они работают только с объектами, но не работают с примитивными типами. То есть мы можем написать `Account<Integer>`, но не можем использовать тип int или double, например, `Account<int>`. Вместо примитивных типов надо использовать классы-обертки: Integer вместо int, Double вместо double и т.д.
```java
Box<String> stringBox = new Box<>("Hello");
String str = stringBox.getValue();

Box<Integer> intBox = new Box<>(123);
Integer num = intBox.getValue();
```

## Обработка исключений

### Блоки try, catch, finally
Для обработки исключений используется конструкция try-catch-finally:

**Блок try**: Внутри блока try помещается код, который может потенциально выбросить исключение.

**Блок catch**: Если в блоке try возникает исключение, то управление передается в соответствующий блок catch. Блок catch определяет тип исключения, которое он может обработать, и содержит код для обработки этого исключения.

**Блок finally**: Блок finally (необязательный) выполняется всегда, независимо от того, было ли выброшено исключение или нет. Он обычно используется для освобождения ресурсов, например, закрытия файлов или сетевых соединений.

*Пример*:
```java
try {
    int result = 10 / 0; // Деление на ноль
} catch (ArithmeticException e) {
    System.out.println("Ошибка: деление на ноль!");
} finally {
    System.out.println("Блок finally выполнен.");
}
```

### Ключевые слова throw и throws

**throw**: Ключевое слово throw используется для явного выбрасывания исключения.

**throws**: Ключевое слово throws используется в объявлении метода для указания, какие проверяемые исключения этот метод может выбрасывать.

*Пример*:
```java
public void myMethod() throws IOException {
    // ... код, который может выбросить IOException ...
    if (someCondition) {
        throw new IOException("Ошибка ввода-вывода");
    }
}
```

В этом примере метод `myMethod()` объявляет, что он может выбрасывать `IOException`. Если внутри метода возникает `IOException`, то он выбрасывается с помощью throw.

### IllegalArgumentException 

`IllegalArgumentException` - это непроверяемое исключение в Java, которое выбрасывается, чтобы указать на недопустимый или неподходящий аргумент, переданный методу. Это одно из самых распространенных исключений в Java.

#### Причины возникновения IllegalArgumentException

`IllegalArgumentException` выбрасывается, когда аргумент, переданный методу, не соответствует логике использования аргумента. Вот некоторые из наиболее распространенных сценариев:

- **Аргумент выходит за пределы допустимого диапазона.** Например, если метод объявляет целочисленное значение `age` в качестве параметра, которое должно быть положительным целым числом. Если передается отрицательное целое значение, выбрасывается `IllegalArgumentException`.
- **Неверный формат аргумента.** Например, если метод объявляет строку `email` в качестве параметра, которая ожидается в формате адреса электронной почты, но передается обычная строка, не соответствующая формату.
- **Аргумент равен null.** В таких случаях `IllegalArgumentException` выбрасывается, когда метод ожидает непустой объект в качестве аргумента.

#### Пример IllegalArgumentException

Вот пример `IllegalArgumentException`, выбрасываемого, когда аргумент, переданный методу, выходит за пределы допустимого диапазона:

``` Java 
public class Person {
    int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст должен быть больше нуля"); //Выбросить IllegalArgumentException, если возраст отрицательный
        } else {
            this.age = age;
            System.out.println("Возраст человека: " + this.age);
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-1);
    }
}
```

В этом примере метод `main()` вызывает метод `setAge()` с аргументом `age`, установленным в -1. Поскольку `setAge()` ожидает, что `age` будет положительным числом, он выбрасывает `IllegalArgumentException`:

```
Exception in thread "main" java.lang.IllegalArgumentException: Возраст должен быть больше нуля
    at Person.setAge(Person.java:6)
    at Person.main(Person.java:14)
```

Предыдущий пример можно обновить, чтобы гарантировать, что переданный аргумент допустим и находится в диапазоне, ожидаемом методом:

```Java
public class Person {
    int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст должен быть больше нуля");
        } else {
            this.age = age;
            System.out.println("Возраст человека: " + this.age);
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10); //Передача положительного значения во избежание исключения
    }
}
```

Здесь аргумент, переданный методу `setAge()`, является положительным числом, что и ожидается методом. Поскольку этот аргумент допустим и находится в диапазоне, ожидаемом методом, `IllegalArgumentException` избегается, и код выполняется успешно, выдавая правильный вывод, как и ожидалось:

```
Возраст человека: 10
```

### Обработка ввода пользователя:

Необходимо проверить, что пользователь вводит именно целое число. Для этого можно использовать `Scanner` и его метод `nextInt()`. Важно учесть, что `nextInt()` может выбросить `InputMismatchException`, если введенное значение не является целым числом.

*пример из задания 7*

```java
import java.util.Scanner;
public class TestCircleRectangle {  
    public static void main(String[] args) throws IllegalTriangleException
    Scanner Triangle = new Scanner(System.in);
        System.out.println("Три стороны треугольника: ");
        double side1 = Triangle.nextDouble();
        double side2 = Triangle.nextDouble();
        double side3 = Triangle.nextDouble();
        System.out.println("цвет: ");
        String color = Triangle.next();
        System.out.println("заполнение: ");
        Boolean filled = Triangle.nextBoolean();
        //последующий код
    }
}
```

## Сравнение объектов 

**Интерфейс `Comparable`**

Интерфейс `Comparable` содержит один метод: `compareTo(T o)`. Этот метод сравнивает текущий объект (`this`) с объектом, переданным в качестве аргумента (`o`).

**Как работает `compareTo()`**

Метод `compareTo()` должен возвращать:

- **Отрицательное число:** если текущий объект меньше объекта `o`.
- **Ноль:** если текущий объект равен объекту `o`.
- **Положительное число:** если текущий объект больше объекта `o`.

**Пример**
```Java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Сравниваем людей по возрасту
        return this.age - other.age; 
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

В этом примере мы сравниваем объекты `Person` по возрасту. Если возраст текущего объекта меньше возраста объекта `other`, метод `compareTo()` вернет отрицательное число. Если возрасты равны, вернется 0. Если возраст текущего объекта больше, вернется положительное число.

**Использование**

Теперь можно создать несколько объектов `Person` и отсортировать их с помощью метода `Collections.sort()`:

```Java
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people);

        System.out.println(people); // Output: [Person{name='Bob', age=25}, Person{name='Alice', age=30}, Person{name='Charlie', age=35}]
    }
}
```

Метод `Collections.sort()` использует реализацию метода `compareTo()` в классе `Person` для сортировки списка в порядке возрастания возраста.

- Класс может реализовывать интерфейс `Comparable` только один раз.
- Если нужно сравнивать объекты по разным критериям, можно использовать интерфейс `Comparator`.

### Сравнения элементов двумерного массива

для примера можно взять массив следующих чисел
```java
int[][] array = {
	{1, 5, 3},
	{8, 2, 9},
    {4, 6, 7}
};

```

```java
public class DoubleArr implements Comparable<DoubleArr> {
    private int[][] array;
    int largest = array[0][0];  
	for (int i = 0; i < array.length; i++) {  
	    for (int j = 0; j < array[i].length; j++) {  
	        if (compareTo(new DoubleArr(new int[][]{{array[i][j]}})) > 0) {  
	            largest = array[i][j];  
	        }  
	    }  
	}
	@Override
    public int compareTo(DoubleArr o) {
        if (o == null || o.array == null || o.array.length == 0 || o.array[0].length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }
        return Integer.compare(this.array[0][0], o.array[0][0]);
    }
}
```

## Стек
Стек (Stack) — это структура данных, которая работает по принципу **LIFO (Last-In, First-Out)**, то есть "последний вошел, первый вышел".

**Основные операции со стеком:**

* **push(element)**: добавляет элемент на вершину стека.
* **pop()**: удаляет и возвращает элемент с вершины стека.
* **peek()**: возвращает элемент с вершины стека, не удаляя его.
* **isEmpty()**: проверяет, пуст ли стек.
* **search(element)**: ищет элемент в стеке и возвращает его позицию (начиная с 1).

В Java стек реализован с помощью класса `java.util.Stack`. Вот примеры кода, демонстрирующие основные операции:

```java
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        // Создаем стек
        Stack<String> stack = new Stack<>();

        // Добавляем элементы
        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");

        // Выводим размер стека
        System.out.println("Размер стека: " + stack.size()); // Выведет: 3
        // Выводим элемент с вершины стека (не удаляя его)
        System.out.println("Вершина стека: " + stack.peek()); // Выведет: Третий
        // Удаляем и выводим элемент с вершины стека
        System.out.println("Удаленный элемент: " + stack.pop()); // Выведет: Третий
        // Проверяем, пуст ли стек
        System.out.println("Стек пуст? " + stack.isEmpty()); // Выведет: false
        // Ищем элемент в стеке
        System.out.println("Позиция элемента 'Первый': " + stack.search("Первый")); // Выведет: 2
    }
}
```

**Где используются стеки?**

Стеки используются в самых разных областях программирования, например:

* **Обработка рекурсивных вызовов:** при каждом вызове метода информация о нем (локальные переменные, параметры) помещается в стек.
* **Разбор выражений:** например, для вычисления арифметических выражений в обратной польской нотации.
* **История браузера:**  хранение посещенных страниц.
* **Отмена действий (undo/redo):**  хранение последовательности операций.


## Kлонирование

Клонирование в Java — это создание точной копии объекта.  В результате клонирования получается новый объект с таким же состоянием (значениями полей), как и у исходного объекта.

### Как реализовать клонирование?

**Реализовать интерфейс `Cloneable`:**  этот интерфейс является маркером и не содержит методов. Он сигнализирует JVM, что объект можно клонировать.

**Переопределить метод `clone()`:**  этот метод, наследуемый от класса `Object`,  выполняет поверхностное клонирование.  Для глубокого клонирования нужно переопределить его и вручную создать копии всех вложенных объектов.

### клонирования:

**Поверхностное клонирование (shallow copy):**  создается новый объект, но поля, которые являются ссылками на другие объекты,  просто копируются. То есть,  в новом и исходном объекте эти поля будут ссылаться на один и тот же объект в памяти.
```java
class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Person implements Cloneable {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("ул. Пушкина", "Москва");
        Person person1 = new Person("Иван", 30, address);
        Person person2 = (Person) person1.clone();

        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);

        person2.name = "Петр";
        person2.address.street = "ул. Лермонтова"; 

        System.out.println("После изменения person2:");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
    }
}
```
**Глубокое клонирование (deep copy):** создается новый объект, и для всех полей, которые являются ссылками, также рекурсивно создаются копии объектов. В результате новый объект и все его вложенные объекты полностью независимы от исходного объекта.


**Пример кода:**

```java
class Person implements Cloneable {
	String name;
	int age;
	Address address;

	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// Глубокое клонирование
		Person clonedPerson = (Person) super.clone();
		clonedPerson.address = (Address) address.clone();
		return clonedPerson;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", address=" + address +
				'}';
	}
}

class Address implements Cloneable {
	String street;
	String city;

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address{" +
				"street='" + street + '\'' +
				", city='" + city + '\'' +
				'}';
	}
}

public class DeepCloningExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("ул. Пушкина", "Москва");
		Person person1 = new Person("Иван", 30, address);

		// Клонируем person1
		Person person2 = (Person) person1.clone();

		// Выводим информацию о person1 и person2
		System.out.println("person1: " + person1);
		System.out.println("person2: " + person2);

		// Изменяем адрес у person2
		person2.address.street = "ул. Лермонтова";

		// Выводим информацию о person1 и person2 после изменения
		System.out.println("\nПосле изменения адреса у person2:");
		System.out.println("person1: " + person1);
		System.out.println("person2: " + person2);
	}
}
```


## Паттерны
### Builder Design Pattern 
---
Шаблон проектирования Builder – это инструмент, позволяющий создавать сложные объекты пошагово, избегая громоздких конструкторов и обеспечивая гибкость в настройке параметров. Давайте разберемся, как это работает и когда его применение действительно оправдано.

Builder предоставляет механизм для поэтапного создания объекта, где каждый этап отвечает за определенный атрибут или свойство.

Вместо того чтобы передавать все параметры в конструктор, мы используем методы builder'a для установки значений, а финальный объект получаем с помощью специального метода (обычно `build()`).

#### Структура Builder

- **Product:** Класс создаваемого объекта.
- **Builder:** Абстрактный класс или интерфейс, определяющий методы для настройки параметров продукта.
- **ConcreteBuilder:** Конкретная реализация Builder, отвечающая за создание определенного типа продукта.
- **Director:** (Необязательный компонент) Класс, управляющий процессом построения, используя Builder для создания продукта по определенному алгоритму.
#### Пример: создание автомобиля

Допустим, нужно создать класс `Car` с множеством параметров: марка, модель, цвет, тип двигателя, наличие кондиционера и т.д.

**Без Builder:**
```Java
Car car = new Car("Toyota", "Camry", "Синий", "Бензиновый", true); 
```

Такой конструктор становится громоздким и неудобным, особенно если не все параметры обязательны.

**С Builder:**



```Java
Car car = new Car.Builder("Toyota", "Camry")
                .color("Синий")
                .engine("Бензиновый")
                .hasConditioner(true)
                .build();
```


**Реализация:**

```Java
public class Car {
    private String make;
    private String model;
    private String color;
    private String engine;
    private boolean hasConditioner;

    public static class Builder {
        // Обязательные параметры
        private final String make;
        private final String model;

        // Необязательные параметры с дефолтными значениями
        private String color = "Белый";
        private String engine = "Дизельный";
        private boolean hasConditioner = false;

        // ... другие поля ...

        public Builder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder1 engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder2 hasConditioner(boolean hasConditioner) {
            this.hasConditioner = hasConditioner;
            return this;
        }

        // ... другие методы установки ...

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;3
        this.engine = builder.engine;
        this.hasConditioner = builder.hasConditioner;
        // ... инициализация других полей ...
    }

    // ... геттеры ...
}
```

#### Когда использовать Builder?

- **Сложные объекты:** Когда объект имеет большое количество параметров, особенно если многие из них необязательны.
- **Неизменяемые объекты:** Builder идеально подходит для создания immutable объектов, гарантируя, что все поля будут инициализированы при построении.
- **Различные представления:** Если нужно создавать разные вариации объекта с одним и тем же базовым набором параметров.

### Prototype Design Pattern 
---
Prototype - это паттерн проектирования, относящийся к группе порождающих паттернов. Он предоставляет механизм для создания новых объектов путем копирования уже существующего объекта-прототипа, вместо создания объектов с нуля.

#### Суть паттерна Prototype

 У вас есть объект с определенным состоянием. Вместо того чтобы каждый раз проходить сложный процесс создания такого же объекта, вы просто копируете существующий. Prototype позволяет клонировать объекты, избегая затрат на их инициализацию.

#### Структура Prototype

- **Prototype:** Интерфейс или абстрактный класс, декларирующий метод `clone()`.
- **ConcretePrototype:** Конкретные классы, реализующие метод `clone()` для создания копий самих себя.
- **Client:** Код, использующий прототипы для создания новых объектов.

#### Пример: клонирование фигур

Допустим, у нас есть разные типы геометрических фигур, и нужно создавать их копии.

**Без Prototype:**

Для каждой фигуры пришлось бы писать отдельный код создания, учитывая все ее параметры.

**С Prototype:**
```Java
public interface Shape extends Cloneable {
    Object clone();
    void draw();
}

public class Circle implements Shape {
    private int radius;

    // ... конструктор, геттеры, сеттеры ...

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void1 draw() {
        // ... логика рисования круга ...
    }
}

// Аналогично для Square и Triangle
```

Теперь, чтобы создать копию круга, достаточно вызвать метод `clone()`:

```Java
Circle circle = new Circle(5);
Circle clonedCircle = (Circle) circle.clone();
```

#### Когда использовать Prototype?

- **Создание объектов - ресурсоемкая операция:** Когда создание объекта требует значительных ресурсов (например, подключение к базе данных, сложные вычисления).
- **Избежание наследования:** Когда использование наследования для создания объектов нежелательно или невозможно.
- **Множество вариаций объекта:** Когда нужно создавать множество слегка отличающихся друг от друга объектов.


#### Вариации Prototype

- **Prototype Manager:** Специальный класс, хранящий набор прототипов и предоставляющий доступ к ним.
- **Registry:** Реестр прототипов, позволяющий получать доступ к ним по имени или идентификатору.
### Factory Method Design Pattern 
---
Factory Method (Фабричный метод) - это паттерн проектирования, относящийся к группе порождающих паттернов. Он определяет интерфейс для создания объектов, но позволяет подклассам выбирать, какой класс инстанцировать. Таким образом, Factory Method делегирует создание объектов подклассам.

#### Суть паттерна Factory Method



Factory Method  предоставляет "фабричный" метод, который отвечает за создание объектов. Конкретные реализации этого метода определяются в подклассах, что позволяет создавать разные типы объектов, не изменяя основной код.

#### Структура Factory Method

- **Product:** Интерфейс или абстрактный класс, определяющий создаваемый объект.
- **ConcreteProduct:** Конкретные классы, реализующие интерфейс Product.
- **Creator:** Абстрактный класс или интерфейс, декларирующий фабричный метод `factoryMethod()`, который возвращает объект типа Product.
- **ConcreteCreator:** Конкретные классы, реализующие фабричный метод `factoryMethod()` для создания конкретных ConcreteProduct.

#### Пример: создание документов

Допустим, нам нужно создавать разные типы документов: 

**С Factory Method:**
```Java
public interface Document {
    void open();
    void save();
    void close();
}

public class PDFDocument implements Document {
    // ... реализация методов ...
}

public class DOCXDocument implements Document {
    // ... реализация методов ...
}

public abstract class DocumentCreator {
    public abstract Document factoryMethod();

    public void createDocument() {
        Document document = factoryMethod();
        document.open();
        document.save();
        document.close();
    }
}

public class PDFCreator extends DocumentCreator {
    @Override
    public Document factoryMethod() {
        return new PDFDocument();
    }
}

// Аналогично для DOCXCreator и TXTCreator
```

Теперь, чтобы создать  документ, достаточно использовать `PDFCreator`:

```Java
DocumentCreator creator = new PDFCreator();
creator.createDocument();
```

#### Когда использовать Factory Method?

- **Создание объектов зависит от подклассов:** Когда нужно предоставить подклассам возможность выбирать, какой тип объекта создавать.
- **Инкапсуляция логики создания:** Когда нужно скрыть от клиента детали создания объектов.
- **Расширяемость:** Когда нужно легко добавлять новые типы объектов без изменения существующего кода.
### Abstract Factory Pattern 
---
Abstract Factory (Абстрактная фабрика) - это структурный паттерн проектирования, который инкапсулирует группу фабричных методов без указания конкретных классов продуктов. Он предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов, не привязываясь к их конкретным реализациям.

#### Суть паттерна Abstract Factory

Клиентский код взаимодействует с абстрактной фабрикой, получая нужные объекты через ее интерфейс. Это позволяет создавать различные конфигурации объектов, сохраняя при этом независимость от их конкретных классов.

Основная цель Abstract Factory - обеспечить создание объектов, принадлежащих одному семейству, и скрыть от клиента детали их реализации.

#### Структура Abstract Factory

- **AbstractFactory:** Интерфейс или абстрактный класс, декларирующий методы для создания абстрактных продуктов.
- **ConcreteFactory:** Конкретные классы, реализующие AbstractFactory и создающие конкретные продукты.
- **AbstractProduct:** Интерфейсы или абстрактные классы, определяющие типы продуктов (например, стул, стол).
- **ConcreteProduct:** Конкретные классы, реализующие AbstractProduct (например, классический стул, современный стол).

#### Пример: создание UI элементов

 нужно создавать UI элементы для разных операционных систем: Windows, macOS, Linux.

```Java
public interface Button {
    void paint();
}

public class WindowsButton implements Button {
    // ... реализация для Windows ...
}

public class MacButton implements Button {
    // ... реализация для macOS ...
}

public interface TextField {
    void display();
}

public class WindowsTextField implements TextField {
    // ... реализация для Windows ...
}

public class MacTextField implements TextField {
    // ... реализация для macOS ...
}

public interface UIFactory {
    Button createButton();
    TextField createTextField();
}

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public1 TextField createTextField() {
        return new WindowsTextField();2
    }
}

```

Теперь, чтобы создать UI элементы для Windows, достаточно использовать `WindowsUIFactory`:

```java
UIFactory factory = new WindowsUIFactory();
Button button = factory.createButton();
TextField textField = factory.createTextField();
```

#### Когда использовать Abstract Factory?

- **Семейства продуктов:** Когда нужно создавать семейства взаимосвязанных объектов.
- **Независимость от конкретных классов:** Когда клиентский код не должен зависеть от конкретных реализаций продуктов.
- **Согласованность продуктов:** Когда нужно гарантировать, что создаваемые объекты будут совместимы друг с другом.

## Разбор сервера

Основы работы локального сервера на Java
Локальный сервер, исполненный на Java, представляет собой программу, ожидающую входящие сетевые соединения от клиентов (например, веб-браузеров) на локальной машине. При установлении соединения сервер обрабатывает клиентский запрос и формирует соответствующий ответ.

### Ключевые принципы работы:

Сокеты: ServerSocket ожидает подключения на заданном порту. При подключении клиента создается Socket для обмена данными.
Потоки: Каждый клиентский запрос обрабатывается в отдельном потоке, обеспечивая параллельное обслуживание множества клиентов.
HTTP протокол: Сервер интерпретирует HTTP-запросы (GET, POST, PUT, DELETE) и генерирует HTTP-ответы.
Этапы создания локального сервера
Создание серверного сокета:

```Java
int port = 8080; // Номер порта
ServerSocket serverSocket = new ServerSocket(port);
```
Принятие подключения:

```Java
Socket clientSocket = serverSocket.accept(); // Ожидание подключения
```
Создание сокета для клиента:
serverSocket.accept() возвращает объект Socket, представляющий соединение с клиентом.

Обработка запроса:

```Java
BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

String requestLine = in.readLine(); // Чтение первой строки запроса
// ... (логика парсинга запроса и формирования ответа) ...

out.println("HTTP/1.1 200 OK"); // Отправка ответа
out.println("Content-Type: text/html");
out.println("\r\n"); 
out.println("<html><body><h1>Hello, World!</h1></body></html>");
```

Отправка ответа:
Сформированный HTTP-ответ отправляется клиенту через поток вывода.

Закрытие соединения:

```Java
in.close();
out.close();
clientSocket.close();
```

### скелет для простого сервера (базовый вывод)

```Java
import java.io.*;
import java.net.*;
import java.util.*;

public class EbaleiroServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            System.out.println("Server started localhost:1111");

            while (true) {
                try (Socket socket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                    System.out.println("Client connected");

                    String line;
                    boolean getRequestFound = false;
                    while ((line = in.readLine()) != null && !line.isEmpty()) { // Read until an empty line is encountered
                        System.out.println("Client: " + line);
                        if (line.startsWith("GET")) {
                            getRequestFound = true;
                        }
                    }

                    if (getRequestFound) {
                        out.println("HTTP/1.1 200 OK");
                        out.println("Content-Type: text/html");
                        out.println("");
                        out.println("<html><body><h1>Hello from server!</h1></body></html>");
                    } else {
                        System.out.println("No GET request found.");
                    }

                    System.out.println("Client disconnected");
                } catch (IOException e) {
                    System.err.println("Error handling client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }
}
```

вывод консоли

```bash
Server started localhost:1111
Client connected
Client: GET / HTTP/1.1
Client: Host: localhost:1111
Client: Connection: keep-alive
Client: Cache-Control: max-age=0
Client: sec-ch-ua: "Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24"
Client: sec-ch-ua-mobile: ?0
Client: sec-ch-ua-platform: "Windows"
Client: DNT: 1
Client: Upgrade-Insecure-Requests: 1
Client: User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36
Client: Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
Client: Sec-Fetch-Site: cross-site
Client: Sec-Fetch-Mode: navigate
Client: Sec-Fetch-User: ?1
Client: Sec-Fetch-Dest: document
Client: Accept-Encoding: gzip, deflate, br, zstd
Client: Accept-Language: en-US,en;q=0.9,ru;q=0.8
Client disconnected
Client connected
Client: GET /favicon.ico HTTP/1.1
Client: Host: localhost:1111
Client: Connection: keep-alive
Client: sec-ch-ua-platform: "Windows"
Client: User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36
Client: sec-ch-ua: "Google Chrome";v="131", "Chromium";v="131", "Not_A Brand";v="24"
Client: DNT: 1
Client: sec-ch-ua-mobile: ?0
Client: Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
Client: Sec-Fetch-Site: same-origin
Client: Sec-Fetch-Mode: no-cors
Client: Sec-Fetch-Dest: image
Client: Referer: http://localhost:1111/
Client: Accept-Encoding: gzip, deflate, br, zstd
Client: Accept-Language: en-US,en;q=0.9,ru;q=0.8
Client: Cookie: {cookie info}
```


### код из примера 15-ой практики

```java
import java.io.*;
import java.net.*;
import java.util.*;


public class NoteHttpServer {
    private static final int PORT = 8080;
    private static final List<String> notes = new ArrayList<>();
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT))
        {
            System.out.println("Note HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept())
                {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " +
                    e.getMessage());
        }
    }
    private static void handleClient(Socket clientSocket) throws
            IOException {
        BufferedReader in = new BufferedReader(new
                InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new
                PrintWriter(clientSocket.getOutputStream());
        String line = in.readLine();
        if (line == null) return;
        String[] requestParts = line.split(" ");

        if (requestParts.length < 3) {
            handleBadRequest(out);
            return;
        }
        String method = requestParts[0];
        String path = requestParts[1];
        out.flush();
        if (method.equals("GET") && path.equals("/notes")) {
            handleGetNotes(out);
        } else if (method.equals("POST") && path.startsWith("/addnote")) {
            String note = extractBody(in);
            handleAddNote(note, out);
        } else if (method.equals("POST") && path.startsWith("/deletenote")) {
            handleDeleteLastNote(out);
        } else {
            handleNotFound(out);
        }
        out.flush();
    }
    private static void handleGetNotes(PrintWriter out) {
        StringBuilder response = new StringBuilder();
        response.append("<html><body><h1>Notes</h1><ul>");
        for (String note : notes) {

            response.append("<li>").append(note).append("</li>");
        }
        response.append("</ul>");
        response.append("<form method='POST' action='/addnote'>")
                .append("<input type='text' name='note' placeholder='Add note' required>")
                .append("<button type='submit'>Add</button>")
                .append("</form>");
        response.append("<form method='POST' action='/deletenote'>")
                .append("<button type='submit'>Delete Last Note</button>")
                .append("</form>");
        response.append("</body></html>");
        sendHttpResponse(out, 200, response.toString());
    }
    private static void handleAddNote(String note, PrintWriter
            out) {
        if (note != null && !note.isEmpty()) {
            notes.add(note);
            sendHttpRedirect(out);
        } else {
            sendHttpResponse(out, 400, "<html><body><h1>Invalid note</h1><a href='/notes'>Back to Notes</a></body></html>");
        }
    }
    private static void handleDeleteLastNote(PrintWriter out) {
        if (!notes.isEmpty()) {
            notes.remove(notes.size() - 1);
            sendHttpRedirect(out);
        } else {
            sendHttpResponse(out, 400, "<html><body><h1>No notes to delete</h1><a href='/notes'>Back to Notes</a></body></html>");
        }
    }
    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404, "<html><body><h1>404 Not Found</h1><a href='/notes'>Back to Notes</a></body></html>");
    }
    private static String extractBody(BufferedReader in) throws
            IOException {
        StringBuilder body = new StringBuilder();
        String line;
        while (!(line = in.readLine()).isEmpty()) {
            // Считываем заголовки
        }
        while (in.ready() && (line = in.readLine()) != null) {
            body.append(line);
        }
        String bodyString = body.toString();
        String[] parts = bodyString.split("=");
        return parts.length > 1 ? parts[1].replace("+", " ") :
                null;
    }
    private static void sendHttpResponse(PrintWriter out, int
            statusCode, String body) {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
    }
    private static void sendHttpRedirect(PrintWriter out) {
        out.println("HTTP/1.1 302 Found");
        out.println("Location: " + "/notes");
        out.println("Content-Length: 0");
        out.println();
    }
    private static void handleBadRequest(PrintWriter out) {
        sendHttpResponse(out, 400, "<html><body><h1>400 Bad Request</h1></body></html>");
    }
}
```

### Функции

main: Точка входа в программу. Создает серверный сокет и запускает бесконечный цикл для обработки клиентских подключений.
handleClient: Обрабатывает клиентское подключение. Читает HTTP-запрос, определяет метод и путь запроса, и вызывает соответствующий обработчик.
handleGetNotes: Обрабатывает GET-запрос /notes. Возвращает HTML-страницу со списком заметок и формами для добавления и удаления заметок.
handleAddNote: Обрабатывает POST-запрос /addnote. Добавляет новую заметку в список и перенаправляет клиента на страницу /notes.
handleDeleteLastNote: Обрабатывает POST-запрос /deletenote. Удаляет последнюю заметку из списка и перенаправляет клиента на страницу /notes.
handleNotFound: Обрабатывает запросы, которые не соответствуют ни одному из обработчиков. Возвращает ошибку 404 Not Found.
extractBody: Извлекает тело POST-запроса.
sendHttpResponse: Отправляет HTTP-ответ клиенту.
sendHttpRedirect: Отправляет HTTP-перенаправление клиенту.
handleBadRequest: Отправляет ошибку 400 Bad Request.

1. Импорт необходимых классов

```Java
import java.io.*;
import java.net.*;
import java.util.*;
java.io.*: Этот пакет предоставляет классы для работы с вводом и выводом данных, такие как BufferedReader для чтения данных из потока и PrintWriter для записи данных в поток.
java.net.*: Этот пакет содержит классы для работы с сетью, включая ServerSocket для создания серверного сокета и Socket для работы с клиентскими сокетами.
java.util.*: Этот пакет предоставляет различные классы для работы с коллекциями, такие как ArrayList для хранения списка заметок.
```

2. Класс NoteHttpServer

```Java
public class NoteHttpServer {
    // ... код ...
}
```
Этот класс содержит всю логику HTTP-сервера.

3. Поля класса

```Java
private static final int PORT = 8080;
private static final List<String> notes = new ArrayList<>();
PORT: Константа, определяющая порт, на котором сервер будет прослушивать запросы (8080).
notes: Список для хранения заметок. ArrayList — это динамический массив, который может увеличиваться или уменьшаться по мере необходимости.
```

4. Метод main

```Java
public static void main(String[] args) {
    // ... код ...
}
```
Это точка входа в программу.
Создается объект ServerSocket, который прослушивает указанный порт (PORT).
Внутри бесконечного цикла (while (true)) сервер ожидает подключения клиента (serverSocket.accept()).
При подключении клиента создается объект Socket и вызывается метод handleClient для обработки запроса.
Блок try-catch используется для обработки возможных исключений IOException при работе с сетью.

5. Метод handleClient

```Java
private static void handleClient(Socket clientSocket) throws IOException {
    // ... код ...
}
```
Этот метод отвечает за обработку запроса от клиента.
Создаются объекты BufferedReader и PrintWriter для чтения данных от клиента и отправки ответа соответственно.
Читается первая строка запроса, которая содержит метод запроса (GET, POST), путь запроса и версию протокола HTTP.
Строка запроса разбивается на части, и на основе метода и пути запроса вызывается соответствующий обработчик: handleGetNotes, handleAddNote, handleDeleteLastNote или handleNotFound.

6. Обработчики запросов

handleGetNotes: Отправляет клиенту HTML-страницу со списком заметок, а также формы для добавления и удаления заметок.
handleAddNote: Добавляет новую заметку в список notes.
handleDeleteLastNote: Удаляет последнюю заметку из списка notes.
handleNotFound: Отправляет клиенту ошибку 404 Not Found, если запрос не соответствует ни одному из обработчиков.

7. Вспомогательные методы

extractBody: Извлекает тело POST-запроса, содержащее новую заметку.
sendHttpResponse: Формирует и отправляет HTTP-ответ клиенту, включая код состояния (200 OK, 400 Bad Request, 404 Not Found и т.д.), заголовки и тело ответа.
sendHttpRedirect: Отправляет клиенту HTTP-перенаправление (код состояния 302 Found) на страницу /notes.
handleBadRequest: Отправляет клиенту ошибку 400 Bad Request.

## important

Файл обновляется динамически. Все материалы, которые находятся в редакции - помечаются `work in progress`, и в скором времени они будут так же доступны по этой же ссылке в СДО. 

В случае обнаружения неточностей/замечаний/неоднозначности чтения материала прошу связаться для максимально оперативного устранения недочетов в telegram t.me/Its_Raaveinm
*редакция от 12.14.24*


## не смотрите сюда
Конечно, вот UML-диаграмма для предоставленного кода:

```
-----------------       -----------------
|     Main      |       |    MyStack    |
-----------------       -----------------
| + main(args)  |       | - ArryList   |
-----------------       -----------------
|               |<>-----|               |
-----------------       | + isEmpty()  |
                        | + getSize()   |
                        | + peek()     |
                        | + pop()      |
                        | + push(o)    |
                        -----------------
                              ^
                              |
                        -----------------
                        |    Stack     |
                        -----------------
                        | + ArryList   |
                        | + isEmpty()  |
                        | + getSize()   |
                        | + peek()     |
                        | + pop()      |
                        | + push(o)    |
                        -----------------
```

**Описание:**

*   **Main:**
	*   `main(args)`:  Точка входа в программу. Создает экземпляр `MyStack` и использует его для обработки ввода пользователя.
*   **MyStack:**
	*   `- ArryList`: Список `ArrayList` для хранения элементов стека.
	*   `+ isEmpty()`: Возвращает `true`, если стек пуст.
	*   `+ getSize()`: Возвращает количество элементов в стеке.
	*   `+ peek()`: Возвращает верхний элемент стека без его удаления.
	*   `+ pop()`: Возвращает и удаляет верхний элемент стека.
	*   `+ push(o)`: Добавляет элемент в стек.
*   **Stack:**
	*   Интерфейс, который определяет методы для работы со стеком.

**Связи:**

*   **Main  --  MyStack:**  Класс `Main` использует класс `MyStack`.
*   **MyStack  --  Stack:** Класс `MyStack` реализует интерфейс `Stack`.
### Task 13 V5
```java
public class Main{  
    public static void main(String[] args){  
        DVDPlayer DVD = new DVDPlayer();  
        TVScreen TV = new TVScreen();  
        Amplifier AMPLFR = new Amplifier();  
  
        HomeTheaterFacade HomeTheaterRa = new HomeTheaterFacade(DVD,TV,AMPLFR);  
        System.out.println();  
        HomeTheaterRa.SpotifyMode();  
        System.out.println();  
        HomeTheaterRa.NetflixMode();  
        System.out.println();  
        HomeTheaterRa.DVDMode();  
        System.out.println();  
        HomeTheaterRa.TurnOffEverything();  
    }  
}
```

```java
public class DVDPlayer {  
  
    protected void DVDon(){  
        System.out.println("DVD has been turned on");  
    }  
  
    protected void DVDoff(){  
        System.out.println("DVD has been turned off");  
    }  
  
    protected void DVDplay(){  
        System.out.println("Music is playing");  
    }  
  
    protected void DVDstop(){  
        System.out.println("Nothing is playing");  
    }  
}
```

```java
public class HomeTheaterFacade {  
    private DVDPlayer dvdPlayer;  
    private TVScreen tvScreen;  
    private Amplifier amplifier;  
  
    public HomeTheaterFacade(DVDPlayer DVD, TVScreen TV, Amplifier AMPLFR){  
        dvdPlayer = new DVDPlayer();  
        tvScreen = new TVScreen();  
        amplifier = new Amplifier();  
    }  
  
    public void SpotifyMode(){  
        System.out.println("Prepare to enjoy music");  
        amplifier.AmplifierOn();  
        amplifier.AmplifierVolume(6);  
        amplifier.SetAudioSchemeStereo(Source.OPTICAL);  
        tvScreen.TVScreenOn();  
        tvScreen.TVScreenLaunchApp(Apps.SPOTIFY);  
    }  
  
    public void NetflixMode(){  
        System.out.println("Prepare to enjoy movies");  
        amplifier.AmplifierOn();  
        amplifier.SetAudioSchemeStereo(Source.OPTICAL);  
        amplifier.AmplifierVolume(7);  
        amplifier.SetAudioScheme51();  
        tvScreen.TVScreenOn();  
        tvScreen.TVScreenLaunchApp(Apps.NETFLIX);  
    }  
  
    public void DVDMode(){  
        System.out.println("Prepare to enjoy movies");  
        amplifier.AmplifierOn();  
        amplifier.SetAudioSchemeStereo(Source.HDMI);  
        amplifier.AmplifierVolume(7);  
        amplifier.SetAudioScheme51();  
        tvScreen.TVScreenOn();  
        dvdPlayer.DVDon();  
        tvScreen.TVScreenLaunchApp(Apps.DVDPLAYER);  
        dvdPlayer.DVDplay();  
    }  
  
    public void TurnOnEverything(){  
        dvdPlayer.DVDon();  
        tvScreen.TVScreenOn();  
        amplifier.AmplifierOn();  
    }  
  
    public void TurnOffEverything(){  
        System.out.println("Turn off everything");  
        dvdPlayer.DVDstop();  
        dvdPlayer.DVDoff();  
        tvScreen.TVScreenOff();  
        amplifier.AmplifierVolume(0);  
        amplifier.AmplifierOff();  
    }  
}
```

```java
public enum Apps   
{  
    SPOTIFY,YOUTUBE,NETFLIX,DVDPLAYER;  
}
```

```java
public class Amplifier {  
    private int volume;  
    public Source source;  
  
  
    protected void AmplifierOn(){  
        System.out.println("Amplifier has been turned on");  
    }  
  
    protected void AmplifierOff(){  
        System.out.println("Amplifier has been turned off");  
    }  
  
    protected void AmplifierVolume(int volume){  
        System.out.println("Volume set to level"+volume);  
    }  
  
    protected void SetAudioScheme51(){  
        System.out.println("Audio Scheme has been set to 5.1");  
    }  
    protected void SetAudioSchemeStereo(Source source){  
        System.out.println("Audio Scheme has been set to Stereo");  
    }  
}
```

```java
public enum Source 
{  
    USB, HDMI, BLUETOOTH, OPTICAL  
}
```

```java
public class TVScreen {  
    public Apps app;  
  
    protected void TVScreenOn(){  
        System.out.println("TVScreen has been turned on");  
    }  
  
    protected void TVScreenOff(){  
        System.out.println("TVScreen has been turned off");  
    }  
  
    protected void TVScreenLaunchApp(Apps app){  
        this.app = app;  
    }  
}
```

### Task 14 V5
```java
class TextEditorMemento {
    private String text;

    public TextEditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void addText(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(text);
    }

    public void restore(TextEditorMemento memento) {
        this.text = memento.getText();
    }
}

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addText("Привет, ");
        editor.addText("мир!");
        System.out.println("Текущий текст: " + editor.getText());
        
        TextEditorMemento memento = editor.save();

        editor.addText(" До свидания!");
        System.out.println("Текущий текст: " + editor.getText()); 
        
        editor.restore(memento);
        System.out.println("Текущий текст: " + editor.getText());
    }
}
```
