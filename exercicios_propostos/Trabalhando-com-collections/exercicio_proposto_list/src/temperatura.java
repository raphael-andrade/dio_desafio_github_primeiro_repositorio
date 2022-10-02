public class temperatura {

    private String mes;
    private Double temp;

    public temperatura() {
    }

    public temperatura(String mes, Double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return   "mes: " + mes + '\'' +
                "e temp: " + temp;
    }
}
