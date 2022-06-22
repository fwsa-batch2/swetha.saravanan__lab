require '/home/swetham/swetha.saravanan__lab/wd-201-swetha/TODO_CLI/connect_db.rb'
connect_db!

ActiveRecord::Migration.create_table(:todos) do |t|
    t.column :todo_text, :text
    t.column :due_date, :date
    t.column :completed, :bool
  end
