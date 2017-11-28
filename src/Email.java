import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import java.lang.StringBuilder;

public class Email{
    
    // Elementos para criar emails
    private String symbols[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
    private String domains[] = {"@hotmail", "@yahoo", "@uol", "@outlook", "@ig", "@bol"};
    private String nation[] = {".com.br", ".br", ".org", ".com", ".org"};
    private Random random;
    private StringBuilder emailTemp;
    private Integer randomNumbers;
    
    // Armazenamento
    private List<String> emails;

    public Email(Integer randomNumbers){
        random = new Random();
        emails = new ArrayList<>();
        emailTemp = new StringBuilder();
        this.randomNumbers = randomNumbers;
    }

    // Gera emails aleatórios
    public void genEmails(Integer quantidadeEmails){

        for (int i = 0; i < quantidadeEmails; i++){
            // Gerando os nomes primeiro
            for (int j = 0; j < randomNumbers; j++){
                emailTemp.append(random.nextInt(symbols.length));
                emailTemp.append(symbols[random.nextInt(symbols.length - 1)]);
            }

            emailTemp.append(domains[random.nextInt(domains.length - 1)]);
            emailTemp.append(nation[random.nextInt(nation.length - 1)]);

            System.out.println(emailTemp.toString());
            emailTemp.append("\n");
        }

        Save.save(emailTemp.toString(), JOptionPane.showInputDialog(null, "Insira o local onde serão salvos os emails"));
    }
}