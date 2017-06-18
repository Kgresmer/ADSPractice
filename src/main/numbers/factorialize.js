/**
 * Created by user on 6/14/2017.
 */

function factorialize(num) {
    var f = num;
    if (num === 0 ) return 1;
    while (num >= 2) {
        f = (--num) * f;
        console.log(f);
    }
    return f;
}

factorialize(5);