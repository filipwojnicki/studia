#include <iostream>
using namespace std;

int main() {
  char c;
  cout << "Wpisz pojedynczy znak: ";
  cin >> c;
  cout << "Wpisałeś: " << c << ", który ma kod ASCII: " << int(c) << endl;
}