#include <iostream>
using namespace std;
int main(){
    int n=7;
    for(int i=0; i<n; i++){
        for(int j=0; j<(n/2)+i; j++){
            cout<<" ";
        }
        for(int j=0; j<n-2*i; j++){
            cout<<'@';
        }
        cout<<endl;
        if(n-2*i<0){
            break;
        }
    }
    for(int i=0; i<n; i++){
        cout<<"*";
    }
    cout<<endl;
    for(int i=0; i<n-1; i++){
        cout<<'*';
        for(int j=0; j<n-2; j++){
            cout<<" ";
        }
        cout<<'*'<<endl;
    }
}