package fr.adneom.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PartitionListTest {

	private Partition<Integer> partitionList = new PartitionList<>();

	@Test
	public void testPartition() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		String listeNormale = partitionList.partition(liste, 2).toString();
		String listeTailleSuperieur = partitionList.partition(liste, 6).toString();

		assertEquals("[[1, 2], [3, 4], [5]]", listeNormale);

		assertEquals("[[1, 2, 3, 4, 5]]", listeTailleSuperieur);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testListeNull() {
		partitionList.partition(null, 12);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTailleNull() {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		partitionList.partition(liste, 0);
	}

}
