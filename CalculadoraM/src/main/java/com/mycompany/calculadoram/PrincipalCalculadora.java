package com.mycompany.calculadoram;



import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class PrincipalCalculadora {
    
    public static void main(String[] args) {
        
        int x, y;
        String sX, sY;
        
        sX = JOptionPane.showInputDialog( null, "Digite o primeiro número:", "Primeiro número", JOptionPane.QUESTION_MESSAGE);
        
        x = Integer.parseInt( sX );
        
        sY = JOptionPane.showInputDialog( null, "Digite o segundo número:", "Segundo número", JOptionPane.QUESTION_MESSAGE);
        
        y = Integer.parseInt( sY );
    
        
        //Instanciação de um objeto da classe calculadora
        
        calculadora calc = new calculadora();
        
        JOptionPane.showMessageDialog(null, "Somar: " + calc.somar ( x, y ));
        JOptionPane.showMessageDialog(null,"Subtrair: " + calc.subtrair ( x, y ));
        JOptionPane.showMessageDialog(null,"Multiplicar: " + calc.multiplicar ( x, y ));
        JOptionPane.showMessageDialog(null,"Dividir: " + calc.dividir ( x, y ));
        
        System.exit ( 0 );
    }
}
