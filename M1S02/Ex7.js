var today = new Date();
var day = today.getDate();
var month = today.getMonth();
if (day > 21) month++;
if (month > 11) alert("Verão");
else if (month > 8) alert("Primavera");
else if (month > 5) alert("Inverno");
else if (month > 2) alert("Outono");