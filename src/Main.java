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
    }
}