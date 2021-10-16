// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
import java.util.NoSuchElementException;

class PeekingIterator implements Iterator<Integer> {
    private Integer nextValue;
    private Iterator<Integer> p;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        if(iterator.hasNext())
        {
            nextValue=iterator.next();
        }
        p = iterator;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextValue;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(nextValue==null)
            throw new NoSuchElementException();
        Integer toReturn = nextValue;
        
        if(p.hasNext())
        {
            nextValue=p.next();
        }
        else
        {
            nextValue=null;
        }
	    return toReturn;
	}
	
	@Override
	public boolean hasNext() {
	    return nextValue!=null;
	}
}
