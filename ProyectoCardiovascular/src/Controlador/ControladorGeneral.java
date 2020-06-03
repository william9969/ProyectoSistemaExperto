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
    
    public Pregunta1 pre1;
    public Pregunta2 pre2;
    public Pregunta3 pre3;
    public Pregunta4 pre4;
    public Pregunta5 pre5;
    public Pregunta6 pre6;
    public Pregunta7 pre7;
    public Pregunta8 pre8;
    public Pregunta9 pre9;
    public Pregunta10 pre10;
    public Pregunta11 pre11;
    public Pregunta12 pre12;
    public Pregunta13 pre13;
    public Pregunta14 pre14;
    public Pregunta15 pre15;
    public Pregunta16 pre16;
    public Pregunta17 pre17;
    public Pregunta18 pre18;
    public Pregunta19 pre19;
    public Pregunta20 pre20;
    public Pregunta21 pre21;
    public Pregunta22 pre22;
    public Pregunta23 pre23;
    public Pregunta24 pre24;
    public Pregunta25 pre25;
    
    private net.sf.clipsrules.jni.Environment environment;
    
    
    
    //JTextField txtnom = new JTextField();
    public ControladorGeneral (){
       
    }
    
    
    public void objeto(Pregunta1 preg1,Pregunta2 preg2, Pregunta3 preg3,Pregunta4 preg4,Pregunta5 preg5,Pregunta6 preg6,Pregunta7 preg7,
            Pregunta8 preg8, Pregunta9 preg9, Pregunta10 preg10,Pregunta11 preg11, Pregunta12 preg12, Pregunta13 preg13,Pregunta14 preg14,
            Pregunta15 preg15, Pregunta16 preg16,Pregunta17 preg17,Pregunta18 preg18,Pregunta19 preg19,Pregunta20 preg20,Pregunta21 preg21,
            Pregunta22 preg22,Pregunta23 preg23,Pregunta24 preg24,Pregunta25 preg25, String nombre,String apellido,float peso,String genero){     //<- simple Explicacion: le pedimos que asigene el objeto del tipo Flores, usted puede leer sobre los get set en java
        this.pre1=preg1;this.pre2=preg2;this.pre3=preg3;this.pre4=preg4;this.pre5=preg5;this.pre6=preg6;this.pre7=preg7;this.pre8=preg8;this.pre9=preg9;this.pre10=preg10;
        this.pre11=preg11;this.pre12=preg12;this.pre13=preg13;this.pre14=preg14;this.pre15=preg15;this.pre16=preg16;this.pre17=preg17;this.pre18=preg18;this.pre19=preg19;this.pre20=preg20;
        this.pre21=preg21;this.pre22=preg22;this.pre23=preg23;this.pre24=preg24;this.pre25=preg25;
        
        conexionClips (nombre,apellido,peso,genero);
    }
    /**
     * Metodo para conectar con la base de conocimiento
     */
    public void conexionClips (String nombre,String apellido,float peso,String genero){
            
        //environment = new net.sf.clipsrules.jni.Environment();
        environment = new net.sf.clipsrules.jni.Environment();
        try{
            
            System.out.println("Base de Conocimiento Cargada con Exito!");
            environment.load("BaseConocimiento.clp");
    
            environment.reset();
            
            if (pre1.p1rb1.isSelected()){System.out.println("A");}
        else if (pre1.p1rb2.isSelected()){System.out.println("B");}
        else if (pre1.p1rb3.isSelected()){System.out.println("C");}
        else if (pre1.p1rb4.isSelected()){System.out.println("D");}
        
        if (pre2.p2rb1.isSelected()){System.out.println("A");}
        else if (pre2.p2rb2.isSelected()){System.out.println("B");}
        else if (pre2.p2rb3.isSelected()){System.out.println("C");}
        else if (pre2.p2rb4.isSelected()){System.out.println("D");}
        
        
        if (pre3.p3rb1.isSelected()){System.out.println("A");}
        else if (pre3.p3rb2.isSelected()){System.out.println("B");}
        else if (pre3.p3rb3.isSelected()){System.out.println("C");}
        else if (pre3.p3rb4.isSelected()){System.out.println("D");}
        
        
        if (pre4.p4rb1.isSelected()){System.out.println("A");}
        else if (pre4.p4rb2.isSelected()){System.out.println("B");}
        else if (pre4.p4rb3.isSelected()){System.out.println("C");}
        else if (pre4.p4rb4.isSelected()){System.out.println("D");}
        
        
        if (pre5.p5rb1.isSelected()){System.out.println("A");}
        else if (pre5.p5rb2.isSelected()){System.out.println("B");}
        else if (pre5.p5rb3.isSelected()){System.out.println("C");}
        else if (pre5.p5rb4.isSelected()){System.out.println("D");}
        
        
        if (pre6.p6rb1.isSelected()){System.out.println("A");}
        else if (pre6.p6rb4.isSelected()){System.out.println("D");}
        
        
        if (pre7.p7rb1.isSelected()){System.out.println("A");}
        else if (pre7.p7rb2.isSelected()){System.out.println("B");}
        else if (pre7.p7rb3.isSelected()){System.out.println("C");}
        else if (pre7.p7rb4.isSelected()){System.out.println("D");}
        
        
        if (pre8.p8rb1.isSelected()){System.out.println("A");}
        else if (pre8.p8rb2.isSelected()){System.out.println("B");}
        else if (pre8.p8rb3.isSelected()){System.out.println("C");}
        else if (pre8.p8rb4.isSelected()){System.out.println("D");}
        
        
        if (pre9.p9rb1.isSelected()){System.out.println("A");}
        else if (pre9.p9rb2.isSelected()){System.out.println("B");}
        else if (pre9.p9rb3.isSelected()){System.out.println("C");}
        else if (pre9.p9rb4.isSelected()){System.out.println("D");}
        
        
        if (pre10.p10rb1.isSelected()){System.out.println("A");}
        else if (pre10.p10rb2.isSelected()){System.out.println("B");}
        else if (pre10.p10rb3.isSelected()){System.out.println("C");}
        else if (pre10.p10rb4.isSelected()){System.out.println("D");}
        
        
        if (pre11.p11rb1.isSelected()){System.out.println("A");}
        else if (pre11.p11rb4.isSelected()){System.out.println("D");}
        
        
        if (pre12.p12rb1.isSelected()){System.out.println("A");}
        else if (pre12.p12rb2.isSelected()){System.out.println("B");}
        else if (pre12.p12rb3.isSelected()){System.out.println("C");}
        else if (pre12.p12rb4.isSelected()){System.out.println("D");}
        
        
        if (pre13.p13rb1.isSelected()){System.out.println("A");}
        else if (pre13.p13rb2.isSelected()){System.out.println("B");}
        else if (pre13.p13rb3.isSelected()){System.out.println("C");}
        else if (pre13.p13rb4.isSelected()){System.out.println("D");}
        
        if (pre14.p14rb1.isSelected()){System.out.println("A");}
        else if (pre14.p14rb2.isSelected()){System.out.println("B");}
        else if (pre14.p14rb3.isSelected()){System.out.println("C");}
        else if (pre14.p14rb4.isSelected()){System.out.println("D");}
        
        if (pre15.p15rb1.isSelected()){System.out.println("A");}
        else if (pre15.p15rb2.isSelected()){System.out.println("B");}
        else if (pre15.p15rb3.isSelected()){System.out.println("C");}
        else if (pre15.p15rb4.isSelected()){System.out.println("D");}
        
        if (pre16.p16rb1.isSelected()){System.out.println("A");}
        else if (pre16.p16rb2.isSelected()){System.out.println("B");}
        else if (pre16.p16rb3.isSelected()){System.out.println("C");}
        else if (pre16.p16rb4.isSelected()){System.out.println("D");}
        
        if (pre17.p17rb1.isSelected()){System.out.println("A");}
        else if (pre17.p17rb2.isSelected()){System.out.println("B");}
        else if (pre17.p17rb3.isSelected()){System.out.println("C");}
        else if (pre17.p17rb4.isSelected()){System.out.println("D");}
        
        if (pre18.p18rb1.isSelected()){System.out.println("A");}
        else if (pre18.p18rb2.isSelected()){System.out.println("B");}
        else if (pre18.p18rb3.isSelected()){System.out.println("C");}
        else if (pre18.p18rb4.isSelected()){System.out.println("D");}
        
        if (pre19.p19rb1.isSelected()){System.out.println("A");}
        else if (pre19.p19rb2.isSelected()){System.out.println("B");}
        else if (pre19.p19rb3.isSelected()){System.out.println("C");}
        
        if (pre20.p20rb1.isSelected()){System.out.println("A");}
        else if (pre20.p20rb2.isSelected()){System.out.println("B");}
        else if (pre20.p20rb3.isSelected()){System.out.println("C");}
        else if (pre20.p20rb4.isSelected()){System.out.println("D");}
        
        if (pre21.p21rb1.isSelected()){System.out.println("A");}
        else if (pre21.p21rb2.isSelected()){System.out.println("B");}
        else if (pre21.p21rb3.isSelected()){System.out.println("C");}
        else if (pre21.p21rb4.isSelected()){System.out.println("D");}
        
        if (pre22.p22rb1.isSelected()){System.out.println("A");}
        else if (pre22.p22rb2.isSelected()){System.out.println("B");}
        else if (pre22.p22rb3.isSelected()){System.out.println("C");}
        else if (pre22.p22rb4.isSelected()){System.out.println("D");}
        
        if (pre23.p23rb1.isSelected()){System.out.println("A");}
        else if (pre23.p23rb2.isSelected()){System.out.println("B");}
        else if (pre23.p23rb3.isSelected()){System.out.println("C");}
        
        if (pre24.p24rb1.isSelected()){System.out.println("A");}
        else if (pre24.p24rb2.isSelected()){System.out.println("B");}
        else if (pre24.p24rb3.isSelected()){System.out.println("C");}
        
        if (pre25.p25rb1.isSelected()){System.out.println("A");}
        else if (pre25.p25rb2.isSelected()){System.out.println("B");}
        else if (pre25.p25rb3.isSelected()){System.out.println("C");}
        else if (pre25.p25rb4.isSelected()){System.out.println("D");}
            
            
            
            
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
