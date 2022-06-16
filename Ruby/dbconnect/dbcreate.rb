require '/home/swetham/swetha.saravanan__lab/Ruby/dbconnect/database.rb'
connect_db!

ActiveRecord::Migration.create_table(:swetha) do |t|
    t.column :todo_text, :text
    t.column :due_date, :date
    t.column :completed, :bool  
  end
  