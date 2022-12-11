/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
//package UI.Admin;

//import model.DB4OUtil.DB4OUtil;
//import model.EcoSystem.EcoSystem;
//import model.Firebase.FirebaseHelper;
//import model.Organization.DonateEntity;
//import UI.MainFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author harshaljaiswal
 */
public class Graphs extends javax.swing.JPanel {

    /**
     * Creates new form Graphs
     */
    
    private static final int N = 128;
    private static final Random random = new Random();
    
    private void display() {
        JFrame f = new JFrame("Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(new GridLayout(2, 2));
//        p.add(createEntityNameChartPanel());
//        p.add(createEntityEnterpriseChartPanel());
//        p.add(createEntityBloodChartPanel());
//        p.add(createEntityRecChartPanel());
//        p.add(createStatusChartPanel());
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
//    private ChartPanel createStatusChartPanel() {
//        final XYSeries series = new XYSeries("Data");
//        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
//            series.add(i, random.nextGaussian());
//        }
// 
//        Map<String, Integer> hm = new HashMap();
//        
//        for(DonateEntity de: ecoSystem.getDonateEntityList()){
//            try{
//            String key = de.getStatus().toLowerCase();
//            
//            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
//            }
//            catch (Exception e){
//               // e.printStackTrace();
//            }
//           
//        }
//        DefaultPieDataset ds = new DefaultPieDataset();
////      dataset.setValue( "IPhone 5s" , new Double( 20 ) );  
//        for(String k:hm.keySet()){
//            System.out.println("key: "+k+": "+hm.get(k));
//            ds.setValue( k , new Double( hm.get(k) ) ); 
//        }
//        
//        JFreeChart chart = ChartFactory.createPieChart("Status", 
//         ds,        
//         true,            
//         true, 
//         false);
//        return new ChartPanel(chart) {
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(N * 2, N * 2);
//            }
//        };
//    }
//    
//    private ChartPanel createEntityRecChartPanel() {
//        final XYSeries series = new XYSeries("Data");
//        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
//            series.add(i, random.nextGaussian());
//        }
//        XYSeriesCollection dataset = new XYSeriesCollection(series);
//        DefaultCategoryDataset dc = new DefaultCategoryDataset();
//        
//        Map<String, Integer> hm = new HashMap();
//        for(DonateEntity de: ecoSystem.getDonateEntityList()){
//            try{
//            String key = de.getReceiverEnterprise().getEnterpriseName().toLowerCase();
//            
//            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
//            }
//            catch (Exception e){
//                //e.printStackTrace();
//            }
//           
//        }
//        for(String k:hm.keySet()){
//            System.out.println("key: "+k+": "+hm.get(k));
//            dc.addValue(hm.get(k), "", k);
//        }
//        
//        JFreeChart chart = ChartFactory.createBarChart("", "Receiver Ent.",
//            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
//        return new ChartPanel(chart) {
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(N * 2, N * 2);
//            }
//        };
//    }
//    
//    private ChartPanel createEntityEnterpriseChartPanel() {
//        final XYSeries series = new XYSeries("Data");
//        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
//            series.add(i, random.nextGaussian());
//        }
//        XYSeriesCollection dataset = new XYSeriesCollection(series);
//        DefaultCategoryDataset dc = new DefaultCategoryDataset();
//        
//        Map<String, Integer> hm = new HashMap();
//        for(DonateEntity de: ecoSystem.getDonateEntityList()){
//            try{
//            String key = de.getDonorEnterprise().getEnterpriseName().toLowerCase();
//            
//            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
//            }
//            catch (Exception e){
//                //e.printStackTrace();
//            }
//           
//        }
//        for(String k:hm.keySet()){
//            System.out.println("key: "+k+": "+hm.get(k));
//            dc.addValue(hm.get(k), "", k);
//        }
//        
//        JFreeChart chart = ChartFactory.createBarChart("", "Donor Ent.",
//            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
//        return new ChartPanel(chart) {
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(N * 2, N * 2);
//            }
//        };
//    }
//    
//    private ChartPanel createEntityBloodChartPanel() {
//        final XYSeries series = new XYSeries("Data");
//        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
//            series.add(i, random.nextGaussian());
//        }
//        XYSeriesCollection dataset = new XYSeriesCollection(series);
//        DefaultCategoryDataset dc = new DefaultCategoryDataset();
//        
//        Map<String, Integer> hm = new HashMap();
//        for(DonateEntity de: ecoSystem.getDonateEntityList()){
//            String key = de.getBloodGroup().toLowerCase();
//            
//            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
//           
//        }
//        for(String k:hm.keySet()){
//            System.out.println("key: "+k+": "+hm.get(k));
//            dc.addValue(hm.get(k), "", k);
//        }
//        
//        JFreeChart chart = ChartFactory.createBarChart("", "blood",
//            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
//        return new ChartPanel(chart) {
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(N * 2, N * 2);
//            }
//        };
//    }
//
//    private ChartPanel createEntityNameChartPanel() {
//        final XYSeries series = new XYSeries("Data");
//        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
//            series.add(i, random.nextGaussian());
//        }
//        XYSeriesCollection dataset = new XYSeriesCollection(series);
//        DefaultCategoryDataset dc = new DefaultCategoryDataset();
//        
//        Map<String, Integer> hm = new HashMap();
//        for(DonateEntity de: ecoSystem.getDonateEntityList()){
//            String key = de.getEntityName().toLowerCase();
//            
//            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
//           
//        }
//        for(String k:hm.keySet()){
//            System.out.println("key: "+k+": "+hm.get(k));
//            dc.addValue(hm.get(k), "", k);
//        }
//        
//        JFreeChart chart = ChartFactory.createBarChart("", "organ/blood",
//            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
//        return new ChartPanel(chart) {
//            @Override
//            public Dimension getPreferredSize() {
//                return new Dimension(N * 2, N * 2);
//            }
//        };
//    }
//
//
//    MainFrame mainScreen;
//    FirebaseHelper firebaseHelper;
//    private EcoSystem ecoSystem;
//    private DB4OUtil dB4OUtil;
//
//    public Graphs(MainFrame mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
//        initComponents();
//        this.mainScreen = mainScreen;
//        this.dB4OUtil = dB4OUtil;
//        this.ecoSystem = ecoSystem;
//        
//        initComponents();
//        
//        display();
//    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("Graphs");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jLabel1)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(555, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
