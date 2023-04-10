var initVal = parseInt(prompt("Valor inicial: "));
var root = parseInt(prompt("Valor da raiz: "));
var progression = [ initVal ];
for (var i = 0; i < 9; i++) {   
    initVal += root;
    progression.push(initVal);
}
alert(progression.toString());