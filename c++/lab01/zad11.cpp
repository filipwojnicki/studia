#include <iostream>
#include <limits.h>

int main()
{
    int a = 1000000, b = 1000000;

    long long int c = static_cast<long long int>(a)*b;
    std::cout << a << " * " << a << " = " << c << std::endl;
    
    if (b > 0 && a > INT_MAX - b) {
      std::cout << "Przepelnienie dodawanie";
      return 1;
    }

    if (b < 0 && a < INT_MIN - b) {
      std::cout << "Niedomiar dodawanie";
      return 1;
    }

    if (b < 0 && a > INT_MAX + b) {
      std::cout << "Przepelnienie odejmowanie";
      return 1;
    }

    if (b > 0 && a < INT_MIN + b) {
      std::cout << "Niedomiar odejmowanie";
      return 1;
    }

    if (b != 0 && a > INT_MAX / b) {
      std::cout << "Przepelnienie mnozenie";
      return 1;
    }

    if (b != 0 && a < INT_MIN / b) {
      std::cout << "Niedomiar mnozenie";
      return 1;
    }

    return 0;
};