import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// H3 Operator


        int getal1 = 120;
        int getal2 = 20;
        int getal3 = 520;
        int getal4 = 220;
        int resultaat = getal1 + getal2 + getal3 + getal4;
        System.out.println(resultaat);

        int getal5 = 8;
        int getal6 = 9;
        int resultaat2 = getal5 * getal6;
        System.out.println(resultaat2);

        int getal7 = 99383;
        int getal8 = 884848;
        int resultaat3 = getal7 + getal8;
        System.out.println(resultaat3);

        int getal9 = 11;
        int getal10 = 1;
        int resultaat4 = getal9 + getal10;
        System.out.println(resultaat4);

        int getal11 = 5595;
        int getal12 = 998;
        int resultaat5 = getal11 / getal12;
        System.out.println(resultaat5);

        int getal13 = 2999;
        int getal14 = 42;
        int resultaat6 = getal13 * getal14;
        System.out.println(resultaat6);

        int getal15 = 12;
        int getal16 = 66;
        int resultaat7 = getal15 - getal16;
        System.out.println(resultaat7);

// h4 Statements


        int getal17 = 100;
        int getal18 = 10;
        if (getal17 < getal18) {
            System.out.println("getal17 is lager of gelijk aan 10");
        } else {
            System.out.println("foutmelding getal 17 is groter dan 10");
        }

// opdr 14 H4

        double cijfer1 = 5.3;
        double cijfer2 = 5.5;

        if (cijfer1 <= cijfer2) {
            System.out.println("cijfer 1 is onvoldoende");
        } else {
            System.out.println("cijfer 1 is voldoende");
        }
        //opdr 15 h4
        double cijfer3 = 7.0;
        double cijfer4 = 5.5;

        if (cijfer3 <= cijfer4) {
            System.out.println("je hebt een onvoldoende gescoord");
        } else {
            System.out.println("je hebt een voldoende 7.0");
        }

// H5 Lussen

        //Opdr 16
        for (int i = 1; i < 6; i++) {
            System.out.println("waarde " + i);
        }
        //opdr 17
        for (int i = 10; i < 15; i++) {
            System.out.println("waarde2 " + i);

            while (i < 15) {
                i++;
                System.out.println("waarde2 " + i);
            }
        }
        //opdr 18
        for (int i = 28; i > 37; i++) {
            System.out.println("3waarde " + i);
        }
        // opdr 19
        for (int i = 19; i < 33; i = i + 2) {
            System.out.println("4waarde4 " + i);
        }
        // opdr 20
        for (int i = -2039; i < 4192; i = i + 150) {
            System.out.println("5.waarde " + i);
        }
        //H6 invoer vanaf het toetsenbord

        // opdr 21, 22 & 23
        Scanner scanner = new Scanner(System.in);
        System.out.print("geef je naam op: ");
        String Naam = scanner.nextLine();
        System.out.print("hallo" + Naam );

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("type je leeftijd: ");
        int Leeftijd = scanner2.nextInt();
        System.out.print("topper: ");
        for (int i = 0; i <Leeftijd; i++)
            System.out.println(Naam);


    }
}