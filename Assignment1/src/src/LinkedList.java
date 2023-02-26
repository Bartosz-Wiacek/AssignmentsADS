package src;

public class LinkedList<T> implements Stack<T>
{
    private Node<T> head;

    @Override
    public void push(T element)
    {
        if (head == null)
        {
            head = new Node<>(element);
        }
        else
        {
         head = new Node<>(element, head);
        }
    }

    @Override
    public T pop()
    {
        if (head == null)
        {
            return null;
        }
        else
        {
            T temp = head.getElement();
            head = head.getNext();
            return temp;
        }
    }

    @Override
    public T peek()
    {
        if (head == null)
        {
            return null;
        }
      return head.getElement();
    }
}
