package com.emse.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LightDAO extends JpaRepository<Light, String>, LightDaoCustom {

}
