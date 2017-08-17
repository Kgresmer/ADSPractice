/**
 * Created by chq-keving on 6/30/2017.
 */

function rot13(str) { // LBH QVQ VG!
    var pattern = /[a-z]/ig;
    var result = [];
    for (var i = 0; i < str.length; i++) {
        if (/[a-z]/ig.test(str[i])) {
            var charCode = str.charCodeAt(i);
            var desCC = charCode + 13;
            if (desCC > 90) {
                desCC = 64 + Math.abs(90 - desCC);
            }
            result.push(String.fromCharCode(desCC));

        } else {
            result.push(str[i]);
        }
    }
    return result.join('');
}

// Change the inputs below to test
rot13("SERR PBQR PNZC");