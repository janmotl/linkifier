package utility;

import java.util.Collections;
import java.util.PriorityQueue;

// We can put inside anything that is comparable
public class HeapWithFixedSize<T extends Comparable <T>> extends PriorityQueue<T>{
	private final int maxSize;

	// Constructor
	public HeapWithFixedSize(int maxSize) {
		super(maxSize, Collections.reverseOrder()); // Reversed to keep the lowest probabilities at the top
		this.maxSize = maxSize;
	}

	// Add the record while preserving the size limit
	public boolean add(T relationship) {
		if (size()<maxSize || relationship.compareTo(peek())<0) { // If we know that heap is not going to change, skip the expensive insert
			super.add(relationship);
			if (size()>maxSize) poll();
		}
		return true;
	}
}
