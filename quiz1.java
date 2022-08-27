package quiz_1;

import javax.swing.JOptionPane;

public class quiz1 {
    public static void main(String[] args) {
        int ConsumoAgua;
        int CuotaFija = 10000;
        int CostoTotal = 0;
        ConsumoAgua = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el gasto de agua mensual: "));

        if (ConsumoAgua <= 50){
            CostoTotal = CuotaFija;
        } else if (ConsumoAgua > 50 && ConsumoAgua <= 200){
            ConsumoAgua -= 50;
            CostoTotal = CuotaFija + (ConsumoAgua * 2000);
        } else {
            ConsumoAgua -= 50;
            CostoTotal = CuotaFija + (ConsumoAgua * 3000);
        }
        JOptionPane.showMessageDialog(null, "Con un gasto de agua de " + (ConsumoAgua + 50) + " m3 mensuales, el costo total es: " + CostoTotal);
        System.exit(0);
    }
}
