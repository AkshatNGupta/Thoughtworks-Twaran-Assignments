A = [1, 2, 3]

const filter = (arr, callback)=>{
    var Result = [];
    for(var i of arr){
        if (callback(i)){
            Result.push(i);
        }
    }
    return Result;
}

Answer = filter(A, n => n%2!=0);

console.log(Answer);