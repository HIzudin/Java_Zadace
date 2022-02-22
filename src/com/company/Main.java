package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite pet brojeva od 5 do 10.");
        int prvi_broj = scanner.nextInt();
        int drugi_broj = scanner.nextInt();
        scanner.nextLine();
        int treci_broj = scanner.nextInt();
        int cetvrti_broj = scanner.nextInt();
        scanner.nextLine();
        int peti_broj = scanner.nextInt();
        // provjera unosa brojeva i ponovni unos u slucaju greske


            if (prvi_broj > 10 || drugi_broj > 10 || treci_broj > 10 || cetvrti_broj > 10 || peti_broj > 10) {
                System.out.println("Unijeli ste broj veci od 10. Ponovite unos.");
                prvi_broj = scanner.nextInt();
                drugi_broj = scanner.nextInt();
                scanner.nextLine();
                treci_broj = scanner.nextInt();
                cetvrti_broj = scanner.nextInt();
                scanner.nextLine();
                peti_broj = scanner.nextInt();
                int Suma = (prvi_broj + drugi_broj + treci_broj + cetvrti_broj + peti_broj);
                double Prosjek = (double) Suma / 5;

            if (Prosjek <= 5) {
                System.out.println("Vas prosjek je: " + Prosjek + " Niste polozili. Potrudite se vise.");
            } else if (Prosjek >= 6 && Prosjek < 7) {
                System.out.println("Vas prosjek je: " + Prosjek + ".Polozili ste, ali mozete i bolje.");
            } else if (Prosjek >= 7 && Prosjek < 8) {
                System.out.println("Vas prosjek je: " + Prosjek + ".Polozili ste!");
            } else if (Prosjek >= 8 && Prosjek < 9) {
                System.out.println("Vas prosjek je: " + Prosjek + ".Polozili ste! Vas trud se vidi!");
            } else if (Prosjek >= 9 && Prosjek < 10) {
                System.out.println("Vas prosjek je: " + Prosjek + ".Polozili ste! Zadovoljan sam vasim napretkom!");
            } else if (Prosjek == 10) {
                System.out.println("Vas prosjek je: " + Prosjek + ".Polozili ste! Vas trud je odusevljavajuci!");
            }
        }
            //nastavak programa za prvobitni unos bez greske
            else {
                int suma = (prvi_broj + drugi_broj + treci_broj + cetvrti_broj + peti_broj);
                double prosjek =(double) suma /5;
                if (prosjek <= 5) {
                    System.out.println("Vas prosjek je: " + prosjek + " Niste polozili. Potrudite se vise.");
                } else if (prosjek >= 6 && prosjek < 7) {
                    System.out.println("Vas prosjek je: " + prosjek + ".Polozili ste, ali mozete i bolje.");
                } else if (prosjek >= 7 && prosjek < 8) {
                    System.out.println("Vas prosjek je: " + prosjek + ".Polozili ste!");
                } else if (prosjek >= 8 && prosjek < 9) {
                    System.out.println("Vas prosjek je: " + prosjek + ".Polozili ste! Vas trud se vidi!");
                } else if (prosjek >= 9 && prosjek < 10) {
                    System.out.println("Vas prosjek je: " + prosjek + ".Polozili ste! Zadovoljan sam vasim napretkom!");
                } else if (prosjek == 10) {
                    System.out.println("Vas prosjek je: " + prosjek + ".Polozili ste! Vas trud je odusevljavajuci!");
                } }
                scanner.nextLine();
                System.out.println("Koja Vam je boja draza? Plava ili Crvena? ");
                String izbor_boje= scanner.next();;
                String prvo_slovo=String.valueOf(izbor_boje.charAt(0));
                String izbor= prvo_slovo.equals("P")|| prvo_slovo.equals("p") ? "Izabrali ste plavu": "Izabrali ste crvenu";
                System.out.println(izbor);






            }
        }






