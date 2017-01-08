package niv.test;

import java.util.List;


public interface PostalAddress {

    public String getAdrTp();

    public String getDept();
    
    public String getSubDept();
    
    public String getStrtNm();
    
    public String getBldgNb();
    
    public String getPstCd();
    
    public String getTwnNm();
    
    public String getCtrySubDvsn();
    
    public String getCtry();
    
    public List<String> getAdrLine();

}
