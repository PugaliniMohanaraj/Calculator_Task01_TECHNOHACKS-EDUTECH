import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

class calculator implements ActionListener {
    JFrame frame;
    JTextField screen;
    JButton nbtn[] = new JButton[10];
    JButton btnPlus, btnMinus, btnRem, btnDiv, btnMult, btnZero, btnZero2, btnEq, btnDec, btnAC, btnDel;
    Font ff1 = new Font("Ink.Free", Font.BOLD, 20);
    Font ff2 = new Font("Ink.Free", Font.BOLD, 30);

    JPanel panel;

    char opr;
    Double num1 ,num2 , result;

    public calculator() {
        frame = new JFrame();
        frame.setSize(400, 550);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0000));

        screen = new JTextField("");
        screen.setBounds(25, 25, 340, 50);
        screen.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.WHITE, 1),
        BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
                BorderFactory.createLineBorder(Color.WHITE, 2))));

        screen.setFont(ff1);
        screen.setEditable(false);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(screen);

        panel = new JPanel();
        panel.setBounds(25, 100, 335, 370);
        panel.setLayout(new GridLayout(5, 4));
        frame.add(panel);

        for (int i = 0; i < 10; i++) {
            nbtn[i] = new JButton(String.valueOf(i));
            nbtn[i].setFont(ff2);
            nbtn[i].setBackground(new Color(40, 40, 40));
            nbtn[i].setBorder(BorderFactory.createLineBorder(Color.white, 2));
            nbtn[i].setForeground(Color.WHITE);
            nbtn[i].addActionListener(this);
        }

        btnPlus = new JButton("+");
        btnPlus.setFont(ff1);
        btnPlus.setBackground(new Color(40, 40, 40));
        btnPlus.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnPlus.setForeground(Color.WHITE);

        btnMinus = new JButton("-");
        btnMinus.setFont(ff1);
        btnMinus.setBackground(new Color(40, 40, 40));
         btnMinus.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnMinus.setForeground(Color.WHITE);

        btnMult = new JButton("*");
        btnMult.setFont(ff1);
        btnMult.setBackground(new Color(40, 40, 40));
        btnMult.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnMult.setForeground(Color.WHITE);

        btnDiv = new JButton("/");
        btnDiv.setFont(ff1);
        btnDiv.setBackground(new Color(40, 40, 40));
        btnDiv.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnDiv.setForeground(Color.WHITE);

        btnZero = new JButton("0");
        btnZero.setFont(ff1);
        btnZero.setBackground(new Color(40, 40, 40));
        btnZero.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnZero.setForeground(Color.WHITE);

        btnZero2 = new JButton("00");
        btnZero2.setFont(ff1);
        btnZero2.setBackground(new Color(40, 40, 40));
        btnZero2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnZero2.setForeground(Color.WHITE);

        btnDec = new JButton(".");
        btnDec.setFont(ff1);
        btnDec.setBackground(new Color(40, 40, 40));
        btnDec.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnDec.setForeground(Color.WHITE);

        btnDel = new JButton("C");
        btnDel.setFont(ff1);
        btnDel.setBackground(new Color(40,40,40));
        btnDel.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnDel.setForeground(Color.WHITE);

        btnEq = new JButton("=");
        btnEq.setFont(ff1);
        btnEq.setBackground(new Color(0,0,139));
        btnEq.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnEq.setForeground(Color.WHITE);

        btnAC = new JButton("AC");
        btnAC.setFont(ff1);
        btnAC.setBackground(new Color(188,0,0));
        btnAC.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnAC.setForeground(Color.WHITE);

        btnRem = new JButton("%");
        btnRem.setFont(ff1);
        btnRem.setBackground(new Color(40, 40, 40));
        btnRem.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        btnRem.setForeground(Color.WHITE);

        panel.add(btnAC);
        panel.add(btnDel);
        panel.add(btnDiv);
        panel.add(btnMult);
        panel.add(nbtn[7]);
        panel.add(nbtn[8]);
        panel.add(nbtn[9]);
        panel.add(btnMinus);
        panel.add(nbtn[4]);
        panel.add(nbtn[5]);
        panel.add(nbtn[6]);
        panel.add(btnPlus);
        panel.add(nbtn[1]);
        panel.add(nbtn[2]);
        panel.add(nbtn[3]);
        panel.add(btnRem);
        panel.add(btnZero);
        panel.add(btnZero2);
        panel.add(btnDec);
        panel.add(btnEq);

        btnZero.addActionListener(this);
        btnZero2.addActionListener(this);
        btnDec.addActionListener(this);
        btnAC.addActionListener(this);
        btnDel.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMult.addActionListener(this);
        btnDiv.addActionListener(this);
        btnRem.addActionListener(this);
        btnEq.addActionListener(this);

        frame.setLayout(null);
        frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        try{
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == nbtn[i]) {
                screen.setText(screen.getText().concat(String.valueOf(i)));   
            }
        }
        if (e.getSource() == btnZero) {
            screen.setText(screen.getText().concat("0"));   
        }
        if (e.getSource() == btnZero2) {
            screen.setText(screen.getText().concat("00"));   
        }
        if (e.getSource() == btnDec) {
            screen.setText(screen.getText().concat("."));   
        }
        if (e.getSource() == btnAC) {
            screen.setText("");   
        }
        if (e.getSource() == btnDel) {
            String backSpace= null;
            if (screen.getText().length()>0) {
                StringBuilder str = new StringBuilder(screen.getText());
                str.deleteCharAt(screen.getText().length()-1);
                backSpace=str.toString();
                screen.setText(backSpace);
                
            }
        }

        if (e.getSource() == btnPlus) {
           num1= Double.parseDouble(screen.getText()) ;
           opr='+';
           screen.setText(""); 
        }

        if (e.getSource() == btnMinus) {
            num1= Double.parseDouble(screen.getText()) ;
            opr='-';
            screen.setText(""); 
         }

         
         if (e.getSource() == btnMult) {
            num1= Double.parseDouble(screen.getText()) ;
            opr='*';
            screen.setText(""); 
         }

         
         if (e.getSource() == btnDiv) {
            num1= Double.parseDouble(screen.getText()) ;
            opr='/';
            screen.setText(""); 
         }

         
         if (e.getSource() == btnRem) {
            num1= Double.parseDouble(screen.getText()) ;
            opr='%';
            screen.setText(""); 
         }

         if (e.getSource() == btnEq) {
            num2= Double.parseDouble(screen.getText()) ;
           switch (opr) {
            case '+':
                result=num1+num2;
                screen.setText(String.valueOf(result));
                break;
           
            case '-':
                result=num1-num2;
                screen.setText(String.valueOf(result));
                break;

            case '*':
                result=num1*num2;
                screen.setText(String.valueOf(result));
                break;

                case '/':
                result=num1/num2;
                screen.setText(String.valueOf(result));
                break;

                case '%':
                result=num1%num2;
                screen.setText(String.valueOf(result));
                break;

           }
         }
       

        }

        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "SYNTAX ERROR");
            screen.setText("");
        }
       

    }

    public static void main(String[] args) {
        new calculator();
    }
}
