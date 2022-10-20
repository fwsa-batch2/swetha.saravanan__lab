tic_tac_array1 = [[1, 0, 0],
                 [0, 0 , 0],
                 [1 ,1 ,1]]
tic_tac_array2 = [[1, 0, 0],
                 [ 0, 0, 1],
                 [ 0, 1, 1]]
tic_tac_array3 = [[1, 0, 0],
                  [ 1, 0, -1],
                  [ 0 ,1, 1]]

def tic_tac(array)
 vertical_value = 0
 diagonal_value = 0
 for i in array
  unique_array = i.uniq
  vertical_array = i if array.find_index(i) == 0
  index = vertical_array.find_index(1)
   if unique_array.length == 1 && unique_array.include?(1)
       return true
   elsif index
      if index == 0 && array[0][0] ==1 && array[1][1] == 1 && array[2][2] ==1
         return true
      elsif index == 2 && array[0][2] ==1 && array[1][1] == 1 && array[2][0] ==1
         return true
      else
         vertical_value = vertical_value + 1 if i[index] == 1
         return true if vertical_value == 3
      end
   else
      return false
   end
 end
end



tic_tac(tic_tac_array2)
