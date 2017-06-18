
function repeatStringNumTimes(str, num) {
    if (num < 1) return "";
    var strs = [];
    while(num > 0) {
        strs.push(str);
        num--;
        console.log(strs.join(''));
    }
    return strs.join('');
}

repeatStringNumTimes("abc", 3);/**
 * Created by user on 6/17/2017.
 */

function repeatStringNumTimes(str, num) {
    if (num < 1) return "";
    return str.repeat(num);
}

repeatStringNumTimes("abc", 3);

