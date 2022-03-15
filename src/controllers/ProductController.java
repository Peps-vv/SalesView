package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        String name = model.getName();
        double income = model.getIncome(model.getQuantity(),model.getPrice());
       String incomeRounded = Rounder.roundValue(income);
        double fiscal = this.model.getFiscal(model.getQuantity(),model.getPrice());
        String fiscalRounded = Rounder.roundValue(fiscal);
        double profit = this.model.getProfit(model.getQuantity(),model.getPrice());
        String profitRounded = Rounder.roundValue(profit);
        String output = "Наименование товара: " + name + "\nОбщий доход (грн.): " + incomeRounded + "\nСумма налога (грн.): " + fiscalRounded + "\nЧистый доход (грн.): " + profitRounded;
       // String output = "Наименование товара: " + name + "\nОбщий доход (грн.): " + model.income + "\nСумма налога (грн.): " + model.fiscal + "\nЧистый доход (грн.): " + model.profit;
        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

       // String output = "[здесь должен быть вывод по формату]";

        view.getOutput(output);
    }
}
