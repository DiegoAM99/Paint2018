/*
 * esta clase realiza trazos
 */
package codigo;

import java.awt.BasicStroke;

/**
 *
 * @author xp
 */
public class Trazo extends BasicStroke{
    
    public Trazo(int _grosor){
        super(_grosor);
    }
    public Trazo (int _grosor, boolean rayas){
        super(_grosor, BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER,10.0f,  new float[]{10.0f},0.0f);
    }
}
