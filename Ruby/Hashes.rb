student ={"Name"=>"Swetha","Age"=>17 ,"Marks"=>100}
student.each do
    puts student
end
for i in 0...student.length do
    puts "#{student.values[i]}"
end
student.each_key do |keys|
    puts keys
end
student.each_value do |values|
    puts values
end
student.each_index do |index|