function sub(){
  let a=+num;
  let b=+num1;
  let diff=a-b;
  return diff;
}
function difference(){
  event.preventDefault();
  let value1=document.getElementById("demo");
  let value2=document.getElementById("demo1");
  console.log(value1.value);
  console.log(value2.value);
  let minus=sub(+value2.value,+value2.value);
  console.log(minus); 
}

