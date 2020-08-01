//
//  Question6.h
//  LinkedList
//
//  Created by sriprasath on 31/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef Question6_h
#define Question6_h
struct node* detectLoopAndRemove(struct node* node){
    struct node *fastPtr = node,*slowPtr = node;
    while(slowPtr != NULL && fastPtr != NULL && fastPtr->next != NULL){
        if(slowPtr == fastPtr){
            break;
        }
        slowPtr = slowPtr->next;
        fastPtr = fastPtr->next->next;
    }
    if(slowPtr != fastPtr){
        return NULL;
    }
    slowPtr = node;
    while (slowPtr!=fastPtr) {
        slowPtr = slowPtr->next;
        fastPtr = fastPtr->next;
    }
    return slowPtr;
}

#endif /* Question6_h */
