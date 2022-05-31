print "Enter your Age : "
age = gets.chomp.to_i
if age>18
    puts "You have eligible for voting"
elsif age<18
    puts "You are not eligible for voting"
else
    puts "You are in the stage of Eighteen so , You have the eligible"
end