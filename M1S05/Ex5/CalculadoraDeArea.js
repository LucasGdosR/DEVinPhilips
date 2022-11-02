export default class CalculadoraDeArea {
    constructor(tipo, base, altura) {
        this.tipo = tipo;
        this.base = parseFloat(base);
        this.altura = parseFloat(altura);
    }

    calcular() {
        switch (this.tipo) {
            case 'triangulo':
                return (this.base * this.altura) / 2;
            case 'quadrado':
            case 'retangulo':
                return this.base * this.altura;
        }
    }
}