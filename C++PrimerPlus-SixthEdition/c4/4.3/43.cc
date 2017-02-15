#include <iostream>
#include <cstring>

int main()
{
    using namespace std;
    char first_name[20];
    char last_name[20];
    char add[3] = ", ";
    char name[43];

    cout << "Enter your first name: ";
    (cin.get(first_name, 20)).get();

    cout << "Enter your last name: ";
    (cin.get(last_name, 20)).get();

    strcat(name, last_name);
    strcat(name, add);
    strcat(name, first_name);

    cout << "Here's the information in a single string: " << name << endl;
}
