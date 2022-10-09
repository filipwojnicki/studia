#include <iostream>
#include <climits>

using namespace std;

// 5 + 7 = 12
// 3.7 + 8.0 = 11.7
// 5 + 8.0 = 13.0
// 5 - 7 = -2
// 3.7 - 8.0 = -4.3
// 5 - 8.0 = -3.0
// 5 * 7 = 35
// 3.7 * 8.0 = 29.6
// 5 * 8.0 = 40.0
// 5 / 7 = 0
// 3.7 / 8.0 = 0.5
// 5 / 8.0 = 0.6.0

int main() {
  int a,b,c,d,e,f;
  double da, db, dc, dd, de, df;

  a = 5;
  b = 7;

  cout << a << " + " << b << " = " << a + b << endl;

  da = 3.7;
  db = 8.0;

  cout << da << " + " << db << " = " << da + db << endl;

  c = 5;
  dc = 8.0;

  cout << c << " + " << dc << " = " << c + dc << endl;

  d = 5;
  e = 7;

  cout << d << " - " << e << " = " << d - e << endl;

  dd = 3.7;
  de = 8.0;

  cout << dd << " - " << de << " = " << dd - de << endl;

  f = 5;
  df = 8.0;

  cout << f << " * " << df << " = " << f * df << endl;
  cout << f << " / " << df << " = " << f / df << endl;
} 
