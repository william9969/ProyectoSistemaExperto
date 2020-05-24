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
import net.sf.clipsrules.jni.*;
import Interfaz.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Jessica
 */

public class ControladorGeneral {

    public String nombreS;
    private net.sf.clipsrules.jni.Environment environment;
    Test t = new Test();
    //JTextField txtnom = new JTextField();
    public ControladorGeneral (){
       
    }
    /**
     * Metodo para conectar con la base de conocimiento
     */
    public void conexionClips (){
        //environment = new net.sf.clipsrules.jni.Environment();
        environment = new net.sf.clipsrules.jni.Environment();
        try{
            
            System.out.println("Base de Conocimiento Cargada con Exito!");
            environment.load("D:\\UNIVERSIDAD\\CICLO 6\\SISTEMAS EXPERTOS\\ProyectoSistemaExperto\\ProyectoCardiovascular\\BaseConocimiento.clp");
    
            environment.reset();
            
            String comandoAssert = "(assert (persona (codigo 1)(nombre \"Juan\")(apellido \"Loja\")(peso 23.3) (genero F)))";
            
            environment.eval(comandoAssert);
            String busqueda = "(find-all-facts ((?f persona)) TRUE)";
            net.sf.clipsrules.jni.MultifieldValue mv = (net.sf.clipsrules.jni.MultifieldValue) 
            environment.eval(busqueda);
           if (mv.size()>0){
                //busqueda = "(find-fact ((?f persona)) (eq ?f:edad 23))";
                mv = (net.sf.clipsrules.jni.MultifieldValue) environment.eval(busqueda);
                
                if(mv.size()>0){
                    net.sf.clipsrules.jni.FactAddressValue fv = (net.sf.clipsrules.jni.FactAddressValue) mv.get(0);
                    
                    String nombres = fv.getSlotValue("nombre").toString();
                    //System.out.println("La persona mayor a 18 aÃ±os se llama ["+nombres+"]");
                    //System.out.println("Edad: ["+fv.getSlotValue("edad")+"]");
                    
                    System.out.println("Tipo Nombres: " + fv.getSlotValue("nombre").getCLIPSType());
                    
                    //System.out.println("Tipo Edad: " + fv.getSlotValue("edad").getCLIPSType());              
                    System.out.println("C"+nombres);
                    //t.txtnom.setText(nombres);
                    //System.out.println("J"+nombreS);
                    JOptionPane.showMessageDialog(null, nombres);
                }
            }
           
            
        }catch(Exception e){
            System.out.println("Error no conectada");
            e.printStackTrace();
        }
    }
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
