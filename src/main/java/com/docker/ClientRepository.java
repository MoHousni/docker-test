package com.docker;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
