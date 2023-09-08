/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

/**
 *
 * @author MINH TUAN
 */
public class SearchProgramming extends Menu<String> {

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};
    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;
    protected int[] sort;

    public SearchProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        sort = element.sort();
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("Mang cac so ngau nhien (da duoc sap xep):");
                library.display(array);
                linearSearch();
                break;
            case 2:
                System.out.println("Mang ngau nhien (da duoc sap xep):");
                library.display(array);
                binarySearch();
                break;
            case 3:
                System.out.println("___<3___Thank you___<3___");
                System.exit(0);
        }
    }

    public void linearSearch() {
        int value = library.getInt("\nEnter number to find", 0, 100);
        if (algorithm.linearSearch(array, value) != -1) {
            System.out.println("Linear Search: Phan tu " + value + " duoc tim thay tai vi tri " + algorithm.linearSearch(array, value));
        } else {
            System.out.println("Linear Search: Phan tu " + value + " khong ton tai trong mang");
        }

    }

    public void binarySearch() {
        int value = library.getInt("\nEnter number to find", 0, 100);
        if (algorithm.binarySearch(array, value) != -1) {
            System.out.println("Binary Search: Phan tu " + value + " duoc tim thay tai vi tri " + algorithm.binarySearch(array, value));
        } else {
            System.out.println("Binary Search: Phan tu " + value + " khong ton tai trong mang");
        }

    }

}
