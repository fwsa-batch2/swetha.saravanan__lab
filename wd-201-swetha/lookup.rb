# require '/home/swetham/swetha.saravanan__lab/wd-201-swetha/zone'
def get_command_line_argument
  if ARGV.empty?
    puts "Usage: ruby lookup.rb <domain>"
    exit
  end
  ARGV.first
end
def parse_dns(dns_raw)
   zone = {Record_type: [],Domain: [], Destination: []}
   for i in (dns_raw.select{|x| (x!="#")&&(x!="\n")})
    puts i
   zone[:Record_type].push((i.split(","))[0].strip())
   zone[:Domain].push((i.split(","))[1].strip())
   zone[:Destination].push((i.split(","))[2].strip())   
   end
   return zone
end
def resolve(zone,records,domain)
  if(zone[:Domain].include? domain)
    index = zone[:Domain].find_index(domain)
    if(zone[:Record_type][index]=="A")
      records.push(zone[:Destination][index])
    else(zone[:Record_type][index]=="CNAME")
    new_dom = zone[:Destination][index]
    resolve(zone,records,new_dom)
    end
    # records.push(dns_raw[:Destination][index])
  else
    records.push("Domain not found")
  end
end
domain = get_command_line_argument
dns_raw = File.readlines("zone")
zone = parse_dns(dns_raw)
records = [domain]
records = resolve(zone,records,domain)
puts records.join(" => ")
