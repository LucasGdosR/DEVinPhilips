const somaTudo = (...nums) => {
    return nums.reduce((sum, n) => {return sum + n;
    });
}
const resultado = somaTudo(1, 2, 3, 4);
console.log(resultado);