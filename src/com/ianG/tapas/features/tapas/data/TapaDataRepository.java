package com.ianG.tapas.features.tapas.data;

import com.ianG.tapas.features.tapas.domain.Tapa;
import com.ianG.tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

   private static TapaDataRepository instance = null;
   private ArrayList<Tapa> tapaList = new ArrayList<>();

   private TapaDataRepository() {
       initData();
   }

   //Initial Data
    public void initData(){
        tapaList.add(new Tapa("1", "Cerdecería la bruja", "Restaurante La Bruja", "0", "0.0", "9", "0", "cerdo, cerveza"));
        tapaList.add(new Tapa("2","Belice fusión", "Gastro Cervecería Sélva", "10", "5.0", "2", "5","carne, cerveza"));
    }
   //SINGLETON
    public static TapaDataRepository newInstance() {
        if (instance == null){
            instance = new TapaDataRepository();
        }
        return instance;
    }

    @Override
    public void create(Tapa tapa) {
        tapaList.add(tapa);
    }

    @Override
    public void delete(String code) {
        for (int i = 0; i < tapaList.size(); i++) {
            if (tapaList.get(i).getCode().equals(code)) {
                tapaList.remove(i);
                System.out.println("-> Se ha borrado la Tapa con exito :>");
                return;
            }
        }
        //Imprimir caso que no exista
        System.out.println("-> Error 404: Tapa no encontrada :(");
    }

    @Override
    public Tapa get(String code) {
        for (Tapa tapa : tapaList){
            if (tapa.getCode().equals(code)){
                System.out.println("-> La tapa existe: " + tapa.toString());
                return tapa;

            }
        }
        System.out.println("-> Err404: Tapa no exste");
        return null; //Tapa no encontrada
    }

    @Override
    public ArrayList<Tapa> getTapas() {
        ArrayList<Tapa> tapas = new ArrayList<>();
        for (Tapa tapa : tapaList) {
            System.out.println("-> Tapa: " + tapa.toString());
            tapas.add(tapa); //
        }
        return tapas;
    }

    @Override
    public void update(Tapa tapa) {
        for (int i=0; i<tapaList.size(); i++){
            Tapa tapa1 = tapaList.get(i);
            if (tapa1.getCode().equals(tapa.getCode())){
                tapaList.set(i,tapa); //Actualizar tapa
                System.out.println("-> Tapa Actualizada: " + tapa.getCode());
                System.out.println("-> Datos Actualizados : "+ tapa.toString());
                return;
            }
        }
        System.out.println("->Error 404: Tapa no encontrada :(");
    }
}
