//
//  Question4.h
//  LinkedList
//
//  Created by sriprasath on 31/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef Question4_h
#define Question4_h

struct node* reverseLL(struct node* node){
    struct node* curr = node,*next = node,*prev = NULL;
    while(curr != NULL){
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
#endif /* Question4_h */
