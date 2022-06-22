def get_command_line_argument
  if ARGV.empty?
    puts "Usage: ruby lookup.rb <domain>"
    exit
  end
  ARGV.first
end

def parse_dns(dns_raw)
      records  = {}
      for i in (dns_raw.select{ |x| x[0] != "#" && x!="\n"})
        array = i.split(", ")
        array.each_with_object({}) do |element,dns_records|
        dns_records[array[1].strip()]={type: array[0].strip(),target: array[2].strip()}
        records.store(array[1].strip,dns_records[array[1].strip()])
        end
      end
      return records
end

def resolve(dns_records,lookup_chain,domain)
     result =dns_records[domain]
     if(!result)
      lookup_chain[0] = "Error : Domain not found " +domain
      return lookup_chain
    elsif result[:type] == "A"
      return lookup_chain << result[:target]
    elsif result[:type] == "CNAME"
      lookup_chain << result[:target]
      resolve(dns_records, lookup_chain, result[:target])
    else
      lookup_chain[0] = "Invalid record type for " + domain
      return lookup_chain
    end
end

domain = get_command_line_argument
file = File.open("zone")
dns_raw = File.readlines(file)
dns_records = parse_dns(dns_raw)
lookup_chain = [domain]
lookup_chain = resolve(dns_records,lookup_chain,domain)
puts lookup_chain.join(" => ")

