import java.awt.event.*;
import javax.swing.*;

public class Pizza extends JFrame implements ActionListener {
    private JFrame f;
    private JButton b;
    private JCheckBox olives, pepperoni, pineapple, mushrooms, chicken, spinach, extraCheese, onions;
    private JRadioButton small, medium, large, extraLarge;
    private JLabel l1, l2;

    public Pizza() {
        f = new JFrame("Pizza System");
        f.setSize(806, 507);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        small = new JRadioButton("Small", true);
        small.setBounds(41, 49, 67, 24);
        medium = new JRadioButton("Medium");
        medium.setBounds(153, 49, 85, 24);
        large = new JRadioButton("Large");
        large.setBounds(287, 48, 67, 24);
        extraLarge = new JRadioButton("Extra Large");
        extraLarge.setBounds(408, 48, 104, 24);
        ButtonGroup bg = new ButtonGroup();
        bg.add(small);
        bg.add(medium);
        bg.add(large);
        bg.add(extraLarge);
        f.add(small);
        f.add(medium);
        f.add(large);
        f.add(extraLarge);
        pepperoni = new JCheckBox("Pepperoni");
        pepperoni.setBounds(41, 129, 98, 24);
        f.add(pepperoni);
        mushrooms = new JCheckBox("Mushrooms");
        mushrooms.setBounds(153, 129, 108, 24);
        f.add(mushrooms);
        spinach = new JCheckBox("Spinach");
        spinach.setBounds(287, 129, 83, 24);
        f.add(spinach);
        pineapple = new JCheckBox("Pineapple");
        pineapple.setBounds(408, 129, 97, 24);
        f.add(pineapple);
        extraCheese = new JCheckBox("Extra Cheese");
        extraCheese.setBounds(41, 210, 115, 24);
        f.add(extraCheese);
        olives = new JCheckBox("Black Olives");
        olives.setBounds(153, 210, 110, 24);
        f.add(olives);
        chicken = new JCheckBox("Chicken");
        chicken.setBounds(287, 210, 82, 24);
        f.add(chicken);
        onions = new JCheckBox("Onions");
        onions.setBounds(408, 210, 77, 24);
        f.add(onions);
        b = new JButton("Total");
        b.setBounds(41, 291, 120, 30);
        f.add(b);
        b.addActionListener(this);
        l1 = new JLabel("Thank you for using our automated Pizza Maker System.");
        l1.setBounds(185, 255, 350, 24);
        f.add(l1);
        l2 = new JLabel();
        l2.setBounds(185, 305, 157, 24);
        f.add(l2);
    }

    public void actionPerformed(ActionEvent e) {
        double price = 0.0;
        if (small.isSelected())
            price = price + 7.25;
        else if (medium.isSelected())
            price = price + 10.25;
        else if (large.isSelected())
            price = price + 13.25;
        else
            price = price + 18.25;
        if (olives.isSelected())
            price = price + 1.15;
        if (pepperoni.isSelected())
            price = price + 2.16;
        if (pineapple.isSelected())
            price = price + 1.16;
        if (mushrooms.isSelected())
            price = price + 0.82;
        if (chicken.isSelected())
            price = price + 1.13;
        if (spinach.isSelected())
            price = price + 1.19;
        if (extraCheese.isSelected())
            price = price + 1.53;
        if (onions.isSelected())
            price = price + 1.14;
        int x = JOptionPane.showConfirmDialog(f, "Would you like this to be delivered to your home residence?");
        if (x == JOptionPane.YES_OPTION)
            price = price + 4.17;
        price = price + 2.34;
        double roundoff = Math.round(price * 100.0) / 100.0;
        l2.setText("Total: $" + roundoff);
    }

    public static void main(String[] args) {
        new Pizza();
    }
}