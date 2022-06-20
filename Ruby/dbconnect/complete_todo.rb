require '/home/swetham/swetha.saravanan__lab/Ruby/dbconnect/database.rb'
require '/home/swetham/swetha.saravanan__lab/Ruby/dbconnect/todo.rb'
connect_db!
Todo.show_list

puts "Which todo do you want to mark as complete? (Enter id): "
todo_id = gets.strip.to_i

todo = Todo.mark_as_complete(todo_id)

puts todo.to_displayable_string
