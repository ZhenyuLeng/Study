#include <iostream>

int main()
{
    using namespace std;
    const int size = 20;
    char first_name[size];
    char last_name[size];
    char grade;
    int age;
  
    cout << "What is your first name? ";
    (cin.get(first_name, size)).get();
  
    cout << "What is your last name? ";
    (cin.get(last_name, size)).get();

    cout << "What letter grade do you deserve? ";
    (cin >> grade).get();
    grade = (char) (grade + 1);

    cout << "What is your age? ";
    (cin >> age).get();

    cout << "Name: " << last_name << ", " << first_name << endl;
    cout << "Grade: " << grade << endl;
    cout << "Age: " << age << endl;

    return 0;
}
