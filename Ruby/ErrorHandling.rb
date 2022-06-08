begin
    example = [1,2,3,4,5]
    puts example[7]
rescue => exception 
    puts exception.backtrace
    raise

end