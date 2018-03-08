/*
 * esta clase dibuja cuadrados
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author xp
 */
public class Cuadrado extends Forma{
    public Cuadrado (int _posX, int _posY,Color _color, boolean _relleno){
         //inicializo el constructor del cuadrado correctamente para que guarde 4 lados.
         super(_posX,_posY,4, _color,_relleno);
     }
}
