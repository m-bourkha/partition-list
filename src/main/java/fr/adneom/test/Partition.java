package fr.adneom.test;

import java.util.List;

public interface Partition<T> {

	/**
	 * Partitionne la liste specif�e en liste de sous listes de taille maximum
	 * est �gale � taille
	 * 
	 * @param liste
	 * @param taille
	 * 
	 */
	List<List<T>> partition(List<T> liste, int taille);
}
