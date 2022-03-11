/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_jose_21941105;

import java.awt.Color;

/**
 *
 * @author josec
 */
public class McQueen extends Auto{
    
    public McQueen(int identificador, int distanciaRecorrida, String nombreCorredor, Color color) {
        super(identificador, distanciaRecorrida, nombreCorredor, color);
        Vmin=30;
        Vmax=190;
    }
    
}
