/**
 * Created by chq-keving on 6/15/2017.
 */
function palindrome(str) {
    var nstr = str.replace(/[^A-Za-z0-9]/g, '').toLowerCase();

    for (var i = nstr.length - 1; i >= nstr.length/2; i--) {
        if (nstr[i] !== nstr[nstr.length - 1 - i]) {
            return false;
        }
    }
    return true;
}



palindrome("eye");