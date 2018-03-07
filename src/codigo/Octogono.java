/*
 * esta clase dibuja pentagonos (o eso creo)
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author Diego Álvarez    
 */
public class Octogono extends Forma{
    public Octogono (int _posX, int _posY,Color _color, boolean _relleno){
         //inicializo el constructor del octogono correctamente para que guarde 8 lados
         super(_posX,_posY,8, _color,_relleno);
     }
}
