package orgplus;

public class OrgPLUS {

    public static void main(String[] args) {

    }

    public void talla(int k, int filas, Object[][] matriz, Object[][] matriz2) {

        for (int col = 0; col < 1; col++) {
            for (int fil = 0; fil < filas; fil++) {

                if (matriz[fil][col] == null) {

                    matriz[fil][col] = matriz2[k][1];
                    matriz2[k][1] = null;

                }
            }
        }
    }

    public void TallaComoVariable(int nfilas, Object mat, Object[][] matrizdos, Object[][] matFila, String talla) {

        for (int k = 0; k < nfilas; k++) {
            for (int l = 0; l < 2; l++) {

                if (mat.equals(matrizdos[k][0])) {

                    if (matrizdos[k][1] != null && (matrizdos[k][1]).toString().contains(talla) == true) {
                        talla(k, nfilas, matFila, matrizdos);
                    }

                }
            }
        }
    }

    public void TallaComoVariableChar(int nfilas, Object mat, Object[][] matrizdos, Object[][] matFila, char letra) {

        for (int k = 0; k < nfilas; k++) {
            for (int l = 0; l < 2; l++) {

                if (mat.equals(matrizdos[k][0])) {

                    if (matrizdos[k][1] != null && (matrizdos[k][1]).toString().charAt(l) == letra) {
                        talla(k, nfilas, matFila, matrizdos);
                    }

                }
            }
        }
    }

    public static Object PonerMarca(int filas, String marca) {

        Object[] vecMarcas = new Object[filas];
        for (int i = 0; i < filas; i++) {

            if (vecMarcas[i] == null) {
                vecMarcas[i] = marca;

            }
        }
        return vecMarcas;
    }

   
    
    public void Categoria(int nfilas, int ncol, Object[][] matriz, String categ, String cambio){
        
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                
                 if(matriz[i][2].toString().contains(categ))
                (matriz[i][2])= cambio;
                
            }
        }
        
    }
    
     
   
      public static Object MarcaB(int nfilas, Object marca){
      
                if(marca.toString().equalsIgnoreCase("CRML1"))
                  marca="CRMLB";  
                 if(marca.toString().equalsIgnoreCase("LGIN1"))
                  marca="LGINB";  
                 if(marca.toString().equalsIgnoreCase("PCFK1"))
                  marca="PCFKB";  
                 if(marca.toString().equalsIgnoreCase("YBNA1"))
                  marca="YBNAB";  
                 if(marca.toString().equalsIgnoreCase("REAL1"))
                 marca="REALB";  
      
                return marca;
    
    }
      
      public static Object MarcaC(int nfilas,  Object marca){
      
         
          
          if(marca.toString().equalsIgnoreCase("CRML1"))
                  marca="CRMLC";  
          if(marca.toString().equalsIgnoreCase("LGIN1"))
                  marca="LGINC";  
          if(marca.toString().equalsIgnoreCase("PCFK1"))
                  marca="PCFKC";  
          if(marca.toString().equalsIgnoreCase("YBNA1"))
                  marca="YBNAC";  
           if(marca.toString().equalsIgnoreCase("REAL1"))
                 marca="REALC";  
       
                return marca;
    
    }
      
}