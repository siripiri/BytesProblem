//
//  Question2.h
//  LinkedList
//
//  Created by sriprasath on 31/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef Question2_h
#define Question2_h
struct node* middleNode(struct node* node){
    if(node == NULL){
        return NULL;
    }
    struct node *refPtr = node,*mainPtr = node;
    while(refPtr != NULL && refPtr->next != NULL){
        refPtr = refPtr->next->next;
        mainPtr = mainPtr->next;
    }
    return mainPtr;
}
#endif /* Question2_h */
