package es.ieslavereda.miraveredaapi.service;

import es.ieslavereda.miraveredaapi.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;
}
