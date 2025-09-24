#include<iostream>
#include<iostream>
#include<string>
#include<map>
using namespace std;
int main(){
    string s1 = "abc";
    string s2 = "acd";
    map<char,int> m;
    if(s1.length()!=s2.length()){
        cout<<"false"<<endl;
        return 0;
    }
    for(int i=0; i<s1.length(); i++){
        m[s1[i]]++;
    }
    for(int i=0; i<s2.length(); i++){
        if(m.find(s2[i])==m.end()){
            cout<<"false"<<endl;
            return 0;
        }else{
            m[s2[i]]--;
        }
    }
    for(const auto& pair: m){
        if(pair.second!=0){
            cout<<"false"<<endl;
            return 0;
        }
    }
    cout<<"true"<<endl;
    return 0;
}