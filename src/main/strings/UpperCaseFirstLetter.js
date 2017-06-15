/**
 * Created by chq-keving on 6/15/2017.
 */
function titleCase(str) {
    var arr = str.toLowerCase().split(" ");

    for (var i = 0; i < arr.length; i++) {
        console.log(arr[i]);
        arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length);
        console.log(arr[i]);
    }
    return arr.join(" ");
}

titleCase("I'm a little tea pot");