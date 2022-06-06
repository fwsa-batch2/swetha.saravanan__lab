class SAMPLE
    @@name="Karthika"
    @Age =16
    ins="HSC"
    $marks=101
    puts "Name #{@@name} , Age #{@Age} , Ins #{ins} , Marks #{$marks} "
    def method
        @@name="Swetha"
        @Age =17
        # -id=40
        ins="FWSA"
        $mark =100
        puts "Name #{@@name} , Age #{@Age} , Ins #{ins}  , Marks #{$mark}"
    end
end
object = SAMPLE.new
object.method

