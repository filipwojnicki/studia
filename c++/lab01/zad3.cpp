#include <iostream>
using namespace std;

int main() {
  cout << "Podaj liczbę: ";
  int num{ };
  cin >> num;
  cout << "Podwojona wartosc: " << num * 2 << endl;
  cout << "Podwojona wartosc: " << num << " to: " << num * 2 << endl;
  cout << "Potrojona wartosc: " << num << " to: " << num * 3 << endl;
}