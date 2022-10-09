#include <iostream>

int main()
{
    int a = 1000000, b = 1000000;
    long long int c = static_cast<long long int>(a)*b;
    std::cout << c;
    return 0;
};