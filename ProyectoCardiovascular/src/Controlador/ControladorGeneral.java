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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Interfaz.*;
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
    String nombre;
    String apellido;
    float peso;
    int resultadoA, resultadoB,resultadoC, resultadoD;
    String genero;
    String cardioVascular;
    String mostrar;
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
        this.nombre=nombre;
        this.apellido=apellido;
        this.peso=peso;
        this.genero=genero;
       // nombre,apellido,peso,genero
       // String nombre,String apellido,float peso,String genero
        conexionClips();
    }
    /**
     * Metodo para conectar con la base de conocimiento
     */
    public void conexionClips (){
            
        //environment = new net.sf.clipsrules.jni.Environment();
        
        /*
            Problemas con el Resultado
        ----Path de la funcion editar---
        */
        environment = new net.sf.clipsrules.jni.Environment();
        try{
            
            System.out.println("Base de Conocimiento Cargada con Exito!");
            environment.load("BaseConocimiento.clp");
    
            environment.reset();
            
            if (pre1.p1rb1.isSelected()){
                System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 1)(valor 1)))");
            }
            else if (pre1.p1rb2.isSelected()){
                System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 1)(valor 2)))");
            }
            else if (pre1.p1rb3.isSelected()){
                System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 1)(valor 3)))");
            }
            else if (pre1.p1rb4.isSelected()){
                System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 1)(valor 4)))");
            }
            if (pre2.p2rb1.isSelected()){
                System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 2)(valor 1)))");
            }
            else if (pre2.p2rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 2)(valor 2)))");
            }
            else if (pre2.p2rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 2)(valor 3)))");
            }
            else if (pre2.p2rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 2)(valor 4)))");
            }
            if (pre3.p3rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 3)(valor 1)))");
            }
            else if (pre3.p3rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 3)(valor 2)))");
            }
            else if (pre3.p3rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 3)(valor 3)))");
            }
            else if (pre3.p3rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 3)(valor 4)))");
            }
            if (pre4.p4rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 4)(valor 1)))");
            }
            else if (pre4.p4rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 4)(valor 2)))");
            }
            else if (pre4.p4rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 4)(valor 3)))");
            }
            else if (pre4.p4rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 4)(valor 4)))");
            }
            if (pre5.p5rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 5)(valor 1)))");
            }
            else if (pre5.p5rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 5)(valor 2)))");
            }
            else if (pre5.p5rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 5)(valor 3)))");
            }
            else if (pre5.p5rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 5)(valor 4)))");
            }
            if (pre6.p6rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 6)(valor 1)))");
            }
            else if (pre6.p6rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 6)(valor 4)))");
            }
            if (pre7.p7rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 7)(valor 1)))");
            }
            else if (pre7.p7rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 7)(valor 2)))");
            }
            else if (pre7.p7rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 7)(valor 3)))");
            }
            else if (pre7.p7rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 7)(valor 4)))");
            }
            if (pre8.p8rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 8)(valor 1)))");
            }
            else if (pre8.p8rb2.isSelected()){System.out.println("B");
                 environment.eval("(assert (respuestas (pregunta 8)(valor 2)))");
            }
            else if (pre8.p8rb3.isSelected()){System.out.println("C");
                 environment.eval("(assert (respuestas (pregunta 8)(valor 3)))");
            }
            else if (pre8.p8rb4.isSelected()){System.out.println("D");
                 environment.eval("(assert (respuestas (pregunta 8)(valor 4)))");
            }
            if (pre9.p9rb1.isSelected()){System.out.println("A");
                 environment.eval("(assert (respuestas (pregunta 9)(valor 1)))");
            }
            else if (pre9.p9rb2.isSelected()){System.out.println("B");
                 environment.eval("(assert (respuestas (pregunta 9)(valor 2)))");
            }
            else if (pre9.p9rb3.isSelected()){System.out.println("C");
                 environment.eval("(assert (respuestas (pregunta 9)(valor 3)))");
            }
            else if (pre9.p9rb4.isSelected()){System.out.println("D");
                 environment.eval("(assert (respuestas (pregunta 9)(valor 4)))");
            }
            if (pre10.p10rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 10)(valor 1)))");
            }
            else if (pre10.p10rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 10)(valor 2)))");
            }
            else if (pre10.p10rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 10)(valor 3)))");
            }
            else if (pre10.p10rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 10)(valor 4)))");
            }
            if (pre11.p11rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 11)(valor 1)))");
            }
            else if (pre11.p11rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 11)(valor 4)))");
            }
            if (pre12.p12rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 12)(valor 1)))");
            }
            else if (pre12.p12rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 12)(valor 2)))");
            }
            else if (pre12.p12rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 12)(valor 3)))");
            }
            else if (pre12.p12rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 12)(valor 4)))");
            }
            if (pre13.p13rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 13)(valor 1)))");
            }
            else if (pre13.p13rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 13)(valor 2)))");
            }
            else if (pre13.p13rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 13)(valor 3)))");
            }
            else if (pre13.p13rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 13)(valor 4)))");
            }
            if (pre14.p14rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 14)(valor 1)))");
            }
            else if (pre14.p14rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 14)(valor 2)))");
            }
            else if (pre14.p14rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 14)(valor 3)))");
            }
            else if (pre14.p14rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 14)(valor 4)))");
            }
            if (pre15.p15rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 15)(valor 1)))");
            }
            else if (pre15.p15rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 15)(valor 2)))");
            }
            else if (pre15.p15rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 15)(valor 3)))");
            }
            else if (pre15.p15rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 15)(valor 4)))");
            }
            if (pre16.p16rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 16)(valor 1)))");
            }
            else if (pre16.p16rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 16)(valor 2)))");
            }
            else if (pre16.p16rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 16)(valor 3)))");
            }
            else if (pre16.p16rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 16)(valor 4)))");
            }
            if (pre17.p17rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 17)(valor 1)))");
            }
            else if (pre17.p17rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 17)(valor 2)))");
            }
            else if (pre17.p17rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 17)(valor 3)))");
            }
            else if (pre17.p17rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 17)(valor 4)))");
            }
            if (pre18.p18rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 18)(valor 1)))");
            }
            else if (pre18.p18rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 18)(valor 2)))");
            }
            else if (pre18.p18rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 18)(valor 3)))");
            }
            else if (pre18.p18rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 18)(valor 4)))");
            }
            if (pre19.p19rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 19)(valor 1)))");
            }
            else if (pre19.p19rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 19)(valor 2)))");
            }
            else if (pre19.p19rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 19)(valor 3)))");
            }
            if (pre20.p20rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 20)(valor 1)))");
            }
            else if (pre20.p20rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 20)(valor 2)))");
            }
            else if (pre20.p20rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 20)(valor 3)))");
            }
            else if (pre20.p20rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 20)(valor 4)))");
            }
            if (pre21.p21rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 21)(valor 1)))");
            }
            else if (pre21.p21rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 21)(valor 2)))");
            }
            else if (pre21.p21rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 21)(valor 3)))");
            }
            else if (pre21.p21rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 21)(valor 4)))");
            }
            if (pre22.p22rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 22)(valor 1)))");
            }
            else if (pre22.p22rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 22)(valor 2)))");
            }
            else if (pre22.p22rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 22)(valor 3)))");
            }
            else if (pre22.p22rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 22)(valor 4)))");
            }
            if (pre23.p23rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 23)(valor 1)))");
            }
            else if (pre23.p23rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 23)(valor 2)))");
            }
            else if (pre23.p23rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 23)(valor 3)))");
            }
            if (pre24.p24rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 24)(valor 1)))");
            }
            else if (pre24.p24rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 24)(valor 2)))");
            }
            else if (pre24.p24rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 24)(valor 3)))");
            }
            if (pre25.p25rb1.isSelected()){System.out.println("A");
                environment.eval("(assert (respuestas (pregunta 25)(valor 1)))");
            }
            else if (pre25.p25rb2.isSelected()){System.out.println("B");
                environment.eval("(assert (respuestas (pregunta 25)(valor 2)))");
            }
            else if (pre25.p25rb3.isSelected()){System.out.println("C");
                environment.eval("(assert (respuestas (pregunta 25)(valor 3)))");
            }
            else if (pre25.p25rb4.isSelected()){System.out.println("D");
                environment.eval("(assert (respuestas (pregunta 25)(valor 4)))");
            }
            
            
            environment.run();
            environment.eval("(resultado ?*valorA* ?*valorB* ?*valorC* ?*valorD* )");
           
            
            leerResultado();
            
        }catch(Exception e){
            System.out.println("Error no conectada");
            e.printStackTrace();
        }
    }
    
    public void leerResultado(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String resultado = "";
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("resultado.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            resultado = linea;
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        String [] partes = resultado.split(";");
        resultadoA=Integer.parseInt(partes[0]);
        resultadoB=Integer.parseInt(partes[1]);
        resultadoC=Integer.parseInt(partes[2]);
        resultadoD=Integer.parseInt(partes[3]);
        calcularMayor();
       // System.out.println("A: "+ resultadoA +"B: "+resultadoB+ "C:"+resultadoC +"D:" +resultadoD);  
    }
    public void calcularMayor(){
        if (resultadoA>=resultadoB && resultadoA>=resultadoC && resultadoA>=resultadoD){
            cardioVascular="RiesgoBajo";
            mostrar="El riesgo de infarto es... Bajo. ¡Enhorabuena! Llevas una vida saludable \n"
                    + "y se nota que proteges tu corazón. Nuestro consejo es que sigas con los buenos \n"
                    + "hábitos, tal y como vienes haciendo hasta ahora.";
        }
        else if(resultadoB>=resultadoA && resultadoB>=resultadoC && resultadoB>=resultadoD){
            cardioVascular="RiesgoMedio";
            mostrar="El riesgo de infarto es... Medio. Felicidades: estás dentro de los márgenes de la normalidad.\n"
                    + " Pero si te propusieras llevar un estilo de vida más cardiosaludable, ayudarías a reducir \n"
                    + "cualquier riesgo de enfermedad coronaria.";
        }
        else if(resultadoC>=resultadoA && resultadoC>=resultadoB && resultadoC>=resultadoD){
            cardioVascular="RiesgoElevado";
            mostrar="El riesgo de infarto es... Elevado. Puedes sufrir alguna dolencia cardiovascular.\n"
                    + " Nuestro consejo es que te tomes en serio las recomendaciones sobre alimentación y ejercicio físico. \n"
                    + "Consulta al médico si tienes dudas.";
        }
        else if(resultadoD>=resultadoA && resultadoD>=resultadoB && resultadoD>=resultadoC){
            cardioVascular="RiesgoAlto";
            mostrar="El riesgo de infarto es... Muy alto. Lo sentimos, pero tienes muchas probabilidades \n"
                    + "de padecer una enfermedad cardiovascular. No sólo deberías llevar un estilo de vida saludable, \n"
                    + "sino que estaría bien que acudieras a un médico...";
        }
         crearHecho();
    }
    
    public void crearHecho(){
        String nombreClass []= nombre.split(" ");
        try {
            environment.eval("(make-instance "+nombreClass[0]+" of persona "+"(nombre "+nombre+") "
                    +"(apellido "+apellido+") "+"(peso "+peso+") "
                            +"(genero "+genero+")"+"(cardiovascular "+cardioVascular+"))");
            environment.run();
            environment.reset();
        } catch (CLIPSException ex) {
            Logger.getLogger(ControladorGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileWriter fichero = null;
        PrintWriter pw = null;
            try
            {
               fichero = new FileWriter("hechos.txt",true);
               pw = new PrintWriter(fichero);
               String hecho = "(make-instance "+nombreClass[0]+" of persona "+"(nombre "+nombre+") "
                    +"(apellido "+apellido+") "+"(peso "+peso+") "
                            +"(genero "+genero+")"+"(cardiovascular "+cardioVascular+"))\n";
               pw.println(hecho);

            } catch (Exception e) {
               e.printStackTrace();
            } finally {
              try {
              if (null != fichero)
                 fichero.close();
              } catch (Exception e2) {
                 e2.printStackTrace();
              }
           }
            
            Resultado resul=new Resultado();
            resul.lblNomR.setText(nombre);
            resul.txtR.setText(mostrar);
            resul.setVisible(true);
    
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
