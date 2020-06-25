import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.*;

public class TimeLogger {
  
  JFrame frame;
  JPanel mainPanel;
  JButton log;
  JLabel time;

  public static void main(String[] args){
    TimeLogger timeLogger = new TimeLogger();
    timeLogger.build();
  }

  public void build(){
    frame = new JFrame("Time Logger");
    mainPanel = new JPanel();

    log = new JButton("Log Time");
    log.addActionListener(new LogListener());
   
    String currentTime = LocalDateTime.now().toString();
    time = new JLabel(currentTime);

    mainPanel.add(BorderLayout.NORTH, time);
    mainPanel.add(BorderLayout.CENTER, log);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(mainPanel);
    frame.setSize(300,300);
    frame.setVisible(true);

  }
  
  public void log(){
    System.out.println(LocalDateTime.now());
  }

  public class LogListener implements ActionListener {
    public void actionPerformed(ActionEvent ev){
      log();
    }
  }
}
