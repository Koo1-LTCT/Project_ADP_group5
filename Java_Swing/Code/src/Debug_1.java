import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Author : Bui Quoc Tan
public class Debug_1 extends javax.swing.JFrame {

	public Debug_1() {
		initComponents();
	}
	// Author : Huynh Viet Bao
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		buttomSum = new javax.swing.JButton();
		Button_Minus = new javax.swing.JButton();
		Button_Mul = new javax.swing.JButton();
		Button_Div = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		inputVariableA = new javax.swing.JTextField();
		inputVariableB = new javax.swing.JTextField();
		result = new javax.swing.JTextField();
		title = new javax.swing.JLabel();
		buttonResult = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		// Tao buttom de tinh tong
		buttomSum.setText("Sum");
		buttomSum.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttomSumActionPerformed(evt);
			}
		});

		Button_Minus.setText("Minus");
		Button_Minus.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button_MinusActionPerformed(evt);
			}
		});

		Button_Mul.setText("Mul");
		Button_Mul.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button_MulActionPerformed(evt);
			}
		});

		Button_Div.setText("Div");
		Button_Div.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button_DivActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(31)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(Button_Div, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(buttomSum, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
										.addComponent(Button_Minus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(Button_Mul, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addContainerGap(43, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(22).addComponent(buttomSum).addGap(18)
						.addComponent(Button_Minus).addGap(18).addComponent(Button_Mul).addGap(18)
						.addComponent(Button_Div).addContainerGap(145, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		jLabel2.setText("a");

		jLabel3.setText("b");

		inputVariableA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inputVariableAActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(33, 33, 33)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
								.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(46, 46, 46)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(inputVariableA).addComponent(inputVariableB,
										javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
						.addContainerGap(63, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(36, 36, 36)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inputVariableA, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(61, 61, 61)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inputVariableB, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(156, Short.MAX_VALUE)));

		title.setBackground(new java.awt.Color(102, 102, 255));
		title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
		title.setForeground(new java.awt.Color(255, 0, 204));
		title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		title.setText("MÃ¡y TÃ­nh Ä�Æ¡n Giáº£n");

		buttonResult.setText("K\u1EBFt qu\u1EA3");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 305,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttonResult).addGap(18, 18, 18).addComponent(result,
								javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(22, 22, 22)
						.addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(8, 8, 8)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonResult))
						.addContainerGap()));

		pack();
	}

	private void inputVariableAActionPerformed(java.awt.event.ActionEvent evt) {

	}

	// Author : Bui Quoc Tan
	private void buttomSumActionPerformed(java.awt.event.ActionEvent evt) {
		double variableA = Double.parseDouble(inputVariableA.getText());
		double variableB = Double.parseDouble(inputVariableB.getText());
		double Sum = 0;
		Sum = variableA + variableB;
		result.setText(Sum + " ");
	}

	private void Button_MinusActionPerformed(java.awt.event.ActionEvent evt) {
		double Input1 = Double.parseDouble(inputVariableA.getText());
		double Input2 = Double.parseDouble(inputVariableB.getText());
		double Minus = 0;
		Minus = Input1 - Input2;
		result.setText(Minus + " ");
	}

	private void Button_MulActionPerformed(java.awt.event.ActionEvent evt) {
		double Input1 = Double.parseDouble(inputVariableA.getText());
		double Input2 = Double.parseDouble(inputVariableB.getText());
		double Mul = 0;
		Mul = Input1 * Input2;
		result.setText(Mul + " ");
	}

	private void Button_DivActionPerformed(java.awt.event.ActionEvent evt) {
		double Input1 = Double.parseDouble(inputVariableA.getText());
		double Input2 = Double.parseDouble(inputVariableB.getText());
		double Div = 0;
		Div = Input1 / Input2;
		result.setText(Div + " ");
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Debug_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Debug_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Debug_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Debug_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			//ham chay
			public void run() {
				new Debug_1().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
		private javax.swing.JButton buttonResult;
		private javax.swing.JButton Button_Minus;
		private javax.swing.JButton Button_Mul;
		private javax.swing.JButton buttomSum;
		private javax.swing.JTextField inputVariableA;
		private javax.swing.JTextField inputVariableB;
		private javax.swing.JLabel title;
		private javax.swing.JLabel jLabel2;
		private javax.swing.JLabel jLabel3;
		private javax.swing.JPanel jPanel1;
		private javax.swing.JPanel jPanel2;
		private javax.swing.JTextField result;
		private javax.swing.JButton Button_Div;
		// End of variables declaration
	
}
