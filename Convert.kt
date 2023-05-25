/*
   Name: Ademola Tikare
   Student Number: A00276024
   Description: This is a conversion program that does a two way -  unit measurement conversion.
   Allowed Conversion Units: mi,km,in,cm,lb,kg,oz,g,cups,L,yards,ft.
 */

import java.util.Scanner

enum class MeasurementType(val conversionConstant: Double, val conversionUnit: String) {
    KM(0.62, "mi"),
    MI(1.61, "km"),
    CM(0.39, "in"),
    IN(2.54, "cm"),
    KG(2.2, "lb"),
    LB(0.45, "kg"),
    G(0.04, "oz"),
    OZ(28.35, "g"),
    L(4.17, "cups"),
    CUPS(0.24, "L"),
    FT(0.33, "yards"),
    YARDS(0.9144, "ft")
}

fun stringToMeasurementType(name: String): MeasurementType = MeasurementType.valueOf(name.uppercase())

fun main() {
    try {
        // Getting input from the user
        val input = Scanner(System.`in`)

        println("Enter a measurement number: ")
        val numberInput = input.nextDouble()
        input.nextLine()

        println("Enter the current measurement unit: ")
        val unitInput = input.nextLine()

        // Get measuremnt config from user input
        val measurementType = stringToMeasurementType(unitInput)

        // Calculate Conversion
        val numericValue = numberInput * measurementType.conversionConstant

        // Show result
        println("Result: $numericValue${measurementType.conversionUnit}")
    } catch (e: Exception) {
        println("Error: Invalid input, kindly try again")
    }
}
