
def fibonacci(n)

end

puts "Enter a number to find the count of ways"
n = gets.chomp.to_i
way = n+1
p fibonacci(way-1)+fibonacci(n-2)


