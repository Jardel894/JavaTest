package br.com.sigabem.service.impl;

import br.com.sigabem.DTO.EnderecoViaCepResponseDTO;
import br.com.sigabem.client.ViaCepClient;
import br.com.sigabem.exception.EnderecoBadRequestException;
import br.com.sigabem.exception.EnderecoNotFoundException;
import br.com.sigabem.service.EnderecoService;
import feign.FeignException;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class EnderecoServiceImpl implements EnderecoService {

    private final ViaCepClient viaCepClient;

    public EnderecoViaCepResponseDTO getEndereco(String cep) {
        try {
            final EnderecoViaCepResponseDTO enderecoViaCepResponseDTO = viaCepClient.getEndereco(cep);
            if (ObjectUtils.isEmpty(enderecoViaCepResponseDTO) || enderecoViaCepResponseDTO.getCep() == null) {
                throw new EnderecoNotFoundException(cep);
            }
            return enderecoViaCepResponseDTO;
        } catch (FeignException.BadRequest badRequest) {
            log.error("error: " + badRequest.getMessage());
            throw new EnderecoBadRequestException(cep);
        }
    }
}