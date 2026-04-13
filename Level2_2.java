#include <iostream>
using namespace std;

int recursiveSum(int n)
{
    if(n == 1)
        return 1;
    return n + recursiveSum(n - 1);
}

int formulaSum(int n)
{
    return n * (n + 1) / 2;
}

int main()
{
    int n;
    cin >> n;

    if(n <= 0)
    {
        cout << "Not a natural number";
        return 0;
    }

    int sum1 = recursiveSum(n);
    int sum2 = formulaSum(n);

    cout << sum1 << endl;
    cout << sum2 << endl;

    if(sum1 == sum2)
        cout << "Both results are correct";
    else
        cout << "Results do not match";

    return 0;
}