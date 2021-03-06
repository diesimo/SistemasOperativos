
        
package ibmw;

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ProdRuedas extends Thread {
    
    
  
     
    
   static  private final Semaphore permiso= new Semaphore(0,true);
   private static int n1;
   static private  int n2;
   static private int contract; // csntidsd de personas trabajando
     Almacen almacen = new Almacen();  
  Comienzo comienzo= new Comienzo();
    
   
    public void run()
    {
        //Se le da el valor iniciado de contratados
      
        Ensambladores emsa = new Ensambladores();
       
        Jefe jefe = new Jefe();
          contract=comienzo.getiP_Rue();
        
    
        while(true)
        {
                // cantidad de producgtores
                
                  
                  
          // La produccion ruedas llevara el conteo de los dias, ya que es el unico que produce todos los dias
                if(jefe.isBooR()==true && jefe.isBooP()==true && jefe.isBooM()==true && jefe.cantCont()<3)
                {
                   // -- System.out.println("Comenzo");
                    
              
                   //Si en el almacen hay espacio menor de 30 entra
                    if(permiso.availablePermits()<comienzo.getMax_ARue())
                    {
                       
                        
                        //Dependiendo de la cantidad de trabajadores que haya en el momento, entrara
                        //en un for por la cantidad de trabajdores que debem producir
                        
                        for(int i=1; i<=contract;i++)
                        {
                            
                            
                           // -- System.out.println("Entro en R");
                            //Cuaando n1 ya llegue a 30 este se establecera en 0
                            //para poder verificar en el vector las posciones desde 0 de nuevo
                            //para poder llenar el almacen en los espacio vacios
                            if(n1==comienzo.getMax_ARue())
                            {
                               n1=0;
                            }
                            //Si n1 es menor a 29, entra y simplemente almancena en el almacen
                            // si y solo si este espacio este vacio, es decir, en 0.
                            if(n1<=(comienzo.getMax_ARue()-1))
                            {
                                //obtiene el valor de la posicion n1 del almacen
                                if(almacen.getStoreR(n1)==0)
                                {
                                    generar();
                                    emsa.addR(1);
                                }
                                n1++;
                                
                               
                            }
                            
                        }
                        
                        
                    }
                 
                    
                 
                        //Disminuye los dias 
                       
                        jefe.setBooP(false);
                        jefe.setBooM(false);
                        jefe.setBooR(false);
                     
                        
                       // --- System.out.println(jefe.isBooR()+ " "+ jefe.isBooP() + " "+ jefe.isBooM());
                        //Realiza un release al semaforo de  jefe para saber el dia pasado
                        jefe.addCont();
                        try {
                        //Duerme al hilo 
                       
                    
                       
                         Thread.sleep(comienzo.getTiempo());
                          
                        
                         
                 
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ProdRuedas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }  
                
                   
       
            }
        
    

    }
    
    
    // Se le realiza cuando entra una rueda al almacen
    public void addR()
    {
    
        permiso.release();
       
    
    }
    
    public int Devol()
    {
    
        return permiso.availablePermits();
    }
    
    
    // Funcion llamada en emsablandora para obtener una rueda y aplciar un acquire()
    public void preveerR(int cant)
    {
        try {
          
            permiso.acquire( cant);
             
           
           //Como cada carro necesita  4 ruedas
            for(int cont=1; cont<=4;cont++)
            {
                
                //Si  n2 ya esta esta en 29 es porque ya llego a la ultima posicion del almacen
                //y se reinicia para obtener ruedas de las primeras posiciones
                 if(n2==(comienzo.getMax_ARue()-1))
            {
                n2=0;
               // ---- System.out.println(" Limite 29");
            
            }
                 // Pone en 0 la posicion asignada por n2 para indicar que fue retirado una rueda 
                 // en esa poision y que esta disponible dicha posicion para llenar de nuevo
            almacen.setStoreR(n2,0);
           //-----System.out.println("Se le quito 1 Rueda: " + " posicion: "+ n2);
            n2++;
            } 
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProdMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    //Funcion para saber que se genero una rueda
     public void generar(){
         
         
         almacen.setStoreR(n1,1);
       // ---- System.out.println("Se Genero 1 Rueda en la posicon " + n1); 
         addR();
                   
    
}

    public int getContract() {
        return contract;
    }

    public  void setContractadd() {
        contract++;
    }
    
    public void setContractdis(){
    
    contract--;
    
    }
    
    

     
   }    

   
   
    
            
 
    

