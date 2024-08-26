package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] fin = new int [arregloEnteros.length];
        
        for (int i = 0; i < arregloEnteros.length; i+=1) {
        	fin[i] = arregloEnteros[i];
        }
        
        return fin;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        String[] fin = new String [arregloCadenas.length];
        
        for (int i = 0; i < arregloCadenas.length; i+=1) {
        	fin[i] = arregloCadenas[i];
        }
        
        return fin;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[] nArray = getCopiaEnteros();
    	int[] aFinal = new int[nArray.length + 1];
    			
    	for (int i = 0; i < nArray.length; i+=1){
    		aFinal[i] = nArray[i];
    	}
    	aFinal[aFinal.length - 1] = entero;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] nArray = getCopiaCadenas();
    	String[] aFinal = new String[nArray.length + 1];
    			
    	for (int i = 0; i < nArray.length; i+=1){
    		aFinal[i] = nArray[i];
    	}
    	aFinal[aFinal.length - 1] = cadena;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int[] nArray = new int[arregloEnteros.length];
    	int x = 0;
    	for(int i = 0; i < arregloEnteros.length; i+=1) {
    		if (arregloEnteros[i] != valor) {
    			nArray[x+=1] = arregloEnteros[i];
    		}
    	}
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	String[] nArray = new String[arregloCadenas.length];
    	int x = 0;
    	for(int i = 0; i < arregloCadenas.length; i+=1) {
    		if (arregloCadenas[i] != cadena) {
    			nArray[x+=1] = arregloCadenas[i];
    		}
    	}
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int[] nArray = new int[arregloEnteros.length+1];
    	for(int i = 0; i < arregloEnteros.length; i+=1) {
    		if(i == posicion) {
    			arregloEnteros[i] = entero;
    		}
    	}
    	arregloEnteros = nArray;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int[] nArray = getCopiaEnteros();
    	/**if (posicion < 0 )**/
    	
    	int[] fArray = new int[nArray.length - 1];
    	for (int i = 0; i < fArray.length; i+=1) {
    		if (i == posicion) {
    			fArray[i] = nArray[i+1];
    		}
    	}
    	arregloEnteros = fArray;

    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	arregloEnteros = new int[valores.length];
    	for (int i = 0; i < valores.length; i+=1) {
    		arregloEnteros[i] = (int) valores[i];
    	}
    			
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	arregloCadenas = new String[objetos.length];
    	for (int i = 0; i < objetos.length; i+=1) {
    		arregloCadenas[i] = (String) objetos[i];
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int[] nArray = getCopiaEnteros();
    	
    	for (int i = 0; i < nArray.length; i += 1) {
    		nArray[i] = Math.abs(nArray[i]);
    	}
    	arregloEnteros = nArray;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(arregloEnteros);
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int[] cArray = getCopiaEnteros();
    	int cont = 0;
    	for (int i = 0; i < cArray.length; i+=1) {
    		if (cArray[i] == valor) {
    			cont += 1;
    		}
    	}
    	
        return cont;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        String[] cArray = getCopiaCadenas();
    	int cont = 0;
    	for (int i = 0; i < cArray.length; i+=1) {
    		if (cArray[i] == cadena) {
    			cont += 1;
    		}
    	}
    	
        return cont;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int[] nArray = getCopiaEnteros();
    	int cont = 0;
    	for (int i = 0; i<nArray.length; i+=1) {
    		if (nArray[i] == valor) {
    			cont += 1;
    		}
    	}
        int[] fArray = new int[cont];
        int x = 0;
        
        for (int i = 0; i<nArray.length; i+=1) {
        	if (nArray[i] == valor) {
        		fArray[x] = i;
        		x += 1;
        	}
        }
        
        return fArray;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int[] nArray = getCopiaEnteros();
    	
    	if (nArray.length == 0) {
    		int[] fArray = new int[0];
    		return fArray;
    	}
    	
    	int min = nArray[0];
    	int max = nArray[0];
    	
    	for (int i = 0; i<nArray.length; i += 1) {
    		if (nArray[i]< min) {
    			min = nArray[i];
    		}
    		if (nArray[i] >max) {
    			max = nArray[i];
    		}
    	}
    	int [] fArray = new int[] { min, max };
        return fArray;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	int[] nArray = getCopiaEnteros();
        HashMap<Integer, Integer> histograma = new HashMap<>();
        
        for (int i = 0; i < nArray.length; i+=1) {
            int x = nArray[i];
            if (histograma.containsKey(x)) {
                histograma.put(x, histograma.get(x) + 1);
            } else {
                histograma.put(x, 1);
            }
        }
        
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int [] c1 = getCopiaEnteros();
    	
    	if (c1.length == 0) {
    		return 0;
    	}
    	int[] rango = calcularRangoEnteros();
    	int min = rango[0];
    	int max = rango[1];
    	
    	int[] c2 = new int[max-min + 1];
    	int cont = 0;
    	
    	for (int i = 0; i < c1.length; i+=1) {
    		int x = c1[i];
    		c2[x-min] += 1;
    	}
    		
    	for (int k = 0; k<c2.length; k+=1) {
    		if (c2[k] > 1) {
    			cont += 1;
    		}
    	}
    			
    	
        return cont;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	int[] c1 = getCopiaEnteros();
    	if (c1.length != otroArreglo.length) {
    		return false;
    	}
    		
    	for (int i = 0; i<c1.length; i+=1) {
    		if (c1[i] != otroArreglo[i]) {
    			return false;
    		}
    	}
    	
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	int[] c1 = getCopiaEnteros();
    	if (c1.length != otroArreglo.length) {
    		return false;
    	}
    	
        return false;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	arregloEnteros = new int[cantidad];
    	
    	for (int i = 0; i<cantidad; i +=1) {
    		arregloEnteros[i] = (int) (Math.random());
    	}
    }

}
