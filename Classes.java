public class Veiculo {
    private String chassi;
    private String modelo;
    private String cor;

    public String getChassi(){
        return this.chassi;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void setChassi(String chassinovo){
        this.chassi = chassinovo;
    }

    public void setModelo(String modelonovo){
        this.modelo = modelonovo;
    }

    public void setCor(String cornovo){
        this.cor = cornovo;
    }
}