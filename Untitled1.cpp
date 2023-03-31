#include<bits/stdc++.h>
using namespace std;

int main()
{
int n;
cin>>n;
int arr[n];
for(int i=0;i<n;i++)
{
cin>>arr[i];
}

int rmin=INT_MAX,ans;
for(int i=0;i<n;i++)
{
    int red=0;
    for(int j=0;j<n;j++)
    {
        int k=0;
        if(arr[j]>=arr[i])
        {
            k=arr[i];
        }
        red=red+(arr[j]-k);
    }

    if(rmin>=red)
    {
        rmin=red;
        ans=arr[i];
    }

}
cout<<ans;
return 0;
}
