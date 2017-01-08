package niv.test;

public interface FinancialInstitutionIdentification {

    public String getBICFI();

    public ClearingSystemMemberIdentification getClrSysMmbId();

    public String getNm();

    public PostalAddress getPstlAdr();

    public GenericFinancialIdentification getOthr();

}
