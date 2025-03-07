import tasks.*;

public class Main {
    public static void main(String[] args) {
        goods();
        arrayOfGoods();
        saveAttractionsInfo();
    }

    // Задание №1
    public static void goods() {
        new Product("Iphone 16", "01.01.2025", "Apple", "USA", 900, true).printInfo();
    }

    //Задание №2
    public static void arrayOfGoods() {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Iphone 16", "01.01.2025", "Apple", "USA", 900, true);
        productsArray[1] = new Product("Iphone 15", "01.01.2024", "Apple", "USA", 800, true);
        productsArray[2] = new Product("Iphone 14", "01.01.2023", "Apple", "USA", 700, true);
        productsArray[3] = new Product("Iphone 13", "01.01.2022", "Apple", "USA", 600, true);
        productsArray[4] = new Product("Iphone 12", "01.01.2021", "Apple", "USA", 400, true);

        for (Product i : productsArray) {
            if (i != null) {
                i.printInfo();
            }
        }
    }

    //Задание №3
    public static void saveAttractionsInfo() {
        Park gorkyPark = new Park("Парк Горького");
        gorkyPark.attractionAdd("Колесо обозрения", "с 10:00 до 20:00", 11.5);
        // метод для вывода информации в консоль
        //gorkyPark.printAttraction();
    }
}

