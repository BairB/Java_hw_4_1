public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(10000);
        System.out.println("Вам начислено: " + miles + " миль");

        int miles2 = service.calculate(345);
        System.out.println("Вам начислено: " + miles2 + " миль");
    }
}
