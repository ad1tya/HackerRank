process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function solve(n, squares, d, m){
    // Complete this function
    result = 0;
    if (n == m){
        sum = 0;
        for(square = 0; square < n; square++)
            sum += squares[square];
        if(sum == d)
            result += 1;
    }
    else{ 
        for(index1 = 0; index1<(n-m+1); index1++){
            sum = 0;
            for(index2 = index1;index2 < (index1+m) ; index2++)
                sum += squares[index2];
            if(sum == d)
                result += 1;
        }
    }
    return result
}

function main() {
    var n = parseInt(readLine());
    s = readLine().split(' ');
    s = s.map(Number);
    var d_temp = readLine().split(' ');
    var d = parseInt(d_temp[0]);
    var m = parseInt(d_temp[1]);
    var result = solve(n, s, d, m);
    process.stdout.write(""+result+"\n");

}
