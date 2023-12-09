package lab9p1_hectorflores;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    
    Random random = new Random();
    
    ArrayList <String> instrucciones = new ArrayList<>();
    char [][] tablero;
    int posx_m;
    int posy_m;
    int posx_s;
    int posy_s;

    public ArrayList<String> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<String> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getPosx_s() {
        return posx_s;
    }

    public void setPosx_s(int posx_s) {
        this.posx_s = posx_s;
    }

    public int getPosy_s() {
        return posy_s;
    }

    public void setPosy_s(int posy_s) {
        this.posy_s = posy_s;
    }
    
    
    
    public boolean revisarDimensiones(String dim){
        boolean valida = false;
        int filas = (int)dim.charAt(0) - (int)'0';
        int columnas = (int)dim.charAt(2) - (int)'0';
        
        if (filas > 0 && columnas > 0){
            valida = true;
        }
        
        return valida;
    }
    
    int filas;
    int columnas;

    public Game(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }
    
    public Game(){
        
    }
    
    public boolean verificarLibre(char [][] x, int i, int j){
        boolean disp = false;
        
        if (x[i][j] == ' '){
            disp = true;
        }
        
        return disp;
    }
    
    public char[][] generarTablero(int filas, int columnas){
        tablero = new char [filas][columnas];
        
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = ' ';
            }
        }
        
        posx_m = random.nextInt(((filas - 1) - 0) + 1) + 0;
        posy_m = random.nextInt(((columnas - 1) - 0) + 1) + 0;
        
        tablero[posx_m][posy_m] = 'Ó';
        
        posx_s = random.nextInt(((filas - 1) - 0) + 1) + 0;
        posy_s = random.nextInt(((columnas - 1) - 0) + 1) + 0;
        
        while (tablero[posx_s][posy_s] == 'Ó'){
            posx_s = random.nextInt(((filas - 1) - 0) + 1) + 0;
            posy_s = random.nextInt(((columnas - 1) - 0) + 1) + 0;
        }
        
        tablero[posx_s][posy_s] = 'S';
        
        int menor = 0;
        int mayor = 0;
        
        if (filas < columnas){
            menor = filas;
            mayor = columnas;
        } else {
            menor = columnas;
            mayor = filas;
        }
        
        int obstaculos = random.nextInt((mayor-menor)+1)+menor;
        int contador = 0;
        
        
        for (int i = 0; i < tablero.length; i++){
            if (contador >= obstaculos){
                break;
            } 
            for (int j = 0; j < tablero[i].length; j++){
                if (contador >= obstaculos){
                    break;
                }
                
                if (verificarLibre(tablero, i, j)){
                    tablero[random.nextInt(((filas - 1) - 0) + 1) + 0][random.nextInt(((columnas - 1) - 0) + 1) + 0] = 'X';
                    contador++;
                }
                
                if (contador >= obstaculos){
                    break;
                }
            }
            if (contador >= obstaculos){
                break;
            }
        }
        
        return tablero;
    }
    
    public String JOpImprimirMat(char [][]x){
        String temp = "";
        
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                temp += "[" + x[i][j] + "]";
            }
            temp+= "\n";
        }
        
        return temp;
    }
}
