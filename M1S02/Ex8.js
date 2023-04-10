let primes = [2];

const isPrime = (num) => {
    for (let prime of primes) {
        if (!(num % prime)) return false;
    }
    primes.push(num);
    return true;
}

for (let i = 3; i <= 1000; i += 2) {
    if (isPrime(i)) console.log(i);
}
console.log(primes.length);