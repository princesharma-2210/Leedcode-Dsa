#include<iostream>
#include <string>
using namespace std;
class Teacher{
    public:
    string name;
    string deptName;
    Teacher(){
        cout<<"hello!";
    }
};
int main(){
    Teacher t1;
    t1.name= "Ram";
    t1.deptName= "cs";
}