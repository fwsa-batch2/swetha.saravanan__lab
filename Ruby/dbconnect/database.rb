require 'active_record'

def connect_db!
  ActiveRecord::Base.establish_connection(
    host: 'localhost', 
    adapter: 'mysql2',
    database: 'blazers', 
    username: 'swetha', 
    password: 'Swetha@2021'
)
end