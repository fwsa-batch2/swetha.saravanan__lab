     
      function calculate() {
           event.preventDefault();
           let a = parseFloat(document.getElementById("number1").value);
           let b =parseFloat(document.getElementById("number2").value);
           let c=document.getElementById("operators").value;
           if(c=="Addition(+)") {
                document.getElementById("result").value=a+b;
           }
          if(c=="Subtraction(-)") {
                document.getElementById("result").value=a-b;
          }
           if(c=="Multipication(*)") {
               document.getElementById("result").value=a*b;
          }
            if(c=="Division(/)"){
               document.getElementById("result").value=a/b;
          }
           if(c=="Exponent(**)") {
               document.getElementById("result").value=a**b;
          }
            if(c=="Remainder(%)") {
               document.getElementById("result").value=a%b;
           }
      }
    
     