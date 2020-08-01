//
//  Question1.h
//  LinkedList
//
//  Created by sriprasath on 31/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef Question1_h
#define Question1_h
int nodeFromLast1(struct node* node,int n){
    struct node* curr = node;
    int len = 0;
    while(curr != NULL){
        curr = curr->next;
        len++;
    }
    if(len < n){
        printf("n is greater than length of the LL");
        return -1;
    }
    curr = node;
    for(int i=1;i<len-n+1;i++){
        curr = curr->next;
    }
    return curr->data;
}
int nodeFromLast2(struct node* node,int n){
    struct node* curr = node;
    if(node != NULL){
        int count = 0;
        while(count < n){
            if(curr == NULL){
                printf("n is greater than length of the LL");
                return -1;
            }
            curr = curr->next;
            count++;
        }
        struct node* mainPtr = node;
        while(curr != NULL){
            mainPtr = mainPtr->next;
            curr = curr->next;
        }
        return mainPtr->data;
    }
    return -1;
}
#endif /* Question1_h */
