module Math_swetha
    def Math_swetha.square(n)
        return n**2
    end

    def Math_swetha.cube(n) 
        return n**3
    end

    def Math_swetha.exponential(base , power)
        @ans = 1
        i=1
        for i in i..power do
            @ans = base*i 
        end
        return @ans
    end

    def Math_swetha.leap(year)
        if leap%4 == 0
            puts "#{year} is Leap year"
        else
            puts "#{year} is not Leap year"
        end
    end

    def Math_swetha.prime(number)
        i =1
        @result = 0
        for i in i..number do
            @ans = number% i
            @result+=@ans
        end
    if @result == 2 
        puts "#{number} is Prime number"
    else
        puts "#{number} is not Prime number"
    end
    end
     
    def Math_swetha.palindrom(number)
        @no = number.to_s
        puts @no
        i=-1
        result = " "
        i=-1
        @no.each i do
            result= @no[i]+result
            i-=1
        end   
        if result==@no
            puts "#{number} is Palindrom"
        else
            puts "#{number} is not Palindrom"
        end
    end
end