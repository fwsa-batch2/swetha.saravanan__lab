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
      library[authors[j].gsub(/\s.+/, "").downcase.to_sym] = books[i]
    end
  end
end
p library
