/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Kakung Rama Rahmuda
 */
public class PanelGambar extends JPanel{
    Image Gambar;
    public PanelGambar(){
        Gambar=new ImageIcon(getClass().getResource("/Gambar/revisi.png")).getImage();
     }
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent (g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(Gambar, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
