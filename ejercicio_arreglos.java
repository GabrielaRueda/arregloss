import javax.swing.JOptionPane;

public class ejercicio_arreglos {
    public static void main(String[] args) {

        
        String Materia[] = {"CALCDIF", "MATEDIS", "FUNDPRO", "FUNDINV", "QUIMICA", "DESSUS"};
        String Encabezado[] = {"Materia", "U1", "U2", "U3", "U4", "U5", "promedio"};
        byte calificaciones[][] = new byte[6][5];
        byte x, y;
                
        double promedio;
        
        // Ingresa calificaciones de las materias
        for (x = 0; x <= 5; x++) {  // filas
            for (y = 0; y < 5; y++) {  // columnas
                calificaciones[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa Calificación de " + Materia[x] + " UNIDAD " + (y + 1)));
            }
        }

        // Impresión de encabezado
        for (x = 0; x < 7; x++) {  
            System.out.printf(Encabezado[x] + "\t");
        }
        System.out.println();

  
        for (x = 0; x <= 5; x++) {  // filas
            System.out.print(Materia[x] + "\t");
            int suma = 0; 

            for (y = 0; y < 5; y++) {   //columnas
                System.out.print(calificaciones[x][y] + "\t");
                suma += calificaciones[x][y];  
            }
            
           
            promedio = suma / 5.0;
            System.out.printf("%.2f", promedio); 
            System.out.println();
        }
    }
}

