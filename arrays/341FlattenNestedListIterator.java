/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
import java.util.NoSuchElementException;
public class NestedIterator implements Iterator<Integer> {

    private Deque<ListIterator<NestedInteger>> stackOfIterators = new ArrayDeque();
    private Integer peeked=null;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        stackOfIterators.addFirst(nestedList.listIterator());    
    }

    private void makeStackTopAnInteger()
    {
        if(peeked!=null) return;
            
        while(!stackOfIterators.isEmpty())
        {
            if(!stackOfIterators.peekFirst().hasNext())
            {
                stackOfIterators.removeFirst();
                continue;
            }    
            
            NestedInteger n = stackOfIterators.peekFirst().next();
            if(n.isInteger())
            {
                peeked = n.getInteger();
                return;
            }
            
            stackOfIterators.addFirst(n.getList().listIterator());
        }
        
        
    }
    @Override
    public Integer next() {
        if(!hasNext()) throw new NoSuchElementException();
        
        Integer result = peeked;
        peeked=null;
        return result;
    }

    @Override
    public boolean hasNext() {
        makeStackTopAnInteger();
        return peeked!=null;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
