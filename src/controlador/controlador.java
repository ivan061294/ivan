/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author l03m10
 */
public class controlador implements ActionListener{
    
     private vista view;
    private modelo model;
    
    public controlador(vista view,modelo model)
    {
        this.view = view;
        this.model =model;
        this.view.btnmultiplicar.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("MVC Multiplicr");
        view.setLocationRelativeTo(null);
        //
    }

    public void actionPerformed(ActionEvent e)
    {
        model.setNumerouno(Integer.parseInt(view.txtnumero1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtnumerodos.getText()));
        model.multiplicar();
        view.txtresultado.setText(String.valueOf(model.getResultado()));
    }

   
}

  

