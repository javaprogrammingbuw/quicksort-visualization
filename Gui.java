import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{

	private JPanel contentPane;
	private JPanel inputPane;
	private JTextPane outputPane;
	private JTextField tf;
	private JButton sortBtn;

	public Gui(){
		initUi();
	}

	public void initUi(){
		contentPane = (JPanel) getContentPane();

		inputPane = new JPanel();
		tf = new JTextField();
		tf.setText("Input comes here");
		sortBtn = new JButton("Sort");
		inputPane.add(tf);
		inputPane.add(sortBtn);
		inputPane.setLayout(new GridLayout(1,3));

		outputPane = new JTextPane();
		outputPane.setPreferredSize(new Dimension(600, 600));
		outputPane.setLayout(new FlowLayout());
		outputPane.setText("1. Iteration: \n Pivot: \n List: \n 2. Iteration: \n ...");

		contentPane.add(inputPane);
		contentPane.add(outputPane);

		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        pack();

        //Position in screen center
        setLocationRelativeTo(null);
        //Close Application when window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		EventQueue.invokeLater(() ->{
            Gui gui = new Gui();
            gui.setVisible(true);
        });
	}

}