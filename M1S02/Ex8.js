var isPrime = (num) => {
    var root = Math.sqrt(num);
    for (var j = 2; j < root; j++) {
        if (!(num % j)) return false;
    }
    console.log(num);
    return true;
}

var count = 0;
for (var i = 2; i <= 1000; i++) {
    if (isPrime(i)) count++;
}
console.log(count);
