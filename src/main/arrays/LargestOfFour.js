
function largestOfFour(arr) {
    var la = [arr[0][0], arr[1][0], arr[2][0], arr[3][0]];
    for (var i = 0; i < arr[0].length; i++) {
        if (arr[0][i] > la[0]) {
            la[0] = arr[0][i];
        }
        if (arr[1][i] > la[1]) {
            la[1] = arr[1][i];
        }
        if (arr[2][i] > la[2]) {
            la[2] = arr[2][i];
        }
        if (arr[3][i] > la[3]) {
            la[3] = arr[3][i];
        }

    }
    return la;
}

largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]);

//https://medium.freecodecamp.com/three-ways-to-return-largest-numbers-in-arrays-in-javascript-5d977baa80a1