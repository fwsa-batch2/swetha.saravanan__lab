def salute name, wish
    fullname = name.split(' ').last
    "#{wish} Mr. #{fullname}"
end
puts salute("Nelson Rolihlahla Mandela", "hello")
puts salute("Sir Alan Turing", "welcome")

def run_thrice_with_index
	yield 0
	yield 1
	yield 2
end

run_thrice_with_index { |i| puts "#{i} Tada!" }
def wrap_div
    "<div>#{yield}</div>" 
end
  
  puts wrap_div { "hello!" }
  