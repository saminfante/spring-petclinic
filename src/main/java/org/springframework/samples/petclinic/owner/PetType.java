package org.springframework.samples.petclinic.owner;

import org.springframework.samples.petclinic.model.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/** Can be Cat, Dog, Hamster... */
@Entity
@Table(name = "types")
public class PetType extends NamedEntity {}
