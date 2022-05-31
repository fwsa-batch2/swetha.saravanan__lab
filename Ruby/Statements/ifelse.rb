print "Enter a Number :"
no=gets.chomp.to_i
if no%4==0
    puts "Given year #{no} is Leap ."
else
    puts "#{no} is not Leap year"
end