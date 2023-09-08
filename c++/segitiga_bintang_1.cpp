// Youtube Video : https://www.youtube.com/watch?v=1qfPq_0XU60

#include <iostream>

using namespace std;

int main() {
  int tinggi = 10;

  for(int baris = 1; baris <= tinggi; baris++) {
    for(int kolom = 1; kolom <= baris; kolom++) {
      cout << "*";
    }
    cout << "\n";
  }
}
