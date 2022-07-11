package br.com.sigabem.service;

import br.com.sigabem.DTO.EnderecoViaCepResponseDTO;


public interface EnderecoService {
    EnderecoViaCepResponseDTO getEndereco(String cep);

}
