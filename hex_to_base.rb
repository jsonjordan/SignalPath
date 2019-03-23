def hex_to_base64_string(hex_string)
    [[hex_string].pack("H*")].pack("m").strip
end

print "Enter hexadecimal string > "

hex_string = gets.chomp.to_s

base64_string = hex_to_base64_string(hex_string)

puts "The base 64 string is: #{base64_string}"
