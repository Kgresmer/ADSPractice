/**
 * Created by chq-keving on 6/27/2017.
 */

function getIndexToIns(arr, num) {
    console.log("pre sorted: " + arr);
    arr = arr.sort(function compare(a, b) {
        if (a < b) {
            return -1;
        }
        if (a > b) {
            return 1;
        }
        return 0;
    });
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] >= num) {
            return i;
        }
    }
    return arr.length;
}

getIndexToIns([40, 60], 50);
