
print "Input Batasan Angka : "
int batas_angka = System.in.newReader().readLine().toInteger()
int jumlah_ganjil = 0
int jumlah_genap = 0

println "==========================================="
print "Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari ${batas_angka} adalah "

for(angka in 1..(batas_angka-1)) {
    if(angka % 3 == 0 || angka % 5 == 0) {
        if(angka % 2 == 0) {
            jumlah_genap += 1
        }
        else {
            jumlah_ganjil += 1
        }
        print angka + " "
    }
}
println ""
println "Jumlah angka genap : ${jumlah_genap}"
println "Jumlah angka ganjil : ${jumlah_ganjil}"
