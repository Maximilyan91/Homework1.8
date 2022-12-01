public class Main {
    public static void main(String[] args) {
        var weightFighter1 = 78.2;
        var weightFighter2 = 82.7;
        var totalWeight = weightFighter1 + weightFighter2;
        System.out.println("Общий вес двух бойцов: " + totalWeight + "кг!");

        var differenceWeight = weightFighter2 - weightFighter1;
        System.out.println("Разница веса двух бойцов: " + differenceWeight + "кг!");
        var differenceWeight2 = weightFighter2 % weightFighter1;
        System.out.println("Разница веса двух бойцов: " + differenceWeight2 + "кг!");


        var totalWorkHours = 640;
        var workingHours = 8;
        var numberOfStaff = totalWorkHours / workingHours;
        System.out.println("Всего работников в компании - " + numberOfStaff + " человек");

        var numberOfStaff2 = numberOfStaff + 94;
        var totalWorkHours2 = numberOfStaff2 * 8;
        System.out.println("Если в компании работает " + numberOfStaff2 + " человек(а), то всего " + totalWorkHours2 + " часов работы может быть поделено между сотрудниками");


    }
}