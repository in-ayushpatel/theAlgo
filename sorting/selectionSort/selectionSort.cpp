
// C++ program for selection sort  
#include <iostream> 
using namespace std; 
void selectionSort(int arr[], int n)  
{  
    int i, j, min_idx;  
    // One by one move boundary of unsorted subarray  
    for (i = 0; i < n-1; i++)  
    {  
        // Find the minimum element in unsorted array  
        min_idx = i;  
        for (j = i+1; j < n; j++)  
        if (arr[j] < arr[min_idx])
        {  
            min_idx = j;  
        }    
        //Swap 
    }  
}  
  
/* Function to print an array */
void printArray(int arr[], int size)  
{  
    cout << "Sorted array: \n"; 
    for (int i=0; i < size; i++)  
        cout << arr[i] << " ";  
    cout << endl;  
}  
  
// Driver program to test above functions  
int main()  
{  
    int n;
    cout<<"enter number of array"<<endl;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    selectionSort(arr, n);   
    printArray(arr, n);  
    return 0;  
}