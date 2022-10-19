const concatenate = (arr1, arr2) => {
    return [...arr1, ...arr2];
}

const novoArray = concatenate([1, 2, 3], [4, 5, 6]);
console.log(novoArray);