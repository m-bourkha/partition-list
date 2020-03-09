package fr.adneom.test;

import java.util.List;

public interface Partition<T> {

	/**
	 * Partitionne la liste specifée en liste de sous listes de taille maximum
	 * est égale à taille
	 * 
	 * @param liste
	 * @param taille
	 * 
	 */
	List<List<T>> partition(List<T> liste, int taille);
}
