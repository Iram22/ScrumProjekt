/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.ValgfagResultat;
import entity.FørsteRunde;
import entity.Puljer;
import entity.Student;
import entity.Valgfag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ahmed
 */
public class Controller {

    private EntityManager em;

    public Controller()
    {
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
    }

    public void gemPuljerIdb(Object[] puljeA, Object[] puljeB)
    {
        
        gemFagIPuljer("a", puljeA);
        gemFagIPuljer("b", puljeB);
    }

    private void gemFagIPuljer(String puljenavn, Object[] pulje)
    {
        for (int i = 0; i < pulje.length; i++)
        {
            persist(new Puljer(((ValgfagResultat)pulje[i]).getFag().getId(), puljenavn));
        }
    }
    
    
    public ArrayList<ValgfagResultat> visResultat()
    {
       em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();

        Query query = em.createNamedQuery("Valgfag.findAll");
        Query query2 = em.createNamedQuery("FørsteRunde.findCount1");
        Query query3 = em.createNamedQuery("FørsteRunde.findCount2");
        ArrayList<ValgfagResultat> resultater = new ArrayList<>();
        Collection<Valgfag> valgfag = query.getResultList();
        
        for(Valgfag v : valgfag)
        {
            query2.setParameter("førstePrioriteta", v);
            query3.setParameter("andenPrioriteta", v);
            Collection count1 = query2.getResultList();
            Collection count2 = query3.getResultList();
            ValgfagResultat resultat = new ValgfagResultat(v, Integer.parseInt(count1.toArray()[0] + ""), Integer.parseInt(count2.toArray()[0] + ""));
            resultater.add(resultat);

        }
        return resultater;
    }

   
    
    /**
      * Beregner student tilfredshed ud fra deres valg og deres pladsering i begge puljer,
      * jo flere valg som eksistere i samme pulje jo mere utilfreds studenten er.
      * Metoden tjekker begge puljer for valgets eksistense
      * 
      **/
    //<editor-fold defaultstate="collapsed" desc=" beregnTilfredshed ">
    public List beregnTilfredshed(Object[] puljeA, Object[] puljeB){
          
          em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
          Query query = em.createNamedQuery("F\u00f8rsteRunde.findAll");
          List<FørsteRunde> students = query.getResultList();
          List <String> utilfredseStudenter = new ArrayList();
          FørsteRunde runde1;
        
          for(FørsteRunde stud : students){
            runde1 = stud.getStudent().getFørsteRunde();
            int valgIpuljeA = 0; // 1 prioritet 1/ 2 prioritet 2
            int valgIpuljeB = 0; // 1 prioritet 1/ 2 prioritet 2
            
             // prioritet 1a
            if(erIpuljen(runde1.getFørstePrioriteta().getId(), puljeA)) // tjek om prioritet 1a er i pulje a
            {
                valgIpuljeA = 1;
            
            }else if (!erIpuljen(runde1.getFørstePrioriteta().getId(), puljeA)){ 
                
                if(erIpuljen(runde1.getFørstePrioriteta().getId(), puljeB)) // hvis ikke så tjek om prioritet 1a er i pulje b
                {
                        valgIpuljeB = 1;
                }
            }
            
            
            // prioritet 1b
            if(erIpuljen(runde1.getFørstePrioritetb().getId(), puljeA)) // tjek om prioritet 1b er i pulje A
            {
                 if (valgIpuljeA == 0 || valgIpuljeA != 1){
                     valgIpuljeA = 1;
                 }
                 
            }else if(!erIpuljen(runde1.getFørstePrioritetb().getId(), puljeA)){
                 
                 if(erIpuljen(runde1.getFørstePrioritetb().getId(), puljeB)) // hvis ikke så tjek om prioritet 1b er i pulje B
                {   
                     if (valgIpuljeB == 0 || valgIpuljeB != 1){
                         valgIpuljeB = 1;
                     }
                     
                }
            }
             
             
              // prioritet 2a
             if(erIpuljen(runde1.getAndenPrioriteta().getId(), puljeA)) // tjek om prioritet 2a er i pulje A
            {
                 if(valgIpuljeA != 1 || valgIpuljeA == 0){
                      valgIpuljeA = 2;
                  }
               
            }else if(!erIpuljen(runde1.getAndenPrioriteta().getId(), puljeA)){
                  
                  if(erIpuljen(runde1.getAndenPrioriteta().getId(), puljeB)) // hvis ikke så tjek om prioritet 2a er i pulje B
                {
                    if(valgIpuljeB != 1 || valgIpuljeB == 0){
                        valgIpuljeB =2;
                    }
                   
                }
            }
              
               // prioritet 2b
              if(erIpuljen(runde1.getAndenPrioritetb().getId(), puljeA)) // tjek om prioritet 2b er i pulje a
            {
                 if(valgIpuljeA != 1 || valgIpuljeA == 0){
                    valgIpuljeA = 2;
                 }
              
            }else if(!erIpuljen(runde1.getAndenPrioritetb().getId(), puljeA)){
                   
                if(erIpuljen(runde1.getAndenPrioritetb().getId(), puljeB)) // hvis ikke så tjek om prioritet 2b er i pulje b
                {
                    if(valgIpuljeB != 1 || valgIpuljeA == 0)
                    {
                     valgIpuljeB =2;
                    }
                }
            }
               
            String result =  stud.getStudent().getNavn() +" "+ stud.getFørstePrioriteta().getFag() +" "+ 
                             stud.getFørstePrioritetb().getFag() +" "+ stud.getAndenPrioriteta().getFag() +" "+
                             stud.getAndenPrioritetb().getFag() +" "+  valgIpuljeA+"/"+valgIpuljeB;
               
            utilfredseStudenter.add(result); // List kan sorteres ved Collections.sort den og reverse
            
               
    
        } // end of loop
          utilfredseStudenter = sortList(utilfredseStudenter);
          return utilfredseStudenter;
          
    }
  
