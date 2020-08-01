//
//  Question2.h
//  Trees
//
//  Created by sriprasath on 21/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef Question2_h
#define Question2_h
#include<stdio.h>
struct node* convertMirror(struct node* node){
    if(node == NULL){
        return NULL;
    }
    node->left = convertMirror(node->left);
    node->right = convertMirror(node->right);
    struct node* temp = node->left;
    node->left = node->right;
    node->right = temp;
    return node;
}

#endif /* Question2_h */
