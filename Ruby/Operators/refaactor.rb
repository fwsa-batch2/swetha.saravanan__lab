puts "True" if True
puts "False" unless False
puts 3 < 4 ? "3 is less than 4!" : "3 is not less than 4."
greeting = gets.chomp
case greeting
  when "English" then puts "Hello!"
  when "French" then puts "Bonjour!"
  when "German" then puts "Guten Tag!"
  when "Finnish" then puts "Haloo!"
  else puts "I don't know that language!"
end