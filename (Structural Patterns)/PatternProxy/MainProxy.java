package PatternProxy;

public class MainProxy {
    public static void main (String[] args){
        ImageProxyInterface imageProxyInterface = new ProxyImage("Image.jpg");
        imageProxyInterface.display();
        imageProxyInterface.display();
    }
}

/*
    Proxy – Задание
Создать систему для загрузки изображений с использованием прокси.
Изображение должно загружаться только тогда, когда оно необходимо для отображения.
    Требования:
Реализовать интерфейс Image с методом display(). Создать классы для реального изображения и прокси-изображения.
Проверить, что изображение загружается только при первом вызове метода display().
*/