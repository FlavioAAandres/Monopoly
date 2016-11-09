package monopoly;

public class Jugadores {
    
    Jugadores Link; 
    Propiedad Propiedad;
    String Nombre; 
    int Dinero;   
    int Posicion; 

    public Jugadores getLink() {
        return Link;
    }

    public void setLink(Jugadores Link) {
        this.Link = Link;
    }

    public Propiedad getPropiedad() {
        return Propiedad;
    }

    public void setPropiedad(Propiedad Propiedad) {
        this.Propiedad = Propiedad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public Jugadores(String Nombre, int Dinero) {
        this.Nombre = Nombre;
        this.Dinero = Dinero;
        this.Propiedad = null;
        this.Posicion = 0;
    }   
    public static Jugadores Agregar_PROPIEDAD(Propiedad Propiedad, Jugadores PTR){ //PROPIEDAD A AGREGAR, JUGADOR A AGREGAR PROPIEDAD
            Propiedad.setlLink(null);
            Propiedad.setrLink(null);
        
        if (PTR.getPropiedad()== null) {
            PTR.setPropiedad(Propiedad);           
        }
        else{
            Propiedad p = PTR.getPropiedad();
            while(p.rLink != null) {
                p = p.rLink;
            }
            Propiedad q = Propiedad;
            p.rLink = q;
            q.lLink = p;        
        }
        return PTR;
    }//REALIZAR    
    
}
