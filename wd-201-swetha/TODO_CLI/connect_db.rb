require 'active_record'

def connect_db!
  ActiveRecord::Base.establish_connection(
    host: 'localhost',
    adapter: 'mysql2',
    database: 'Todos',
    username: 'swetha',
    password: 'Swetha@2021'
)
end
