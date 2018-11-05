#include<stdio.h>
#include<stdlib.h>

struct Node *head=NULL;

typedef struct Node
{
    int data;
    struct Node *next;
}Node;

void addNode(int data) //The new node is the temp node, and we are switching pointers around to add it to the beginning of the lsit
{
    struct Node *temp = (struct Node*)malloc(sizeof(struct Node));
    temp -> data=data;
    temp -> next=head;
    head=temp;
}

void delete_at_head() //same idea as the addNode method, but I use the free() method to free up the memory allocation of the previous head
{
    struct Node *temp = head;
    struct Node *newHead = NULL;

    if (temp != NULL) {
        newHead = temp->next;
        free(temp);
        head = newHead;
    } else {
        printf("\nLinked list is empty");
    }

}


int main()
{
    struct Node *one = (struct Node*)malloc(sizeof(struct Node));
    struct Node *two = (struct Node*)malloc(sizeof(struct Node));

    head = one;

    one -> data = 1;
    one -> next=  two;

    two -> data=2;
    two -> next=NULL;

    printf("List: \n");
    printf("%d", one -> data);
    printf("\n%d",one -> next -> data);

    return 0;
}

/*
 * The * declares a pointer variable and the & calls the variable address
 */