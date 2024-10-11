package ejerciciosf02;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Empresa {

    private Conductor[] listaConductores;

    public Empresa(Conductor[] conductor) {
        this.listaConductores = conductor;
    }

    public int getRecorridoTotalConductor(Conductor conductor) {
        int sumaKilometros = 0;
        
        for(int i = 0; i < conductor.getListaKilometros().length; i++) {
            sumaKilometros += conductor.getDiaKilometros(i);
        }
        
        return sumaKilometros;
    }
    
    public int getRecorridoDiaConductor(Conductor conductor, int diaRecorrido) {
        int Kilometros = conductor.getDiaKilometros(diaRecorrido - 1);
        
        return Kilometros;
    }
    
    public Conductor getConductorMasKilometros() {
        Conductor conductorMaxK = null;
        
        for(int i = 0; i < this.listaConductores.length; i++) {
            if(conductorMaxK == null || getRecorridoTotalConductor(this.listaConductores[i]) > getRecorridoTotalConductor(conductorMaxK)) {
                conductorMaxK = this.listaConductores[i];
            }
        }
        
        return conductorMaxK;
    }
    
    public Conductor getConductorMasKilometros(int diaEspecifico) {
        Conductor conductorMaxK = null;
        
        for(int i = 0; i < this.listaConductores.length; i++) {
            if(conductorMaxK == null || getRecorridoDiaConductor(this.listaConductores[i], diaEspecifico) > getRecorridoDiaConductor(conductorMaxK, diaEspecifico)) {
                conductorMaxK = this.listaConductores[i];
            }
        }
        
        return conductorMaxK;
    }

}