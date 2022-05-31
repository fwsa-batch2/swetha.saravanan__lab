print "Enter your Mark percentage : "
mark=gets.chomp.to_i
case mark
when 0..34
    puts "Status : Fail"
when 35..49
    puts "Status : Third Stage"
when 50..75
    puts "Status : Second Stage"
when 76..100
    puts "Status : First Stage"
else
    puts "NOT APPILICABLE"
end