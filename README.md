# Linked List
A list of nodes which refer to each other (or to another node).

 
## Problem
Implement doubly-linked list in Java and the following methods:
* __traverse__
* __makeFromArrayOfStrings__ (similar to _addAll_ method from the Collection 
  interface? we started to write this, but another approach might be to 
  initialize an empty list and the add elements one by one; ref. _add_ and 
  _addAll_ methods)

## Test-driven approach
* modelling testing with the class __TestRunner__
* modelling tests for the doubly-linked list with the class 
  [TestDoublyLinkedList](exp/TestDoublyLinkedList.java)
* doubly-linked list is modelled with the class [DoublyLinkedList](exp/DoublyLinkedList.java)
* a node in the list is modelled with the class [Node](exp/Node.java)
* traversing is modelled by with __TestTraverse__ function (similar to 
  _iterator_ method from Collection interface)