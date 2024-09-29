public class Geometrica implements ICalcMedia {
        
        public double CalculaMedia(double a, double b) {
            return Math.sqrt(a*b);
        }
    
        
        public String Situacao(double media) {
            if(media > 7)
            return "Aprovado";
            else
            return "Reprovado";
        }
    }