    private boolean erIpuljen(int fag_id, Object[] pulje){
         boolean erIpuljen = false;
        for (int i = 0; i < pulje.length; i++)
        {
            Valgfag fagIpuljen = ((ValgfagResultat)pulje[i]).getFag();
            if (fag_id == fagIpuljen.getId())
            {
                erIpuljen = true;
            }   
        }
        
        return erIpuljen;
    }
    //<editor-fold defaultstate="collapsed" desc=" sortList ">
    public List sortList(List list){
        
        List ekstrem = new ArrayList();
        List meget = new ArrayList();
        List mellem = new ArrayList();
        List let = new ArrayList();
        List ok = new ArrayList();
        List tilfreds = new ArrayList();
        List result = new ArrayList();
        
        for (int i = 0; i < list.size(); i++) {
            String currentStudent = ((String)list.get(i));
            String[] temp = currentStudent.split(" ");
            
            if(temp[5].compareTo("0/0") == 0){
                ekstrem.add(currentStudent);
            }
            if(temp[5].compareTo("2/0") == 0 || temp[5].compareTo("0/2") == 0){
                meget.add(currentStudent);
            }
            if(temp[5].compareTo("1/0") == 0 || temp[5].compareTo("0/1") == 0){
                mellem.add(currentStudent);
            }
            if(temp[5].compareTo("2/2") == 0){
                let.add(currentStudent);
            }
            if(temp[5].compareTo("1/2") == 0 || temp[5].compareTo("2/1") == 0){
                ok.add(currentStudent);
            }
            if(temp[5].compareTo("1/1") == 0 ){
                tilfreds.add(currentStudent);
            }
        }
        
        for (int i = 0; i < ekstrem.size(); i++) {
            result.add(ekstrem.get(i));
        }
        for (int i = 0; i < meget.size(); i++) {
            result.add(meget.get(i));
        }
        for (int i = 0; i < mellem.size(); i++) {
            result.add(mellem.get(i));
        }
        for (int i = 0; i < let.size(); i++) {
            result.add(let.get(i));
        }
        for (int i = 0; i < ok.size(); i++) {
            result.add(ok.get(i));
        }
        for (int i = 0; i < tilfreds.size(); i++) {
            result.add(tilfreds.get(i));
        }
        return result;
        
    }
    
    public int getTotalAntalStudenter(){
        
       Query q = em.createNamedQuery("Student.findAll");
       return q.getResultList().size();
       
    }
    
     public void persist(Object object)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("XPScrumProjektPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try
        {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e)
        {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally
        {
            em.close();
        }
    }
    
}
