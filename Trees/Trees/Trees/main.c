#include <stdio.h>
#include <stdlib.h>
#include "basic.h"
#include "Question2.h"
int main(int argc, const char * argv[]) {
    struct node* head = NULL;
    head = insert(8, head);head = insert(3, head);
    head = insert(1, head);head = insert(6, head);
    head = insert(4, head);head = insert(7, head);
    head = insert(10, head);head = insert(14, head);
    head = insert(13, head);
    inOrder(head);printf("NULL\n");
    printf("The height of the tree is : %d \n",findHeight(head));
    return 0;
}
