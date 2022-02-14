import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CiubotariuBeatrice {
    public static void main(String args[]){
        Angajati angajat=new Angajati("Ana","20 lei","5","10 lei");
        System.out.println(angajat.toString());

        JFrame frame=new JFrame("Angajati");
        JPanel panel=new JPanel();

        JComboBox lista=new JComboBox();
        lista.addItem(angajat);

        JLabel lblNume=new JLabel("");
        JLabel lblTarif=new JLabel("");
        JLabel lblOre=new JLabel("");
        JLabel lblAvans=new JLabel("");

        JTextField txtNume=new JTextField();
        JTextField txtTarif=new JTextField();
        JTextField txtOre=new JTextField();
        JTextField txtAvans=new JTextField();
        JLabel lblDetaliiComplete=new JLabel("");
        JButton btnPreluareNume=new JButton("Preluare nume");
        JButton btnPreluareTarif=new JButton("Preluare tarif");
        JButton btnPreluareOre=new JButton("Preluare ore");
        JButton btnPreluareAvans=new JButton("Preluare avans");
        JButton btnCreareObiect=new JButton("Creeaza obiect");
        JButton btnAfisareInEtichetaToateInf=new JButton("Afiseaza date obiect curent");

        panel.add(txtAvans);
        panel.add(txtOre);
        panel.add(txtTarif);
        panel.add(txtNume);
        panel.add(lblAvans);
        panel.add(lblOre);
        panel.add(lblTarif);
        panel.add(lblNume);
        panel.add(lblDetaliiComplete);
        panel.add(btnAfisareInEtichetaToateInf);
        panel.add(btnCreareObiect);
        panel.add(btnPreluareAvans);
        panel.add(btnPreluareOre);
        panel.add(btnPreluareTarif);
        panel.add(btnPreluareNume);
        panel.add(lista);
        frame.add(panel);
        txtAvans.setBounds(260,150,50,20);
        txtOre.setBounds(190,150,50,20);
        txtTarif.setBounds(120,150,50,20);
        txtNume.setBounds(50,150,50,20);
        lblDetaliiComplete.setBounds(20,100,50,20);
        lblAvans.setBounds(200,100,50,20);
        lblOre.setBounds(150,100,50,20);
        lblTarif.setBounds(100,100,50,20);
        lblNume.setBounds(50,100,50,20);
        btnAfisareInEtichetaToateInf.setBounds(380,300,50,20);
        btnCreareObiect.setBounds(310,300,50,20);
        btnPreluareAvans.setBounds(240,300,50,20);
        btnPreluareOre.setBounds(170,300,50,20);
        btnPreluareTarif.setBounds(100,300,50,20);
        btnPreluareNume.setBounds(30,300,50,20);
        lista.setBounds(30,20,200,20);

        btnPreluareNume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNume.setText(((Angajati)lista.getSelectedItem()).angNume);
            }
        } );

        btnPreluareTarif.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtTarif.setText(((Angajati)lista.getSelectedItem()).tarifOrar);
            }
        } );

        btnPreluareOre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtOre.setText(((Angajati)lista.getSelectedItem()).oreLucrate);
            }
        } );

        btnPreluareAvans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAvans.setText(((Angajati)lista.getSelectedItem()).avansSalariu);
            }
        } );

        btnCreareObiect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Angajati angPrestabilit = new Angajati(txtNume.getText(), txtTarif.getText(), txtOre.getText(), txtAvans.getText());
                lista.addItem(angPrestabilit);
            }
        } );

        btnAfisareInEtichetaToateInf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblDetaliiComplete.setText(((Angajati)lista.getSelectedItem()).toString());
            }
        } );

        lista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Angajati angajatSelectat = (Angajati)lista.getSelectedItem();
                lblNume.setText(angajatSelectat.getNume());
                lblTarif.setText(angajatSelectat.getTarif());
                lblOre.setText(angajatSelectat.getOre());
                lblAvans.setText(angajatSelectat.getAvans());
            }
        });

        panel.setSize(500,400);
        panel.setLayout(null);
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setLocation(200,100);
        frame.setVisible(true);
    }
}
