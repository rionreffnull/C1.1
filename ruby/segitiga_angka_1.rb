=begin
Youtube Video : https://www.youtube.com/watch?v=XtjBRGCpAk4

3. Buatlah program C++ yang menggunakan for bersarang
dengan output seperti berikut:

1
11
111
1111
11111
111111
=end


print "masukkan tinggi segitiga : "
$stdout.flush

tinggi = gets.to_i

for baris in 1 .. tinggi
	for kolom in 1 .. baris
		print 1
		$stdout.flush
	end
	puts ""
end








