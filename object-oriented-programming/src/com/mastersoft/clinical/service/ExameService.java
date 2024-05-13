package com.mastersoft.clinical.service;

import com.mastersoft.clinical.model.Exame;

public class ExameService {
    public void salvarExame(Exame exame) {
        System.out.printf("Exame %d salvo!", exame.id);
    }
}
