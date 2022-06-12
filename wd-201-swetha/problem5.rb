todos = [
  ["Send invoice", "money"],
  ["Clean room", "organize"],
  ["Pay rent", "money"],
  ["Arrange books", "organize"],
  ["Pay taxes", "money"],
  ["Buy groceries", "food"],
]
category = {}
array1 = Array.new(0)
array2 = Array.new(0)
array3 = Array.new(0)
for i in 0...todos.length
  for j in 0...todos[i].length
    if todos[i][j + 1] == "money"
      array1.push(todos[i][j])
      category[todos[i][j + 1].to_sym] = array1
    end
    if todos[i][j + 1] == "organize"
      array2.push(todos[i][j])
      category[todos[i][j + 1].to_sym] = array2
    end
    if todos[i][j + 1] == "food"
      array3.push(todos[i][j])
      category[todos[i][j + 1].to_sym] = array3
    end

  end
end
p category
# case todos[i][j+1]
    # when todos[i][j+1]=="money"
    #     array1.push(todos[i][j])
    #     category[todos[i][j + 1].to_sym] = array1 
    # when todos[i][j+1]=="organize"
    #     array2.push(todos[i][j])
    #     category[todos[i][j + 1].to_sym] = array2 
    # else
    #     array3.push(todos[i][j])
    #     category[todos[i][j + 1].to_sym] = array3 
    # end
    # if todos[i][j + 1] == "money"
    #   array1.push(todos[i][j])
    #   category[todos[i][j + 1].to_sym] = array1
    # elsif todos[i][j + 1] == "organize"
    #   array2.push(todos[i][j])
    #   category[todos[i][j + 1].to_sym] = array2
    # else
    #   array3.push(todos[i][j])
    #   category[todos[i][j + 1].to_sym] = array3
    # end
    