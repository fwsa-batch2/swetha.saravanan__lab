require '/home/swetham/swetha.saravanan__lab/Ruby/dbconnect/database.rb'
require '/home/swetham/swetha.saravanan__lab/Ruby/dbconnect/todo.rb'
connect_db!
puts Todo.all
# Todo.insert_all!([
#                  {todo_text: "Buy groceries", due_date: Date.today + 4, completed: false},
#                 {todo_text: "Call Acme Corp.", due_date: Date.today + 2, completed: true},
#                 {todo_text: "File taxes", due_date: Date.today, completed: false}])


# You can't pass spread opearter inside crud .
#Todo.destroy([6,7,8,9,10,11,12,13,14,15])
#Todo.insert!([{todo_text:"Feel music", due_date: Date.today, completed: true}])
#Todo.create!([{todo_text:"Coding",due_date:Date.today,completed: true}])


