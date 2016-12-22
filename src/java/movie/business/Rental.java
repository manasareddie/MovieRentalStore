/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.business;
public class Rental {
    private int membership_id;
    private String movie_id;
    private String uemail;
    private String title;
    private String cc_num;
    
    
    public Rental(){}
    
    public void setmembershipId(int userid) {
        this.membership_id = userid;
    }
    public int getmembershipId() {
        return membership_id;
    }
    public void setmovieId(String movieid) {
        this.movie_id = movieid;
    }
    public String getmovieId() {
        return movie_id;
    }
    public void setuemail(String email) {
        this.uemail = email;
    }
    public String getuemail() {
        return uemail;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public String gettitle() {
        return title;
    }
    public void setccNum(String ccnum) {
        this.cc_num = ccnum;
    }
    public String getccNum() {
        return cc_num;
    }
    
    
}
