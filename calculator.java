class calculator{
    // The `float addition(float operand_1,float operand_2)` method is a function that takes two float
    // numbers as input (operand_1 and operand_2) and returns their sum. It performs the addition
    // operation by adding operand_1 and operand_2 together and returning the result.
    float addition(float operand_1,float operand_2){
        return(operand_1 + operand_2);
    }

// The `float substraction(float operand_1,float operand_2)` method is a function that takes two float
// numbers as input (operand_1 and operand_2) and returns their difference. It performs the subtraction
// operation by subtracting operand_2 from operand_1 and returning the result.
float substraction(float operand_1,float operand_2){
    return(operand_1 - operand_2);
}
// The `float multiplication(float operand_1,float operand_2)` method is a function that takes two
// float numbers as input (operand_1 and operand_2) and returns their product. It performs the
// multiplication operation by multiplying operand_1 and operand_2 together and returning the result.
float multiplication(float operand_1,float operand_2){
    return(operand_1 * operand_2);
}
// The `float division(float operand_1,float operand_2)` method is a function that takes two float
// numbers as input (operand_1 and operand_2) and returns their division result. It performs the
// division operation by dividing operand_1 by operand_2 and returning the result.
float division(float operand_1,float operand_2){
    return(operand_1 / operand_2);
}
// The code you provided is the main method of the calculator class. The main method is the entry point
// of a Java program. It is where the program starts executing.
public static void main(string[] args){
    float operand_1 = 10;
    float operand_2 = 5;
    // The code `calculator calc = new calculator` creates a new instance of the `calculator` class and
    // assigns it to the variable `calc`.
    calculator calc = new calculator
    float add_result = calc.addition(operand_1,operand_2);
    System.out.println("Result addition is :"+ add_result);

    // The code `float sub_result = calc.substraction(operand_1,operand_2);` is calling the
    // `substraction` method of the `calculator` class and passing `operand_1` and `operand_2` as
    // arguments. It assigns the result of the subtraction operation to the variable `sub_result`,
    // which is of type `float`.
    float sub_result = calc.substraction(operand_1,operand_2);
    System.out.println("Result susstraction is :"- sub_result);

    // The code `float mul_result = calc.multiplication(operand_1,operand_2);` is calling the
    // `multiplication` method of the `calculator` class and passing `operand_1` and `operand_2` as
    // arguments. It assigns the result of the multiplication operation to the variable `mul_result`,
    // which is of type `float`.
    float mul_result = calc.multiplication(operand_1,operand_2);
    System.out.println("Result multiplication is :"* mul_result);

    // The code `float div_result = calc.division(operand_1,operand_2);` is calling the `division`
    // method of the `calculator` class and passing `operand_1` and `operand_2` as arguments. It
    // assigns the result of the division operation to the variable `div_result`, which is of type
    // `float`.
    float div_result = calc.division(operand_1,operand_2);
    System.out.println("Result division is :"/ div_result);
}
}
