package datastructure;
// Single linked list

public class LinkedList {
    private Link first;
    public boolean isEmpty()
    {
      return first==null; // if (first==null) {return true;} else {return false;}

    }
    public void insertFirst(int data)
    {
        Link second = new Link(data);
        if (first==null)
        {
            first = second;
        }
        else{
            second.next = first;
            first = second;
        }
    }
}

