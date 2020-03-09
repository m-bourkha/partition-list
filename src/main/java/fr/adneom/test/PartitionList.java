package fr.adneom.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionList<T> implements Partition<T> {

	public List<List<T>> partition(List<T> liste, int taille) {
		List<List<T>> listes = new ArrayList<>();
		List<T> sousList = null;

		if (liste == null)
			throw new IllegalArgumentException("La list est null");

		if (taille == 0)
			throw new IllegalArgumentException("la taille de partitionnement est null");

		int listeSize = liste.size();

		if (listeSize <= taille) {
			listes.add(liste);
			return listes;
		}

		for (int i = 0; i < listeSize / taille; i++) {
			sousList = new ArrayList<>();
			for (int j = 0; j < taille; j++) {
				sousList.add(liste.get(i * taille + j));
			}
			listes.add(sousList);
		}

		if (listeSize % taille != 0) {
			sousList = new ArrayList<>();
			int startIndexOfLastElements = listeSize - listeSize % taille;
			for (int j = startIndexOfLastElements; j < listeSize; j++) {
				sousList.add(liste.get(j));
			}
			listes.add(sousList);

		}

		return listes;

	}

}
