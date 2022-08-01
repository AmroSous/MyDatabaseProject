package company;


public class SplashScreen extends javax.swing.JFrame implements Runnable{

    public SplashScreen() {
        initComponents();
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        barLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(420, 200));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Company Management System");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 30, 410, 50);
        getContentPane().add(bar);
        bar.setBounds(60, 120, 340, 11);

        barLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barLabel.setForeground(new java.awt.Color(255, 0, 0));
        barLabel.setText(" 0 %");
        getContentPane().add(barLabel);
        barLabel.setBounds(60, 96, 40, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("welcome to our program . please wait . . .");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 260, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashWall.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 470, 210);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 200);

        setSize(new java.awt.Dimension(440, 200));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel barLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        this.setVisible(true);
        try{
            for(int i = 0; i < 100; i++){
            Thread.sleep(30);
            this.bar.setValue(i);
            this.barLabel.setText(i+" %");
            
        }
        }catch(Exception e){e.printStackTrace();}
        
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }
}
