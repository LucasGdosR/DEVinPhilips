import Juros from "./Juros.js"

let juros = new Juros(10000, 0.07, 24);
console.log(juros.calcularJurosSimples());
console.log(juros.calcularJurosCompostos());

juros = new Juros(10000, 0.15, 10);
console.log(juros.calcularJurosSimples());
console.log(juros.calcularJurosCompostos());