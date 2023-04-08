import java.text.NumberFormat;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        
        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            
            /*int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);*/
    
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                //System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um numero inteiro. " + e.getMessage());
            } catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir número por 0. " + e.getMessage());
            } finally {
                System.out.println("Chegou no finnaly!");
            }
        } while (continueLooping);
       

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b){
        return a/b;
    }
 }
