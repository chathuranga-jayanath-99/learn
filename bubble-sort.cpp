#include <iostream>

using namespace std;

void bubbleSort(int arr[], int n);
void printArray(int arr[], int n);

void bubbleSort(int arr[], int n){
	printf("initial array: \n");
	printArray(arr,n);

	for(int i=0; i<n-1; i++){		
		for(int j=0;j<n-i-1;j++){
			printf("in iteration %d comparison %d: ", i, j);
			printf("compare %d and %d\n", arr[j], arr[j+1]);
			if(arr[j] > arr[j+1]) {
				swap(arr[j], arr[j+1]);
			}
			printArray(arr, n);
		}
		printf("iteration %d finish. index %d is solved.\n\n", i, n-i-1);
	}
}

void printArray(int arr[], int n) {
	for(int i=0; i<n; i++) {
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

int main() {
	int arr[] = {5,1,4,2,8};
	int n = sizeof(arr)/sizeof(arr[0]);
	bubbleSort(arr,n);
	cout <<"\nSorted array\n";
	printArray(arr, n);

	printf("read the printed lines from top to bottom to understand algorithm\n");
	return 0;
}
