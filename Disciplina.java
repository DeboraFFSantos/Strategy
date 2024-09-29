public class Disciplina {
    ICalcMedia calcMedia;
    double P1;
    double P2;
    String Nome;
    double Media;
    String Situacao;

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getMedia() {
        return Media;  
    }

    public void setMedia(double media) {  
    }

    public String getSituacao() {
        return Situacao;  
    }

    public void setSituacao(String situacao) {  
        this.Situacao = situacao;
    }

    
    public void CalcularMedia() {
        this.Media = calcMedia.CalculaMedia(this.P1, this.P2);  
        this.Situacao = calcMedia.Situacao(this.Media);  
    }

    public Disciplina() {
    }

    public Disciplina(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }
}
