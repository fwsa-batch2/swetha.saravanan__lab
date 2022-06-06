class SAMPLE
    def initialize
        puts "Swetha is a good girl"
    end
    def name(name)
        puts name
    end
end
class SAMPLE1 < SAMPLE
    def intialize
        super
        puts "Karthika"    
    end
    def name(name)
        puts name
    end
end

print "Enter your name : "
name = gets.chomp
obj = SAMPLE1.new
obj.name(name)
puts "#{SAMPLE1.superclass}"