#include <iostream>
using namespace std;

float global = 5;

int main () {
  float local = 10;

  cout << global << endl;
  cout << local << endl;
 
  return 0;
}