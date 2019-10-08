package org.springframework.samples.petclinic.vet;

import org.springframework.samples.petclinic.model.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/** Models a {@link Vet Vet's} specialty (for example, dentistry). */
@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity implements Serializable {}
