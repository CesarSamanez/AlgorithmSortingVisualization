
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    public Index() {
        super("Sorting Algorithm Visualization");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxAlgorithm1 = new javax.swing.JComboBox<>();
        ComboBoxAlgorithm2 = new javax.swing.JComboBox<>();
        btnSorting = new javax.swing.JButton();
        jPanelResults = new javax.swing.JPanel();
        lblResults = new javax.swing.JLabel();
        lblAlgorithm1 = new javax.swing.JLabel();
        lblAlgorithm2 = new javax.swing.JLabel();
        lblDataResults = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblComplexity = new javax.swing.JLabel();
        txtData1 = new java.awt.TextField();
        txtData2 = new java.awt.TextField();
        txtTime1 = new java.awt.TextField();
        txtTime2 = new java.awt.TextField();
        txtComplexity1 = new java.awt.TextField();
        txtComplexity2 = new java.awt.TextField();
        lblData = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        ComboBoxSetting = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Algorithm Sorting Visualization");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Algorithm 1:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Algorithm 2:");

        ComboBoxAlgorithm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BubbleSort", "HeapSort", "InsertionSort", "MergeSort", "QuickSort", "SelectionSort", "ShellSort" }));

        ComboBoxAlgorithm2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BubbleSort", "HeapSort", "InsertionSort", "MergeSort", "QuickSort", "SelectionSort", "ShellSort" }));
        ComboBoxAlgorithm2.setSelectedIndex(1);

        btnSorting.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSorting.setText("Sorting");
        btnSorting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortingActionPerformed(evt);
            }
        });

        lblResults.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResults.setText("Results");
        lblResults.setToolTipText("");

        lblAlgorithm1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAlgorithm1.setText("Algorithm 1:");

        lblAlgorithm2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAlgorithm2.setText("Algorithm 2:");

        lblDataResults.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataResults.setText("Data");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setText("Time(ms)");

        lblComplexity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblComplexity.setText("Complexity");

        txtData1.setEditable(false);
        txtData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtData1ActionPerformed(evt);
            }
        });

        txtData2.setEditable(false);
        txtData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtData2ActionPerformed(evt);
            }
        });

        txtTime1.setEditable(false);

        txtTime2.setEditable(false);

        txtComplexity1.setEditable(false);

        txtComplexity2.setEditable(false);

        javax.swing.GroupLayout jPanelResultsLayout = new javax.swing.GroupLayout(jPanelResults);
        jPanelResults.setLayout(jPanelResultsLayout);
        jPanelResultsLayout.setHorizontalGroup(
            jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultsLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblDataResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime)
                .addGap(73, 73, 73)
                .addComponent(lblComplexity)
                .addGap(55, 55, 55))
            .addGroup(jPanelResultsLayout.createSequentialGroup()
                .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlgorithm1)
                            .addComponent(lblAlgorithm2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtData2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtComplexity1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txtComplexity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelResultsLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(lblResults)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanelResultsLayout.setVerticalGroup(
            jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblResults)
                .addGap(18, 18, 18)
                .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataResults)
                    .addComponent(lblTime)
                    .addComponent(lblComplexity))
                .addGap(8, 8, 8)
                .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlgorithm1)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplexity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlgorithm2)
                    .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplexity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        lblData.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblData.setText("Data");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Setting");

        ComboBoxSetting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Random", "Nearly Sorted", "Reversed" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Cesar Samanez Jimenez");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(lblData)
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxAlgorithm1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxAlgorithm2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtData)
                            .addComponent(ComboBoxSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(btnSorting)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxAlgorithm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboBoxAlgorithm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSorting)
                        .addGap(20, 20, 20)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboBoxSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jPanelResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtData2ActionPerformed

    private void txtData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtData1ActionPerformed

    private void btnSortingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSortingActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Index().setVisible(true);
                btnSorting.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String algorithm1 = (String) ComboBoxAlgorithm1.getSelectedItem();
                        String algorithm2 = (String) ComboBoxAlgorithm2.getSelectedItem();
                        int data;
                        int setting = ComboBoxSetting.getSelectedIndex() + 1;

                        lblAlgorithm1.setText(algorithm1);
                        lblAlgorithm2.setText(algorithm2);

                        HashMap<String, String> complexity = new HashMap<String, String>();
                        complexity.put("BubbleSort", "0(n^2)");
                        complexity.put("HeapSort", "O(n log n)");
                        complexity.put("InsertionSort", "O(n^2)");
                        complexity.put("MergeSort", "O(n log n)");
                        complexity.put("QuickSort", "O(n log n)");
                        complexity.put("SelectionSort", "O(n^2)");
                        complexity.put("ShellSort", "O(n log n)");

                        if (txtData.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Complete all fields - data is requerid", "Error", JOptionPane.ERROR_MESSAGE);
                        } else if (algorithm1.equals(algorithm2)) {
                            JOptionPane.showMessageDialog(null, "The algorithms must be different", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            data = Integer.parseInt(txtData.getText());

                            Hilo n1 = new Hilo(algorithm1, setting, data);
                            n1.start();
                            long start_time1 = System.nanoTime();
                            Hilo n2 = new Hilo(algorithm2, setting, data);
                            n2.start();
                            long start_time2 = System.nanoTime();

                            if (n1.isAlive()) {
                                long end_time1 = System.nanoTime();
                                txtTime1.setText("" + ((end_time1 - start_time1)/1000000000F) + "s");
                            }
                            if (n2.isAlive()) {
                                long end_time2 = System.nanoTime();
                                txtTime2.setText("" + ((end_time2 - start_time2)/1000000000F) + "s");
                            }

                            txtData1.setText("" + data);
                            txtData2.setText("" + data);

                            txtComplexity1.setText(complexity.get(algorithm1));
                            txtComplexity2.setText(complexity.get(algorithm2));

                        }
                    }
                });
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> ComboBoxAlgorithm1;
    public static javax.swing.JComboBox<String> ComboBoxAlgorithm2;
    public static javax.swing.JComboBox<String> ComboBoxSetting;
    public static javax.swing.JButton btnSorting;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel jPanelResults;
    public static javax.swing.JLabel lblAlgorithm1;
    public static javax.swing.JLabel lblAlgorithm2;
    private javax.swing.JLabel lblComplexity;
    public static javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDataResults;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblTime;
    public static java.awt.TextField txtComplexity1;
    public static java.awt.TextField txtComplexity2;
    public static javax.swing.JTextField txtData;
    public static java.awt.TextField txtData1;
    public static java.awt.TextField txtData2;
    public static java.awt.TextField txtTime1;
    public static java.awt.TextField txtTime2;
    // End of variables declaration//GEN-END:variables

}
