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

public class Device3SubConfig extends JFrame {
	private static final long serialVersionUID = 1L;
	private Data myData;
	private Result result;

	String[] values = { "Please select Device Name", "Device1", "Device2", "Device3", "Device4" };
	JComboBox<String> cmb = new JComboBox<>(values);
	JLabel label = new JLabel("What do you want to Subcribe?");
	JLabel title = new JLabel("Device 3 Subscription");

	JButton subBtn = new JButton("Subscribe");
	JButton back = new JButton("Back");
	JCheckBox box;

	JPanel pn = new JPanel();
	JPanel pw = new JPanel();
	JPanel pe = new JPanel();
	JPanel ps = new JPanel();

	ArrayList<JCheckBox> listDynamicCheck;
	ArrayList<JCheckBox> isSelected;

	public Device3SubConfig(Data myDataIn, Result resultIn) {
		this.myData = myDataIn;
		this.result = resultIn;
		listDynamicCheck = new ArrayList<>();
		isSelected = new ArrayList<>();

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		getContentPane().add(pn, BorderLayout.NORTH);
		pn.add(title);

		pe.setBounds(61, 11, 81, 140);
		pe.setLayout(new BoxLayout(pe, BoxLayout.Y_AXIS));
		getContentPane().add(pe, BorderLayout.CENTER);

		// pw.setBounds(0,0,20,20);
		// pw.setLayout(new BoxLayout(pw, BoxLayout.Y_AXIS));
		getContentPane().add(pw, BorderLayout.WEST);

		// getContentPane().add(pw, BorderLayout.WEST);
		pw.add(label);
		pw.add(cmb);

		getContentPane().add(ps, BorderLayout.SOUTH);
		ps.add(subBtn);
		ps.add(back);

		setSize(600, 400);
		setLocationRelativeTo(null);

		cmb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				checkbox();

			}
		});
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				initiateSubscription();
				JOptionPane.showMessageDialog(null, "Device 3 Subcriber Successfully Configured: ", "MESSAGE",
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
		sub.setName("Device 3");
		result.setSub3(sub);
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
