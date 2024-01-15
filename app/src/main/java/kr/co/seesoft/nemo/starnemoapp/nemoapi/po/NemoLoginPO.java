package kr.co.seesoft.nemo.starnemoapp.nemoapi.po;


/**
 * 로그인용 PO
 */
public class NemoLoginPO {
    /** id */
    private String userId;
    /** 패스워드 */
    private String pswd;

    /** 시큐어키 추가되어야함 */
    private String moblSno;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pwd) {
        this.pswd = pwd;
    }

    public String getMoblSno() {
        return moblSno;
    }

    public void setMoblSno(String moblSno) {
        this.moblSno = moblSno;
    }

    @Override
    public String toString() {
        return "NemoLoginPO{" +
                "userId='" + userId + '\'' +
                ", pwd='" + pswd + '\'' +
                ", moblSno='" + moblSno + '\'' +
                '}';
    }
}
