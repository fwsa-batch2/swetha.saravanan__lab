# def lambda_demo(a_lambda)
#     puts "I'm the method!"
#     a_lambda.call
# end
  
#   lambda_demo(lambda { puts "I'm the lambda!" })
def lamp(l)
    puts "Lamp"
    l.call
end
lamp(lambda {puts "Light"})
