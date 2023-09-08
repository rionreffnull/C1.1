// Youtube Video : https://www.youtube.com/watch?v=1qfPq_0XU60

#include <iostream>

using namespace std;

int main() {
  int N = 5;
  int total = 0;
  int bilangan = 1;

  for(int i=1; i<=N; i++) {
    total += bilangan;
    cout << bilangan;

    if(i != N) {
      cout << " + ";
    }
    bilangan += 2;
  }
  cout << " = " << total << "\n";
}
