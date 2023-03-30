#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cout<<"ENTER SIZE OF ARRAY 1-";
    cin>>n;
    
    set<int> s1;
    int arr1[n];
    cout<<"ENTER ARRAY-"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr1[i];
        s1.insert(arr1[i]);
    }
    
    int m;
    cout<<"ENTER SIZE OF ARRAY 2-";
    cin>>m;
    int arr2[m];
    cout<<"ENTER ARRAY-"<<endl;
    for(int i=0;i<m;i++)
    {
        cin>>arr2[i];
        s1.insert(arr2[i]);
    }
    

    vector<int> v2;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(arr1[i]==arr2[j])
            {
                v2.push_back(arr1[i]);
                arr2[j]=INT_MIN;
                break;
            }
        }
    }
    
    cout<<"UNION IS-"<<endl;
    for(int x:s1)
    {
        cout<<x<<" ";
    }
    cout<<endl;
    
    cout<<"INTERSECTION IS-"<<endl;
    for(int x:v2)
    {
        cout<<x<<" ";
    }
    
    return 0;
}}