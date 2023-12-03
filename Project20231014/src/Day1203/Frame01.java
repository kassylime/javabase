package Day1203;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;

public class Frame01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JButton btnSave = new JButton("Save");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame01 frame = new Frame01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame01() {
		setTitle("프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Open File");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_4 = new JMenu("Load");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("1. ----------");
		mnNewMenu_4.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("2. ----------");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("3. ----------");
		mnNewMenu_4.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Source");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Help");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		getContentPane().setLayout(new MigLayout("", "[434px]", "[24.00px][][23px][][][][][]"));
		
		JCheckBox checkBox_1 = new JCheckBox("1번 파일");
		getContentPane().add(checkBox_1, "flowx,cell 0 0");
		
		JCheckBox checkBox_2 = new JCheckBox("2번 파일");
		getContentPane().add(checkBox_2, "cell 0 0");
		
		JCheckBox checkBox_3 = new JCheckBox("3번 파일");
		getContentPane().add(checkBox_3, "cell 0 0");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_1.isSelected()) {
					System.out.println("Saving 1번 파일...");
					for (int i = 0; i < mnNewMenu_4.getItemCount(); i++) {
		                JMenuItem item = mnNewMenu_4.getItem(i);
		                if (item != null && "1. ----------".equals(item.getText())) {
		                    // Modify the name as needed
		                    item.setText("1. 23_12_03");
		                    break;
		                }
					}
				} else {
					// Save the content of another file or handle differently
					// You can add your logic here
					System.out.println("Saving other file...");
				}
			}
		});
		getContentPane().add(btnSave, "cell 0 7,growx,aligny top");
	}
}
