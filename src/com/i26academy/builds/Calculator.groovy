//The below line indicates that we are declaring package for builds folder, whenever we use the methods from builds package we have to import this package
package com.i26academy.builds;

//Defining a class
class Calculator(){
    //declaring a variable (We use this variable for builds deployment)
    def jenkins
    //constructor(it will take reference for calling jenkins,running scripts it will take reference of jenkins variable)
    //jenkins variable will hold jenkins reference here
    Calculator(jenkins){

    }
    def add(firstNumber, secondNumber) {
        //logical code base here
        return firstNumber + secondNumber
    }
    def multiply(firstNumber, secondNumber) {
        //logical code base here
        return firstNumber * secondNumber
    }

}


