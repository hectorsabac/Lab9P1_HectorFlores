/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab9p1_hectorflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }   
    
    Game game = new Game();
    
    public static boolean verificarDim(String dimensiones){
        boolean temp = true;
        String [] arreglo = dimensiones.split(",",2);
        int x = Integer.parseInt(arreglo[0]);
        int y = Integer.parseInt(arreglo[1]);
        
        
        if (dimensiones.length() == 3){
            if (x < 4 || y < 4){
                temp = false;
            }
        } else if (dimensiones.length() == 5){
            if (x != 10 || y != 10){
                temp = false;
            }
        } else if (dimensiones.length() == 4){
            if (x != 10 || y < 4){
                if (x < 4 || y != 10){
                    temp = false;
                }
            }
        }
        
        return temp;
    }
    
    public static int filas(String dimensiones){
        String [] arreglo = dimensiones.split(",",2);
        int x = Integer.parseInt(arreglo[0]);
        
        return x;
    }
    
    public static int columnas(String dimensiones){
        String [] arreglo = dimensiones.split(",",2);
        int y = Integer.parseInt(arreglo[1]);
        
        return y;
    }
    
    public char [][] leerInstruccion(String inst, char [][]x){
        int mov = 0;
        
        while (inst.length() > 4 || inst.length() < 3){
            JOptionPane.showInputDialog(null, "Ingrese una instruccion que no exceda la matriz");
        }
        
        if (inst.length() != 3 || inst.length() != 4){
            JOptionPane.showInputDialog(null, "Ingrese una instruccion adecuada");
        } else if (inst.length() == 4 && !"10".equals(inst.substring(0, 2))){
            JOptionPane.showInputDialog(null, "Ingrese una instruccion que no exceda la matriz");
        } else if (inst.length() == 4 && (inst.charAt(2) != 'U' || inst.charAt(2) != 'D' || inst.charAt(2) != 'L' || inst.charAt(2) != 'R')){
            JOptionPane.showInputDialog(null, "Ingrese una instruccion adecuada");
        } else if (inst.length() == 3 && (inst.charAt(1) != 'U' || inst.charAt(2) != 'D' || inst.charAt(2) != 'L' || inst.charAt(2) != 'R')){
            JOptionPane.showInputDialog(null, "Ingrese una instruccion adecuada");
        }
        
        if (inst.length() == 3){
            if (inst.charAt(1) == 'U'){
                mov = Integer.parseInt(inst.substring(0, 1));
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosy_s(game.getPosy_s() - mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            } else if (inst.charAt(1) == 'D'){
                mov = Integer.parseInt(inst.substring(0, 1));
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosy_s(game.getPosy_s() + mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            } else if (inst.charAt(1) == 'L'){
                mov = Integer.parseInt(inst.substring(0, 1));
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosx_s(game.getPosx_s() - mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            } else if (inst.charAt(1) == 'R'){
                mov = Integer.parseInt(inst.substring(0, 1));
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosx_s(game.getPosx_s() + mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            }
        } else if (inst.length() == 4){
            if (inst.charAt(2) == 'U'){
                mov = 10;
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosy_s(game.getPosy_s() - mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            } else if (inst.charAt(2) == 'D'){
                mov = 10;
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosy_s(game.getPosy_s() + mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            } else if (inst.charAt(2) == 'L'){
                mov = 10;
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosx_s(game.getPosx_s() - mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            } else if (inst.charAt(2) == 'R'){
                mov = 10;
                x[game.getPosx_s()][game.getPosy_s()] = ' ';
                game.setPosx_s(game.getPosx_s() + mov); 
                x[game.getPosx_s()][game.getPosy_s()] = 'S';
            }
        }
        
        return x;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gusanito = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        gusanito.setText("Gusanito");
        gusanito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gusanitoActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(gusanito)
                    .addComponent(salir))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gusanito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void gusanitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gusanitoActionPerformed
        Menu menu = new Menu();
        menu.setVisible(false);
        String dimensiones = JOptionPane.showInputDialog(null,"Ingrese las dimensiones (entre 4 y 10 en formato 'fila,columna' y sin espacios)");
        
        while (true){
            if (dimensiones.length() == 3 || dimensiones.length() == 4 || dimensiones.length() == 5){
                break;
            } else {
                dimensiones = JOptionPane.showInputDialog(null, "Ingrese dimensiones en el formato especificado\n(Entre 4 y 10 en formato 'fila,columna' y sin espacios)");
            }
        }
        
        while (verificarDim(dimensiones) == false){
            dimensiones = JOptionPane.showInputDialog(null, "Ingrese dimensiones en el formato especificado\n(Entre 4 y 10 en formato 'fila,columna' y sin espacios)");
        }
        
        char [][] tablero = game.generarTablero(filas(dimensiones), columnas(dimensiones));
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "\n1. Ingresar instruccion\n2. Ejecutar Instrucciones"));
        
        while (opcion < 1 || opcion > 2){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1 o 2\n\nMapa:\n" + game.JOpImprimirMat(tablero) + "\n1. Ingresar instruccion\n2. Ejecutar Instrucciones"));
        }
        
        ArrayList <String> temp = new ArrayList<>();
        
        String instruccion = "";
        int paso = 0;
        int opcion2 = 0;
        if (opcion == 1){
            while (opcion == 1){
                instruccion = JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "\nIngrese una instruccion en el formato magnitudDireccion (ejemplo: 2UP, 3DN, 4LT, 5RT)");
                temp.add(instruccion);
                game.setInstrucciones(temp);
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "\n1. Ingresar instruccion\n2. Ejecutar Instrucciones"));
            }
        } else if (opcion == 2){
            if ((game.getInstrucciones()).size() == 0){
                JOptionPane.showMessageDialog(null, "No hay instrucciones en el ArrayList");
            } else {
                opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "\n1. Ver siguiente paso\n2. Ver paso anterior\n3. Seleccionar paso\n4. Volver al menu"));
                paso = 1;
            
            
                while (opcion2 != 4 || opcion != 0){
                    switch (opcion2){
                        case 1:
                            paso++;
                            if (paso > (game.getInstrucciones()).size()){
                                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "Ese paso no existe\n\n1. Ver siguiente paso\n2. Ver paso anterior\n3. Seleccionar paso\n4. Volver al menu"));
                                paso--;
                            } else {
                                leerInstruccion(instruccion, tablero);
                            }
                            break;
                        case 2:
                            paso--;
                            if (paso < 0){
                                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "Ese paso no existe\n\n1. Ver siguiente paso\n2. Ver paso anterior\n3. Seleccionar paso\n4. Volver al menu"));
                                paso++;
                            } else {
                                leerInstruccion(instruccion, tablero);
                            }
                            break;
                        case 3:
                            int paso_viejo = paso;
                            paso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el paso que desea accesar"));
                            if (paso > (game.getInstrucciones()).size() || paso < 0){
                                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "Ese paso no existe\n\n1. Ver siguiente paso\n2. Ver paso anterior\n3. Seleccionar paso\n4. Volver al menu"));
                                paso = paso_viejo;
                            } else {
                                leerInstruccion(instruccion, tablero);
                            }
                            break;
                        case 4:
                            menu.setVisible(true);
                            menu.setLocationRelativeTo(null);
                            break;
                    }
                }    
                opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa:\n" + game.JOpImprimirMat(tablero) + "\n1. Ver siguiente paso\n2. Ver paso anterior\n3. Seleccionar paso\n4. Volver al menu"));
            }
            
        }
        
    }//GEN-LAST:event_gusanitoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gusanito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
