const isPalindrome = (word) => {
    let lowerCaseWord = word.toLowerCase();
    for (let i = 0; i < word.length; i++) {
        if (lowerCaseWord[i] != lowerCaseWord[word.length - 1 - i]) return false;
    }
    return true;
}

const test1 = isPalindrome("Ana");
console.log(test1);

const test2 = isPalindrome("julia");
console.log(test2);