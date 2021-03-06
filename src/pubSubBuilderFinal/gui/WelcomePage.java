package pubSubBuilderFinal.gui;

import java.util.ArrayList;

import pubSubBuilderFinal.data.Data;
import pubSubBuilderFinal.gui.pub.Device1PubConfig;
import pubSubBuilderFinal.gui.pub.Device2PubConfig;
import pubSubBuilderFinal.gui.pub.Device3PubConfig;
import pubSubBuilderFinal.gui.pub.Device4PubConfig;
import pubSubBuilderFinal.gui.sub.Device1SubConfig;
import pubSubBuilderFinal.gui.sub.Device2SubConfig;
import pubSubBuilderFinal.gui.sub.Device3SubConfig;
import pubSubBuilderFinal.gui.sub.Device4SubConfig;
import pubSubBuilderFinal.publisher.builder.PublisherWorkShop;
import pubSubBuilderFinal.publisher.builder.PublisherWorkshopInterface;
import pubSubBuilderFinal.publisher.types.Publisher;
import pubSubBuilderFinal.subscriber.Subscriber;
import pubSubBuilderFinal.subscriber.builder.SubscriberWorkshop;
import pubSubBuilderFinal.subscriber.builder.SubscriberWorkshopInterface;

/**
 * @author Yash Divecha
 * This class is the Welcome Page which provides the GUI
 */
public class WelcomePage extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton Publish;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	// End of variables declaration//GEN-END:variables

	private Data myData;
	private Result result;

	public static void main(String args[]) {
		try {

			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new WelcomePage(new Data(), new Result()).setVisible(true);
			}
		});
	}

	/**
	 * Creates new form WelcomePage
	 */
	public WelcomePage(Data myDataIn, Result resultIn) {
		this.myData = myDataIn;
		this.result = resultIn;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		Publish = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Welcome to Publisher Subscriber Simulation");

		jButton1.setText("Device1");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Device2");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Device3");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Device4");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Please select Device to configure");

		Publish.setText("Publish");
		Publish.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PublishActionPerformed(evt);
			}
		});
		if (result.isDevice1PubConfigured() == true || result.isDevice2PubConfigured() == true
				|| result.isDevice3PubConfigured() == true || result.isDevice4PubConfigured() == true)
			Publish.setVisible(true);
		else
			Publish.setVisible(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(43, 43, 43)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(71, 71, 71)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(71, 71, 71)
										.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(70, 70, 70).addComponent(jButton4,
												javax.swing.GroupLayout.PREFERRED_SIZE, 96,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(87, 87, 87)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(302, 302, 302).addComponent(Publish,
										javax.swing.GroupLayout.PREFERRED_SIZE, 109,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(119, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(37, 37, 37)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(51, 51, 51)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(54, 54, 54).addComponent(Publish, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(56, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		if (result.isDevice1PubConfigured() == true && result.isDevice2PubConfigured() == true
				&& result.isDevice3PubConfigured() == true && result.isDevice4PubConfigured() == true) {
			// new Device1SubConfig_old(mongo, result).setVisible(true);
			new Device1SubConfig(myData, result).setVisible(true);
		} else
			new Device1PubConfig(myData, result).setVisible(true);

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		if (result.isDevice1PubConfigured() == true && result.isDevice2PubConfigured() == true
				&& result.isDevice3PubConfigured() == true && result.isDevice4PubConfigured() == true)
			new Device2SubConfig(myData, result).setVisible(true);
		else
			new Device2PubConfig(myData, result).setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		if (result.isDevice1PubConfigured() == true && result.isDevice2PubConfigured() == true
				&& result.isDevice3PubConfigured() == true && result.isDevice4PubConfigured() == true)
			new Device3SubConfig(myData, result).setVisible(true);
		else
			new Device3PubConfig(myData, result).setVisible(true);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		if (result.isDevice1PubConfigured() == true && result.isDevice2PubConfigured() == true
				&& result.isDevice3PubConfigured() == true && result.isDevice4PubConfigured() == true)
			new Device4SubConfig(myData, result).setVisible(true);
		else
			new Device4PubConfig(myData, result).setVisible(true);

	}

	private void PublishActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<Publisher> allPubs = new ArrayList<>();
		ArrayList<Publisher> d1 = null;
		ArrayList<Publisher> d2 = null;
		ArrayList<Publisher> d3 = null;
		ArrayList<Publisher> d4 = null;
		if (result.isDevice1PubConfigured()) {
			d1 = result.getDevice1PublishersSelected();
			allPubs.addAll(d1);
		}
		if (result.isDevice2PubConfigured()) {
			d2 = result.getDevice2PublishersSelected();
			allPubs.addAll(d2);
		}
		if (result.isDevice3PubConfigured()) {
			d3 = result.getDevice3PublishersSelected();
			allPubs.addAll(d3);
		}
		if (result.isDevice4PubConfigured()) {
			d4 = result.getDevice4PublishersSelected();
			allPubs.addAll(d4);
		}

		PublisherWorkshopInterface shop = new PublisherWorkShop();

		Subscriber s1 = result.getSub1();
		SubscriberWorkshopInterface shopSub = new SubscriberWorkshop();
		Thread t = new Thread() {
			public void run() {
				for (Publisher pub : allPubs) {
					try {
						Thread.sleep(2000);
						shop.construct(pub);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};
		t.start();

		shopSub.construct(s1);

	}

}
