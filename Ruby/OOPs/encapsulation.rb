public 
class Encapsulation
    def set(name)
       @name = name    
    end
    def get
        return "My name is #{@name}"
    end
end
obj = Encapsulation.new
obj.set("Swetha")
p obj.get