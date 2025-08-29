import java.util.Scanner;

public class ccjava {

    public static float fuelEfficency(int fuel, int km) {
        float eff = km / fuel;
        return eff;

    }

    public static void resto() {
        int total = 0;
        String name;
        System.out.println("----------------Menu----------------");
        System.out.println(" 1. Add items  \n 2. Total \n 3. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        int cost;

        while (choice != 3) {
            System.out.println("Enter the name of Dish : ");
            name = sc.nextLine();
            System.out.println("enter the cost :");
            cost = sc.nextInt();
            total += cost;
             System.out.println(" 1. Add items  \n 2. Total \n 3. Exit");
            System.out.println("enter the Choice :");
            choice = sc.nextInt();
            if (choice == 2) {
                System.out.println("The total price is : " + total);
            }
        }

    }

    

    public static void area(int r){
        double area = 3.14 * r * r;
        System.out.println("The area is : " + area);
    }

    public static void main(String[] args) {

        // int num ;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter the number : ");
        // num = sc.nextInt();

        // if(num == 0 || num == 1){
        // System.out.println("Number 0 and 1 are not prime numbers");
        // }

        // for(int i = 2; i < num ;i++){
        // if(num % i == 0){
        // System.out.println("Number is not prime numbver");
        // break;
        // }else{
        // System.out.println("Number is prime!!");
        // }
        // }

        // sc.close();

        // System.out.println("Enter the fuel used");
        // int fuel = sc.nextInt();
        // System.out.println("Enter the Km Driven :");
        // int km = sc.nextInt();
        // System.err.println("The fuel Efficeincy is " + fuelEfficency(fuel, km) +"
        // km/l of fuel");

        area(4);

    }
}
