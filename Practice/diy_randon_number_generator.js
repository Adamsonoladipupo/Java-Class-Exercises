function getRandom(min, max){
	let number = Math.round(Math.random() * (min - max) + min);
	return Math.abs(number)
}

console.log(getRandom(4, 40))