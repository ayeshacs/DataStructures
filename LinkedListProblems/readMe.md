# LinkedList


## Definition:

Stores data with nodes that point to other nodes.
Nodes, at its most basic it has one datum and one reference (another node).
A linked list chains nodes together by pointing one node's reference towards another node.


### What you need to know:

* Designed to optimize insertion and deletion, slow at indexing and searching.
* Doubly linked list has nodes that reference the previous node.
* Circularly linked list is simple linked list whose tail, the last node, references the head, the first node.
* Stack, commonly implemented with linked lists but can be made from arrays too.
    Stacks are last in, first out (LIFO) data structures.
    Made with a linked list by having the head be the only place for insertion and removal.
* Queues, too can be implemented with a linked list or an array.
    Queues are a first in, first out (FIFO) data structure.
    Made with a doubly linked list that only removes from head and adds to tail.


#### Big O efficiency:

* Indexing: Linked Lists: O(n)
* Search: Linked Lists: O(n)
* Optimized Search: Linked Lists: O(n)
* Insertion: Linked Lists: O(1)
