## Youtube Video : https://www.youtube.com/watch?v=-LU81fWDMzY

print "Inputkan Sebuah Angka : "
$stdout.flush

angka = gets.to_i

puts "======================================================"
puts "Angka yang dapat membagi #{angka} tanpa sisa adalah :"

i = 1

begin
    if angka % i == 0
        print "#{i}, "
        $stdout.flush
    end
    i += 1
end while i <= angka
