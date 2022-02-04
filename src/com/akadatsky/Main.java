package com.akadatsky;

public class Main {

    public static void main(String[] args) {
        fruitsShop();
    }

    private static void fruitsShop() {
//    1) Завершить задачу с фруктами что мы начали в классе ( https://github.com/akadatsky/Fruits2701 ):
//       добавить все 4 фрукта, округлить до сотых стоимость каждого фрукта (в методе printBill())
//       Lemon: 24.90, 198г
//       Banana: 31.30, 198г (again 198)
//       RedApple: 14.90, 228г
//       GreenApple: 23.90, 232г
//    2*)
//       сделать форк репозитория https://github.com/akadatsky/Fruits2701
//       клонировать его себе из вашего форка
//       завершить (задаче 1)
//       сделать git push в свой форк
//       послать pull реквест к моему оригинальному репозиторию.
        Fruit lemon = new Fruit(Fruit.FruitType.LEMON, Fruit.Color.YELLOW, 24.90, 198);
        Fruit banana = new Fruit(Fruit.FruitType.BANANA, Fruit.Color.YELLOW, 31.3, 198);
        Fruit redApple = new Fruit(Fruit.FruitType.APPLE, Fruit.Color.RED, 14.9, 228);
        Fruit greenApple = new Fruit(Fruit.FruitType.APPLE, Fruit.Color.GREEN, 23.9, 232);

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(lemon);
        cashMachine.add(banana);
        cashMachine.add(redApple);
        cashMachine.add(greenApple);
        cashMachine.printBill();
    }
}