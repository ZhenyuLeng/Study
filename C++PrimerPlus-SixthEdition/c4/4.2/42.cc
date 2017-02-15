#include <iostream>
#include <string>

int main()
{
    using namespace std;
    string first_name;
    string last_name;
    char grade;
    int age;
  
    cout << "What is your first name? ";
    getline(cin, first_name);
  
    cout << "What is your last name? ";
    getline(cin, last_name);

    cout << "What letter grade do you deserve? ";
    cin >> grade;
    grade = (char) (grade + 1);

    cout << "What is your age? ";
    (cin >> age).get();

    cout << "Name: " << last_name << ", " << first_name << endl;
    cout << "Grade: " << grade << endl;
    cout << "Age: " << age << endl;

    return 0;
}
