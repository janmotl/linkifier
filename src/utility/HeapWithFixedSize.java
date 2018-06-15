package utility;

import java.util.PriorityQueue;

// We can put inside anything that is comparable.
// The heap preserves the biggest values and keeps the minimum at the head.
// Duplicate values are permitted.
// In case of a tie & eviction, we prefer to keep older records to newer records.
public class HeapWithFixedSize<T extends Comparable <T>> extends PriorityQueue<T>{
	private final int maxSize;

	// Constructor
	public HeapWithFixedSize(int maxSize) {
		super(maxSize);
		this.maxSize = maxSize;
	}

	// Add the record while preserving the size limit.
	// Return true if the new item is inserted. If the new item is/would be immediately evicted, return false.
	public boolean add(T relationship) {
		// If we know that heap is not going to change, skip the expensive insert and return false.
		if (size()==maxSize && relationship.compareTo(peek())<=0) return false;

		super.add(relationship);
		if (size()>maxSize) poll();

		return true;
	}
}
