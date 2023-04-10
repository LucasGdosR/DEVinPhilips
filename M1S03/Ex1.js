const procuraMinMax = (array) => {
    if ((!Array.isArray(array)) || isNaN(array[0])) return console.log("Não é possível encontrar");
    let min = array[0];
    let max = array[0];
    for (let i = 1; i < array.length; i++) {
        if (array[i] < min) min = array[i];
        else if (array[i] > max) max = array[i];
    }
    console.log("Menor valor: ", min, "\nMaior valor: ", max);
}

procuraMinMax([56,65,64,-3,23,42,-15,65,14,32,78,70,47]);
procuraMinMax([]);
procuraMinMax([1]);
procuraMinMax([1,-1]);
procuraMinMax(null);
procuraMinMax([-2,-2,-2,-2]);
procuraMinMax([20,10,30]);