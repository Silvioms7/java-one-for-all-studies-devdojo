package academy.devdojo.javaoneforall.javacore.kenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start up");

    private final int DB_VALUE;
    private String reportValue;

    CustomerType(int dbValue, String reportValue) {
        this.DB_VALUE = dbValue;
        this.reportValue = reportValue;
    }

    public static CustomerType getByReportValue (String reportValue){
        for (CustomerType customerType : values()) {
            if (customerType.getReportValue().equalsIgnoreCase(reportValue)) {
                return customerType;
            }
        }
        return null;
    }

    public int getDB_VALUE() {return DB_VALUE;}
    public String getReportValue() {return reportValue;}
}
