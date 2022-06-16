names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
name = []
# p names.length
for i in 0...names.length
  # puts "#{names[i]} and #{names[i].length} #{names[i][1]}"
  j = 0
  name.push(names[i][j] + " " + names[i][j + 1])
  # p name
end
# a = [1,2,3,4]
# p a
p name
# puts a
puts name
print name
# print names.flatten!
