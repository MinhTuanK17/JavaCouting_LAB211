/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Validation;

/**
 * @author MINH TUAN
 *
 */
public class Main {

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        String name = Validation.getString("Enter your content: ");
        System.out.println();
        algorithm.countLetter(name);
        name = name.replaceAll("\\s+", "");
        algorithm.countCharater(name);
    }
}
