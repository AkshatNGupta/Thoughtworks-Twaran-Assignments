A = [1, 2, 3];

const reduce = (arr, callback, initialValue = 0) => {
	if (arr.length === 0){
		return initialValue;
	}	
	const [A1, ...remArray] = arr;
	return reduce (remArray, callback, callback (initialValue, A1));
}

const Answer = reduce (A, (a,b)=>a+b);

console.log(Answer);