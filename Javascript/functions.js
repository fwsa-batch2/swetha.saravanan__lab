function add() {
    let a=parseInt(prompt("Enter first number to add"));
    let b=parseInt(prompt("Enter second number to add"));
    a+b;
    document.write("Sum of the numbers    "     +(a+b));
}
function sub() {
    let a=parseInt(prompt("Enter first number "));
    let b=parseInt(prompt("Enter second number "));
    a-b;
    document.write("Subtraction of the numbers    "     +(a-b));
}
function multiply() {
    let a=parseInt(prompt("Enter first number "));
    let b=parseInt(prompt("Enter second number "));
    a*b;
    document.write("Multipication of the numbers    "     +(a*b));
}
function divide() {
    let a=parseInt(prompt("Enter first number "));
    let b=parseInt(prompt("Enter second number "));
    a/b;
    document.write("Division of the numbers    "     +(a/b));
}
function remain() {
    let a=parseInt(prompt("Enter first number "));
    let b=parseInt(prompt("Enter second number to see the remainder"));
    a%b;
    document.write("Remainder    "     +(a%b));
}
function exponent() {
    let a=parseInt(prompt("Enter first number for base value" ));
    let b=parseInt(prompt("Enter second number for power value"));
    a**b;
    document.write("The answer is    "     +(a**b));
}