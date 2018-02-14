/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author Diego Álvarez
 */
public class Circulo extends Forma {
    
    public Color color= null;
    public boolean relleno = false;
    
    public Circulo (int _posX, int _posY,Color _color, boolean _relleno){
         //inicializo el constructor del triangulo
         super(_posX,_posY,5000, _color,_relleno);
     }
}
