    #include<bits/stdc++.h>
 
    using namespace std;
 
    typedef long long LL;
    typedef string S;
    typedef vector<LL> V;
    typedef pair<LL , LL > P;
    typedef map<LL,LL> M;
    typedef set<LL> st;
    typedef priority_queue<LL> PQ;
    typedef vector<P> VP;
 
    #define mp make_pair
    #define pb push_back
    #define fi first
    #define se second
    #define INF 10000000000LL
    const double PI=4*atan(1);
    #define fastio ios::sync_with_stdio(false);cin.tie(0);cout.tie(0);
 
    int main()
    {
        fastio
 
        LL T,N,M;
        long double r;
        LL i,j,k,a,b,c;
        S s;
        V v,f;
        LL temp,flag = 1,ans,count;
        char ch;
        setprecision(30);
        cin>>T;
        while(T--)
        {
            count=0;
            LL min;
             map < LL , vector < LL > > m;
             map <LL,LL> dp;
            cin>>N;
            V a,b;
            a.clear();b.clear();
            for(i=0;i<N;i++)
            {
                cin>>temp;
                a.push_back(temp);
            }
            for(i=0;i<N;i++)
            {
                
                cin>>temp;
                if(i==0)
                    min=temp;
                else if(temp<min)
                    min=temp;
                b.push_back(temp);
            }
            //cout<<min<<endl;
            map < LL,vector < LL > > :: iterator it;
            for(i=0;i<N;i++)
            {
                if(a[i]%b[i]>=min)
                {
                    count+=b[i]-a[i];
                    m[0].push_back(i);
                }
                else
                {
                    m[a[i]%b[i]].push_back(i);
                }
            }
            j=0;
            //cout<<j<<endl;j++;

           // cout<<m.size()<<endl;;
            for(it=m.begin();it!=m.end();it++)
            {
             //   cout<<j<<endl;j++;
                if(it->first!=0)
                {
                    for(i=0;i<it->second.size();i++)
                    {
                     // cout<<it->first<<it->second[i]<<endl;
                    dp[0]+=b[it->second[i]]-a[it->second[i]];
                    }
                }
            }
            LL prev=0;
            ans=dp[0];
            //cout<<ans<<endl;
            map < LL , LL > :: iterator iter;
            for(it=m.begin();it!=m.end();it++)
            {
                if(it->first!=0)
                {
                    dp[it->first]=dp[prev];
                    dp[it->first]+=(N-it->second.size())*(it->first-prev);
                    for(i=0;i<it->second.size();i++)
                    {
                        dp[it->first]-=(b[it->second[i]]-(it->first-prev));

                    }
                }
                if(dp[it->first]<ans)
                    ans=dp[it->first];
                prev=it->first;
            }
           // for(iter=dp.begin();iter!=dp.end();iter++)
           //     cout<<iter->first<<" : "<<iter->second<<endl;

            cout<<ans+count<<endl;
        }
        return 0;
    }