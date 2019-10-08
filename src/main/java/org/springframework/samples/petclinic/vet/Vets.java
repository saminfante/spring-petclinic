package org.springframework.samples.petclinic.vet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple domain object representing a list of veterinarians. Mostly here to be used for the 'vets'
 * {@link org.springframework.web.servlet.view.xml.MarshallingView}.
 */
@XmlRootElement
public class Vets {

  private List<Vet> vets;

  @XmlElement
  public List<Vet> getVetList() {
    if (vets == null) {
      vets = new ArrayList<>();
    }
    return vets;
  }
}
