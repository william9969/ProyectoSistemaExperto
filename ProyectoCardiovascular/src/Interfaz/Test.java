/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Panel;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jessica
 */
public class Test extends javax.swing.JFrame implements ActionListener{
    //this.Test = Test();
    private final Pregunta1 pre1;
    private final Pregunta2 pre2;
    private final Pregunta3 pre3;
    private final Pregunta4 pre4;
    private final Pregunta5 pre5;
    private final Pregunta6 pre6;
    private final Pregunta7 pre7;
    private final Pregunta8 pre8;
    private final Pregunta9 pre9;
    private final Pregunta10 pre10;
    private final Pregunta11 pre11;
    private final Pregunta12 pre12;
    private final Pregunta13 pre13;
    private final Pregunta14 pre14;
    private final Pregunta15 pre15;
    private final Pregunta16 pre16;
    private final Pregunta17 pre17;
    private final Pregunta18 pre18;
    private final Pregunta19 pre19;
    private final Pregunta20 pre20;
    private final Pregunta21 pre21;
    private final Pregunta22 pre22;
    private final Pregunta23 pre23;
    private final Pregunta24 pre24;
    private final Pregunta25 pre25;

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
    
        /*Inicialimos los JPanel que heredan del JPanel Contenedor*/
        pre1 = new Pregunta1();
        pre2 = new Pregunta2();
        pre3 = new Pregunta3();
        pre4 = new Pregunta4();
        pre5 = new Pregunta5();
        pre6 = new Pregunta6();
        pre7 = new Pregunta7();
        pre8 = new Pregunta8();
        pre9 = new Pregunta9();
        pre10 = new Pregunta10();
        pre11 = new Pregunta11();
        pre12 = new Pregunta12();
        pre13 = new Pregunta13();
        pre14 = new Pregunta14();
        pre15 = new Pregunta15();
        pre16 = new Pregunta16();
        pre17 = new Pregunta17();
        pre18 = new Pregunta18();
        pre19 = new Pregunta19();
        pre20 = new Pregunta20();
        pre21 = new Pregunta21();
        pre22 = new Pregunta22();
        pre23 = new Pregunta23();
        pre24 = new Pregunta24();
        pre25 = new Pregunta25();
        
