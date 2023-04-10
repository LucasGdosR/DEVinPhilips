var input = parseInt(prompt("Insira um número:"));
var odds = parseInt(input/2);
var even = odds;
if (input % 2) odds++;
alert("Pares: " + even + "\nÍmpares: " + odds);