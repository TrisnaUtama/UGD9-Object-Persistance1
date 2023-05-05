/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.*;
import model.*;
import java.util.*;

/**
 *
 * @author
 *
 * I Putu Trisna Budi Utama      | 210711438
 * Boniface Fredo Ronan Antolino | 210711446
 * 
 */
public class KendaraanControl {
    private KendaraanDAO kDao = new KendaraanDAO();
    
    public void insertDataKendaraan(Kendaraan k){
        kDao.insertData(k);
    }
    
    public void updateDataKendaraan(Kendaraan k, String id){
        kDao.updateData(k, id);
    }
    
    public void deleteDataKendaraan(String id){
        kDao.deleteData(id);
    }
    
    public Kendaraan searchDataKendaraan(String id){
        List<Kendaraan> dataKendaraan = kDao.showData();
        
        for(int i=0; i < dataKendaraan.size(); i++){
            if(dataKendaraan.get(i).getId().equals(id)){
                return dataKendaraan.get(i);
            }
        }
        
        return null;
    }
    
    public String showDataMobil(){
        List<Kendaraan> dataKendaraan = kDao.showData();
        String tempKendaraan="";
        
        for (int i = 0; i<dataKendaraan.size(); i++){
            if(dataKendaraan.get(i).getJenis().equalsIgnoreCase("Car"))
                tempKendaraan = tempKendaraan + dataKendaraan.get(i).showData() + "\n";
        }
        return tempKendaraan;
    }
    
    public String showDataMotor(){
        List<Kendaraan> dataKendaraan = kDao.showData();
        String tempKendaraan="";
        
        for (int i = 0; i<dataKendaraan.size(); i++){
            if(dataKendaraan.get(i).getJenis().equalsIgnoreCase("Motorcycle"))
                tempKendaraan = tempKendaraan + dataKendaraan.get(i).showData() + "\n";
        }
        return tempKendaraan;
    }
    
    public 
    
}
