package br.com.sigabem.service;

import br.com.sigabem.DTO.CotacaoCalculadaResponseDTO;
import br.com.sigabem.DTO.CotacaoRequestDTO;
import br.com.sigabem.DTO.CotacaoResponseDTO;

import java.util.List;


public interface CotacaoService {

    CotacaoResponseDTO obterCotacao(CotacaoRequestDTO cotacaoRequestDTO);

    List<CotacaoCalculadaResponseDTO> getCotacaoList();

}
