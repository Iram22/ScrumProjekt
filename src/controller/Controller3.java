/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import entity.FørsteRunde;
import entity.Student;
import entity.Valgfag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;

/**
 *
 * @author Chris
 */
public class Controller3 {
    
     private EntityManager em;
     
     
     
     /**
      * Beregner student tilfredshed ud fra deres valg og deres pladsering i begge puljer,
      * jo flere valg som eksistere i samme pulje jo mere utilfreds studenten er.
      * Metoden tjekker begge puljer for valgets eksistense, hvis valget eksistere i ingen af puljer
      * stiger utilfredshed også
      **/
     public HashMap beregnTilfredshed(DefaultListModel pulje_A, DefaultListModel pulje_B){
          
         em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
          Query query = em.createNamedQuery("F\u00f8rsteRunde.findAll");
          List<Student> students = query.getResultList();
          Object[] puljeA = pulje_A.toArray();
          Object[] puljeB = pulje_B.toArray();
          
        final int MAX_UTILFREDSHED = 4;
        
        HashMap utilfredseStudenter = new HashMap();
        FørsteRunde runde1;
        for(Student stud : students){
            runde1 = stud.getFørsteRunde();
            int utilfredshedsGrad = 0;
            int valgIpuljeA = 0;
            int valgIpuljeB = 0;
             // prioritet 1a
            if(!erIpuljen(runde1.getFørstePrioriteta().getFag(), puljeA)) // tjek om prioritet 1a er i pulje a
            {
                
                if(!erIpuljen(runde1.getFørstePrioriteta().getFag(), puljeB)) // hvis ikke så tjek om prioritet 1a er i pulje b
                {
                    utilfredshedsGrad += 1; // hvis den ikke findes i begge puljer så stiger utilfredshed
                }else{
                valgIpuljeB +=1;
                     }
                
            }else{
                valgIpuljeA +=1;
            }
            
            
            
            // prioritet 1b
            
             if(!erIpuljen(runde1.getFørstePrioritetb().getFag(), puljeA)) // tjek om prioritet 1b er i pulje A
            {
                
                if(!erIpuljen(runde1.getFørstePrioritetb().getFag(), puljeB)) // hvis ikke så tjek om prioritet 1b er i pulje B
                {
                    utilfredshedsGrad += 1; // hvis den ikke findes i begge puljer så stiger utilfredshed
                }else{
                valgIpuljeB +=1;
                    if(valgIpuljeB == 2){ utilfredshedsGrad += 1; } // hvis begge prioritet 1a og 1b findes i pulje B
                     }
                
            }else{
                valgIpuljeA +=1;
                if(valgIpuljeA == 2){ utilfredshedsGrad += 1; } // hvis begge prioritet 1a og 1b findes i pulje A
                     }
            
             
             
              // prioritet 2a
             
              if(!erIpuljen(runde1.getAndenPrioriteta().getFag(), puljeA)) // tjek om prioritet 2a er i pulje A
            {
                
                if(!erIpuljen(runde1.getAndenPrioriteta().getFag(), puljeB)) // hvis ikke så tjek om prioritet 2a er i pulje B
                {
                    utilfredshedsGrad += 1; // hvis den ikke findes i begge puljer så stiger utilfredshed
                }else{
                valgIpuljeB +=1;
                       if(valgIpuljeB == 3){ utilfredshedsGrad += 1; } // hvis begge prioritet 1a og 1b og 2a findes i pulje B
                     } 
                     
                
            }else{
                valgIpuljeA +=1;
                       if(valgIpuljeA == 2){ utilfredshedsGrad += 1; } // hvis begge prioritet 1a og 1b og 2a findes i pulje A
            }
              
              
              
               // prioritet 2b
               if(!erIpuljen(runde1.getAndenPrioritetb().getFag(), puljeA)) // tjek om prioritet 2b er i pulje a
            {
                
                if(!erIpuljen(runde1.getAndenPrioritetb().getFag(), puljeB)) // hvis ikke så tjek om prioritet 2b er i pulje b
                {
                    utilfredshedsGrad += 1; // hvis den ikke findes i begge puljer så stiger utilfredshed
                }else{
                valgIpuljeB +=1;
                      if(valgIpuljeB == MAX_UTILFREDSHED){ utilfredshedsGrad += 1; } // hvis begge prioritet 1a og 1b og 2a og 2b findes i pulje B
                     
                     }
                
            }else{
                valgIpuljeA +=1;
                      if(valgIpuljeB == MAX_UTILFREDSHED){ utilfredshedsGrad += 1; } // hvis begge prioritet 1a og 1b og 2a og 2b findes i pulje A
            }
            
               
            if(utilfredshedsGrad > 2)
            {
                String result = stud.getId() +" "+ stud.getFørsteRunde().getFørstePrioriteta().getFag() +" "+ 
                                                   stud.getFørsteRunde().getFørstePrioritetb().getFag() +" "+
                                                   stud.getFørsteRunde().getAndenPrioriteta().getFag() +" "+
                                                   stud.getFørsteRunde().getAndenPrioritetb().getFag() +" "+ utilfredshedsGrad;
                utilfredseStudenter.put(utilfredshedsGrad,result); // HashMap kan sorteres ved at tage alle Keys i en List så sort den og reverse
            }   
               
    
        } // end of loop
          
          return utilfredseStudenter;
          
    }
    

    
    private boolean erIpuljen(String fag, Object[] pulje){
         boolean erIpuljen = false;
        for (int i = 0; i < pulje.length; i++)
        {
            if (fag.compareTo(((Valgfag)pulje[i]).getFag()) == 0)
            {
                erIpuljen = true;
            }else{
                erIpuljen = false;
                }   
        }
        
        return erIpuljen;
    }
    
}
