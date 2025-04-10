package palabras;

public class CalculadoraDistancias{
    /**
     * * Calcula la distancia de edició n, tal y como la expone
     * * Jurafsky entre las cadenas ` s1` y ` s2`.
     * */
    public static int calcularDistancia(String s1, String s2){
        int ii = s1.length();
        int jj = s2.length();
        int [] [] d = new int [ii+1] [jj+1];
        d = calDistIni(ii,jj,s1,s2,d);
        return d[ii - 1][jj - 1];
    }

    public static int[][] calDistIni(int ii, int jj, String s1, String s2, int[][]d){
        for (int i=0;i<ii;i++){
            d[i][0] = i;
        }
        for (int j=0;j<jj;j++) {
            d[0][j] = j;
        }
        calDistFin(ii,jj,s1,s2,d);
        return d;
    }

    public static int[][] calDistFin(int ii, int jj, String s1, String s2, int[][]d){
        for (int j=1;j<jj;j++){
            for (int i=1;i<ii;i++){
                int costo,inser, borra, susti = 10000, igual = 10000;
                inser = d[i-1][j]+1;
                borra = d[i][j-1]+1;
                if(s1.charAt(i)==s2.charAt(j)){
                    igual = d[i-1][j-1];
                } else {
                    susti = d[i-1][j-1]+2;
                }
                costo = min(inser,borra,susti,igual);
                d[i][j] = costo;
            }
        }
        return d;
    }

    public static int min(int i, int j, int k, int l){
        int aux = 1000000;
        if (aux>i){
            aux = i;
        }
        if (aux>j){
            aux = j;
        }
        if (aux>k){
            aux = k;
        }
        if (aux>l){
            aux = l;
        }
        return aux;
    }
}