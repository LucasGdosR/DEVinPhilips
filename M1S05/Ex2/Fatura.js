export default class Fatura {
    constructor(id, descricao, quantia, preco) {
        this.id = parseInt(id);
        this.descricao = descricao;
        if (quantia < 0) this.quantia = 0;
        else this.quantia = parseFloat(quantia);
        if (preco < 0) this.preco = 0;
        else this.preco = parseFloat(preco);
    }

    obterValorTotal() {
        return this.quantia * this.preco;
    }

    get valorTotal() {
        return this.quantia * this.preco;
    }
}