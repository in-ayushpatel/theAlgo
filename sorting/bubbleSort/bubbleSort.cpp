
// C++ program for Bubble sort  
#include <iostream> 
using namespace std; 
  
// Bubble sort function
void bubbleSort(int arr[], int n)  
{  
    for (int i = 0; i < n-1; i++){
        for (int j = 0; j < n-i-1; j++)
        {
            if (arr[j] > arr[j+1])
            {
                //Swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}  
//Function to print an array
void printArray(int arr[], int size)  
{   
     cout<<"Sorted array: \n";
    for (int i = 0; i < size; i++)  
        cout << arr[i] << " ";  
    cout << endl;  
}  


  
// main function 
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
    bubbleSort(arr, n);  
    printArray(arr, n);  
    return 0;  
}  