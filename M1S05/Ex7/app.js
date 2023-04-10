import Time from "./Time.js";
import Partida from "./Partida.js";

const galo = new Time('Atlético Mineiro', 'CAM');
const coelho = new Time('América Mineiro', 'AMG');

const semiA = new Partida('CAM', 2, 'CRZ', 1);
const semiB = new Partida('AMG', 3, 'VNC', 2);
const finalA = new Partida('AMG', 5, 'CAM', 1);
const finalB = new Partida('AMG', 0, 'CAM', 0);

galo.computarPartida(semiA);
galo.computarPartida(semiB);
galo.computarPartida(finalA);
galo.computarPartida(finalB);
galo.exibirSituacao();

coelho.computarPartida(semiA);
coelho.computarPartida(semiB);
coelho.computarPartida(finalA);
coelho.computarPartida(finalB);
coelho.exibirSituacao();