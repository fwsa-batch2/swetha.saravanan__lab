# p "Enter the limitation of number to find GCD"
# no = gets.chomp.to_i
# p no

# def RecursiveSum(arrayofNumbers)
#   # Base Case: If the array is empty, return 0.
#   return 0 if arrayofNumbers.empty?

#   # Recursive code: Adding each element to the variable by calling the method.
#   sum = arrayofNumbers.pop

#   p "sum = #{sum}"
#   p "method  = #{RecursiveSum(arrayofNumbers)}"
#   return sum + RecursiveSum(arrayofNumbers)
# end

#  p RecursiveSum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
no = gets.chomp.to_i
p no
@array = Array.new
def divide(no)
  remainder = no %2
      if remainder == 0
        one_array = Array.new
        for i in 1..no do
          one_array.push(1)
        end
        @array.push(one_array)
        divisor = no/2
        two_array = Array.new
        for j in 1..divisor do
          two_array.push(2)
        end
        @array.push(two_array)
      else
        remainder = no%2
        divisor = no/2
        @array.push([remainder])
        for j in 1..divisor do
          @array.push([2])
        end
      end
end
divide(no)

p @array
