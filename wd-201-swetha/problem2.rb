books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
book = Array.new(0)
for i in 0...books.length
  for j in 0...authors.length
    if i == j
      book.push("#{books[i]} was written by #{authors[j]}")
    end
  end
end
puts book
