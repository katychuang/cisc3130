# Exercises

Application type problems

## Film Collection

Try inserting and deleting films from the film collection

Implement the code that would make this bit of code work:

```java
public static void main(String[] args) {
    FilmCollection watchList = new FilmCollection();
    watchList.insertFirst("The Matrix", 1999);
    watchList.insertFirst("The Matrix Revolutions", 2003);
    watchList.insertFirst("The Matrix Reloaded", 2003);
    watchList.insertFirst("Iron Man", 2008);
    watchList.displayList();

    watchList.deleteFirst();
    watchList.displayList()’
}
```

## Song Playlist 

Implement the code that would make this bit of code work:

```java
public static void main(String[] args) {
    Playlist playlist = new Playlist();
    playlist.insertFirst("WAP", 5992721);
    playlist.insertFirst("Mood",5342940);
    playlist.insertFirst("Hawái", 5082385);
    playlist.insertFirst("Dynamite",4081950);
    playlist.displayList();
}
```
--- 

Purely abstract exercises

## Simple Linked List

### Inserting, deleting, and searching from a simple linked list

Try implementing the code that would allow you to do the following

```java
LinkedList myList = new LinkedList();
myList.insertFirst(22);
myList.insertFirst(44);
myList.insertFirst(66);
myList.insertFirst(88);

myList.displayList();

while (!myList.isEmpty())
   myList.deleteFirst();

myList.displayList();
```

### Implement the size() method for linked list

Working through this...

1. Planning the problem

The number of elements in a linked list can be determined by initializing a counter to 0 and then incrementing the counter at each step of traversal of the linked list.

2. What variables do we need?

A counter variable



## Double ended list

### Inserting, deleting, and searching from a double ended linked list

Try implementing the code that would allow you to do the following

```java
LinkedList myList = new LinkedList();
myList.insertFirst(22);
myList.insertFirst(44);
myList.insertFirst(66);

myList.insertLast(11);
myList.insertLast(33);
myList.insertLast(55);

myList.displayList();

// Inserting items at the beginning reverses their order
// Inserting items at the end, preserves their order!
```