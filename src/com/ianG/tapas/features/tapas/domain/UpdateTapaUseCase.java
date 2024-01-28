package com.ianG.tapas.features.tapas.domain;

public class UpdateTapaUseCase {

    private TapaRepository tapaRepository;

    public UpdateTapaUseCase (TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }
    public void execute(Tapa tapa){
        tapaRepository.update(tapa);
    }
}
