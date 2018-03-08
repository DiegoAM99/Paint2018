/*
 * esta clase dibuja hexágonos
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author Diego Álvarez    
 */
public class Hexagono extends Forma{
    public Hexagono (int _posX, int _posY,Color _color, boolean _relleno){
         //inicializo el constructor del hexagono correctamente para que guarde 6 lados
         super(_posX,_posY,6, _color,_relleno);
     }
}
