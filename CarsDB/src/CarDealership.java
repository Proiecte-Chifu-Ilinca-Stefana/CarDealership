import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  CarDealership extends JFrame  implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;

    private JButton insert, delete;
    private JTextArea  tx;
    private JPanel panel, panel1, panel2,panel3, panel4;
    private JLabel lb, lb1,lb2,lb3,lb4,lb5,lb6, lb7;
    public static JTextField tf1;
    public static JTextField tf2;
    public static JTextField tf3;
    public static JTextField tf4;
    public static JTextField tf5;
    public static JTextField tf6;

    public static JTextField tf7;

    Border blackline;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button1){
            DBConnection db= new DBConnection();
            String s= db.selectDB1();
            tx.setText(s);

        }
        if (e.getSource()== button2){
            DBConnection db= new DBConnection();
            String s= db.selectDB2();
            tx.setText(s);

        }
        if (e.getSource()== button3){
            DBConnection db= new DBConnection();
            String s= db.selectDB3();
            tx.setText(s);

        }
        if (e.getSource()== button4){
            DBConnection db= new DBConnection();
            String s= db.selectDB4();
            tx.setText(s);

        }
        if (e.getSource()== button5){
            DBConnection db= new DBConnection();
            String s= db.selectDB5();
            tx.setText(s);

        }
        if (e.getSource()== button6){
            DBConnection db= new DBConnection();
            String s= db.selectDB6();
            tx.setText(s);

        }
        if (e.getSource()== button7){
            DBConnection db= new DBConnection();
            String s= db.selectDB7();
            tx.setText(s);

        }

        if(e.getSource()==insert){
            DBConnection db= new DBConnection();
            db.insertDB();
                   }
        if(e.getSource()==delete){
            DBConnection db= new DBConnection();
             db.deleteDB();
                  }

    }

    public void initComponents(){
        panel =new JPanel();
        panel1 =new JPanel();
        panel2 =new JPanel();
        panel3 =new JPanel();
        panel4 =new JPanel();
        panel.setLayout( new FlowLayout());

        panel1.setLayout( new GridLayout(7,1));
        JLabel showTextArea = new JLabel("Car Dealership");
        showTextArea.setFont(new Font("Times New Roman", Font.ITALIC, 26));
        showTextArea.setBounds(5, 5, 186, 70);
        this.getContentPane().add(showTextArea);

        button1= new JButton("Car Brand");
        button1.setSize(20,30);
        panel1.add(button1);

        button2= new JButton("Car Model");
        button2.setSize(20,30);
        panel1.add(button2);

        button3= new JButton("Option");
        button3.setSize(20,30);
        panel1.add(button3);

        button4= new JButton("Dealer");
        button4.setSize(20,30);
        panel1.add(button4);

        button5= new JButton("Manufacturer");
        button5.setSize(20,30);
        panel1.add(button5);

        button6= new JButton("Inventory");
        button6.setSize(20,30);
        panel1.add(button6);

        button7= new JButton("Customer");
        button7.setSize(20,30);
        panel1.add(button7);

        Dimension d= new Dimension(20,210);
        panel1.setSize(d);

        lb= new JLabel("<html><FONT COLOR=RED><b>Red</b></FONT>");

        tx= new JTextArea(20,75);
        boolean b = true;


        tx.setAutoscrolls(b);
        Dimension d1= new Dimension(300,210);
        panel2.setSize(d1);

        panel2.add(tx);


        panel3.setLayout( new GridLayout(7,2));
        lb1= new JLabel("ID");
        lb2= new JLabel("Name");
        lb3= new JLabel("Year");
        lb4= new JLabel("Brand");
        lb5= new JLabel("Body Style");
        lb6= new JLabel("Warranty");
        lb7= new JLabel("Price");
        tf1= new JTextField(10);
        tf2= new JTextField(20);
        tf3= new JTextField(20);
        tf4= new JTextField(20);
        tf5= new JTextField(20);
        tf6= new JTextField(20);
        tf7= new JTextField(10);

        panel3.add(lb1);
        panel3.add(tf1);
        panel3.add(lb2);
        panel3.add(tf2);
        panel3.add(lb3);
        panel3.add(tf3);
        panel3.add(lb4);
        panel3.add(tf4);
        panel3.add(lb5);
        panel3.add(tf5);
        panel3.add(lb6);
        panel3.add(tf6);
        panel3.add(lb7);
        panel3.add(tf7);
        Dimension d2= new Dimension(300,210);
        panel3.setSize(d2);

        panel4.setLayout( new GridLayout(3,1));
        insert= new JButton("Insert");
        insert.setSize(20,30);
        panel4.add(insert);


        delete= new JButton("Delete");
        delete.setSize(20,30);
        panel4.add(delete);
        panel4.setSize(d);


        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        this.add(panel);

        this.setVisible(true);
        this.setSize(1500,400);
        this.setBackground(Color.gray);
        this.setTitle("Car Dealership");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        insert.addActionListener(this);
        delete.addActionListener(this);
    }

    public static void main(String args[]){
        CarDealership cs= new CarDealership();
        cs.initComponents();
    }
}
