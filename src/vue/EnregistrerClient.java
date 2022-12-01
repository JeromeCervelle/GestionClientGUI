package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnregistrerClient extends JDialog {
    private JTextField tfNomClient;
    private JTextField tfPrenomClient;
    private JTextField tfPortableClient;
    private JPasswordField pfMotDePasseClient;
    private JPasswordField pfComfirmeMotDePasse;
    private JButton enregistrerButton;
    private JButton annulerButton;
    private JPanel ClientPanel;

    public EnregistrerClient(JFrame parent) {
        super(parent);
        setTitle("Créer un nouvel utilisateur");
        setContentPane(ClientPanel);
        setMinimumSize(new Dimension(800,400));
        setModal(true);
        setLocationRelativeTo(parent);

        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enregistrerClient();
            }
        });

        annulerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    private void enregistrerClient() {

        if (tfNomClient.getText().isEmpty() ||
                tfPrenomClient.getText().isEmpty() ||
                tfPortableClient.getText().isEmpty() ||
                pfMotDePasseClient.getPassword().length < 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Tous les champs sont requis",
                    "Recommencez",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!pfMotDePasseClient.equals(pfComfirmeMotDePasse)) {

            JOptionPane.showMessageDialog(
                    this,
                    "Les mots de passe ne correspondent pas !",
                    "Recommensez la saisie du mot de passe",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        ajouterClient(nomClietn)
    }
}
