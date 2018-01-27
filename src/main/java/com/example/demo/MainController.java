package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")
    public void waterGallons() {

        double cubicInchesGallon = 231;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of roof");
        double lengthOfRoof = scan.nextDouble();

        System.out.println("Enter breadth of roof");
        double breadthOfRoof = scan.nextDouble();

        System.out.println("Enter rainfall in inches");
        double rainfall = scan.nextDouble();

        double lengthInches = lengthOfRoof * 12;
        double breadthInches = breadthOfRoof * 12;

        double waterCuInches = lengthInches * breadthInches * rainfall;
        double gallonsOfWater = waterCuInches / cubicInchesGallon;

        System.out.println("Water drained" + gallonsOfWater);


    }

   /* @RequestMapping("/new")
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            } else if (i % 5 == 0)
            {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }

        }
    }*/
}