package kino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KinoFrame {

    static Film film;

    public static void main(String[] args) {
        //Odkomentuj ponizej po stworzeniu klasy Film w projekcie:
        film = new Film(124, 6);
        JFrame frame = new JFrame("Test");
        frame.setVisible(true);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Dodaj");
        panel.add(button);
        button.addActionListener(new DodajRezerwacje());
        JButton button2 = new JButton("Wyswietl");
        panel.add(button2);
        button2.addActionListener(new Wyswietl());

    }

    static class DodajRezerwacje implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String imienazwisko = JOptionPane.showInputDialog("Imie,Nazwisko");
            String[] arr;
            arr = imienazwisko.split(",", 2);
            Osoba o = new Osoba(arr[0], arr[1]);
            try {
                film.addOsoba(o);
            } catch (BrakWolnychMiejscException ex) {
                 JOptionPane.showMessageDialog(null,"Brak Wolnych miejsc");
            }

        }
    }

    static class Wyswietl implements ActionListener {

        public void actionPerformed(ActionEvent e) {
//      Wyswietl obiekt typu film, kod filmu, oraz zajete miejsca.
//      za pomoca znanej Ci metody z klasy JOptionPane.

        }
    }
}
