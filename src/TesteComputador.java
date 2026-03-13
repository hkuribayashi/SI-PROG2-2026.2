import tarefa8.Desktop;
import tarefa8.Notebook;

import javax.swing.*;

void main(){
    int n = Integer.parseInt(JOptionPane.showInputDialog("Total de computadores"));
    while (n > 0){
        // Criando um computador
        String r = JOptionPane.showInputDialog("Notebook ou Desktop?");
        if (r.equals("Desktop")){
            // Aqui deve ser criado um desktop
            String marca = JOptionPane.showInputDialog("Marca");
            Integer mem = Integer.parseInt(JOptionPane.showInputDialog("Memória RAM"));
            String placa = JOptionPane.showInputDialog("Placa Gráfica");
            Integer tg = Integer.parseInt(JOptionPane.showInputDialog("Tamanho Gabiente"));
            String mm = JOptionPane.showInputDialog("Marca Monitor");
            Double tt = Double.parseDouble(JOptionPane.showInputDialog("Tamanho da Tela"));

            Desktop d = new Desktop(marca, mem, placa, tg, mm, tt);
            IO.println( d.toString() );
        }else{
            // Aqui deve ser criado um notebook
            String marca = JOptionPane.showInputDialog("Marca");
            Integer mem = Integer.parseInt(JOptionPane.showInputDialog("Memória RAM"));
            String placa = JOptionPane.showInputDialog("Placa Gráfica");
            Double cb = Double.parseDouble(JOptionPane.showInputDialog("Capacidade Bateria"));
            Double tt = Double.parseDouble(JOptionPane.showInputDialog("Tamanho da Tela do Notebook"));

            Notebook n1 = new Notebook(marca, mem, placa, cb, tt);
            IO.println( n1.toString() );
        }
        n--;
    }
}