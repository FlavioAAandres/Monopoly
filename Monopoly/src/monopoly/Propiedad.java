package monopoly;

public class Propiedad {
    
     //inner class
        String Nombre_Propiedad;
        int Costo_Propiedad;
        int Costo_Alquiler;
        int Costo_Casa_Uno;
        int Costo_Casa_Dos;
        int Costo_Casa_Tres;
        int Costo_Casa_Cuatro;
        int Costo_Hotel; 
        int Costo_Casa;
        int Propietario; 
        boolean Usado; 
        Propiedad lLink;
        Propiedad rLink;
        
        public Propiedad(String NombrePropiedad, int CP,int Costo_Alquiler, int c1, int c2, int c3, int c4,int costoC, int CostoH) {
            this.Nombre_Propiedad = NombrePropiedad;
            this.Costo_Alquiler=Costo_Alquiler;
            Costo_Casa_Uno = c1 ; 
            Costo_Casa_Dos = c2;
            Costo_Casa_Tres = c3 ;
            Costo_Casa_Cuatro = c4; 
            Costo_Hotel = costoC; 
            Costo_Casa = CostoH;
            Usado = false; 
            lLink = null; 
            rLink = null;
        }
        public void setUsado(boolean u){
            this.Usado = u;         
        }

    public String getNombre_Propiedad() {
        return Nombre_Propiedad;
    }

    public void setNombre_Propiedad(String Nombre_Propiedad) {
        this.Nombre_Propiedad = Nombre_Propiedad;
    }

    public int getCosto_Propiedad() {
        return Costo_Propiedad;
    }

    public void setCosto_Propiedad(int Costo_Propiedad) {
        this.Costo_Propiedad = Costo_Propiedad;
    }

    public int getCosto_Alquiler() {
        return Costo_Alquiler;
    }

    public void setCosto_Alquiler(int Costo_Alquiler) {
        this.Costo_Alquiler = Costo_Alquiler;
    }

    public int getCosto_Casa_Uno() {
        return Costo_Casa_Uno;
    }

    public void setCosto_Casa_Uno(int Costo_Casa_Uno) {
        this.Costo_Casa_Uno = Costo_Casa_Uno;
    }

    public int getCosto_Casa_Dos() {
        return Costo_Casa_Dos;
    }

    public void setCosto_Casa_Dos(int Costo_Casa_Dos) {
        this.Costo_Casa_Dos = Costo_Casa_Dos;
    }

    public int getCosto_Casa_Tres() {
        return Costo_Casa_Tres;
    }

    public void setCosto_Casa_Tres(int Costo_Casa_Tres) {
        this.Costo_Casa_Tres = Costo_Casa_Tres;
    }

    public int getCosto_Casa_Cuatro() {
        return Costo_Casa_Cuatro;
    }

    public void setCosto_Casa_Cuatro(int Costo_Casa_Cuatro) {
        this.Costo_Casa_Cuatro = Costo_Casa_Cuatro;
    }

    public int getCosto_Hotel() {
        return Costo_Hotel;
    }

    public void setCosto_Hotel(int Costo_Hotel) {
        this.Costo_Hotel = Costo_Hotel;
    }

    public int getCosto_Casa() {
        return Costo_Casa;
    }

    public void setCosto_Casa(int Costo_Casa) {
        this.Costo_Casa = Costo_Casa;
    }

    public Propiedad getlLink() {
        return lLink;
    }

    public void setlLink(Propiedad lLink) {
        this.lLink = lLink;
    }

    public Propiedad getrLink() {
        return rLink;
    }

    public void setrLink(Propiedad rLink) {
        this.rLink = rLink;
    }
        public void setPropietario (int s){
        this.Propietario = s; 
        }
        
    }
    
    

