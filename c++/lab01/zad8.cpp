#include <iostream>
#include <climits>

using namespace std;

int main() {
  string fullName;
  cout << "Wpisz swoje imie i nazwisko: ";
  getline(cin, fullName);

  int age{};
  cout << "Wpisz swoj wiek: ";
  cin >> age;

  cout << age + fullName.length() << endl;
}