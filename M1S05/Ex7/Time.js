export default class Time {
    vitorias = 0;
    derrotas = 0;
    empates = 0;
    golsMarcados = 0;
    golsSofridos = 0;

    constructor(nome, sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    get numeroDeJogos() {
        return this.vitorias + this.derrotas + this.empates;
    }

    get numeroDePontos() {
        return this.vitorias * 3 + this.empates;
    }

    computarPartida(partida) {
        if (this.sigla == partida.siglaTimeA) {
            this.golsMarcados += partida.golsTimeA;
            this.golsSofridos += partida.golsTimeB;
            if (partida.golsTimeA > partida.golsTimeB) this.vitorias++;
            else if (partida.golsTimeB > partida.golsTimeA) this.derrotas++;
            else this.empates++;
        } else if (this.sigla == partida.siglaTimeB) {
            this.golsMarcados += partida.golsTimeB;
            this.golsSofridos += partida.golsTimeA;
            if (partida.golsTimeA > partida.golsTimeB) this.derrotas++;
            else if (partida.golsTimeB > partida.golsTimeA) this.vitorias++;
            else this.empates++;
        }
    }

    exibirSituacao() {
        console.log(`Time: ${this.nome}
        Sigla: ${this.sigla}
        Jogos: ${this.numeroDeJogos}
        Vitórias: ${this.vitorias}
        Empates ${this.empates}
        Derrotas: ${this.derrotas}
        Pontos: ${this.numeroDePontos}
        Gols marcados: ${this.golsMarcados}
        Gols sofridos: ${this.golsSofridos}`);
    }
}