
function sumAll(arr) {
    var m = Math.max(...arr);
    var min = Math.min(...arr);
    var total = 0;
    while(m >= min) {
        total += m;
        m--;
    }
    return total;
}

sumAll([1, 4]);

