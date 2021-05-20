package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		int i = p1.getName().compareToIgnoreCase(p2.getName());
		if ( i <= -1)
			return -1;
		else if (i >= 1)
			return 1;
		return 0;
	}

}
