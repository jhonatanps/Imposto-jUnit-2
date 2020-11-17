/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo.imposto;

/**
 *
 * @author Cirim
 */
public class NovoImposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Imposto imp = new Imposto();
        ImpostoCalculo impostoCalculo = new ImpostoCalculo();
        
        imp.setNumeroRegisto(1);
        
        imp.setValorImposto(100.00);
        imp.setMesAtraso(1.00);
        
        imp.valorDaMulta();
        imp.mesDeAtraso();
        imp.valorDoToal();
        
        System.out.println("Numero do resgito:");
        System.out.println(imp.numeroRegisto);
          System.out.println("Valor da multa:");
        System.out.println(imp.valorDaMulta());
          System.out.println("Valor da multa por meses de atraso:");
        System.out.println(imp.mesDeAtraso());
          System.out.println("Valor total da multa:");
        System.out.println(imp.valorDoToal());
    }
    
}
