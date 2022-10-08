#include <iostream>
using namespace std;

int main() {
  int x, y;
  int sum;
  int minus;
  cout << "Podaj 1 liczbe: ";
  cin >> x;
  cout << "Podaj 2 liczba: ";
  cin >> y;
  sum = x + y;
  minus = x - y;
  cout << x << " + " << y << " = " << sum << endl;
  cout << x << " - " << y << " = " << minus << endl;
}