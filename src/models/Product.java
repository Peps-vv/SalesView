package models;
import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {
    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    final double TaxRate_5Percent= 0.05;
    // Налоговоу ставку объявите в виде константы
    // здесь ...

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...
    public String getName() {

        return this.name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public int getQuantity() {

        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return this.price;
    }
        public void setPrice(double price) {
        this.price = price;
        }

    // Переопределите методы реализуемых интерфейсов.
    public double getIncome(int quantity,double price){
       return quantity*price;

    }
    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

    public double getFiscal(int quantity,double price){
        return quantity*price*TaxRate_5Percent;

    }
    // Расчёт суммы налога с продаж.
    // здесь ...

    public double getProfit(int quantity,double price){

        return ((quantity*price)-(quantity*price*TaxRate_5Percent));
    }
    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...

}