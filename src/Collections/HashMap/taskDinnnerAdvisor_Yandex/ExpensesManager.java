package Collections.HashMap.taskDinnnerAdvisor_Yandex;

import java.util.ArrayList; // импортируйте ArrayList
import java.util.HashMap;


public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories; // замените на таблицу с именем expensesByCategories

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // создайте таблицу
    }

    // добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, String category, double expense) {
        if (category == null) {
            return moneyBeforeSalary;
        }

        moneyBeforeSalary = moneyBeforeSalary - expense;
        if (expensesByCategories.containsKey(category)) { // проверьте наличие категории
            ArrayList<Double> categoryList = expensesByCategories.get(category); // получите список трат в этой категории
            categoryList.add(expense); // добавьте трату
        } else {
            ArrayList<Double> newExpensesList = new ArrayList<>() {{
                add(expense);
            }}; // создайте новый список трат и добавьте в него сумму
            expensesByCategories.put(category, newExpensesList); // сохраните категорию и новый список трат в хеш-таблицу
        }
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }


    void printAllExpensesByCategories() {
        // замените логику для работы с таблицами
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            for (Double expense : expensesByCategories.get(category)) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                maxExpense = Double.max(maxExpense, expense);
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }


    void removeAllExpenses() {
        expensesByCategories.clear(); // таблица называется иначе
        System.out.println("Траты удалены.");
    }


    public double getExpensesSum() {
        double sum = 0.0;
        for (String category : expensesByCategories.keySet()) {
            for (Double expense : expensesByCategories.get(category)) {
                sum += expense;
            }
        }
        return sum;
    }


    public void removeCategory(String category) {
        if (category == null) {
            return;
        }
        if (expensesByCategories.containsKey(category)) {
            expensesByCategories.remove(category);
        }
        System.out.println("Выбранная категория успешно удалена!");
    }


    public String getMaxCategoryName() {
        String maxCategoryName = "";
        double maxCategorySum = 0.0;
        for (String category : expensesByCategories.keySet()) {
            double sum = 0.0;
            for (Double expense : expensesByCategories.get(category)) {
                sum += expense;
            }
            if (sum > maxCategorySum){
                maxCategoryName = category;
                maxCategorySum = sum;
            }
        }

        return maxCategoryName;
    }

}