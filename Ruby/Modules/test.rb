# require './math.rb'
# require 'Math_swetha'
# $LOAD_PATH << '.'
# require "./math.rb"
# require math_swetha
# include math_swetha
# class EXAMPLE include math_swetha
# end
# obj = EXAMPLE.new
require '/home/swetham/swetha.saravanan__lab/Ruby/Modules/math.rb'
p "Enter a number :"
no = gets.chomp.to_i
p Math_swetha::square(no)
p Math_swetha::cube(no)
p Math_swetha::palindrom("121")
