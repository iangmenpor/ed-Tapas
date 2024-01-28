package com.ianG.tapas.features.tapas.domain;
import java.util.*;
public interface TapaRepository {

    void create (Tapa tapa);
    void delete (String code);
    Tapa get(String code);
    ArrayList<Tapa> getTapas();
    void update (Tapa tapa);


}
