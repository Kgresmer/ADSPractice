
function findLongestWord(str) {
    var arr = str.split(' ');
    var longest = 0;
    console.log(arr);
    for (var i = 1; i < arr.length; i++) {
        if (arr[longest].length < arr[i].length) {
            console.log(arr[i]);
            longest = i;
        }
    }
    return arr[longest].length;
}

findLongestWord("The quick brown fox jumped over the lazy dog");