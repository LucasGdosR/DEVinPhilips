function sleep (valor) {
    return new Promise ((res, rej) => {
        setTimeout(res, 3000, 'teste')
    })
}

const promise = sleep('teste');

console.log(promise);
setTimeout(console.log, 1000, promise);
setTimeout(console.log, 4000, promise);