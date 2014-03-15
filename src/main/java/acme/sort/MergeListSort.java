package acme.sort;

import java.util.LinkedList;
import java.util.List;

public class MergeListSort implements ListSort {

	@Override
	public List<Integer> sort (List<Integer> unsorted) {
		// we want to be recursive, base case
		if (unsorted.size() <= 1) {
			return unsorted;
		}

		// divide
		int middle = unsorted.size() / 2;
		List<Integer> left = new LinkedList<Integer>(unsorted.subList(0, middle));
		List<Integer> right = new LinkedList<Integer>(unsorted.subList(middle, unsorted.size()));

		left = sort(left);
		right = sort(right);

		return merge(left, right);
	}

	private List<Integer> merge (List<Integer> left, List<Integer> right) {
		List<Integer> result = new LinkedList<>();

		while (left.size() > 0 || right.size() > 0) {
			// one list might be exhausted before the other, three cases
			if (left.size() > 0 && right.size() > 0) {
				if (left.get(0) <= right.get(0)) {
					result.add(left.remove(0));
				} else {
					result.add(right.remove(0));
				}
			} else if (left.size() > 0) {
				result.addAll(left);
				left.clear();
			} else if (right.size() > 0) {
				result.addAll(right);
				right.clear();
			}
		}

		return result;
	}

}
