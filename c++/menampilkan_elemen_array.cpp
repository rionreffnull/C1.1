// Youtube Video : https://www.youtube.com/watch?v=1qfPq_0XU60

#include <iostream>

using namespace std;

int main() {
  int data[] = { 100, 30, 40, 74, 16, 83, 9 };
  int len = sizeof(data)/sizeof(data[0]);

  for(int i = 0; i < len; i++) {
    cout << "Isi element pada index " << i << " adalah " << data[i] << "\n";
  }
}
