package cn.tjmj.serviceadmin.entity;

import java.io.Serializable;

/**
 * 管理用户表
 *
 * @author wanglei
 * @create 2017-12-20 11:56
 */

public class Admin implements Serializable {

    private int id;

    private String aduser;

    private String adpsw;

    private String adstatus;

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAduser() {
        return aduser;
    }

    public void setAduser(String aduser) {
        this.aduser = aduser;
    }

    public String getAdpsw() {
        return adpsw;
    }

    public void setAdpsw(String adpsw) {
        this.adpsw = adpsw;
    }

    public String getAdstatus() {
        return adstatus;
    }

    public void setAdstatus(String adstatus) {
        this.adstatus = adstatus;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", aduser='" + aduser + '\'' +
                ", adpsw='" + adpsw + '\'' +
                ", adstatus='" + adstatus + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
