package com.lucca.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucca.os.domain.Cliente;
import com.lucca.os.domain.OS;
import com.lucca.os.domain.Tecnico;
import com.lucca.os.domain.enuns.Prioridade;
import com.lucca.os.domain.enuns.Status;
import com.lucca.os.repository.ClienteRepository;
import com.lucca.os.repository.OsRepository;
import com.lucca.os.repository.TecnicoRepository;

@Service
public class DBServices {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OsRepository osRepository;

	
	public void InstanciaDb() {
		Tecnico t1 = new Tecnico(null, "Valdir Sezar", "250.018.380-70", "(12) 99999-8888");
		Cliente c1 = new Cliente(null, "Betina Campos", "365.815.130-75", "(12) 88888-9999");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste creat OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}
