strings = ["leonardo", "donatello", "raphael", "michaelangelo"]
# Write your code below this line!

symbolize = lambda {|x| x.to_sym}
print symbolize

# Write your code above this line!
symbols = strings.collect(&symbolize)
print symbols
