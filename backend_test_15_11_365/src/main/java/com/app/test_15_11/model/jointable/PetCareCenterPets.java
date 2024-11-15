package com.app.test_15_11.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.test_15_11.model.Manager;
import com.app.test_15_11.model.Pet;
import com.app.test_15_11.model.PetCareCenter;
import com.app.test_15_11.model.PetOwner;
import com.app.test_15_11.model.Document;
import com.app.test_15_11.model.PetService;
import com.app.test_15_11.enums.PetServiceType;
import com.app.test_15_11.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterPets")
@Table(schema = "\"test_15_11_163\"", name = "\"PetCareCenterPets\"")
@Data
public class PetCareCenterPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}