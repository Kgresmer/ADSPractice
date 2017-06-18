
function chunkArrayInGroups(arr, size) {
    var result = [];
    for (var i = 0; i < arr.length; i+= size) {
        result.push(arr.slice(i, i + size));
    }
    return result;
}

chunkArrayInGroups(["a", "b", "c", "d"], 2);/**
 * Created by user on 6/17/2017.
 */
