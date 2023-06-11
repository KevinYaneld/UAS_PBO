/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class UserLoginImplementation implements UserLoginInterface {
    private final javax.swing.JTextField txtUser;
    private final javax.swing.JPasswordField txtPassword;

    public UserLoginImplementation(javax.swing.JTextField txtUser, javax.swing.JPasswordField txtPassword) {
        this.txtUser = txtUser;
        this.txtPassword = txtPassword;
    }

    @Override
    public void login(String username, String password) {
        try {
            Connection dbconn = koneksi.getConnection();
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Select * from tbl_user Where username = ? AND password = ?");
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            if(res.next()){
                if(res.getString("role").equals("Admin")){
                    MainAdmin admin = new MainAdmin();
                    admin.setVisible(true);
                    txtUser.setText("");
                    txtPassword.setText("");
                    SwingUtilities.getWindowAncestor(txtUser).setVisible(false);
                }else{
                    String id_user = res.getString("id_user");
                    User.getInstance().setUsername(id_user);
                    menuUser user = new menuUser();
                    user.setVisible(true);
                    txtUser.setText("");
                    txtPassword.setText("");
                    SwingUtilities.getWindowAncestor(txtUser).setVisible(false);
                }
            }else{
                System.out.println("");
                txtUser.setText("");
                txtPassword.setText("");
                JOptionPane.showMessageDialog(null,"Username / Password Tidak Ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
