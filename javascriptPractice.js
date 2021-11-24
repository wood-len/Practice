// 1)
function getSubstrings(str, chars){
  let arr = str.split("");
  let id = [];
  let substrings = [];

  for(let i = 0; i< arr.length; i++){
	  let a = arr[i];
	  if(chars.includes(a)){
	    id.push(i);
	  }
  }
    
  for(let i = 0; i<id.length; i++){
    substrings.push(arr[id[i]]);
	  for(let j = i+1; j<id.length; j++){
	    substrings.push(str.substr(id[i],(id[j]+1 - id[i])));
	  }
  }
  
  return substrings.sort();
}

function getVowelSubstrings(str){
  return getSubstrings(str, 'aeiouy');
}

function getConsonantSubstrings(str){
  return getSubstrings(str, 'bcdfghjklmnpqrstvwxyz');
  
}

let string = "aviation";

// console.log(getVowelSubstrings(string));
// console.log(getConsonantSubstrings(string));


// 2)

function redundant(str) {
  return   () => console.log(str);
}

// const f1 = redundant("apple");
// f1();