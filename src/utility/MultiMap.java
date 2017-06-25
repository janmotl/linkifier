package utility;

import java.util.*;

// A map, where we can have multiple values for the same key.
public class MultiMap {
	private Map<String, List<String>> multimap;

	public MultiMap() {
		multimap = new HashMap<>();
	}

	// If it contains the key, just add the value into the list. Otherwise create the key and the list with the value.
	public void put(String K, String V) {
		if (multimap.containsKey(K)) multimap.get(K).add(V);
		else {
			multimap.put(K, new ArrayList<>());
			multimap.get(K).add(V);
		};
	}

	public List<String> get(String K) {
		List<String> values = multimap.get(K);
		if (values == null) {
			values = new ArrayList<>();
		}
		return values;
	}

	public void remove (String K) {
		multimap.remove(K);
	}

	public boolean isEmpty () {
		return multimap.isEmpty();
	}

	public int size() {
		return multimap.size();
	}
}
