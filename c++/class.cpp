#include<iostream>
#include <string>
using namespace std;
class Teacher{
    public:
    string name;
    string deptName;
    Teacher(){
        cout<<"hello!"<<endl;
    }
};
int main(){
    Teacher t1;
    t1.name= "Ram";
    t1.deptName= "cs";
    cout<<t1.name<<endl;
}