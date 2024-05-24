package br.com.carlosjunior.boletojuros.adapter.datasource.database;

import br.com.carlosjunior.boletojuros.adapter.datasource.database.repository.BoletoCalculadoRepository;
import br.com.carlosjunior.boletojuros.adapter.datasource.mapper.BoletoCalculadoMapper;
import br.com.carlosjunior.boletojuros.core.domain.BoletoCalculado;
import br.com.carlosjunior.boletojuros.core.port.out.SalvarCalculoBoletoPort;
import org.springframework.stereotype.Component;

@Component
public class SalvarBoletoCalculado implements SalvarCalculoBoletoPort {

    private final BoletoCalculadoRepository repository;
    private final BoletoCalculadoMapper mapper;

    public SalvarBoletoCalculado(BoletoCalculadoRepository repository,
                                 BoletoCalculadoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void executar(BoletoCalculado boletoCalculado) {
        var entity = mapper.toEntity(boletoCalculado);
        repository.save(entity);
    }

}
