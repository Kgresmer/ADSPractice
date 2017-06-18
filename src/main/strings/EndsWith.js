/**
 * Created by user on 6/17/2017.
 */

function confirmEnding(str, target) {
    var end = str.substr(-target.length, target.length);
    console.log(end);
    return end === target;
}

confirmEnding("Bastian", "n");