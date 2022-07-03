require '/home/swetham/swetha.saravanan__lab/wd-201-swetha/TODO_CLI/connect_db.rb'
require '/home/swetham/swetha.saravanan__lab/wd-201-swetha/TODO_CLI/todo.rb'
connect_db!
puts Todo.all
Todo.create!([{todo_text: todo_text, due_date: date, completed: completed}])

