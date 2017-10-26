package pubSubBuilderFinal.gui.sub;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import pubSubBuilderFinal.data.Data;
import pubSubBuilderFinal.gui.Result;
import pubSubBuilderFinal.gui.WelcomePage;
import pubSubBuilderFinal.subscriber.Subscriber;

public class Device1SubConfig extends JFrame {

	private static final long serialVersionUID = 1L;
	private Data myData;
	private Result result;

	String[] values = { "Please select Device Name", "Device1", "Device2", "Device3", "Device4" };
	JComboBox<String> cmb = new JComboBox<>(values);
	JLabel label;
	JLabel title;

	JButton subBtn;
	JButton back;
	JCheckBox box;

	JPanel pn;
	JPanel pw;
	JPanel pe;
	JPanel ps;

	ArrayList<JCheckBox> listDynamicCheck;
	ArrayList<JCheckBox> isSelected;

	public Device1SubConfig(Data myDataIn, Result resultIn) {
		this.myData = myDataIn;
		this.result = resultIn;
		listDynamicCheck = new ArrayList<>();
		isSelected = new ArrayList<>();

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		pn = new JPanel();
		pw = new JPanel();
		pe = new JPanel();
		ps = new JPanel();

		label = new JLabel("What do you want to Subcribe?");

		subBtn = new JButton("Subscribe");
		back = new JButton("Back");

		title = new JLabel("Device 1 Subscription");
		title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		getContentPane().add(pn, BorderLayout.NORTH);
		pn.add(title);

		getContentPane().add(ps, BorderLayout.SOUTH);
		ps.add(subBtn);
		ps.add(back);

		getContentPane().add(pw, BorderLayout.WEST);
		pw.add(label);
		pw.add(cmb);

		pe.setBounds(61, 11, 81, 140);
		pe.setLayout(new BoxLayout(pe, BoxLayout.Y_AXIS));
		getContentPane().add(pe, BorderLayout.CENTER);

		setSize(800, 400);
		setLocationRelativeTo(null);

		cmb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				checkbox();

			}
		});
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				initiateSubscription();
				JOptionPane.showMessageDialog(null, "Device 1 Subscriber Successfully Configured: ", "MESSAGE",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				goBack();
			}

		});

	}

	private void goBack() {
		this.setVisible(false);
		new WelcomePage(myData, result).setVisible(true);

	}

	public void initiateSubscription() {

		ArrayList<String> topicsArray = new ArrayList<>();
		Subscriber sub;
		for (JCheckBox checkCurrent : isSelected) {
			if (checkCurrent.isSelected())
				topicsArray.add(checkCurrent.getText());
			// System.out.println(checkCurrent.getText());
		}
		sub = new Subscriber(topicsArray.toArray(new String[topicsArray.size()]));
		sub.setName("Device 1");
		result.setSub1(sub);
	}

	public void checkbox() {

		for (JCheckBox check : listDynamicCheck) {
			pe.remove(check);
			pe.revalidate();
			pe.repaint();
		}
		listDynamicCheck.clear();

		String deviceSelected = (String) cmb.getSelectedItem();
		ArrayList<String> test;
		int i;
		switch (deviceSelected) {
		case "Device1": {
			test = result.getDevice1SelectedTopics();

			for (i = 0; i < test.size(); i++) {

				box = new javax.swing.JCheckBox(test.get(i));
				listDynamicCheck.add(box);
				isSelected.add(box);
				// getContentPane().add(pe, BorderLayout.EAST);
				pe.add(box);
				pe.revalidate();
				pe.repaint();

			}
			break;
		}
		case "Device2": {
			test = result.getDevice2SelectedTopics();

			for (i = 0; i < test.size(); i++) {

				box = new javax.swing.JCheckBox(test.get(i));
				listDynamicCheck.add(box);
				isSelected.add(box);
				// getContentPane().add(pe, BorderLayout.EAST);
				pe.add(box);
				pe.revalidate();
				pe.repaint();

			}
			break;
		}
		case "Device3": {
			test = result.getDevice3SelectedTopics();

			for (i = 0; i < test.size(); i++) {

				box = new javax.swing.JCheckBox(test.get(i));
				listDynamicCheck.add(box);
				isSelected.add(box);
				// getContentPane().add(pe, BorderLayout.EAST);
				pe.add(box);
				pe.revalidate();
				pe.repaint();

			}
			break;
		}
		case "Device4": {
			test = result.getDevice4SelectedTopics();

			for (i = 0; i < test.size(); i++) {

				box = new javax.swing.JCheckBox(test.get(i));
				listDynamicCheck.add(box);
				isSelected.add(box);
				// getContentPane().add(pe, BorderLayout.EAST);
				pe.add(box);
				pe.revalidate();
				pe.repaint();

			}
			break;
		}
		}
	}

}
