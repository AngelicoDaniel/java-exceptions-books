package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti libri? ");
        int nBooks = Integer.parseInt(scanner.nextLine());

        Book[] books = new Book[nBooks];
        // aggiungo libri all'array
        for (int i = 0; i < nBooks; i++) {
            boolean validBook = false;
            do {
                try {
                    // chiedo il titolo
                    System.out.println("Titolo: ");
                    String title = scanner.nextLine();

                    // chiedo il numero delle pagine
                    System.out.println("Numero pagine: ");
                    int numPages = Integer.parseInt(scanner.nextLine());

                    // chiedo l'autore
                    System.out.println("Autore: ");
                    String author = scanner.nextLine();

                    // chiedo l'editore
                    System.out.println("Editore: ");
                    String publisher = scanner.nextLine();

                    books[i] = new Book(title, numPages, author, publisher);
                    validBook = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Errore: " + e.getMessage());
                }
            } while (!validBook);
        }
        // stampo l'array
        System.out.println(Arrays.toString(books));
        scanner.close();
    }
}
