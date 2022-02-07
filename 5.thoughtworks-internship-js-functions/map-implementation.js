A = [1, 2, 3]

const map = (arr, callback)=>{
    var Result = [];
    for(var i of arr){
        Result.push(callback(i));
    }
    return Result;
}

Answer = map(A, n => n*2);

console.log(Answer);