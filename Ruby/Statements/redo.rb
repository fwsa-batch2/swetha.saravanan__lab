print "Enter a number : "
x=gets.chomp.to_i
while x>=0
   puts x
   x-=1
   redo if x==5
end