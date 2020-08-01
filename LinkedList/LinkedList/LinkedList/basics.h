//
//  basics.h
//  LinkedList
//
//  Created by sriprasath on 31/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef basics_h
#define basics_h
struct node{
    int data;
    struct node* next;
};
struct doubleLL{
    int data;
    struct node* next;
    struct node* prev;
};
struct node* insertHead(struct node* node,int data){
    struct node* new_node = (struct node*)malloc(sizeof(struct node*));
    new_node->data = data;
    if(node == NULL){
        new_node->next = NULL;
        return new_node;
    }
    else{
        new_node->next = node;
        return new_node;
    }
}
struct node* insertAfter(struct node* node,int data,int prev){
    struct node* curr = node;
    
    while(curr != NULL){
        if(curr->data == prev){
            break;
        }
        curr = curr->next;
    }
    /* allocating memory to new node*/
    struct node* new_node = (struct node*)malloc(sizeof(struct node*));
    new_node->data = data;
    new_node->next = NULL;
    
    /* If element present in between the Linked List or at last of the LL*/
    struct node* temp = curr->next;
    curr->next = new_node;
    new_node->next = temp;
    
    return  node;
    
}
void printLL(struct node* node){
    printf("The LL is:\n");
    while(node!=NULL){
        printf("%d->",node->data);
        node = node->next;
    }
    printf("NULL\n");
}
void printReverse(struct node* node){
    if(node != NULL){
        printReverse(node->next);
        printf("%d->",node->data);
    }
}
struct node* deleteNode(int data,struct node* node){
    if(node == NULL){
        return node;
    }
    struct node* curr = node;
    struct node* prev = NULL;
    
    /* if its head element */
    if(data == node->data){
        node = node->next;
        free(curr);
        return node;
    }
    
    while(curr != NULL){
        if(curr->data == data){
            break;
        }
        prev = curr;
        curr = curr->next;
    }
    
    /* If the element at last of the LL*/
    if(curr->next == NULL){
        prev->next = NULL;
        free(curr);
        return node;
    }
    
    /* If the element present in mid of the LL*/
    prev->next = curr->next;
    free(curr);
    return node;
    
}
#endif /* basics_h */
