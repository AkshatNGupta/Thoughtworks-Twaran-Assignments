A = [1, 2, 3];

const forEach = (A, callback) => {
	for (var i=0;i<A.length;++i){
		A[i] = callback (A[i]);
	}
	return A;
}

const Answer = forEach (A, n => n+1);

console.log(Answer);