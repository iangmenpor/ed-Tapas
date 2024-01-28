package com.ianG.tapas.features.tapas.domain;

public class DeleteTapaUseCase {

    private TapaRepository tapaRepository;

    public DeleteTapaUseCase (TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }
    public void execute(String code){
        tapaRepository.delete(code);

    }
}
