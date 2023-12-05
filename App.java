public class App{
    public static void main(String[] args) {
        System.out.println("Miles" + "\t\t" + "Kilometers");
        System.out.println("----------------------------");
        for (int miles=1;miles<=10;miles++) {
            double kilometers = miles*1.609;
            System.out.println(miles + "mi." + "\t\t" + kilometers + "km.");
        }
    }
}
