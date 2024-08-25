package lista7_9;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_9 {
    public static void main(String[] args) {
        final int LIMITEMAX = 100;
        final int MAX = 5;
//        final int COLUNA = 5;
        int m[][] = new int [MAX][MAX];
        int m2[][] = new int [MAX][MAX];
        int l, c;
        for(l = 0; l < MAX; l++){
            for(c = 0; c < MAX; c++){
                m[l][c] = (int) (Math.random() * (LIMITEMAX+1));
            }
        }
        for(l = 0; l < MAX; l++){
            for(c = 0; c < MAX; c++){
                m2[c][l] = m[l][c];
            }
        }
        String vetorOriginal = "";
        for(int x = 0; x < MAX; x++){
            vetorOriginal += Arrays.toString(m[x]) + "\n";
        }
        String vetorModificado = "";
        for(int x = 0; x < MAX; x++){
            vetorModificado += Arrays.toString(m2[x]) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz gerada: \n"+vetorOriginal+"\n\nMatriz modificada: \n"+vetorModificado);
    }    
}
