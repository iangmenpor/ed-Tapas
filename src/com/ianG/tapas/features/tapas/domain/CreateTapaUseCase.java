package com.ianG.tapas.features.tapas.domain;

import java.util.ArrayList;

public class CreateTapaUseCase{

    private TapaRepository tapaRepository;

    public CreateTapaUseCase (TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }
    public void execute(Tapa tapa){
        tapaRepository.create(tapa);
        System.out.println("->Tapa creada :>");
    }
}
