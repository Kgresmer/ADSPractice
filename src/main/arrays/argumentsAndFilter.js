/**
 * Created by chq-keving on 6/27/2017.
 */

function destroyer(arr) {
    var args = Array.prototype.slice.call(arguments);
    args = args.slice(1);
    var re = arr.filter(function(el) {
        console.log(el + " index of " + args + " = " + args.indexOf(el));
        return args.indexOf(el) < 0;
    });
    console.log(re);
    return re;
}

destroyer([1, 2, 3, 1, 2, 3], 2, 3);