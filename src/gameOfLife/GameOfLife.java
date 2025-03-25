package gameOfLife; 

import java.util.Random; 
import java.util.Scanner; 

public class GameOfLife {
    private int size; 						// Speichert die Gr��e des Spielfelds
    private boolean[][] gameboard; 			// 2D-Array zur Darstellung des Spielfelds

    /**
     * Konstruktor zur Initialisierung des Spielfelds mit einer bestimmten Gr��e.
     * @param size Die Gr��e des Spielfelds (size x size)
     */
   public GameOfLife(int size) {
     this.size = size; 
     	gameboard = new boolean[size][size]; 	// Erstellt ein 2D-Array mit der Gr��e
     											//die der Benutzer vorgibt
     		initializeGameboard(); 				// Initialisiert das Spielfeld
    }

    /**
     * Initialisiert das Spielfeld mit einer 20%igen Wahrscheinlichkeit f�r lebende Zellen.
     */
    private void initializeGameboard() {
       Random randomSpawn = new Random(); 			// Erstellt ein Random-Objekt zur zuf�lligen
       												//Erzeugung von Zellen
        for (int i = 0; i < size; i++) { 			// Durchl�uft die ZEILEN
            for (int j = 0; j < size; j++) { 		// Durchl�uft die SPALTEN
                gameboard[i][j] = randomSpawn.nextDouble() < 0.2; 	// Setzt die Zelle mit
                													//20% Wahrscheinlichkeit auf lebendig
            }
        }
    }

    /**
     * Gibt den aktuellen Zustand des Spielfelds auf der Konsole aus.
     */
    private void printGameboard() {
        for (int i = 0; i < size; i++) { 							// Durchl�uft die ZEILEN
            for (int j = 0; j < size; j++) { 						// Durchl�uft die SPALTEN
                System.out.print(gameboard[i][j] ? "O " : ". "); 	// Gibt "O" f�r lebende
                													//und "." f�r tote Zellen aus
            }
            System.out.println(); 			// Neue Zeile f�r die n�chste Reihe
        }
        System.out.println();				// Zus�tzliche Leerzeile zur besseren Lesbarkeit
    }

    /**
     * Z�hlt die Anzahl lebender Nachbarn f�r eine bestimmte Zelle.
     * @param x Die x-Koordinate der Zelle
     * @param y Die y-Koordinate der Zelle
     * @return Die Anzahl lebender Nachbarn
     */
    private int countNeighbors(int x, int y) {
        int count = 0; 							// Z�hlt die lebenden Nachbarn
        for (int i = -1; i <= 1; i++) { 		// Durchl�uft die Nachbarn in der ZEILENRICHTUNG
            for (int j = -1; j <= 1; j++) { 	// Durchl�uft die Nachbarn in der SPALTENRICHTUNG
                if (!(i == 0 && j == 0)) { 		// �berspringt die Zelle selbst
                    int nx = x + i, ny = y + j; // Berechnet die Nachbar-Koordinaten
                    if (nx >= 0 && ny >= 0 && nx < size && ny < size && gameboard[nx][ny]) { 
                    	// Pr�ft, ob der Nachbar innerhalb des Spielfelds liegt und lebt
                        count++; 				// Erh�ht den Z�hler
                    }
                }
            }
        }
        return count; 							// Gibt die Anzahl lebenden Nachbarn zur�ck
    }

    /**
     * Berechnet die n�chste Generation des Spielfelds basierend auf den Regeln von Game of Life.
     * @return true, wenn es noch lebende Zellen gibt, false, wenn alle Zellen tot sind
     */
    private boolean nextGeneration() {
        boolean[][] newGameboard = new boolean[size][size]; // Erstellt ein neues Spielfeld f�r die n�chste Generation
        boolean hasLivingCells = false;						// Variable zur �berpr�fung, ob noch lebende Zellen existieren
        for (int i = 0; i < size; i++) { 					// Durchl�uft die ZEILEN
            for (int j = 0; j < size; j++) {				// Durchl�uft die SPALTEN
                int neighbors = countNeighbors(i, j); 		// Z�hlt die Nachbarn der aktuellen Zelle
                if (gameboard[i][j]) { 						// Falls die aktuelle Zelle lebt
                    newGameboard[i][j] = (neighbors == 2 || neighbors == 3); // Bleibt nur bei 2 oder 3 Nachbarn am Leben
                } else { 									// Falls die aktuelle Zelle tot ist
                    newGameboard[i][j] = (neighbors == 3);  // Wird bei genau 3 Nachbarn wiederbelebt
                }
                if (newGameboard[i][j]) { 					// Falls die Zelle lebt
                    hasLivingCells = true; 					// Setzt das hasLivingCells auf true
                }
            }
        }
        gameboard = newGameboard; 		// Aktualisiert das Spielfeld
        return hasLivingCells; 			// Gibt zur�ck, ob noch lebende Zellen vorhanden sind
    }

    /**
     * F�hrt die Simulation von Game of Life aus, bis alle Zellen tot sind.
     */
    public void runTheGame() {
        while (true) { 					// Solange es lebendige Zellen gibt l�uft das Spiel
            printGameboard(); 			// Gibt das Spielfeld aus
            if (!nextGeneration()) { 	// Falls keine lebenden Zellen mehr vorhanden sind
                System.out.println("Alle Zellen sind tot. Das Spiel endet."); 
                break; 					// Beendet die Schleife
            }
            try {
                Thread.sleep(1000);					// Wartet eine Sekunde zwischen den Generationen
            } catch (InterruptedException e) { 		// Falls der Thread unterbrochen wird
                Thread.currentThread().interrupt(); // Stellt sicher, dass der Thread korrekt behandelt wird, setzt Interrupt-Flag zur�ck auf true
            }
        }
    }

    /**
     * Hauptmethode zur Steuerung der Game of Life-Simulation.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 					// Erstellt ein Scanner-Objekt zur Eingabe
        System.out.print("Geben Sie die Gr��e der Matrix ein: "); 	// Fragt nach der Gr��e des Spielfelds
        int size = scanner.nextInt(); 								// Liest die Benutzereingabe als Integer ein
        scanner.nextLine(); 									
        
        GameOfLife game = new GameOfLife(size); 					// Erstellt ein GameOfLife-Objekt mit der eingegebenen Gr��e
        game.runTheGame(); 											// Startet die Simulation
    }
}
