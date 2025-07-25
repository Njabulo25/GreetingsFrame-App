
package greetingGui.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingGui extends JFrame
{
    //Declare all components.
    
    //Declare 8 Panels.
    JPanel mainPnl;
    JPanel headingPnl;
    JPanel headingAndDetailsPnl;
    JPanel nameAndSurnamePnl;
    JPanel namePnl;
    JPanel surnamePnl;
    JPanel greetingsTextPnl;
    JPanel btnPnl;
    
    //Declare Labels.
    JLabel headingLabel;
    JLabel nameLabel;
    JLabel surnameLabel;
    
    //Declare 2 textFields.
    JTextField nameField;
    JTextField surnameField;
    
    //Declare 1 textArea.
    JTextArea greetingTextArea;
    
    //Declare 3 buttons.
    JButton greetBtn;
    JButton clearBtn;
    JButton exitBtn;
    
    public GreetingGui()
    {
        //Page settings.
        setTitle("Greetings GUI");
        setSize(600, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setBackground(Color.yellow);
        
        // Initialize all Panels.
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingAndDetailsPnl = new JPanel(new GridLayout(2,1));
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1,1,1));
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        greetingsTextPnl = new JPanel(new BorderLayout());
        greetingsTextPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2),"Greetings Text"));
        
        btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        mainPnl = new JPanel(new BorderLayout());
        
        // Initialize all labels.
        headingLabel = new JLabel("Greetings App");
        headingLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC,25));
        nameLabel = new JLabel("Name: ");
        surnameLabel = new JLabel("Surname: ");
        
        // Initialize all textFields.
        nameField = new JTextField(25);
        surnameField = new JTextField(25);
        
        // Initialize textArea.
        greetingTextArea = new JTextArea(25, 40);
        greetingTextArea.setEditable(false);
        greetingTextArea.setText("Hello" + nameField.getText() + " " + surnameField.getText());
        
        // Initialize all buttons.
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //Add components to the Panels.
        headingPnl.add(headingLabel);
        
        namePnl.add(nameLabel);
        namePnl.add(nameField);
        
        surnamePnl.add(surnameLabel);
        surnamePnl.add(surnameField);
        
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        headingAndDetailsPnl.add(headingPnl);
        headingAndDetailsPnl.add(nameAndSurnamePnl);
        
        greetingsTextPnl.add(greetingTextArea, BorderLayout.CENTER);
        
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(headingAndDetailsPnl,BorderLayout.NORTH);
        mainPnl.add(greetingsTextPnl,BorderLayout.CENTER);
        mainPnl.add(btnPnl,BorderLayout.SOUTH);
        
        //add main to the page.
        add(mainPnl);
        
        //page settings.
        this.setVisible(true);   
    }   
}
