/**
 * Created by chq-keving on 6/19/2017.
 */
function mutation(arr) {
    if (arr.length < 2) return false;
    var s1 = arr[0].toLowerCase();
    var s2 = arr[1].toLowerCase();
    for (var i = 0; i < s2.length; i++) {
        if (s1.indexOf(s2[i]) < 0) {
            return false;
        }
    }
    return true;
}

mutation(["hello", "hey"]);

function isBigEnough(element, index, array) {
    return element >= 10;
}
[12, 5, 8, 130, 44].every(isBigEnough);   // false
[12, 54, 18, 130, 44].every(isBigEnough);

function mutationInterSol(arr) {
    return arr[1].toLowerCase()
        .split('')
        .every(function(letter) {
            return arr[0].toLowerCase()
                    .indexOf(letter) != -1;
        });
}