# puts "Hello world! Greetings from Includehelp.com"
# sleep 30
# puts "bye"
# def set_interval(delay)
#   Thread.new do
#     loop do
#       sleep delay
#       yield # call passed block
#     end
#   end
# end
# t1 = Time.now
# t = set_interval(2.5) {puts Time.now - t1}
p 6.times.map{rand(10)}.join
