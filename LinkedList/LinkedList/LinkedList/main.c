//
//  main.c
//  LinkedList
//
//  Created by sriprasath on 22/07/20.
//  Copyright © 2020 sriprasath. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include "basics.h"
#include "Question1.h"
#include "Question2.h"
#include "Question3.h"
#include "Question4.h"
#include "Question5.h"
#include "Question6.h"
#include "Question7.h"
#include "LeetCode.h"
int main(int argc, const char * argv[]) {
    struct node* head = NULL;
    head = insertHead(head, 1);
    head = insertAfter(head, 2, 1);
    head = insertAfter(head, 3, 2);
    head = insertAfter(head, 4, 3);
    head = insertHead(head, 5);
    printLL(head);
    printf("%d\n",rev(head));
    return 0;
}
