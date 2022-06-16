# require "mysql"    # if needed

# @db_host  = "localhost"
# @db_user  = "swetha"
# @db_pass  = "Swetha@2021"
# @db_name = "blazers"

# client = Mysql::Client.new(:host => @db_host, :username => @db_user, :password => @db_pass, :database => @db_name)
# @cdr_result = client.query("SELECT * from student")
#!/usr/bin/ruby

require 'mysql'


begin
    con = Mysql.new 'localhost', 'swetha', 'Swetha@2021'
    puts con.get_server_info
    rs = con.query 'SELECT VERSION()'
    puts rs.fetch_row    
    
rescue Mysql::Error => e
    puts e.errno
    puts e.error
    
ensure
    con.close if con
end

