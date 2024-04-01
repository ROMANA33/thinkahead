package Modele;
import java.util.*;

public class Grille {
	//Les attributs
	private int nbLigne;
	private int nbColonne;
	private char [][] grille;
	
	//Constructeur
	public Grille(int n, int p) {
		nbLigne = n;
		nbColonne = p;
		grille = new char[nbLigne][nbColonne];
		
		for(int i = 0; i < nbLigne; i++) {
			for(int j = 0; j < nbColonne; j++) {
				
				grille[i][j] = '.';
			}
		}
	}
	
	//accesseurs
	public char getCase(int l, int c) {
		return grille[l - 1][c -1];
	}
	
	
	//methodes
	//Afficher
	public void afficher() {
		System.out.println();
		for(int i = 0; i < nbLigne; i++) {
			for(int j = 0; j < nbColonne; j++) { 
				
				System.out.print(" | " + grille[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println();
	}
	
	//placer
	public void placer(int l, int c, char t) {
		l = l-1;
		c = c-1;
		
		//On teste si on se trouve bien dans la grille
		if(l < 0 || c < 0 || l > nbLigne || c > nbColonne) {
			System.out.println("Erreur de placement!");
			return;
		}
		if(grille[l][c] == '.') {
			grille[l][c] = t;	
		}
		else {
			System.out.println("Erreur, cette zone n'est pas vide !");
		}
	}
	
	//Deplacer
	
	public void deplacerH() {
		
		char tmp;
		for(int i = 0; i < nbLigne; i++) {
			for(int j = 0; j < nbColonne; j++) { 
				if(grille[i][j] == 'j') {  //on cherche le joueur
					if(i - 1 >= 0 && grille	[i-1][j] == '.') {  //on teste la position
						tmp = grille[i][j];  //on copie le perso
						grille[i][j] = '.';  //on vide la case
						grille[i-1][j] = tmp;  //on deplace le perso  
						
					}
				}
			}
		}
	}
public void deplacerD() {
		
		char tmp;
		for(int i = 0; i < nbLigne; i++) {
			for(int j = 0; j < nbColonne; j++) { 
				if(grille[i][j] == 'j') {  //on cherche le joueur
					if(j + 1 <= nbColonne && grille	[i+1][j] == '.') {  //on teste la position
						tmp = grille[i][j];  //on copie le perso
						grille[i][j] = '.';  //on vide la case
						grille[i][j+ 1] = tmp;  //on deplace le perso  
						
					}
				}
			}
		}
	}
public void deplacerB() {
	
	char tmp;
	for(int i = 0; i < nbLigne; i++) {
		for(int j = 0; j < nbColonne; j++) { 
			if(grille[i][j] == 'j') {  //on cherche le joueur
				if(i + 1 <= nbLigne && grille	[i][j-1] == '.') {  //on teste la position
					tmp = grille[i][j];  //on copie le perso
					grille[i][j] = '.';  //on vide la case
					grille[i+1][j] = tmp;  //on deplace le perso  
					
				}
			}
		}
	}
}
public void deplacerG() {
	
	char tmp;
	for(int i = 0; i < nbLigne; i++) {
		for(int j = 0; j < nbColonne; j++) { 
			if(grille[i][j] == 'j') {  //on cherche le joueur
				if(j - 1 >= 0 && grille	[i][j+1] == '.') {  //on teste la position
					tmp = grille[i][j];  //on copie le perso
					grille[i][j] = '.';  //on vide la case
					grille[i][j-1] = tmp;  //on deplace le perso  
					
				}
			}
		}
	}
}
	
	
		

}
