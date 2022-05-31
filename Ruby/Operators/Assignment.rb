class ASSIGNMENT 
    def assignment(a,b)
        puts "AND + Adding : #{a+=b}"
        puts "AND + Substraction : #{a-=b}"
        puts "AND + Multipication :  #{a*=b}"
        puts "AND + Division :  #{a/=b}"
        puts "AND + Modulus : #{a%=b}"
        puts "AND + Exponent #{a**=b}"
    end
end
print "Enter first number : "
a = gets.chomp.to_i
print "Enter second number : "
b=gets.chomp.to_i
object = ASSIGNMENT.new
object.assignment(a,b)
