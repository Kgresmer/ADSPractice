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