public class App{
    public static void main(String[] args) {
        // Display the table header
        System.out.println("Miles\tKilometers");
        System.out.println("--------------------");

        // Display the conversion table for miles 1 to 10
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%d\t%.3f%n", miles, kilometers);
        }
    }
}   