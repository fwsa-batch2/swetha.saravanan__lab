p "Enter the limitation of number to find GCD"
no = gets.chomp.to_i
p no
arr = Array.new
for i in 1..no
  for j in 1..no
    if i!=j && j>i
      p "#{i} and #{j}"
      arr.push(i.gcd(j))
    end
  end
end
p arr


