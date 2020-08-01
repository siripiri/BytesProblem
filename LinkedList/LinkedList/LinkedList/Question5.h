//
//  Question5.h
//  LinkedList
//
//  Created by sriprasath on 31/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef Question5_h
#define Question5_h
int detectLoop(struct node* node){
    struct node *fastPtr = node,*slowPtr = node;
    while(slowPtr != NULL && fastPtr != NULL && fastPtr->next != NULL){
        if(slowPtr == fastPtr){
            return 1;
        }
        slowPtr = slowPtr->next;
        fastPtr = fastPtr->next->next;
    }
    return -1;
} 

#endif /* Question5_h */
