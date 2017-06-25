package utility;

import java.util.HashMap;
import java.util.Map;

// A set, which keeps record of the value occurrence count.
public class MultiSet<K> extends HashMap<K, Integer>{
	private Map<K, Integer> objectCounts = new HashMap<>();
	private int totalCount = 0;

	// Constructor
	public MultiSet() {
		super();
	}

	public void add(K obj) {
		Integer count = objectCounts.get(obj);
		if (count == null) {
			objectCounts.put(obj, 1);
		} else {
			objectCounts.put(obj, ++count);
		}
		totalCount++;
	}

	public int count(K obj) {
		Integer count = objectCounts.get(obj);
		if (count == null) {
			return 0;
		} else {
			return count;
		}
	}

	public int totalCount() {
		return totalCount;
	}
}
