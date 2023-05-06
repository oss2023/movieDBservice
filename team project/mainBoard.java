import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainBoard extends JFrame implements ActionListener {

    //Button Board
    JPanel panel = new JPanel();
    JLabel buttonPanel = new JLabel();
    JLabel boardPanel = new JLabel();
    JButton btn_add = new JButton("Add Data");
    JButton btn_delete = new JButton("Delete Data");
    JButton btn_update = new JButton("Update Data");
    JButton btn_read = new JButton("Read Data");
    JButton btn_file_open = new JButton("File Open");
    JButton btn_search_by_name = new JButton("Search Name");
    JButton btn_search_by_movie = new JButton("Search Movie");
    JButton btn_search_by_movieRoom = new JButton("Search MovieRoom");

    //Data Board
    JLabel nameL = new JLabel("NAME: ", JLabel.LEFT);
    JLabel movie_nameL = new JLabel("Movie Title: ", JLabel.LEFT);

    mainBoard(){
        setTitle("Movie Ticket DataBase Service");
        setLayout(null);

        panel.setLayout(new GridLayout(2,1));
        panel.setBackground(new Color(255, 255, 255));

        buttonPanel.add(btn_add);
        btn_add.setBackground(new Color(204,160,240));
        btn_add.setBounds(10, 22, 90, 30);

        buttonPanel.add(btn_read);
        btn_read.setBackground(new Color(204,160,240));
        btn_read.setBounds(105, 22, 100, 30);

        buttonPanel.add(btn_update);
        btn_update.setBackground(new Color(204,160,240));
        btn_update.setBounds(210, 22, 110, 30);

        buttonPanel.add(btn_delete);
        btn_delete.setBackground(new Color(204,160,240));
        btn_delete.setBounds(325, 22, 110, 30);

        buttonPanel.add(btn_file_open);
        btn_file_open.setBackground(new Color(204,160,240));
        btn_file_open.setBounds(440, 22, 90, 30);

        buttonPanel.add(btn_search_by_name);
        btn_search_by_name.setBackground(new Color(204,160,240));
        btn_search_by_name.setBounds(535, 22, 110, 30);

        buttonPanel.add(btn_search_by_movie);
        btn_search_by_movie.setBackground(new Color(204,160,240));
        btn_search_by_movie.setBounds(10, 60, 120, 30);

        buttonPanel.add(btn_search_by_movieRoom);
        btn_search_by_movieRoom.setBackground(new Color(204,160,240));
        btn_search_by_movieRoom.setBounds(135, 60, 160, 30);

        buttonPanel.setLayout(null);
        buttonPanel.setBounds(10,10,665,100);
        buttonPanel.setBorder(new TitledBorder(new LineBorder(Color.gray, 1), "MENU"));
        boardPanel.setLayout(null);
        boardPanel.setBounds(10,110,665,340);
        boardPanel.setBorder(new TitledBorder(new LineBorder(Color.gray, 2), "Data Board"));

        btn_add.addActionListener(this);
        btn_delete.addActionListener(this);
        btn_update.addActionListener(this);
        btn_file_open.addActionListener(this);
        btn_search_by_name.addActionListener(this);
        btn_search_by_movie.addActionListener(this);
        btn_search_by_movieRoom.addActionListener(this);

        getContentPane().setBackground(new Color(245, 243, 243));
        setSize(700,500);
        setLocationRelativeTo(null);
        setResizable(false);
        add(buttonPanel);
        add(boardPanel);
        this.setVisible(true);
    }



// 이부분을 CLASS로 빼서 각기 다른 Swing창을 띄우면 어떨까 생각합니다!
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if(s.equals("Add Data")){
            boardPanel.add(nameL);
            nameL.setVisible(true);

        }else if(s.equals("Delete Data")){

        }else if(s.equals("Update Data")){

        }else if(s.equals("Read Data")){

        }else if(s.equals("File Open")){

        }else if(s.equals("Search Name")){

        }else if(s.equals("Search Movie")){

        }else if(s.equals("Search MovieRoom")){

        }
    }
}
