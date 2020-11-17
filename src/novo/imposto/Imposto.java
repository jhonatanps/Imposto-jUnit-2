/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo.imposto;

public class Imposto {
    
    double numeroRegisto;
    double valorImposto;
    double valorMulta;
    double mesAtraso;
    double valorTotal;
    double totalAtraso;
    
    public double valorDaMulta(){
        
        if(valorImposto <= 500.00){
            //1.0 / 100 = 0.01
            valorMulta = 0.01 * valorImposto;
        }else if((valorImposto > 500.00)&&(valorImposto <= 1800.00)){
            valorMulta = 0.02 * valorImposto;
        }else if((valorImposto > 1800.00) && (valorImposto <= 5000.00)){
            valorMulta = 0.04 * valorImposto;
        }else if((valorImposto > 5000.00)&&(valorImposto <= 12000.00)){
            valorMulta = 0.07 * valorImposto;
        }else{
            valorMulta = 0.10 * valorImposto;
        }      
        return valorMulta;
    }
    
    public double mesDeAtraso(){
        
        totalAtraso = mesAtraso * valorMulta;
        
        return totalAtraso;
    }
    
    public double valorDoToal(){
        
        valorTotal = valorImposto + totalAtraso;
        
        return valorTotal;
    }

    public double getNumeroRegisto() {
        return numeroRegisto;
    }

    public void setNumeroRegisto(double numeroRegisto) {
        this.numeroRegisto = numeroRegisto;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double getMesAtraso() {
        return mesAtraso;
    }

    public void setMesAtraso(double mesAtraso) {
        this.mesAtraso = mesAtraso;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    

   

    
    
}
