#include <stdio.h>
#include <stdlib.h>

int main() {
	// declare a pointer to int
	int* ptr;

	// use malloc to allocate memory for an integer
	ptr = (int*)malloc(sizeof(int));

	if(ptr==NULL){
		printf("Memory allocation failed\n");
		return 1;
	}

	// assign a value 
	*ptr = 44;

	printf("Pointer: %d\n", ptr);
	printf("Value stored in pointer: %d\n", *ptr);

	free(ptr);
	return 0;
}
