public
def test
    puts "test - 1"
    puts "test - 2"
    yield
    puts "test - 4"
end
test {puts "test - 3"}
