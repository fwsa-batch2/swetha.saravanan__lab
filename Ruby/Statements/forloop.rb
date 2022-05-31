arr = Array.new(0)
for i in 0..10
    arr.push(i)
end
puts "#{arr}"
puts arr.length()
puts "Shift() - first element of the array #{arr.shift()}"
puts "Shift(2) - returns first two values of the array #{arr.shift(2)}"
puts "slice(2,11) #{arr.slice(1,2)}"    #{0,1,2,3,4,5,6,7,8,9,10}
