import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class SmsBulk{
public static void main(String args[]){
JFrame ui=new JFrame("MTN SMS APP");
ui.setLayout(new FlowLayout());
ui.setSize(700,500);
ui.setLocationRelativeTo(null);
ui.setMaximizedBounds(new Rectangle(0, 0, 700, 500));

ui.getContentPane().setBackground( new Color(200, 200, 200));

/*JMenu jmfile=new JMenu("File");
JMenuItem jmiClose =new  JMenuItem("Close");
JMenuItem jmiExit= new JMenuItem("Exit");
jmfile.add(jmiClose);
jmfile.add(jmiExit);
ui.add(jmfile);

iClose.addActionListener(this);
jmiExit.addActionListener(this);

JMenu jmhelp= new JMenu("Help");
JMenuItem jmihelp= new JMenuItem("Online Help");
jmhelp.add(jmihelp);
ui.add(jmhelp);*/


JPanel panel=new JPanel();
panel.setPreferredSize(new Dimension(700, 50));
panel.setBackground(new Color(0, 0, 64));
panel.setBorder(BorderFactory.createSoftBevelBorder(
                BevelBorder.RAISED));
ui.getContentPane().add(panel);


JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
panel1.setPreferredSize(new Dimension(700, 50));
panel1.setBackground(new Color(255, 204, 0));
panel1.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

JButton usage = new JButton("Usage");
panel1.add(usage);
JButton selfService = new JButton("Self Service");
panel1.add(selfService);
JButton device = new JButton("Device");
panel1.add(device);
JButton setup = new JButton("Setup");
panel1.add(setup);
JButton help = new JButton("Help");
panel1.add(help);
usage.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
      //JOptionPane.showMessageDialog(null, "Visit our website and check for the Usage", "Message", JOptionPane.INFORMATION_MESSAGE);
 ButtonSpacing.showWindow();
               
    }

});
selfService.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
      JOptionPane.showMessageDialog(null, "Contact our Main office for Self Service Call: +23300573367", "Message", JOptionPane.WARNING_MESSAGE);
    }

});

help.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
      JOptionPane.showMessageDialog(null, "Visit our website https:www.MTNgh", "Message", JOptionPane.ERROR_MESSAGE);
    }
    

});

device.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
      JOptionPane.showMessageDialog(null, "The device button is for only the administrator ", "Message", JOptionPane.ERROR_MESSAGE);
    
    }

});
setup.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
     JOptionPane.showMessageDialog(null, "Visit our website and check for the Setup", "Message", JOptionPane.INFORMATION_MESSAGE);
 
               
    }

});

ImageIcon mtn1=new ImageIcon("mtn1.jpg");
JLabel icon1=new JLabel("MTN",mtn1,JLabel.LEFT);
panel1.add(icon1);
ui.getContentPane().add(panel1);

JPanel panel4 = new JPanel(new BorderLayout());
panel4.setBackground(new Color(0, 0, 64));
panel4.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

JLabel text = new JLabel();
panel4.add(text, BorderLayout.NORTH);

// West panel
JPanel westPanel = new JPanel(new BorderLayout());
JTextArea textArea = new JTextArea(10, 20); 
textArea.setBorder(BorderFactory.createTitledBorder("Write Message"));
JScrollPane scrollPane1 = new JScrollPane(textArea);
westPanel.add(scrollPane1, BorderLayout.CENTER);
JTextField ft = new JTextField(15);
westPanel.add(ft, BorderLayout.SOUTH);
panel4.add(westPanel, BorderLayout.WEST);

// East panel
JPanel eastPanel = new JPanel(new BorderLayout());
JTextArea textArea2 = new JTextArea(10, 20); 
textArea2.setBorder(BorderFactory.createTitledBorder("Recipient"));
JScrollPane scrollPane2 = new JScrollPane(textArea2);
eastPanel.add(scrollPane2, BorderLayout.CENTER);
JTextField ft1 = new JTextField(15);
eastPanel.add(ft1, BorderLayout.SOUTH);
panel4.add(eastPanel, BorderLayout.EAST);

JPanel southPanel= new JPanel(new BorderLayout());

JButton media=new JButton("Media");
southPanel.add(media,BorderLayout.EAST);
JButton send = new JButton("Send");
southPanel.add(send, BorderLayout.CENTER);
panel4.add(southPanel,BorderLayout.SOUTH);

ui.getContentPane().add(panel4, BorderLayout.CENTER);




 send.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        // Get the text from the JTextField (under the JTextArea)
        String message = ft.getText();

        // Append the message to textArea2, with a newline if it already has content
        if (!textArea2.getText().isEmpty()) {
            textArea2.append("\n"); // Add a newline if there's existing text
        }
        textArea2.append(message); // Append the new message

        // Change the text color of textArea2 to blue
        textArea2.setForeground(Color.BLUE);

        // Optionally, clear the JTextField after sending the message
        ft.setText("");
    }
});


send.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        // Get the text from the JTextField (under textArea2)
        String message = ft1.getText();

        // Append the message to textArea, with a newline if it already has content
        if (!textArea.getText().isEmpty()) {
            textArea.append("\n"); // Add a newline if there's existing text
        }
        textArea.append(message); // Append the new message

        // Change the text color of textArea to blue
        textArea.setForeground(Color.BLUE);

        // Optionally, clear the JTextField after sending the message
        ft1.setText("");
    }
});

media.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            StringBuilder filePaths = new StringBuilder();

            for (File file : files) {
                filePaths.append(file.getAbsolutePath()).append("\n");
            }

            textArea.append(filePaths.toString());
            textArea2.append(filePaths.toString());
        }
    }
});



JPanel panel3=new JPanel(new FlowLayout());
panel3.setPreferredSize(new Dimension(700, 500));
panel3.setBackground(new Color(255, 204, 0));
ImageIcon mtn=new ImageIcon("mtn.jpg");
JLabel icon=new JLabel("MTN_GHANA",mtn,JLabel.LEFT);
panel3.add(icon);
JRadioButton connect=new JRadioButton("Connect");

 		connect.setBackground(new Color(255, 204, 0));
panel3.add(connect);
panel3.setBorder(BorderFactory.createSoftBevelBorder(
                BevelBorder.RAISED));
ui.getContentPane().add(panel3);



ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ui.setVisible(true);
}
}