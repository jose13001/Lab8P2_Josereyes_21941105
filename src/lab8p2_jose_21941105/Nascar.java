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
public class Nascar extends Auto{
    
    public Nascar(int identificador, int distanciaRecorrida, String nombreCorredor, Color color) {
        super(identificador, distanciaRecorrida, nombreCorredor, color);
        Vmin=40;
        Vmax=180;
    }
    
}
