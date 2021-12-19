/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultorio.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class Test {
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Tudo Certo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }
    }
}
