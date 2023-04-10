export default class Funcionario {

    constructor(cpf, nomeCompleto, salario) {
        if (!this.validaCPF(cpf)) {
            console.log("CPF inválido.");
            return;
        }
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
    }

    promover(percentual) {
        this.salario *= (1 + percentual/100);
    }

    validaCPF(cpf) {
        // Padroniza CPF para usar apenas números.
        cpf = cpf.trim();
        cpf = cpf.replaceAll('.', '');
        cpf = cpf.replace('-', '');
        // Checa que são 11 números.
        if (cpf.length != 11) return false;
        // Checksum: primeiro número vezes 10, segundo vezes 9... nono vezes 2.
        let sum = 0;
        for (let i = 0, j = 10; i < 9; i++, j--) {
            sum += parseInt(cpf.charAt(i)) * j;
        }
        let resto = sum % 11;
        if (resto < 2) {
            if (parseInt(cpf.charAt(9)) != 0) return false;
        } else {
            if (parseInt(cpf.charAt(9)) != (11 - resto)) return false;
        }
        // Segundo checksum: primeiro vezes 11... décimo vezes 2.
        sum = 0;
        for (let i = 0, j = 11; i < 10; i++, j--) {
            sum += parseInt(cpf.charAt(i)) * j;
        }
        resto = sum % 11;
        if (resto < 2) {
            if (parseInt(cpf.charAt(10)) != 0) return false;
        } else {
            if (parseInt(cpf.charAt(10)) != (11 - resto)) return false;
        }
        // Passou em tudo, CPF válido.
        return true;
    }
}