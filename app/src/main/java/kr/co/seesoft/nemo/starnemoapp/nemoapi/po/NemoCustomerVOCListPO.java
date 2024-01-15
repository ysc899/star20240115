package kr.co.seesoft.nemo.starnemoapp.nemoapi.po;


/**
 * VOC 조회 PO
 */
public class NemoCustomerVOCListPO {
    /** 고객코드 */
    private String custCd;

    /** 조회일 */
    private String searchDt;


    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd;
    }

    public String getSearchDt() {
        return searchDt;
    }

    public void setSearchDt(String searchDt) {
        this.searchDt = searchDt;
    }


    @Override
    public String toString() {
        return "NemoCustomerVOCPO{" +
                "custCd='" + custCd + '\'' +
                ", searchDt='" + searchDt + '\'' +
                '}';
    }
}
