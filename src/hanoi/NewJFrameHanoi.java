
package hanoi;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class NewJFrameHanoi extends javax.swing.JFrame{

Stack<Image> discos=new Stack<Image>();
Stack<Posicionxy> posiciones=new Stack<Posicionxy>();
Stack<Integer> torre1=new Stack<Integer>();
Stack<Integer> torre2=new Stack<Integer>();
Stack<Integer> torre3=new Stack<Integer>();

private Posicionxy val;
private int numeroDiscos=8;

    public NewJFrameHanoi() {

        this.setTitle("Torres de Hanoi");
        initComponents();
        inicializaDiscos();
        calculaPosicion();
        iniciaTorre();
        
    }

    private void calculaPosicion()
    {
        posiciones.clear();
        for (int x = 1; x <= numeroDiscos; x++)
            {
                 int y = numeroDiscos - x + 1;
                 Posicionxy  tmpe = new Posicionxy(posicionX(x, 1), posicionY(y));
                 posiciones.push(tmpe);

            }
     
    }
    private void iniciaTorre()
    {
        torre1.clear();
        for (int i = numeroDiscos-1; i >=0; i--)
        {
           torre1.push(i);

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMover = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerNumeroDiscos = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerOrigen = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerDestino = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonMover.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButtonMover.setText("Mover Disco");
        jButtonMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoverActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Torre 1");
        jLabel5.setAlignmentX(115);
        jLabel5.setAlignmentY(320);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Torre 2");
        jLabel6.setAlignmentX(315);
        jLabel6.setAlignmentY(320);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Torre 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel5)
                .addGap(142, 142, 142)
                .addComponent(jLabel6)
                .addGap(148, 148, 148)
                .addComponent(jLabel7)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(73, 73, 73))
        );

        jSpinnerNumeroDiscos.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jSpinnerNumeroDiscos.setModel(new javax.swing.SpinnerNumberModel(8, 3, 8, 1));
        jSpinnerNumeroDiscos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerNumeroDiscosStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel1.setText("Selecciona el numero de discos");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel2.setText("Torre Origen");

        jSpinnerOrigen.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jSpinnerOrigen.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel3.setText("a");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel4.setText("Torre Destino");

        jSpinnerDestino.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jSpinnerDestino.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jSpinnerNumeroDiscos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jSpinnerOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jSpinnerDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMover))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(62, 62, 62))))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerNumeroDiscos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinnerOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonMover)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambio(int disco,int torreD,int tmp)
    {
         int x=0,y=0;
         x=posicionX(disco+1,torreD);
         y= posicionY(tmp+1);
         val=   posiciones.get(disco);
         val.setX(x);
         val.setY(y);
         posiciones.set(disco, val);
         repaint();
       
    }
    private void reinicio()
    {
        numeroDiscos=8;
        torre2.clear();
        torre3.clear();
        jSpinnerDestino.setValue(1);
        jSpinnerOrigen.setValue(1);
        jSpinnerNumeroDiscos.setValue(8);
        jSpinnerNumeroDiscos.setEnabled(true);
        
        inicializaDiscos();
        calculaPosicion();
        iniciaTorre();
        
        repaint();
    }

    private void movimiento()
    {
        int torreO=0,torreD=0,disco=0;
        int tmp=0;
        boolean v=false;

        jLabel8.setText("");
        jSpinnerNumeroDiscos.setEnabled(false);

        torreD=Integer.parseInt(jSpinnerDestino.getValue().toString());
        torreO=Integer.parseInt(jSpinnerOrigen.getValue().toString());
        if (torreO!=torreD)
        {
            /////////////////
            if (torreO==1)
            {
                if (!torre1.empty())
                {
                   disco=torre1.pop();


                if (torreD==2)
                {
                    if (!torre2.empty())
                    {
                         if (disco>torre2.peek())
                         {
                          v=msg();
                         }
                            else
                            {
                                  tmp=torre2.size();
                                  torre2.push(disco);
                                  v=false;
                            }
                    }
                    else
                    {
                         tmp=torre2.size();
                         torre2.push(disco);
                         v=false;
                    }
                    
                }
                if (torreD==3)
                {
                   if (!torre3.empty())
                    {
                         if (disco>torre3.peek())
                         {
                          v=msg();
                         }
                            else
                            {
                                  tmp=torre3.size();
                                  torre3.push(disco);
                                  v=false;
                            }
                    }
                    else
                    {
                         tmp=torre3.size();
                         torre3.push(disco);
                         v=false;
                    }
                }
                
                    if (v==false)
                    {
                        cambio(disco,torreD,tmp);
                    }
                
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"La torre origen esta vacia.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            //////////////////
            if (torreO==2)
            {
                if (!torre2.empty())
                {
                    disco=torre2.pop();

                if (torreD==1)
                {
                    if (!torre1.empty())
                    {
                         if (disco>torre1.peek())
                         {
                          v=msg();
                         }
                            else
                            {
                                  tmp=torre1.size();
                                  torre1.push(disco);
                                  v=false;
                            }
                    }
                    else
                    {
                         tmp=torre1.size();
                         torre1.push(disco);
                         v=false;
                    }

                }
                if (torreD==3)
                {

                   if (!torre3.empty())
                    {
                         if (disco>torre3.peek())
                         {
                          v=msg();
                         }
                            else
                            {
                                  tmp=torre3.size();
                                  torre3.push(disco);
                                  v=false;
                            }
                    }
                    else
                    {
                         tmp=torre3.size();
                         torre3.push(disco);
                         v=false;
                    }
                }

                if (v==false)
                    {
                        cambio(disco,torreD,tmp);
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"La torre origen esta vacia.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            //////////////////////
           if (torreO==3)
            {
                if (!torre3.empty())
                {
                   disco=torre3.pop();

                if (torreD==2)
                {
                    if (!torre2.empty())
                    {
                         if (disco>torre2.peek())
                         {
                          v=msg();
                         }
                            else
                            {
                                  tmp=torre2.size();
                                  torre2.push(disco);
                                  v=false;
                            }
                    }
                    else
                    {
                         tmp=torre2.size();
                         torre2.push(disco);
                         v=false;
                    }

                }
                if (torreD==1)
                {
                   if (!torre1.empty())
                    {
                         if (disco>torre1.peek())
                         {
                          v=msg();
                         }
                            else
                            {
                                  tmp=torre1.size();
                                  torre1.push(disco);
                                  v=false;
                            }
                    }
                    else
                    {
                         tmp=torre1.size();
                         torre1.push(disco);
                         v=false;
                    }
                }

                if (v==false)
                    {
                        cambio(disco,torreD,tmp);
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"La torre origen esta vacia.","Error",JOptionPane.ERROR_MESSAGE);
                }
           
        }

        }
         else
            {
                JOptionPane.showMessageDialog(null,"No se puede mover un disco sobre su misma torre.","Error",JOptionPane.ERROR_MESSAGE);
            }
        if (torre3.size()==numeroDiscos)
        {
            jLabel8.setText("Ganaste");
            jSpinnerNumeroDiscos.setEnabled(true);
        }

    }

    private boolean msg()
    {
        jLabel8.setText("Perdiste");
        reinicio();
        jSpinnerNumeroDiscos.setEnabled(true);
        boolean v=true;
        return v;
    }

    private void jButtonMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoverActionPerformed

        movimiento();
     
    }//GEN-LAST:event_jButtonMoverActionPerformed

    private void jSpinnerNumeroDiscosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNumeroDiscosStateChanged

        numeroDiscos=Integer.parseInt(jSpinnerNumeroDiscos.getValue().toString());
        inicializaDiscos();
        calculaPosicion();
        iniciaTorre();
        repaint();

    }//GEN-LAST:event_jSpinnerNumeroDiscosStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reinicio();
    }//GEN-LAST:event_jButton1ActionPerformed

   @Override
   public void paint(Graphics g) {
    
        Image tmp;
        Posicionxy tmp1;
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = numeroDiscos-1; i >=0; i--)
        {
            tmp1 =posiciones.get(i);
            tmp=discos.get(i);
            g2.drawImage(tmp, tmp1.getX(), tmp1.getY(), this);
            
            
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    private void inicializaDiscos() {
        discos.clear();
        for (int i = 1; i <= numeroDiscos; i++)
        {
             ImageIcon tmp = new ImageIcon(this.getClass().getResource("/imagenes/" + i + ".png"));
             discos.push(tmp.getImage());
        }


       
    }
 private int posicionX(int disco, int torre) {

        int k = (torre - 1) * 200;
        switch (disco) {
            case 1:
                return 110 + k;
            case 2:
                return 100 + k;
            case 3:
                return 90 + k;
            case 4:
                return 80 + k;
            case 5:
                return 70 + k;
            case 6:
                return 60 + k;
            case 7:
                return 50 + k;
            case 8:
                return 40 + k;
        }
        return 0;
    }

    private int posicionY(int nivel) {
        
        switch (nivel) {
            case 1:
                return 260;
            case 2:
                return 233;
            case 3:
                return 206;
            case 4:
                return 179;
            case 5:
                return 152;
            case 6:
                return 125;
            case 7:
                return 98;
            case 8:
                return 71;
        }
        return 0;
    }
 
    public void actionPerformed(ActionEvent e) {
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerDestino;
    private javax.swing.JSpinner jSpinnerNumeroDiscos;
    private javax.swing.JSpinner jSpinnerOrigen;
    // End of variables declaration//GEN-END:variables

}
