## Youtube Video : https://www.youtube.com/watch?v=fbwZ9910mG0

puts "Selamat datang di Game Tebak Angka!"

batas_atas = 0
batas_bawah = 20
angka_komputer = rand(batas_atas..batas_bawah)

puts "Saya telah memilih angka antara #{batas_atas} hingga #{batas_bawah}"
puts "Coba tebak angka yang saya pilih."
puts ""

jawaban_benar = false
jumlah_tebakan = 0

while jawaban_benar == false
    print "Tebakan Anda: "
    $stdout.flush
    angka_pemain = gets.to_i
    jumlah_tebakan += 1

    if angka_pemain == angka_komputer
        jawaban_benar = true
        puts "Selamat! Anda berhasil menebak angka #{angka_komputer}"
        puts "Anda mencoba sebanyak #{jumlah_tebakan} kali."
    elsif angka_pemain > angka_komputer
        puts "Tebakan Anda terlalu tinggi. Coba lagi!"
    else
        puts "Tebakan Anda terlalu rendah. Coba lagi!"
    end
    puts ""
end

