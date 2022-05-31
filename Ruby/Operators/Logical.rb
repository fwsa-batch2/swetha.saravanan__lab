class LOGICAL 
    def logical(a,b)
        puts "LOGICAL AND : #{a>0 AND b>0}"
        puts "LOGICAL OR : #{a>0 OR b>0}"
        puts "LOGICAL NOT : #{NOT(a<0 && b<0)}"
        puts "LOGICAL && : #{a>0 &&b<0}"
        puts "LOGICAL || : #{a>0 ||b<0}"
        puts "LOGICAL ! : #{!(a>0&&b>0)}"
        
    end
end
print "Enter first number : "
a=gets.chomp.to_i
print "Enter second number : "
b= gets.chomp.to_i
obj = LOGICAL.new
obj.logical(a,b)