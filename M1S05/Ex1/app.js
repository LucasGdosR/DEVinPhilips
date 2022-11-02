import Funcionario from "./Funcionario.js";

const ada = new Funcionario("528.442.040-31", "Ada Lovelace", 1000);

console.log(ada.salario); // 1000

ada.promover(50);

console.log(ada.salario); // 1500

// Testando CPF inválido:
const lucas = new Funcionario("528.442.040-30", "Lucas Reis", 1000);

console.log(lucas);