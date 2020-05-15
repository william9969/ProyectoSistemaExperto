/*
 * Universidad Politecnica Salesina
 * Carrera de computacion 
 * Cuenca - Ecuador
 */
package Controlador;

import Interfaz.Pregunta1;
import java.awt.GridBagConstraints;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Jessica
 */
public class ControladorGeneral {

    /**
     * Metodo que permite agregar un componenete hijo a un componente padre 
     * @param componentFather   : hace referencia al componente que contendra los componentes hijos
     * @param componentSon      : hace referencia a los componentes a agregar al contenedor principal o Padre
     */
    public static void addComponentToContainer(JPanel componentFather, JPanel componentSon) {
        
        GridBagConstraints config = new GridBagConstraints();
        
        config.gridx = 0;
        config.gridy = 0;
        config.gridwidth = 1;
        config.gridheight = 1;
        config.weightx = 1.0;
        config.weighty = 1.0;
        config.anchor = GridBagConstraints.CENTER;
        config.fill = GridBagConstraints.BOTH;
        componentFather.add(componentSon,config);
        componentSon.setVisible(false);
    }
}