        this.setLocationRelativeTo(null);
        /*contenedor.add(pre1);
        pre1.setVisible(true);
        pre2.setVisible(false);
        pre3.setVisible(false);*/
        /*Agregar los JPaneles al contenedor */
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre1);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre2);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre3);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre4);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre5);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre6);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre7);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre8);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre9);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre10);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre11);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre12);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre13);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre14);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre15);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre16);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre17);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre18);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre19);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre20);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre21);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre22);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre23);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre24);
        Controlador.ControladorGeneral.addComponentToContainer(this.contenedor, pre25);
        
        pre1.setVisible(true);
        contenedor.validate();
        events();
        deshabilitarBtn();
       
    }
    
    public final void events(){
        btnant.addActionListener(this);
        btnsig.addActionListener(this);
    }

    private void deshabilitarBtn(){
        if (pre1.isVisible()){
            btnant.setEnabled(false);
            btnsig.setEnabled(true);
        }else if (pre25.isVisible()){
            btnant.setEnabled(true);
            btnsig.setEnabled(false);
        }else{
            btnant.setEnabled(true);
            btnsig.setEnabled(true);
        }
    }
    /**
     * Metodo para mostrar o ocultar los JPanel 
     * @param btn 
     */
    private void changeJPanel(int btn){
        
        if (pre1.isVisible()){
            pre2.setVisible(true);
            pre3.setVisible(false);
            pre1.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre2.isVisible()){
            pre1.setVisible(btn == 1);
            pre3.setVisible(btn == 2);
            pre2.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre3.isVisible()){
            pre2.setVisible(btn == 1);
            pre4.setVisible(btn == 2);
            pre3.setVisible(false);
            pre1.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre4.isVisible()){
            pre3.setVisible(btn == 1);
            pre5.setVisible(btn == 2);
            pre4.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre5.isVisible()){
            pre4.setVisible(btn == 1);
            pre6.setVisible(btn == 2);
            pre5.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre6.isVisible()){
            pre5.setVisible(btn == 1);
            pre7.setVisible(btn == 2);
            pre6.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre7.isVisible()){
            pre6.setVisible(btn == 1);
            pre8.setVisible(btn == 2);
            pre7.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre8.isVisible()){
            pre7.setVisible(btn == 1);
            pre9.setVisible(btn == 2);
            pre8.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }else if (pre9.isVisible()){
            pre8.setVisible(btn == 1);
            pre10.setVisible(btn == 2);
            pre9.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre10.isVisible()){
            pre9.setVisible(btn == 1);
            pre11.setVisible(btn == 2);
            pre10.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre11.isVisible()){
            pre10.setVisible(btn == 1);
            pre12.setVisible(btn == 2);
            pre11.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre12.isVisible()){
            pre11.setVisible(btn == 1);
            pre13.setVisible(btn == 2);
            pre12.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre13.isVisible()){
            pre12.setVisible(btn == 1);
            pre14.setVisible(btn == 2);
            pre13.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre14.isVisible()){
            pre13.setVisible(btn == 1);
            pre15.setVisible(btn == 2);
            pre14.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre15.isVisible()){
            pre14.setVisible(btn == 1);
            pre16.setVisible(btn == 2);
            pre15.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre16.isVisible()){
            pre15.setVisible(btn == 1);
            pre17.setVisible(btn == 2);
            pre16.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre17.isVisible()){
            pre16.setVisible(btn == 1);
            pre18.setVisible(btn == 2);
            pre17.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre18.isVisible()){
            pre17.setVisible(btn == 1);
            pre19.setVisible(btn == 2);
            pre18.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre19.isVisible()){
            pre18.setVisible(btn == 1);
            pre20.setVisible(btn == 2);
            pre19.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre20.isVisible()){
            pre19.setVisible(btn == 1);
            pre21.setVisible(btn == 2);
            pre20.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre22.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre21.isVisible()){
            pre20.setVisible(btn == 1);
            pre22.setVisible(btn == 2);
            pre21.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre23.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre22.isVisible()){
            pre21.setVisible(btn == 1);
            pre23.setVisible(btn == 2);
            pre22.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre24.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre23.isVisible()){
            pre22.setVisible(btn == 1);
            pre24.setVisible(btn == 2);
            pre23.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre25.setVisible(false);
        }
        else if (pre24.isVisible()){
            pre23.setVisible(btn == 1);
            pre25.setVisible(btn == 2);
            pre24.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
        }
        else if (pre25.isVisible()){
            pre24.setVisible(true);
            pre25.setVisible(false);
            pre23.setVisible(false);
            pre1.setVisible(false);
            pre2.setVisible(false);
            pre3.setVisible(false);
            pre4.setVisible(false);
            pre5.setVisible(false);
            pre6.setVisible(false);
            pre7.setVisible(false);
            pre8.setVisible(false);
            pre9.setVisible(false);
            pre10.setVisible(false);
            pre11.setVisible(false);
            pre12.setVisible(false);
            pre13.setVisible(false);
            pre14.setVisible(false);
            pre15.setVisible(false);
            pre16.setVisible(false);
            pre17.setVisible(false);
            pre18.setVisible(false);
            pre19.setVisible(false);
            pre20.setVisible(false);
            pre21.setVisible(false);
            pre22.setVisible(false);
            pre25.setVisible(false);
        }
        contenedor.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        contenedor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnant = new javax.swing.JButton();
        btnsig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero:");

        jRadioButton1.setBackground(new java.awt.Color(102, 0, 0));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Mujer");

        jRadioButton2.setBackground(new java.awt.Color(102, 0, 0));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Hombre");

        txtnom.setText("   ");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Peso en Kg: ");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        contenedor.setBackground(new java.awt.Color(102, 0, 0));
        contenedor.setForeground(new java.awt.Color(102, 0, 0));
        contenedor.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        btnant.setBackground(new java.awt.Color(102, 0, 0));
        btnant.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnant.setForeground(new java.awt.Color(255, 255, 255));
        btnant.setText("Anterior");
        btnant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnantActionPerformed(evt);
            }
        });
        jPanel3.add(btnant);

        btnsig.setBackground(new java.awt.Color(102, 0, 0));
        btnsig.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnsig.setForeground(new java.awt.Color(255, 255, 255));
        btnsig.setText("Siguiente");
        btnsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigActionPerformed(evt);
            }
        });
        jPanel3.add(btnsig);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigActionPerformed
        // TODO add your handling code here:
        // pre1.setVisible(true);
    }//GEN-LAST:event_btnsigActionPerformed

    private void btnantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnant;
    private javax.swing.JButton btnsig;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        
        if (evt.equals(btnant)){
            changeJPanel(1); //identificar con un numero cada que se aplasta el boton anterior   
            deshabilitarBtn();
        }
        else if (evt.equals(btnsig)){
            changeJPanel(2); //identificar con un numero cada que se aplasta el boton siguiente   
            deshabilitarBtn();
        }
    }
}
