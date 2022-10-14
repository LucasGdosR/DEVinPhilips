var operation = prompt("Qual o tipo de cálculo? Escolha +, -, *, ou /.");
var num1 = Number(prompt("Primeiro valor: "));
var num2 = Number(prompt("Segundo valor: "));
var resultado;
switch(operation) {
    case '+':
        resultado = num1 + num2;
        break;
    case '-':
        resultado = num1 - num2;
        break;
    case '*':
        resultado = num1 * num2;
        break;
    case '/':
        resultado = num1 / num2;
        break;
    default:
        alert("Operação inválida.")
}
alert(resultado);
                  