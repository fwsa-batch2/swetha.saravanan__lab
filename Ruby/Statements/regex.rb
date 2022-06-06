# puts "#{"a1".gsub(/\d/, "2")}"
# puts "#{"a12".gsub(/(\w)(\d)/, '\2\1')}"
def ip_address?(str)
    # We use !! to convert the return value to a boolean
    !!(str =~ /^\d{1,2}\.\d{1,3}\.\d{1,3}\.\d{1,3}$/)
end
puts ip_address?("19.168.1.1")  # returns true
puts ip_address?("0000.0000")    # returns
# Note that this will also match some invalid IP address
# like 999.999.999.999, but in this case we just care about the format.
