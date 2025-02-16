package main;

import java.util.ArrayList;
import main.instruments.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Instrument> instruments = new ArrayList<Instrument>();
        Scanner sc = new Scanner(System.in);
        
        int choice;
        boolean exit = false;

        
        while (!exit) {
            System.out.println("1) Lisää soitin\n2) Listaa soittimet\n3) Viritä kielisoittimet\n4) Soita rumpuja\n0) Lopeta ohjelma");
            choice = Integer.valueOf(sc.nextLine());

            switch(choice) {
                case 1:
                    int instrumentChoice;
                    System.out.println("Minkä soittimen haluat lisätä? 1) Kitara, 2) Viulu, 3) Rummut");
                    instrumentChoice = Integer.valueOf(sc.nextLine());
                    System.out.println("Anna valmistajan nimi: ");
                    String manufacturer = sc.nextLine();
                    System.out.println("Anna hinta euroina: ");
                    int price = Integer.valueOf(sc.nextLine());
                    if (instrumentChoice == 1) {
                        instruments.add(new Guitar(manufacturer, price));
                    }
                    else if (instrumentChoice == 2) {
                        instruments.add(new Violin(manufacturer, price));
                    }
                    else if(instrumentChoice == 3) {
                        instruments.add(new Drum(manufacturer, price));
                    }

                    System.out.println("Soitin lisätty listaan!");

                    break;

                case 2:
                    for(Instrument i: instruments) {
                        System.out.println(i.getDetails());
                    }
                    break;

                case 3:
                    for(Instrument i: instruments) {
                        if (i instanceof StringInstrument) {
                            ((StringInstrument)i).tune();
                        }
                    }
                    break;

                case 4:
                    for(Instrument i: instruments) {
                        if (i instanceof Drum) {
                            ((Drum)i).playBeat();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä!");
                    exit = true;
            }
        } sc.close();
    } 
}
