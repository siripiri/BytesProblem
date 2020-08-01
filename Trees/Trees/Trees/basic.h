//
//  basic.h
//  Trees
//
//  Created by sriprasath on 20/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef basic_h
#define basic_h
#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node* left;
    struct node* right;
};
struct node* insert(int data,struct node* node){
    if(node == NULL){
        struct node* new_node = (struct node*)malloc(sizeof(struct node*));
        new_node->data = data;
        new_node->left = NULL;
        new_node->right = NULL;
        return new_node;
    }
    if(data < node->data){
        node->left = insert(data, node->left);
    }
    if(data > node->data){
        node->right = insert(data, node->right);
    }
    return node;
}
void preOrder(struct node* node){
    if(node != NULL){
        printf("%d->",node->data);
        preOrder(node->left);
        preOrder(node->right);
    }
}
void inOrder(struct node* node){
    if(node != NULL){
        inOrder(node->left);
        printf("%d->",node->data);
        inOrder(node->right);
    }
}
struct node* search(struct node* node,int element){
    if(node == NULL || node->data == element){
        return node;
    }
    else if(element > node->data){
        return search(node->right, element);
    }
    return search(node->left, element);
}
/*
 Function to delete an Node
 */
struct node* delete(struct node* node,int element){
    struct node *curr = node, *prev = NULL ;
    while(curr != NULL){
        if(curr->data == element){
            break;
        }
        else if(element > curr->data){
            prev = curr;
            curr = curr->right;
        }
        else if(element < curr->data){
            prev = curr;
            curr = curr->left;
        }
    }
    if(curr == NULL){
        printf("There is no such element to delete\n");
        return node;
    }
    /*
     case 1: if the node has no child
     */
    if(curr->left == NULL && curr->right == NULL){
        if(prev->left == curr){
            prev->left = NULL;
            free(curr);
        }
        else{
            prev->right = NULL;
            free(curr);
        }
        return node;
    }
    /*
     case 2: if the node has one of it's child
     */
    if(curr->left == NULL && curr->right != NULL){
        if(prev->right == curr){
            prev->right = curr->right;
            free(curr);
        }
        else{
            prev->left = curr->right;
            free(curr);
        }
        return node;
    } 
    else if(curr->right == NULL && curr->left != NULL){
        if(prev->right == curr){
            prev->right = curr->left;
            free(curr);
        }
        else{
            prev->left = curr->left;
            free(curr);
        }
        return node;
    }
    /*
     case 3: if the node has all the two child then find the inorder successor of any one of the child
     */
    struct node* temp = curr;
    struct node* temp_prev = prev;
    while(temp->left != NULL){
        temp_prev = temp;
        temp = temp->left;
    }
    temp_prev->left = NULL;
    if(prev->left == curr){
        prev->left = temp;
        temp->right = curr->right;
        temp->left = curr->left;
        free(curr);
    }
    else{
        prev->right = temp;
        temp->right = curr->right;
        temp->left = curr->left;
        free(curr);
    }
    return node;
}
/*
 Function to get min element in the bst
 */
int findMin(struct node* node){
    if(node == NULL){
        printf("The node is NULL");
        return -1;
    }
    while (node->left!=NULL) {
        node = node->left;
    }
    return node->data;
}
/*
 Function to get max element in the bst
 */
int findMax(struct node* node){
    if(node == NULL){
        printf("The node is NULL");
        return -1;
    }
    while(node->right != NULL){
        node = node->right;
    }
    return node->data;
}
/*
 Function to return max of 2 int
 */
int max(int a,int b){
    return a>b ? a : b;
}
/*
 Function to find the height of the bst
 */
int findHeight(struct node* node){
    if(node == NULL){
        return 0;
    }
    int leftHeight = findHeight(node->left);
    int rightHeight = findHeight(node->right);
    return max(leftHeight,rightHeight)+1;
}
#endif /* basic_h */
