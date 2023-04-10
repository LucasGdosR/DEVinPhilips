var num = prompt("Tabuada de que número?");
var tabuada = "";
for (var i = 0; i <= 10; i++) {
    tabuada = tabuada + num + " x " + i + " = " + (num * i) + "\n";
}
alert(tabuada);