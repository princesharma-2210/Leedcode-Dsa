#include<iostream>
// #include<string>
using namespace std;

void pointer(){
    cout<<"ha ji me he hu pointer()"<<endl;
    int a=5;
    //refernce store karna
    int *p= &a;
    int **q= &p;
    //copy karna
    int r= *p;
    // **q=**q+1;
    r=r+1;
    cout<< **q<<endl;
    cout<<r<<endl;
    cout<<a<<endl;
    cout<<&a<<endl;

}
void arrayPointer(){
    cout<<"me hu Array ab pointer se khellunga"<<endl;
    int arr[10]={2,4,6};
    //by default it take first index of array.
    cout<<arr<<endl;
    cout<<&arr[0]<<endl;
    // arr store 0 index address +2 mean every you try to increase 4+4 sizeof int.
    cout<<*(arr+2)<<endl;
    cout<<++0[arr]<<endl;
    //size of array in case of integer 4*(no of item) and pointer take 8 bits always.
}

int main(){
    // pointer();
    arrayPointer();
}