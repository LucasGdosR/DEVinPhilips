const pessoa = { nome: 'Ada', idade: 36, profissao: 'matemática' };
const destructAda = (Ada) => {
    const { nome, idade, profissao } = Ada;
    return ("Esta é " + nome + ", tem " + idade + " anos e é " + profissao + ".");
}
console.log(destructAda(pessoa));