library = {}
# library["austen"] = ["Pride and Prejudice", "Sense and Sensibility"]
# library["asimov"] = ["Robots of Dawn", "I, Robot"]

# authors = library.keys
# puts "These are the authors in my catalog: #{authors.join(', ')}"

# library.each do |author, books|
#   puts "#{author.capitalize} wrote the books #{books.join(', ')}"
# end
books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
for i in 0...books.length
  for j in 0...authors.length
    if (i == j)
      library[authors[j].split.first.downcase.to_sym] = books[i]
    end
  end
end
p library
# p "5a2".match(/\d.*/)
# p "2aab3".match(/\d.*/)
# p "5.5".match(/\d.*/)
# p "5.5.5".match(/\d.*/)
def ip_address?(str)
  # We use !! to convert the return value to a boolean
  !!(str =~ /\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$/)
end
p ip_address?("192.168.1.1")  # returns true
p ip_address?("0000.0000")