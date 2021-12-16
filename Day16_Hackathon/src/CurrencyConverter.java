//    Make a console based currency converter application with suppport for atleast 5 currencies.
//        Requirements:
//        1. Must be a menu driven program.
//        2. All currencies to be displayed correct upto 2 decimal places.
//        3. Each interaction of the user with the program must be logged in a log.txt file
//        `log.txt` example contents -
//        Program started.
//        User selected INR
//        User selected USD
//        User entered amount 1400
//        Program stopped.
//        4. Add exception handling for when user enters invalid amount or chooses invalid option

import java.io.*;
import java.util.Scanner;

class Application {
    public static void main(String[] args) throws IOException {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        File file = new File("log.txt");
//        file.createNewFile();
//        FileReader reader = new FileReader(file);

        FileWriter writer = new FileWriter(file, true);
        BufferedWriter Writefile = new BufferedWriter(writer);
        Scanner sc = new Scanner(System.in);

        double amountAfterConversion;
        int a;
        Writefile.write(("Program Started \n"));
        do {
            System.out.println("Enter a Choice");
            System.out.println("1) Dollar to Rupees Conversion");
            System.out.println("2) Rupees to Dollar Conversion");
            System.out.println("3) Pound to Rupees Conversion");
            System.out.println("4) Rupees to Pound Conversion");
            System.out.println("5) CanadianDollar to Rupees Conversion");
            System.out.println("6) Rupees to CanadianDollar Conversion");
            System.out.println("7) Euro to Rupees Conversion");
            System.out.println("8) Rupees to Euro Conversion");
            System.out.println("9) AustralianDollar to Rupees Conversion");
            System.out.println("10) Rupees to AustralianDollar Conversion");


            int select_choice = sc.nextInt();
            double amount;

            try {
                if (select_choice <= 0 || select_choice > 10)

                    throw new IllegalArgumentException("Your choice is invalid");


                if (select_choice == 1 || select_choice == 2) {
                    Writefile.write("User selected INR \n");

                } else if (select_choice == 3 || select_choice == 4) {
                    Writefile.write("User selected Pound \n");
                } else if (select_choice == 5 || select_choice == 6) {
                    Writefile.write("User selected CanadianDollar \n");
                } else if (select_choice == 7 || select_choice == 8) {
                    Writefile.write("User selected Euro \n");
                } else if (select_choice == 9 || select_choice == 10) {
                    Writefile.write("User selected AustralianDollar\n");
                } else {
                    System.out.println("Invalid");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("The choice cannot be invalid");

            }


            switch (select_choice) {

                case 1:
                    System.out.println("Dollar to Rupees Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.dollarsToRupees(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 2:
                    System.out.println("Rupees to Dollar Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.rupeesToDollars(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 3:
                    System.out.println("Pound to Rupees Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.poundToRupees(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 4:
                    System.out.println("Rupees to Pound Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.rupeesToPound(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 5:
                    System.out.println("CanadianDollar to Rupees Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.canadianDollarToRupees(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 6:
                    System.out.println("Rupees to CanadianDollar Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.rupeesToCanadianDollar(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 7:
                    System.out.println("Euro to Rupees Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.euroToRupees(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 8:
                    System.out.println("Rupees to Euro Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.rupeesToEuro(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 9:
                    System.out.println("AustralianDollar to Rupees Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.australianDollarToRupees(amount));
                    System.out.println(amountAfterConversion);
                    break;
                case 10:
                    System.out.println("Rupees to AustralianDollar Conversion");
                    System.out.println("Enter the amount you wish to convert");
                    amount = sc.nextDouble();
                    Writefile.write("User entered  " + amount + "\n");
                    amountAfterConversion = currencyConverter.round(currencyConverter.rupeesToAustralianDollar(amount));
                    System.out.println(amountAfterConversion);
                    break;

                default:
                    System.out.println("Enter A valid Conversion");

            }

            System.out.println("Do you wish to continue(yes/no)? Press 1 for continue and 0 for exit");
            a = sc.nextInt();

        } while (a == 1);
        Writefile.write(("Program Stopped \n"));
        Writefile.close();


    }

}

public class CurrencyConverter {
    private final double DOLLARTORUPEES = 76.08;
    private final double POUNDTORUPEES = 100.70;
    private final double CANADIANDOLLARTORUPEES = 59.22;
    private final double EUROTORUPEES = 85.71;
    private final double AUSTRALIANDOLLARTORUPEES = 74.85;


    public double dollarsToRupees(double dollars) {
        return dollars * DOLLARTORUPEES;
    }

    public double rupeesToDollars(double rupees) {
        return rupees / DOLLARTORUPEES;
    }

    public double poundToRupees(double pound) {
        return pound * POUNDTORUPEES;
    }

    public double rupeesToPound(double rupees) {
        return rupees / POUNDTORUPEES;
    }

    public double canadianDollarToRupees(double canadianDollar) {
        return canadianDollar * CANADIANDOLLARTORUPEES;
    }

    public double rupeesToCanadianDollar(double rupees) {
        return rupees / CANADIANDOLLARTORUPEES;
    }

    public double euroToRupees(double euro) {
        return euro * EUROTORUPEES;
    }

    public double rupeesToEuro(double rupees) {
        return rupees / EUROTORUPEES;
    }

    public double australianDollarToRupees(double australianDollar) {
        return australianDollar * AUSTRALIANDOLLARTORUPEES;
    }

    public double rupeesToAustralianDollar(double rupees) {
        return rupees / AUSTRALIANDOLLARTORUPEES;
    }

    public double round(double value) {
        return (double) Math.round(value * 100) / 100;
    }


}




