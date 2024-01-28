package com.ianG.tapas.features.tapas.domain;

public class GetTapaUseCase {

    private TapaRepository tapaRepository;

    public GetTapaUseCase (TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }
    public Tapa execute(String code){
       return tapaRepository.get(code);
    }
}
