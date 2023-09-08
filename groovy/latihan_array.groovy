// Youtube Video : https://www.youtube.com/watch?v=XQ4M8lxuobo

// ARRAY
// -> Menampilkan Nilai
// -> Penjumlahan Nilai
// -> Pencarian Nilai

def arr_data = [8, 9, 13, 9, 11, 15, 20, 15, 7, 1]

arr_data.eachWithIndex { value, index ->
	println "Isi element pada index ${index} adalah ${value}"
}

def arr_sum = 0

arr_data.each { value ->
	arr_sum += value
}

println "Total nilai didalam array adalah ${arr_sum}"

def number = 15

arr_data.eachWithIndex { value, index ->
	if(value == number) {
		println "Nilai ${number} berada pada index ${index}"
	}
}
