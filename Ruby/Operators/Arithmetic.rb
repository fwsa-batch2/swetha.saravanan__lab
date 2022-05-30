class ARITHMETIC 
   
    def add(a,b)
        c=a+b
        puts "Addition of two numbers : #{c}"
    end
    def sub(a,b)
        c=a-b
        puts "Substraction of two numbers : #{c}"
    end
    def divide(a,b)
        c=a/b
        puts "Division of two numbers : #{c}"
    end
    def multiply(a,b)
        c=a*b
        puts "Multipication of two numbers : #{c}"
    end
    def modulus(a,b)
        c=a%b
        puts "Modulus of numbers : #{c}"
    end
    def exponent(a,b)
        c=a**b
        puts "Exponent value of a  : #{c}"       
    end
end
print "Enter first number :"
$a = gets.chomp.to_i
print "Enter second number :"
$b = gets.chomp.to_i
obj = ARITHMETIC.new
obj.add($a,$b)
obj.sub($a,$b)
obj.multiply($a,$b)
obj.divide($a,$b)
obj.modulus($a,$b)
obj.exponent($a,$b)