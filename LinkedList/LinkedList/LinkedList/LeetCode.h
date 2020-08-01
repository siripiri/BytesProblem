//
//  LeetCode.h
//  LinkedList
//
//  Created by sriprasath on 02/08/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#ifndef LeetCode_h
#define LeetCode_h
int rev(struct node* node){
    if(node != NULL){
        int reverse = rev(node->next);
        return reverse*10 + node->data;
    }
    return 0;
}
#endif /* LeetCode_h */
