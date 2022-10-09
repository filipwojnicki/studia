#include <iostream>
using namespace std;

int main() 
{    
    cout << "Size of char: " << sizeof(char) << " byte" << endl;
    cout << "Size of wchar_t: " << sizeof(wchar_t) << " byte" << endl;
    cout << "Size of int: " << sizeof(int) << " bytes" << endl;
    cout << "Size of float: " << sizeof(float) << " bytes" << endl;
    cout << "Size of double: " << sizeof(double) << " bytes" << endl;
    cout << "Size of boolean: " << sizeof(bool) << " bytes" << endl;

    return 0;
}