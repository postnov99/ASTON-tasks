package tasks;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean buyerBookingStatus;

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, int price, boolean buyerBookingStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.buyerBookingStatus = buyerBookingStatus;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна произвоства: " + countryOfOrigin);
        System.out.println("Цена: " + price + "$");
        System.out.println("Состояние бронирования:" + (buyerBookingStatus ? "Забронирован" : "Доступен к заказу"));
    }

    public String info() {
        return "Название:" + name + "," + "Дата производства:" + productionDate + "," + "Производитель:" + manufacturer + "," + "Страна происхождения:" + countryOfOrigin + "," + "Цена:" + price + "$" + "," + "Состояние бронирования:" + (buyerBookingStatus ? "Забронирован" : "Доступен к заказу");
    }
}


